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

import com.coinbase.advanced.errors.CoinbaseAdvancedException;
import com.coinbase.advanced.model.markets.GetServerTimeResponse;
import com.coinbase.advanced.model.products.*;

public interface MarketsService {
    GetProductResponse getPublicProduct(String productId) throws CoinbaseAdvancedException;
    ListProductsResponse listPublicProducts() throws CoinbaseAdvancedException;
    GetProductBookResponse getPublicProductBook(String productId, String limit) throws CoinbaseAdvancedException;
    GetProductCandlesResponse getPublicProductCandles(String productId, String granularity, String start, String end) throws CoinbaseAdvancedException;
    GetMarketTradesResponse getPublicMarketTrades(String productId, String limit, String start, String end) throws CoinbaseAdvancedException;
    GetServerTimeResponse getServerTime() throws CoinbaseAdvancedException;

}
