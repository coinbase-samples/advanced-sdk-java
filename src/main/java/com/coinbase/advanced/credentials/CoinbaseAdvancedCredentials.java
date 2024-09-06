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
import com.fasterxml.jackson.databind.ObjectMapper;
import com.nimbusds.jose.*;
import com.nimbusds.jose.crypto.*;
import com.nimbusds.jwt.*;
import org.bouncycastle.jce.provider.BouncyCastleProvider;
import org.bouncycastle.openssl.PEMParser;
import org.bouncycastle.openssl.jcajce.JcaPEMKeyConverter;

import java.io.StringReader;
import java.net.URI;
import java.security.KeyFactory;
import java.security.PrivateKey;
import java.security.Security;
import java.security.interfaces.ECPrivateKey;
import java.security.spec.PKCS8EncodedKeySpec;
import java.time.Instant;
import java.util.HashMap;
import java.util.Map;

public class CoinbaseAdvancedCredentials implements CoinbaseCredentials {
    private final String apiKeyName;
    private final String privateKey;

    public CoinbaseAdvancedCredentials(String apiKeyName, String privateKey) {
        this.apiKeyName = apiKeyName;
        this.privateKey = privateKey;
    }

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

        Map<String, Object> header = new HashMap<>();
        header.put("alg", "ES256");
        header.put("typ", "JWT");
        header.put("kid", apiKeyName);
        header.put("nonce", String.valueOf(Instant.now().getEpochSecond()));

        String uri = requestMethod + " " + host + path;

        Map<String, Object> data = new HashMap<>();
        data.put("iss", "cdp");
        data.put("nbf", Instant.now().getEpochSecond());
        data.put("exp", Instant.now().getEpochSecond() + 120);
        data.put("sub", apiKeyName);
        data.put("uri", uri);

        PEMParser pemParser = new PEMParser(new StringReader(privateKey));
        JcaPEMKeyConverter converter = new JcaPEMKeyConverter().setProvider("BC");
        Object object = pemParser.readObject();
        PrivateKey privateKey;

        if (object instanceof PrivateKey) {
            privateKey = (PrivateKey) object;
        } else if (object instanceof org.bouncycastle.openssl.PEMKeyPair) {
            privateKey = converter.getPrivateKey(((org.bouncycastle.openssl.PEMKeyPair) object).getPrivateKeyInfo());
        } else {
            throw new Exception("Unexpected private key format");
        }
        pemParser.close();

        KeyFactory keyFactory = KeyFactory.getInstance("EC");
        PKCS8EncodedKeySpec keySpec = new PKCS8EncodedKeySpec(privateKey.getEncoded());
        ECPrivateKey ecPrivateKey = (ECPrivateKey) keyFactory.generatePrivate(keySpec);

        JWTClaimsSet.Builder claimsSetBuilder = new JWTClaimsSet.Builder();
        for (Map.Entry<String, Object> entry : data.entrySet()) {
            claimsSetBuilder.claim(entry.getKey(), entry.getValue());
        }
        JWTClaimsSet claimsSet = claimsSetBuilder.build();

        JWSHeader jwsHeader = new JWSHeader.Builder(JWSAlgorithm.ES256).customParams(header).build();
        SignedJWT signedJWT = new SignedJWT(jwsHeader, claimsSet);

        JWSSigner signer = new ECDSASigner(ecPrivateKey);
        signedJWT.sign(signer);

        return signedJWT.serialize();
    }
}
