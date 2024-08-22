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
import com.coinbase.advanced.model.converts.*;

public class DefaultConvertsService implements ConvertsService {

    private final CoinbaseAdvancedHttpClient httpClient;

    public DefaultConvertsService(CoinbaseAdvancedHttpClient httpClient) {
        this.httpClient = httpClient;
    }

    @Override
    public CreateConvertQuoteResponse createConvertQuote(CreateConvertQuoteRequest request) throws CoinbaseAdvancedException {
        CreateConvertQuoteResponse resp = httpClient.doPost(request, CreateConvertQuoteResponse.class);
        return CreateConvertQuoteResponse.Builder.from(resp)
                .build();
    }

    @Override
    public GetConvertTradeResponse getConvertTrade(GetConvertTradeRequest request) throws CoinbaseAdvancedException {
        GetConvertTradeResponse resp = httpClient.doGet(request, GetConvertTradeResponse.class);
        return GetConvertTradeResponse.Builder.from(resp)
                .build();
    }

    @Override
    public CommitConvertQuoteResponse commitConvertQuote(CommitConvertQuoteRequest request) throws CoinbaseAdvancedException {
        CommitConvertQuoteResponse resp = httpClient.doPost(request, CommitConvertQuoteResponse.class);
        return CommitConvertQuoteResponse.Builder.from(resp)
                .build();
    }
}
