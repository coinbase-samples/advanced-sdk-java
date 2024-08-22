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

package com.coinbase.advanced.service;

import com.coinbase.advanced.client.CoinbaseAdvancedHttpClient;
import com.coinbase.advanced.errors.CoinbaseAdvancedException;
import com.coinbase.advanced.model.fees.*;


public class DefaultFeesService implements FeesService {

    private final CoinbaseAdvancedHttpClient httpClient;

    public DefaultFeesService(CoinbaseAdvancedHttpClient httpClient) {
        this.httpClient = httpClient;
    }

    @Override
    public GetTransactionsSummaryResponse getTransactionsSummary(GetTransactionsSummaryRequest request) throws CoinbaseAdvancedException {
        GetTransactionsSummaryResponse resp = httpClient.doGet(request, GetTransactionsSummaryResponse.class);
        return GetTransactionsSummaryResponse.Builder.from(resp)
                .build();
    }
}
