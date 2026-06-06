/*
 * Copyright 2024-present Coinbase Global, Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *  http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.coinbase.advanced.credentials;

import com.coinbase.advanced.utils.Constants;
import com.coinbase.core.credentials.CoinbaseCredentials;
import com.coinbase.core.errors.CoinbaseClientException;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.nimbusds.jose.*;
import com.nimbusds.jose.crypto.*;
import com.nimbusds.jose.jca.JCAContext;
import com.nimbusds.jose.util.Base64URL;
import com.nimbusds.jwt.*;
import org.bouncycastle.asn1.pkcs.PrivateKeyInfo;
import org.bouncycastle.crypto.params.Ed25519PrivateKeyParameters;
import org.bouncycastle.crypto.util.PrivateKeyInfoFactory;
import org.bouncycastle.jce.provider.BouncyCastleProvider;
import org.bouncycastle.openssl.PEMKeyPair;
import org.bouncycastle.openssl.PEMParser;
import org.bouncycastle.openssl.jcajce.JcaPEMKeyConverter;

import java.io.StringReader;
import java.net.URI;
import java.security.GeneralSecurityException;
import java.security.KeyFactory;
import java.security.PrivateKey;
import java.security.SecureRandom;
import java.security.Security;
import java.security.Signature;
import java.security.interfaces.ECPrivateKey;
import java.security.spec.PKCS8EncodedKeySpec;
import java.time.Instant;
import java.util.Base64;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;

public class CoinbaseAdvancedCredentials implements CoinbaseCredentials {
    @JsonProperty(required = true)
    private String apiKeyName;
    @JsonProperty(required = true)
    private String privateKey;

    public CoinbaseAdvancedCredentials(String apiKeyName, String privateKey) {
        this.apiKeyName = apiKeyName;
        this.privateKey = privateKey;
    }

    public CoinbaseAdvancedCredentials() {}

    public CoinbaseAdvancedCredentials(String credentialsJson) throws CoinbaseClientException {
        ObjectMapper mapper = new ObjectMapper();
        try {
            CoinbaseAdvancedCredentials credentials = mapper.readValue(credentialsJson, CoinbaseAdvancedCredentials.class);
            this.apiKeyName = credentials.getApiKeyName();
            this.privateKey = credentials.getPrivateKey().replace("\\n", "\n");
        } catch (Throwable e) {
            throw new CoinbaseClientException("Failed to parse credentials", e);
        }
    }

    public String getApiKeyName() {
        return apiKeyName;
    }

    public String getPrivateKey() {
        return privateKey;
    }

    @Override
    public Map<String, String> generateAuthHeaders(String httpMethod, URI uri, String body) {
        try {
            String jwt = generateJwt(httpMethod, uri.getHost(), uri.getPath());
            Map<String, String> headers = new HashMap<>();
            headers.put(Constants.AUTH_HEADER, String.format("Bearer %s", jwt));
            headers.put(Constants.USER_AGENT_HEADER, String.format("coinbase-advanced-java/%s", Constants.SDK_VERSION));
            return headers;
        } catch (Exception e) {
            throw new RuntimeException("Failed to generate auth headers", e);
        }
    }

    public String generateJwt(String requestMethod, String host, String path) throws Exception {
        Security.addProvider(new BouncyCastleProvider());

        PrivateKey key = loadPrivateKey(privateKey);
        JWSAlgorithm algorithm = algorithmFor(key);
        if (JWSAlgorithm.ES256.equals(algorithm)) {
            warnEcdsaDeprecation();
        }

        String uri = requestMethod + " " + host + path;
        long now = Instant.now().getEpochSecond();

        JWTClaimsSet claimsSet = new JWTClaimsSet.Builder()
                .subject(apiKeyName)
                .issuer("cdp")
                .notBeforeTime(Date.from(Instant.ofEpochSecond(now)))
                .expirationTime(Date.from(Instant.ofEpochSecond(now + 120)))
                .claim("uri", uri)
                .build();

        JWSHeader jwsHeader = new JWSHeader.Builder(algorithm)
                .type(JOSEObjectType.JWT)
                .keyID(apiKeyName)
                .customParam("nonce", generateNonce())
                .build();

        SignedJWT signedJWT = new SignedJWT(jwsHeader, claimsSet);
        signedJWT.sign(signerFor(algorithm, key));

        return signedJWT.serialize();
    }

    private static final AtomicBoolean ecdsaDeprecationWarned = new AtomicBoolean(false);

    /**
     * Loads a CDP API key secret into a {@link PrivateKey}. Two key types are
     * supported:
     * <ul>
     *   <li>ECDSA (P-256), signed with ES256. Supplied as a PEM-encoded key.</li>
     *   <li>Ed25519, signed with EdDSA. Supplied either as a PKCS#8 PEM key or as
     *       a base64-encoded raw key (32-byte seed or 64-byte seed+public key),
     *       which is how the CDP portal hands out Ed25519 secrets.</li>
     * </ul>
     */
    private static PrivateKey loadPrivateKey(String secret) throws Exception {
        String trimmed = secret.trim();

        if (trimmed.startsWith("-----BEGIN")) {
            PrivateKey key;
            try (PEMParser pemParser = new PEMParser(new StringReader(secret))) {
                JcaPEMKeyConverter converter = new JcaPEMKeyConverter().setProvider("BC");
                Object object = pemParser.readObject();
                if (object instanceof PEMKeyPair) {
                    key = converter.getPrivateKey(((PEMKeyPair) object).getPrivateKeyInfo());
                } else if (object instanceof PrivateKeyInfo) {
                    key = converter.getPrivateKey((PrivateKeyInfo) object);
                } else if (object instanceof PrivateKey) {
                    key = (PrivateKey) object;
                } else {
                    throw new CoinbaseClientException("Unexpected private key format");
                }
            }
            // Normalize EC keys through the default provider so nimbus signs them
            // exactly as before; Ed25519 keys are returned as-is for the BC signer.
            if (isEc(key.getAlgorithm())) {
                KeyFactory keyFactory = KeyFactory.getInstance("EC");
                return keyFactory.generatePrivate(new PKCS8EncodedKeySpec(key.getEncoded()));
            }
            return key;
        }

        byte[] raw;
        try {
            raw = Base64.getDecoder().decode(trimmed.replaceAll("\\s", ""));
        } catch (IllegalArgumentException e) {
            throw new CoinbaseClientException("private key is neither PEM nor valid base64", e);
        }
        if (raw.length != 32 && raw.length != 64) {
            throw new CoinbaseClientException(
                    "Ed25519 raw key must decode to 32 or 64 bytes, got " + raw.length);
        }
        // The constructor reads the 32-byte seed from offset 0, ignoring the
        // trailing public key bytes when a 64-byte key is supplied.
        Ed25519PrivateKeyParameters params = new Ed25519PrivateKeyParameters(raw, 0);
        PrivateKeyInfo keyInfo = PrivateKeyInfoFactory.createPrivateKeyInfo(params);
        KeyFactory keyFactory = KeyFactory.getInstance("Ed25519", "BC");
        return keyFactory.generatePrivate(new PKCS8EncodedKeySpec(keyInfo.getEncoded()));
    }

    private static JWSAlgorithm algorithmFor(PrivateKey key) {
        String alg = key.getAlgorithm();
        if (isEd25519(alg)) {
            return JWSAlgorithm.EdDSA;
        }
        if (isEc(alg)) {
            return JWSAlgorithm.ES256;
        }
        throw new IllegalArgumentException(
                "Unsupported private key type: " + alg + ". Expected ECDSA (P-256) or Ed25519.");
    }

    private static void warnEcdsaDeprecation() {
        if (ecdsaDeprecationWarned.compareAndSet(false, true)) {
            System.err.println("warning: Ed25519 is the recommended CDP API key type. "
                    + "Consider switching to an Ed25519 key at https://portal.cdp.coinbase.com/");
        }
    }

    private static JWSSigner signerFor(JWSAlgorithm algorithm, PrivateKey key) throws JOSEException {
        if (JWSAlgorithm.EdDSA.equals(algorithm)) {
            return new Ed25519JwsSigner(key);
        }
        return new ECDSASigner((ECPrivateKey) key);
    }

    private static boolean isEc(String alg) {
        return "EC".equalsIgnoreCase(alg) || "ECDSA".equalsIgnoreCase(alg);
    }

    private static boolean isEd25519(String alg) {
        return "Ed25519".equalsIgnoreCase(alg) || "EdDSA".equalsIgnoreCase(alg);
    }

    private static final SecureRandom SECURE_RANDOM = new SecureRandom();

    private static String generateNonce() {
        byte[] bytes = new byte[16];
        SECURE_RANDOM.nextBytes(bytes);
        StringBuilder sb = new StringBuilder(bytes.length * 2);
        for (byte b : bytes) {
            sb.append(Character.forDigit((b >> 4) & 0xF, 16));
            sb.append(Character.forDigit(b & 0xF, 16));
        }
        return sb.toString();
    }

    /**
     * A nimbus {@link JWSSigner} for EdDSA backed by BouncyCastle, so Ed25519
     * signing works without pulling in the Tink dependency nimbus otherwise
     * requires for OKP keys.
     */
    private static final class Ed25519JwsSigner implements JWSSigner {
        private final PrivateKey privateKey;
        private final JCAContext jcaContext = new JCAContext();

        Ed25519JwsSigner(PrivateKey privateKey) {
            this.privateKey = privateKey;
        }

        @Override
        public Base64URL sign(JWSHeader header, byte[] signingInput) throws JOSEException {
            try {
                Signature signature = Signature.getInstance("Ed25519", BouncyCastleProvider.PROVIDER_NAME);
                signature.initSign(privateKey);
                signature.update(signingInput);
                return Base64URL.encode(signature.sign());
            } catch (GeneralSecurityException e) {
                throw new JOSEException("Ed25519 signing failed: " + e.getMessage(), e);
            }
        }

        @Override
        public Set<JWSAlgorithm> supportedJWSAlgorithms() {
            return Collections.singleton(JWSAlgorithm.EdDSA);
        }

        @Override
        public JCAContext getJCAContext() {
            return jcaContext;
        }
    }
}
