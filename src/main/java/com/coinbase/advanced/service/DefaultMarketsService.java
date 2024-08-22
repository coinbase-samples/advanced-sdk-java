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
import com.coinbase.advanced.model.markets.GetServerTimeResponse;
import com.coinbase.advanced.model.products.*;

public class DefaultMarketsService implements MarketsService {

    private final CoinbaseAdvancedHttpClient httpClient;

    public DefaultMarketsService(CoinbaseAdvancedHttpClient httpClient) {
        this.httpClient = httpClient;
    }

    @Override
    public GetProductResponse getPublicProduct(String productId) throws CoinbaseAdvancedException {
        String path = "/market/products/" + productId;
        return httpClient.doGetPublic(path, null, GetProductResponse.class);
    }

    @Override
    public ListProductsResponse listPublicProducts() throws CoinbaseAdvancedException {
        String path = "/market/products";
        return httpClient.doGetPublic(path, null, ListProductsResponse.class);
    }

    @Override
    public GetProductBookResponse getPublicProductBook(String productId, String limit) throws CoinbaseAdvancedException {
        String path = "/market/product_book";
        String queryString = "product_id=" + productId;
        if (limit != null && !limit.isEmpty()) {
            queryString += "&limit=" + limit;
        }
        return httpClient.doGetPublic(path, queryString, GetProductBookResponse.class);
    }

    @Override
    public GetProductCandlesResponse getPublicProductCandles(String productId, String granularity, String start, String end) throws CoinbaseAdvancedException {
        String path = "/market/products/" + productId + "/candles";
        String queryString = "granularity=" + granularity + "&start=" + start + "&end=" + end;
        return httpClient.doGetPublic(path, queryString, GetProductCandlesResponse.class);
    }

    @Override
    public GetMarketTradesResponse getPublicMarketTrades(String productId, String limit, String start, String end) throws CoinbaseAdvancedException {
        String path = "/market/products/" + productId + "/ticker";
        String queryString = "limit=" + limit;
        if (start != null && !start.isEmpty()) {
            queryString += "&start=" + start;
        }
        if (end != null && !end.isEmpty()) {
            queryString += "&end=" + end;
        }
        return httpClient.doGetPublic(path, queryString, GetMarketTradesResponse.class);
    }

    @Override
    public GetServerTimeResponse getServerTime() throws CoinbaseAdvancedException {
        String path = "/time";
        return httpClient.doGetPublic(path, null, GetServerTimeResponse.class);
    }
}
