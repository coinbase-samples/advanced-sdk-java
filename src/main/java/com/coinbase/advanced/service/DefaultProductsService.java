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
import com.coinbase.advanced.model.products.*;

public class DefaultProductsService implements ProductsService {

    private final CoinbaseAdvancedHttpClient httpClient;

    public DefaultProductsService(CoinbaseAdvancedHttpClient httpClient) {
        this.httpClient = httpClient;
    }

    @Override
    public ListProductsResponse listProducts(ListProductsRequest request) throws CoinbaseAdvancedException {
        ListProductsResponse resp = httpClient.doGet(request, ListProductsResponse.class);
        return new ListProductsResponse.Builder()
                .products(resp.getProducts())
                .build();
    }

    @Override
    public GetProductResponse getProduct(GetProductRequest request) throws CoinbaseAdvancedException {
        GetProductResponse resp = httpClient.doGet(request, GetProductResponse.class);
        return GetProductResponse.Builder.from(resp)
                .build();
    }


    @Override
    public GetMarketTradesResponse getMarketTrades(GetMarketTradesRequest request) throws CoinbaseAdvancedException {
        GetMarketTradesResponse resp = httpClient.doGet(request, GetMarketTradesResponse.class);
        return new GetMarketTradesResponse.Builder()
                .trades(resp.getTrades())
                .bestBid(resp.getBestBid())
                .bestAsk(resp.getBestAsk())
                .build();
    }

    @Override
    public GetProductBookResponse getProductBook(GetProductBookRequest request) throws CoinbaseAdvancedException {
        GetProductBookResponse resp = httpClient.doGet(request, GetProductBookResponse.class);
        return new GetProductBookResponse.Builder()
                .priceBook(resp.getPriceBook())
                .build();
    }

    @Override
    public GetProductCandlesResponse getProductCandles(GetProductCandlesRequest request) throws CoinbaseAdvancedException {
        GetProductCandlesResponse resp = httpClient.doGet(request, GetProductCandlesResponse.class);
        return new GetProductCandlesResponse.Builder()
                .candles(resp.getCandles())
                .build();
    }

    @Override
    public GetBestBidAskResponse getBestBidAsk(GetBestBidAskRequest request) throws CoinbaseAdvancedException {
        GetBestBidAskResponse resp = httpClient.doGet(request, GetBestBidAskResponse.class);
        return new GetBestBidAskResponse.Builder()
                .priceBooks(resp.getPriceBooks())
                .build();
    }

}
