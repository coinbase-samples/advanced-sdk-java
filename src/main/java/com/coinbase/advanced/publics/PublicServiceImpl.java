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

package com.coinbase.advanced.publics;

import com.coinbase.advanced.client.CoinbaseAdvancedClient;
import com.coinbase.advanced.errors.CoinbaseAdvancedException;
import com.coinbase.advanced.model.publics.*;
import com.coinbase.advanced.model.products.*;
import com.coinbase.core.common.HttpMethod;
import com.coinbase.core.service.CoinbaseServiceImpl;
import com.fasterxml.jackson.core.type.TypeReference;

import java.util.List;

public class PublicServiceImpl extends CoinbaseServiceImpl implements PublicService {
    public PublicServiceImpl(CoinbaseAdvancedClient client) {
        super(client);
    }

    @Override
    public GetProductResponse getPublicProduct(GetPublicProductRequest request) throws CoinbaseAdvancedException {
        return this.request(
                HttpMethod.GET,
                String.format("/market/products/%s", request.getProductId()),
                null,
                List.of(200),
                new TypeReference<GetProductResponse>() {});
    }

    @Override
    public ListProductsResponse listPublicProducts(ListPublicProductsRequest request) throws CoinbaseAdvancedException {
        String path = "/market/products";
        return this.request(
                HttpMethod.GET,
                "/market/products",
                request,
                List.of(200),
                new TypeReference<ListProductsResponse>() {});
    }

    @Override
    public GetProductBookResponse getPublicProductBook(GetPublicProductBookRequest request) throws CoinbaseAdvancedException {
        String path = "/market/product_book";
        return this.request(
                HttpMethod.GET,
                "/market/product_book",
                request,
                List.of(200),
                new TypeReference<GetProductBookResponse>() {});
    }

    @Override
    public GetProductCandlesResponse getPublicProductCandles(GetPublicProductCandlesRequest request) throws CoinbaseAdvancedException {
        return this.request(
                HttpMethod.GET,
                String.format("/market/products/%s/candles", request.getProductId()),
                request,
                List.of(200),
                new TypeReference<GetProductCandlesResponse>() {});
    }

    @Override
    public GetMarketTradesResponse getPublicMarketTrades(GetPublicMarketTradesRequest request) throws CoinbaseAdvancedException {
        return this.request(
                HttpMethod.GET,
                String.format("/market/products/%s/ticker", request.getProductId()),
                request,
                List.of(200),
                new TypeReference<GetMarketTradesResponse>() {});
    }

    @Override
    public GetServerTimeResponse getServerTime() throws CoinbaseAdvancedException {
        return this.request(
                HttpMethod.GET,
                "/time",
                null,
                List.of(200),
                new TypeReference<GetServerTimeResponse>() {});
    }
}
