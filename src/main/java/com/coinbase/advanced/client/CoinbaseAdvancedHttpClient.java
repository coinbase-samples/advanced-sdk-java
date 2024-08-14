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
import com.coinbase.advanced.model.futures.*;
import com.coinbase.advanced.model.paymentmethods.*;
import com.coinbase.advanced.model.perpetuals.*;
import com.coinbase.advanced.model.portfolio.*;
import com.coinbase.advanced.model.market.*;
import com.coinbase.advanced.model.product.*;
import com.coinbase.advanced.model.orders.*;
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
        String path = Constants.API_BASE_PATH + request.getPath();

        try {
            String jwtHost = new URI(baseUrl).getHost();
            String jwtToken = credentials.generateJwt("POST", jwtHost, path);

            URI requestUri = new URI(baseUrl + path);

            String requestBody = request.getBody();

            HttpRequest httpRequest = HttpRequest.newBuilder()
                    .uri(requestUri)
                    .header("Authorization", "Bearer " + jwtToken)
                    .header("Accept", "application/json")
                    .header("Content-Type", "application/json")
                    .POST(HttpRequest.BodyPublishers.ofString(requestBody))
                    .build();

            HttpResponse<String> response = httpClient.send(httpRequest, HttpResponse.BodyHandlers.ofString());

            if (response.statusCode() != 200) {
                throw new CoinbaseAdvancedException(response.statusCode(), "Failed to complete request: " + response.body());
            }

            return mapper.readValue(response.body(), responseClass);
        } catch (Exception e) {
            throw new CoinbaseAdvancedException("Failed to complete request", e);
        }
    }

    protected <T> T doPut(CoinbaseAdvancedPutRequest request, Class<T> responseClass) throws CoinbaseAdvancedException {
        String requestMethod = "PUT";
        String path = Constants.API_BASE_PATH + request.getPath();

        try {
            String jwtHost = new URI(baseUrl).getHost();
            String jwtToken = credentials.generateJwt(requestMethod, jwtHost, path);

            String requestUri = baseUrl + path;
            String queryString = request.getQueryString();
            if (queryString != null && !queryString.isEmpty()) {
                requestUri += "?" + queryString;
            }

            String requestBody = request.getBody();

            HttpRequest httpRequest = HttpRequest.newBuilder()
                    .uri(URI.create(requestUri))
                    .header("Authorization", "Bearer " + jwtToken)
                    .header("Accept", "application/json")
                    .header("Content-Type", "application/json")
                    .PUT(HttpRequest.BodyPublishers.ofString(requestBody))
                    .build();

            HttpResponse<String> response = httpClient.send(httpRequest, HttpResponse.BodyHandlers.ofString());

            if (response.statusCode() != 200) {
                String errorMessage = "Failed to complete request, status code: " + response.statusCode();
                String responseBody = response.body();
                if (responseBody != null && !responseBody.isEmpty()) {
                    errorMessage += ", API response: " + responseBody;
                }
                throw new CoinbaseAdvancedException(response.statusCode(), errorMessage);
            }

            return mapper.readValue(response.body(), responseClass);
        } catch (Exception e) {
            throw new CoinbaseAdvancedException("Failed to complete request", e);
        }
    }




    public <T> T doDelete(CoinbaseAdvancedDeleteRequest request, Class<T> responseClass) throws CoinbaseAdvancedException {
        String requestMethod = "DELETE";
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
                    .DELETE()
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
            throw new CoinbaseAdvancedException("Failed to complete request", e);
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
    public CreatePortfolioResponse createPortfolio(CreatePortfolioRequest request) throws CoinbaseAdvancedException {
        CreatePortfolioResponse resp = doPost(request, CreatePortfolioResponse.class);
        return CreatePortfolioResponse.Builder.from(resp).build();
    }

    @Override
    public DeletePortfolioResponse deletePortfolio(DeletePortfolioRequest request) throws CoinbaseAdvancedException {
        DeletePortfolioResponse resp = doDelete(request, DeletePortfolioResponse.class);
        return new DeletePortfolioResponse.Builder()
                .description(resp.getDescription())
                .schema(resp.getSchema())
                .build();
    }

    @Override
    public EditPortfolioResponse editPortfolio(EditPortfolioRequest request) throws CoinbaseAdvancedException {
        EditPortfolioResponse resp = doPut(request, EditPortfolioResponse.class);
        return EditPortfolioResponse.Builder.from(resp).build();
    }

    @Override
    public MovePortfolioFundsResponse movePortfolioFunds(MovePortfolioFundsRequest request) throws CoinbaseAdvancedException {
        MovePortfolioFundsResponse resp = doPost(request, MovePortfolioFundsResponse.class);
        return MovePortfolioFundsResponse.Builder.from(resp)
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

    @Override
    public AllocatePortfolioResponse allocatePortfolio(AllocatePortfolioRequest request) throws CoinbaseAdvancedException {
        AllocatePortfolioResponse resp = doPost(request, AllocatePortfolioResponse.class);
        return AllocatePortfolioResponse.Builder.from(resp)
                .build();
    }

    @Override
    public GetPerpetualsPortfolioSummaryResponse getPerpetualsPortfolioSummary(GetPerpetualsPortfolioSummaryRequest request) throws CoinbaseAdvancedException {
        GetPerpetualsPortfolioSummaryResponse resp = doGet(request, GetPerpetualsPortfolioSummaryResponse.class);
        return GetPerpetualsPortfolioSummaryResponse.Builder.from(resp)
                .build();
    }

    @Override
    public ListPerpetualsPositionsResponse listPerpetualsPositions(ListPerpetualsPositionsRequest request) throws CoinbaseAdvancedException {
        ListPerpetualsPositionsResponse resp = doGet(request, ListPerpetualsPositionsResponse.class);
        return new ListPerpetualsPositionsResponse.Builder()
                .positions(resp.getPositions())
                .summary(resp.getSummary())
                .build();
    }

    @Override
    public GetPerpetualsPositionResponse getPerpetualsPosition(GetPerpetualsPositionRequest request) throws CoinbaseAdvancedException {
        GetPerpetualsPositionResponse resp = doGet(request, GetPerpetualsPositionResponse.class);
        return GetPerpetualsPositionResponse.Builder.from(resp)
                .build();
    }

    @Override
    public GetPortfoliosBalancesResponse getPortfoliosBalances(GetPortfoliosBalancesRequest request) throws CoinbaseAdvancedException {
        GetPortfoliosBalancesResponse resp = doGet(request, GetPortfoliosBalancesResponse.class);
        return GetPortfoliosBalancesResponse.Builder.from(resp)
                .build();
    }

    @Override
    public OptInOutMultiAssetCollateralResponse optInOutMultiAssetCollateral(OptInOutMultiAssetCollateralRequest request) throws CoinbaseAdvancedException {
        OptInOutMultiAssetCollateralResponse resp = doPost(request, OptInOutMultiAssetCollateralResponse.class);
        return OptInOutMultiAssetCollateralResponse.Builder.from(resp)
                .build();
    }

    @Override
    public GetFuturesBalanceSummaryResponse getFuturesBalanceSummary(GetFuturesBalanceSummaryRequest request) throws CoinbaseAdvancedException {
        GetFuturesBalanceSummaryResponse resp = doGet(request, GetFuturesBalanceSummaryResponse.class);
        return GetFuturesBalanceSummaryResponse.Builder.from(resp)
                .build();
    }

    @Override
    public GetIntradayMarginSettingResponse getIntradayMarginSetting(GetIntradayMarginSettingRequest request) throws CoinbaseAdvancedException {
        GetIntradayMarginSettingResponse resp = doGet(request, GetIntradayMarginSettingResponse.class);
        return GetIntradayMarginSettingResponse.Builder.from(resp)
                .build();
    }

    @Override
    public SetIntradayMarginSettingResponse setIntradayMarginSetting(SetIntradayMarginSettingRequest request) throws CoinbaseAdvancedException {
        SetIntradayMarginSettingResponse resp = doPost(request, SetIntradayMarginSettingResponse.class);
        return SetIntradayMarginSettingResponse.Builder.from(resp)
                .build();
    }

    @Override
    public GetCurrentMarginWindowResponse getCurrentMarginWindow(GetCurrentMarginWindowRequest request) throws CoinbaseAdvancedException {
        GetCurrentMarginWindowResponse resp = doGet(request, GetCurrentMarginWindowResponse.class);
        return GetCurrentMarginWindowResponse.Builder.from(resp)
                .build();
    }

    @Override
    public ListFuturesPositionsResponse listFuturesPositions(ListFuturesPositionsRequest request) throws CoinbaseAdvancedException {
        ListFuturesPositionsResponse resp = doGet(request, ListFuturesPositionsResponse.class);
        return ListFuturesPositionsResponse.Builder.from(resp)
                .build();
    }

    @Override
    public GetFuturesPositionResponse getFuturesPosition(GetFuturesPositionRequest request) throws CoinbaseAdvancedException {
        GetFuturesPositionResponse resp = doGet(request, GetFuturesPositionResponse.class);
        return GetFuturesPositionResponse.Builder.from(resp).build();
    }

    @Override
    public ScheduleFuturesSweepResponse scheduleFuturesSweep(ScheduleFuturesSweepRequest request) throws CoinbaseAdvancedException {
        ScheduleFuturesSweepResponse resp = doPost(request, ScheduleFuturesSweepResponse.class);
        return ScheduleFuturesSweepResponse.Builder.from(resp).build();
    }

    @Override
    public ListFuturesSweepsResponse listFuturesSweeps(ListFuturesSweepsRequest request) throws CoinbaseAdvancedException {
        ListFuturesSweepsResponse resp = doGet(request, ListFuturesSweepsResponse.class);
        return ListFuturesSweepsResponse.Builder.from(resp).build();
    }

    @Override
    public CancelPendingFuturesSweepResponse cancelPendingFuturesSweep(CancelPendingFuturesSweepRequest request) throws CoinbaseAdvancedException {
        CancelPendingFuturesSweepResponse resp = doDelete(request, CancelPendingFuturesSweepResponse.class);
        return CancelPendingFuturesSweepResponse.Builder.from(resp).build();
    }

    @Override
    public ListOrdersResponse listOrders(ListOrdersRequest request) throws CoinbaseAdvancedException {
        ListOrdersResponse resp = doGet(request, ListOrdersResponse.class);
        return ListOrdersResponse.Builder.from(resp)
                .build();
    }

    @Override
    public GetOrderResponse getOrder(GetOrderRequest request) throws CoinbaseAdvancedException {
        GetOrderResponse resp = doGet(request, GetOrderResponse.class);
        return GetOrderResponse.Builder.from(resp)
                .build();
    }

    @Override
    public ListFillsResponse listFills(ListFillsRequest request) throws CoinbaseAdvancedException {
        ListFillsResponse resp = doGet(request, ListFillsResponse.class);
        return ListFillsResponse.Builder.from(resp)
                .build();
    }

    @Override
    public CreateOrderPreviewResponse createOrderPreview(CreateOrderPreviewRequest request) throws CoinbaseAdvancedException {
        CreateOrderPreviewResponse resp = doPost(request, CreateOrderPreviewResponse.class);
        return CreateOrderPreviewResponse.Builder.from(resp)
                .build();
    }

    @Override
    public CreateOrderResponse createOrder(CreateOrderRequest request) throws CoinbaseAdvancedException {
        CreateOrderResponse resp = doPost(request, CreateOrderResponse.class);
        return CreateOrderResponse.Builder.from(resp).build();
    }

    @Override
    public CancelOrdersResponse cancelOrders(CancelOrdersRequest request) throws CoinbaseAdvancedException {
        CancelOrdersResponse resp = doPost(request, CancelOrdersResponse.class);
        return CancelOrdersResponse.Builder.from(resp).build();
    }

    @Override
    public EditOrderResponse editOrder(EditOrderRequest request) throws CoinbaseAdvancedException {
        EditOrderResponse resp = doPost(request, EditOrderResponse.class);
        return EditOrderResponse.Builder.from(resp)
                .build();
    }

    @Override
    public PreviewEditOrderResponse previewEditOrder(PreviewEditOrderRequest request) throws CoinbaseAdvancedException {
        PreviewEditOrderResponse resp = doPost(request, PreviewEditOrderResponse.class);
        return PreviewEditOrderResponse.Builder.from(resp).build();
    }
}
