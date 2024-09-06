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

package com.coinbase.advanced.products;

import com.coinbase.advanced.client.CoinbaseAdvancedClient;
import com.coinbase.advanced.errors.CoinbaseAdvancedException;
import com.coinbase.advanced.model.products.*;
import com.coinbase.core.common.HttpMethod;
import com.coinbase.core.service.CoinbaseServiceImpl;
import com.fasterxml.jackson.core.type.TypeReference;

import java.util.List;

public class ProductsServiceImpl extends CoinbaseServiceImpl implements ProductsService {
    public ProductsServiceImpl(CoinbaseAdvancedClient client) {
        super(client);
    }

    @Override
    public ListProductsResponse listProducts(ListProductsRequest request) throws CoinbaseAdvancedException {
        return this.request(
                HttpMethod.GET,
                "/brokerage/products",
                request,
                List.of(200),
                new TypeReference<ListProductsResponse>() {});
    }

    @Override
    public GetProductResponse getProduct(GetProductRequest request) throws CoinbaseAdvancedException {
        return this.request(
                HttpMethod.GET,
                String.format("/brokerage/products/%s", request.getProductId()),
                null,
                List.of(200),
                new TypeReference<GetProductResponse>() {});
    }


    @Override
    public GetMarketTradesResponse getMarketTrades(GetMarketTradesRequest request) throws CoinbaseAdvancedException {
        return this.request(
                HttpMethod.GET,
                String.format("/brokerage/products/%s/ticker", request.getProductId()),
                request,
                List.of(200),
                new TypeReference<GetMarketTradesResponse>() {});
    }

    @Override
    public GetProductBookResponse getProductBook(GetProductBookRequest request) throws CoinbaseAdvancedException {
        return this.request(
                HttpMethod.GET,
                "/brokerage/product_book",
                request,
                List.of(200),
                new TypeReference<GetProductBookResponse>() {});
    }

    @Override
    public GetProductCandlesResponse getProductCandles(GetProductCandlesRequest request) throws CoinbaseAdvancedException {
        return this.request(
                HttpMethod.GET,
                String.format("/brokerage/products/%s/candles", request.getProductId()),
                request,
                List.of(200),
                new TypeReference<GetProductCandlesResponse>() {});
    }

    @Override
    public GetBestBidAskResponse getBestBidAsk(GetBestBidAskRequest request) throws CoinbaseAdvancedException {
        return this.request(
                HttpMethod.GET,
                "/brokerage/best_bid_ask",
                request,
                List.of(200),
                new TypeReference<GetBestBidAskResponse>() {});
    }

}