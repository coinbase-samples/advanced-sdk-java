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

import com.coinbase.advanced.errors.CoinbaseAdvancedException;
import com.coinbase.advanced.model.account.GetAccountRequest;
import com.coinbase.advanced.model.account.GetAccountResponse;
import com.coinbase.advanced.model.account.ListAccountsRequest;
import com.coinbase.advanced.model.account.ListAccountsResponse;
import com.coinbase.advanced.model.convert.*;
import com.coinbase.advanced.model.fees.GetTransactionsSummaryRequest;
import com.coinbase.advanced.model.fees.GetTransactionsSummaryResponse;
import com.coinbase.advanced.model.futures.*;
import com.coinbase.advanced.model.market.GetServerTimeResponse;
import com.coinbase.advanced.model.orders.ListOrdersRequest;
import com.coinbase.advanced.model.orders.ListOrdersResponse;
import com.coinbase.advanced.model.paymentmethods.GetPaymentMethodRequest;
import com.coinbase.advanced.model.paymentmethods.GetPaymentMethodResponse;
import com.coinbase.advanced.model.paymentmethods.ListPaymentMethodsRequest;
import com.coinbase.advanced.model.paymentmethods.ListPaymentMethodsResponse;
import com.coinbase.advanced.model.perpetuals.*;
import com.coinbase.advanced.model.portfolio.*;
import com.coinbase.advanced.model.product.*;

public interface CoinbaseAdvancedApi {
    // Portfolios
    ListPortfoliosResponse listPortfolios(ListPortfoliosRequest request)  throws CoinbaseAdvancedException;
    GetPortfolioBreakdownResponse getPortfolioBreakdown(GetPortfolioBreakdownRequest request) throws CoinbaseAdvancedException;

    // Accounts
    ListAccountsResponse listAccounts(ListAccountsRequest request)  throws CoinbaseAdvancedException;
    CreatePortfolioResponse createPortfolio(CreatePortfolioRequest request) throws CoinbaseAdvancedException;
    MovePortfolioFundsResponse movePortfolioFunds(MovePortfolioFundsRequest request) throws CoinbaseAdvancedException;
    GetAccountResponse getAccount(GetAccountRequest request) throws CoinbaseAdvancedException;
    DeletePortfolioResponse deletePortfolio(DeletePortfolioRequest request) throws CoinbaseAdvancedException;
    EditPortfolioResponse editPortfolio(EditPortfolioRequest request) throws CoinbaseAdvancedException;

    // Products
    ListProductsResponse listProducts(ListProductsRequest request) throws Exception;
    GetProductResponse getProduct(GetProductRequest request) throws CoinbaseAdvancedException;
    GetMarketTradesResponse getMarketTrades(GetMarketTradesRequest request) throws CoinbaseAdvancedException;
    GetProductBookResponse getProductBook(GetProductBookRequest request) throws CoinbaseAdvancedException;
    GetProductCandlesResponse getProductCandles(GetProductCandlesRequest request) throws CoinbaseAdvancedException;
    GetBestBidAskResponse getBestBidAsk(GetBestBidAskRequest request) throws CoinbaseAdvancedException;

    // Fees
    GetTransactionsSummaryResponse getTransactionsSummary(GetTransactionsSummaryRequest request) throws CoinbaseAdvancedException;

    // Payment Methods
    ListPaymentMethodsResponse listPaymentMethods(ListPaymentMethodsRequest request) throws CoinbaseAdvancedException;
    GetPaymentMethodResponse getPaymentMethod(GetPaymentMethodRequest request) throws CoinbaseAdvancedException;

    // Public market
    GetProductResponse getPublicProduct(String productId) throws CoinbaseAdvancedException;
    ListProductsResponse listPublicProducts() throws CoinbaseAdvancedException;
    GetProductBookResponse getPublicProductBook(String productId, String limit) throws CoinbaseAdvancedException;
    GetProductCandlesResponse getPublicProductCandles(String productId, String granularity, String start, String end) throws CoinbaseAdvancedException;
    GetMarketTradesResponse getPublicMarketTrades(String productId, String limit, String start, String end) throws CoinbaseAdvancedException;
    GetServerTimeResponse getServerTime() throws CoinbaseAdvancedException;

    // Converts
    CreateConvertQuoteResponse createConvertQuote(CreateConvertQuoteRequest request) throws CoinbaseAdvancedException;
    GetConvertTradeResponse getConvertTrade(GetConvertTradeRequest request) throws CoinbaseAdvancedException;
    CommitConvertQuoteResponse commitConvertQuote(CommitConvertQuoteRequest request) throws CoinbaseAdvancedException;

    // Perpetuals
    AllocatePortfolioResponse allocatePortfolio(AllocatePortfolioRequest request) throws CoinbaseAdvancedException;
    GetPerpetualsPortfolioSummaryResponse getPerpetualsPortfolioSummary(GetPerpetualsPortfolioSummaryRequest request) throws CoinbaseAdvancedException;
    ListPerpetualsPositionsResponse listPerpetualsPositions(ListPerpetualsPositionsRequest request) throws CoinbaseAdvancedException;
    GetPerpetualsPositionResponse getPerpetualsPosition(GetPerpetualsPositionRequest request) throws CoinbaseAdvancedException;
    GetPortfoliosBalancesResponse getPortfoliosBalances(GetPortfoliosBalancesRequest request) throws CoinbaseAdvancedException;
    OptInOutMultiAssetCollateralResponse optInOutMultiAssetCollateral(OptInOutMultiAssetCollateralRequest request) throws CoinbaseAdvancedException;

    // Futures
    GetFuturesBalanceSummaryResponse getFuturesBalanceSummary(GetFuturesBalanceSummaryRequest request) throws CoinbaseAdvancedException;
    GetIntradayMarginSettingResponse getIntradayMarginSetting(GetIntradayMarginSettingRequest request) throws CoinbaseAdvancedException;
    SetIntradayMarginSettingResponse setIntradayMarginSetting(SetIntradayMarginSettingRequest request) throws CoinbaseAdvancedException;
    GetCurrentMarginWindowResponse getCurrentMarginWindow(GetCurrentMarginWindowRequest request) throws CoinbaseAdvancedException;
    ListFuturesPositionsResponse listFuturesPositions(ListFuturesPositionsRequest request) throws CoinbaseAdvancedException;
    GetFuturesPositionResponse getFuturesPosition(GetFuturesPositionRequest request) throws CoinbaseAdvancedException;
    ScheduleFuturesSweepResponse scheduleFuturesSweep(ScheduleFuturesSweepRequest request) throws CoinbaseAdvancedException;
    ListFuturesSweepsResponse listFuturesSweeps(ListFuturesSweepsRequest request) throws CoinbaseAdvancedException;
    CancelPendingFuturesSweepResponse cancelPendingFuturesSweep(CancelPendingFuturesSweepRequest request) throws CoinbaseAdvancedException;

    ListOrdersResponse listOrders(ListOrdersRequest request) throws CoinbaseAdvancedException;

    // Orders


}