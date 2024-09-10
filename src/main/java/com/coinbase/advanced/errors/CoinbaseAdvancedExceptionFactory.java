/*
 * Copyright 2024-present Coinbase Global, Inc.
 *
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *  http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 */

package com.coinbase.advanced.errors;

import com.fasterxml.jackson.databind.ObjectMapper;

public class CoinbaseAdvancedExceptionFactory {
    private static final ObjectMapper mapper = new ObjectMapper();

    public static CoinbaseAdvancedException create(int statusCode, String responseBody) {
        try {
            CoinbaseAdvancedErrorMessage errorMessage = mapper.readValue(responseBody, CoinbaseAdvancedErrorMessage.class);
            return new CoinbaseAdvancedException(statusCode, errorMessage.getMessage());
        } catch (Throwable e) {
            return new CoinbaseAdvancedException(statusCode, responseBody);
        }
    }

    public static CoinbaseAdvancedException create(String responseBody, Throwable cause) {
        try {
            CoinbaseAdvancedErrorMessage errorMessage = mapper.readValue(responseBody, CoinbaseAdvancedErrorMessage.class);
            return new CoinbaseAdvancedException(errorMessage.getMessage(), cause);
        } catch (Throwable e) {
            return new CoinbaseAdvancedException(responseBody, cause);
        }
    }

    public static CoinbaseAdvancedException create(int statusCode, String responseBody, Throwable cause) {
        try {
            CoinbaseAdvancedErrorMessage errorMessage = mapper.readValue(responseBody, CoinbaseAdvancedErrorMessage.class);
            return new CoinbaseAdvancedException(statusCode, errorMessage.getMessage(), cause);
        } catch (Throwable e) {
            return new CoinbaseAdvancedException(statusCode, responseBody, cause);
        }
    }

    public static CoinbaseAdvancedException create(Throwable cause) {
        return new CoinbaseAdvancedException(cause);
    }
}
