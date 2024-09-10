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

package com.coinbase.advanced.client;

import com.coinbase.advanced.credentials.CoinbaseAdvancedCredentials;
import com.coinbase.advanced.errors.CoinbaseAdvancedErrorMessage;
import com.coinbase.advanced.errors.CoinbaseAdvancedException;
import com.coinbase.advanced.utils.Constants;
import com.coinbase.core.client.CoinbaseNetHttpClient;
import com.coinbase.core.errors.CoinbaseClientException;
import com.fasterxml.jackson.core.type.TypeReference;

import java.net.http.HttpClient;
import java.net.http.HttpResponse;
import java.util.List;

public class CoinbaseAdvancedClient extends CoinbaseNetHttpClient {
    public CoinbaseAdvancedClient(CoinbaseAdvancedCredentials credentials, String baseUrl) {
        super(credentials, baseUrl);
    }

    public CoinbaseAdvancedClient(CoinbaseAdvancedCredentials credentials, String baseUrl, HttpClient client) {
        super(credentials, baseUrl, client);
    }

    public CoinbaseAdvancedClient(CoinbaseAdvancedCredentials credentials) {
        super(credentials, Constants.BASE_URL);
    }

    public CoinbaseAdvancedClient(CoinbaseAdvancedCredentials credentials, HttpClient client) {
        super(credentials, Constants.BASE_URL, client);
    }

    @Override
    protected <T> T handleResponse(
            HttpResponse<String> response,
            List<Integer> expectedStatusCodes,
            TypeReference<T> responseClass) throws CoinbaseAdvancedException {
        if (!expectedStatusCodes.contains(response.statusCode())) {
            try {
                CoinbaseAdvancedErrorMessage errorMessage = this.mapper.readValue(response.body(), CoinbaseAdvancedErrorMessage.class);
                errorMessage.setStatusCode(response.statusCode());
                throw errorMessage.createCoinbaseException();
            } catch (Exception e) {
                throw new CoinbaseAdvancedException(response.statusCode(), response.body());
            }
        }

        try {
            return this.mapper.readValue(response.body(), responseClass);
        } catch (Throwable e) {
            throw new CoinbaseClientException("Failed to deserialize class", e);
        }
    }

}
