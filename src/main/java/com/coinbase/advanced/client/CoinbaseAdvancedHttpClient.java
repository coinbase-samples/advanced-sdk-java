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

import com.coinbase.advanced.credentials.CoinbaseCredentials;
import com.coinbase.advanced.errors.CoinbaseAdvancedException;
import com.coinbase.advanced.http.*;
import com.coinbase.advanced.model.account.*;
import com.coinbase.advanced.model.convert.*;
import com.coinbase.advanced.model.fees.*;
import com.coinbase.advanced.model.paymentmethods.*;
import com.coinbase.advanced.model.portfolio.*;
import com.coinbase.advanced.model.market.*;
import com.coinbase.advanced.model.product.*;
import com.coinbase.advanced.utils.Constants;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class CoinbaseAdvancedHttpClient implements CoinbaseAdvancedApi {

    private final CoinbaseCredentials credentials;
    private final HttpClient httpClient;
    private final ObjectMapper mapper;
    private final String baseUrl;

    public CoinbaseAdvancedHttpClient(CoinbaseCredentials credentials, String baseUrl) {
        this.credentials = credentials;
        this.httpClient = HttpClient.newHttpClient();
        this.mapper = new ObjectMapper();
        this.baseUrl = baseUrl;
    }

    protected <T> T doGet(CoinbaseAdvancedGetRequest request, Class<T> responseClass) throws CoinbaseAdvancedException {
        String requestMethod = "GET";
        String path = Constants.API_BASE_PATH + request.getPath();

        try {
            String jwtHost = new URI(baseUrl).getHost();
            String jwtToken = credentials.generateJwt(requestMethod, jwtHost, path);
            System.out.println("Generated JWT in client: " + jwtToken);

            String requestUri = baseUrl + path;

            String queryString = request.getQueryString();
            if (queryString != null && !queryString.isEmpty()) {
                requestUri += "?" + queryString;
            }

            System.out.println("Request URI with Query String: " + requestUri);

            HttpRequest httpRequest = HttpRequest.newBuilder()
                    .uri(URI.create(requestUri))
                    .header("Authorization", "Bearer " + jwtToken)
                    .header("Accept", "application/json")
                    .GET()
                    .build();

            System.out.println("Debug: HTTP Request URI - " + httpRequest.uri().toString());
            System.out.println("Request Headers in client:");
            httpRequest.headers().map().forEach((key, value) -> System.out.println(key + ": " + value));

            HttpResponse<String> response = httpClient.send(httpRequest, HttpResponse.BodyHandlers.ofString());

            System.out.println("Response status code: " + response.statusCode());
            System.out.println("Response body: " + response.body());

            if (response.statusCode() != 200) {
                throw new CoinbaseAdvancedException(response.statusCode(), "Failed to complete request, status code: " + response.statusCode());
            }

            return mapper.readValue(response.body(), responseClass);
        } catch (Exception e) {
            throw new CoinbaseAdvancedException("Failed to parse response", e);
        }
    }

    protected <T> T doGetPublic(String path, String queryString, Class<T> responseClass) throws CoinbaseAdvancedException {
        try {
            String fullPath = "/api/v3/brokerage" + path;

            if (queryString != null && !queryString.isEmpty()) {
                fullPath += "?" + queryString;
            }

            URI requestUri = new URI(baseUrl + fullPath);
            System.out.println("Request URI for public endpoint: " + requestUri.toString());

            HttpRequest httpRequest = HttpRequest.newBuilder()
                    .uri(requestUri)
                    .header("Accept", "application/json")
                    .GET()
                    .build();

            HttpResponse<String> response = httpClient.send(httpRequest, HttpResponse.BodyHandlers.ofString());

            if (response.statusCode() != 200) {
                throw new CoinbaseAdvancedException(response.statusCode(), "Failed to complete public request, status code: " + response.statusCode());
            }

            return mapper.readValue(response.body(), responseClass);
        } catch (Exception e) {
            throw new CoinbaseAdvancedException("Failed to parse public response", e);
        }
    }

    protected <T> T doPost(CoinbaseAdvancedPostRequest request, Class<T> responseClass) throws CoinbaseAdvancedException {
        String requestMethod = "POST";
        String path = Constants.API_BASE_PATH + request.getPath();

        try {
            String jwtHost = new URI(baseUrl).getHost();
            String jwtToken = credentials.generateJwt(requestMethod, jwtHost, path);

            URI requestUri = new URI(baseUrl + path);

            HttpRequest httpRequest = HttpRequest.newBuilder()
                    .uri(requestUri)
                    .header("Authorization", "Bearer " + jwtToken)
                    .header("Content-Type", "application/json")
                    .POST(HttpRequest.BodyPublishers.ofString(mapper.writeValueAsString(request)))
                    .build();

            HttpResponse<String> response = httpClient.send(httpRequest, HttpResponse.BodyHandlers.ofString());

            if (response.statusCode() != 200) {
                throw new CoinbaseAdvancedException(response.statusCode(), "Failed to complete request: " + response.body());
            }

            return mapper.readValue(response.body(), responseClass);
        } catch (Exception e) {
            throw new CoinbaseAdvancedException("Failed to execute POST request", e);
        }
    }



    @Override
    public ListAccountsResponse listAccounts(ListAccountsRequest request) throws CoinbaseAdvancedException {
        ListAccountsResponse resp = doGet(request, ListAccountsResponse.class);
        return new ListAccountsResponse.Builder()
                .pagination(resp.getPagination())
                .accounts(resp.getAccounts())
                .build();
    }

    @Override
    public ListPortfoliosResponse listPortfolios(ListPortfoliosRequest request) throws CoinbaseAdvancedException {
        ListPortfoliosResponse resp = doGet(request, ListPortfoliosResponse.class);
        return new ListPortfoliosResponse.Builder()
                .portfolios(resp.getPortfolios())
                .build();
    }

    @Override
    public GetPortfolioBreakdownResponse getPortfolioBreakdown(GetPortfolioBreakdownRequest request) throws CoinbaseAdvancedException {
        GetPortfolioBreakdownResponse resp = doGet(request, GetPortfolioBreakdownResponse.class);
        return new GetPortfolioBreakdownResponse.Builder()
                .breakdown(resp.getBreakdown())
                .build();
    }

    @Override
    public GetAccountResponse getAccount(GetAccountRequest request) throws CoinbaseAdvancedException {
        GetAccountResponse resp = doGet(request, GetAccountResponse.class);
        return new GetAccountResponse.Builder()
                .account(resp.getAccount())
                .build();
    }

    @Override
    public ListProductsResponse listProducts(ListProductsRequest request) throws CoinbaseAdvancedException {
        ListProductsResponse resp = doGet(request, ListProductsResponse.class);
        return new ListProductsResponse.Builder()
                .products(resp.getProducts())
                .build();
    }

    @Override
    public GetProductResponse getProduct(GetProductRequest request) throws CoinbaseAdvancedException {
        GetProductResponse resp = doGet(request, GetProductResponse.class);
        return GetProductResponse.Builder.from(resp)
                .build();
    }


    @Override
    public GetMarketTradesResponse getMarketTrades(GetMarketTradesRequest request) throws CoinbaseAdvancedException {
        GetMarketTradesResponse resp = doGet(request, GetMarketTradesResponse.class);
        return new GetMarketTradesResponse.Builder()
                .trades(resp.getTrades())
                .bestBid(resp.getBestBid())
                .bestAsk(resp.getBestAsk())
                .build();
    }

    @Override
    public GetProductBookResponse getProductBook(GetProductBookRequest request) throws CoinbaseAdvancedException {
        GetProductBookResponse resp = doGet(request, GetProductBookResponse.class);
        return new GetProductBookResponse.Builder()
                .priceBook(resp.getPriceBook())
                .build();
    }

    @Override
    public GetProductCandlesResponse getProductCandles(GetProductCandlesRequest request) throws CoinbaseAdvancedException {
        GetProductCandlesResponse resp = doGet(request, GetProductCandlesResponse.class);
        return new GetProductCandlesResponse.Builder()
                .candles(resp.getCandles())
                .build();
    }

    @Override
    public GetBestBidAskResponse getBestBidAsk(GetBestBidAskRequest request) throws CoinbaseAdvancedException {
        GetBestBidAskResponse resp = doGet(request, GetBestBidAskResponse.class);
        return new GetBestBidAskResponse.Builder()
                .priceBooks(resp.getPriceBooks())
                .build();
    }

    @Override
    public GetTransactionsSummaryResponse getTransactionsSummary(GetTransactionsSummaryRequest request) throws CoinbaseAdvancedException {
        GetTransactionsSummaryResponse resp = doGet(request, GetTransactionsSummaryResponse.class);
        return GetTransactionsSummaryResponse.Builder.from(resp)
                .build();
    }

    @Override
    public ListPaymentMethodsResponse listPaymentMethods(ListPaymentMethodsRequest request) throws CoinbaseAdvancedException {
        ListPaymentMethodsResponse resp = doGet(request, ListPaymentMethodsResponse.class);
        return ListPaymentMethodsResponse.Builder.from(resp)
                .build();
    }

    @Override
    public GetPaymentMethodResponse getPaymentMethod(GetPaymentMethodRequest request) throws CoinbaseAdvancedException {
        GetPaymentMethodResponse resp = doGet(request, GetPaymentMethodResponse.class);
        return GetPaymentMethodResponse.Builder.from(resp)
                .build();
    }

    @Override
    public GetProductResponse getPublicProduct(String productId) throws CoinbaseAdvancedException {
        String path = "/market/products/" + productId;
        return doGetPublic(path, null, GetProductResponse.class);
    }

    @Override
    public ListProductsResponse listPublicProducts() throws CoinbaseAdvancedException {
        String path = "/market/products";
        return doGetPublic(path, null, ListProductsResponse.class);
}

    @Override
    public GetProductBookResponse getPublicProductBook(String productId, String limit) throws CoinbaseAdvancedException {
        String path = "/market/product_book";
        String queryString = "product_id=" + productId;
        if (limit != null && !limit.isEmpty()) {
            queryString += "&limit=" + limit;
        }
        return doGetPublic(path, queryString, GetProductBookResponse.class);
    }

    @Override
    public GetProductCandlesResponse getPublicProductCandles(String productId, String granularity, String start, String end) throws CoinbaseAdvancedException {
        String path = "/market/products/" + productId + "/candles";
        String queryString = "granularity=" + granularity + "&start=" + start + "&end=" + end;
        return doGetPublic(path, queryString, GetProductCandlesResponse.class);
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
        return doGetPublic(path, queryString, GetMarketTradesResponse.class);
    }

    @Override
    public GetServerTimeResponse getServerTime() throws CoinbaseAdvancedException {
        String path = "/time";
        return doGetPublic(path, null, GetServerTimeResponse.class);
    }

    @Override
    public CreateConvertQuoteResponse createConvertQuote(CreateConvertQuoteRequest request) throws CoinbaseAdvancedException {
        CreateConvertQuoteResponse resp = doPost(request, CreateConvertQuoteResponse.class);
        return CreateConvertQuoteResponse.Builder.from(resp)
                .build();
    }

    @Override
    public GetConvertTradeResponse getConvertTrade(GetConvertTradeRequest request) throws CoinbaseAdvancedException {
        GetConvertTradeResponse resp = doGet(request, GetConvertTradeResponse.class);
        return GetConvertTradeResponse.Builder.from(resp)
                .build();
    }

    @Override
    public CommitConvertQuoteResponse commitConvertQuote(CommitConvertQuoteRequest request) throws CoinbaseAdvancedException {
        CommitConvertQuoteResponse resp = doPost(request, CommitConvertQuoteResponse.class);
        return CommitConvertQuoteResponse.Builder.from(resp)
                .build();
    }

}
