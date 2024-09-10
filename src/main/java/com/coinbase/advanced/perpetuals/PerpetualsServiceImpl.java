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

package com.coinbase.advanced.perpetuals;

import com.coinbase.advanced.client.CoinbaseAdvancedClient;
import com.coinbase.advanced.errors.CoinbaseAdvancedException;
import com.coinbase.advanced.model.perpetuals.*;
import com.coinbase.core.common.HttpMethod;
import com.coinbase.core.service.CoinbaseServiceImpl;
import com.fasterxml.jackson.core.type.TypeReference;

import java.util.List;

public class PerpetualsServiceImpl extends CoinbaseServiceImpl implements PerpetualsService {
    public PerpetualsServiceImpl(CoinbaseAdvancedClient client) {
        super(client);
    }

    @Override
    public AllocatePortfolioResponse allocatePortfolio(AllocatePortfolioRequest request) throws CoinbaseAdvancedException {
        return this.request(
                HttpMethod.POST,
                "/brokerage/intx/allocate",
                request,
                List.of(200),
                new TypeReference<AllocatePortfolioResponse>() {});
    }

    @Override
    public GetPerpetualsPortfolioSummaryResponse getPerpetualsPortfolioSummary(GetPerpetualsPortfolioSummaryRequest request) throws CoinbaseAdvancedException {
        return this.request(
                HttpMethod.GET,
                String.format("/brokerage/intx/portfolio/%s", request.getPortfolioUuid()),
                null,
                List.of(200),
                new TypeReference<GetPerpetualsPortfolioSummaryResponse>() {});
    }

    @Override
    public ListPerpetualsPositionsResponse listPerpetualsPositions(ListPerpetualsPositionsRequest request) throws CoinbaseAdvancedException {
        return this.request(
                HttpMethod.GET,
                String.format("/brokerage/intx/positions/%s", request.getPortfolioUuid()),
                null,
                List.of(200),
                new TypeReference<ListPerpetualsPositionsResponse>() {});
    }

    @Override
    public GetPerpetualsPositionResponse getPerpetualsPosition(GetPerpetualsPositionRequest request) throws CoinbaseAdvancedException {
        return this.request(
                HttpMethod.GET,
                String.format("/brokerage/intx/positions/%s/%s", request.getPortfolioUuid(), request.getSymbol()),
                null,
                List.of(200),
                new TypeReference<GetPerpetualsPositionResponse>() {});
    }

    @Override
    public GetPortfoliosBalancesResponse getPortfoliosBalances(GetPortfoliosBalancesRequest request) throws CoinbaseAdvancedException {
        return this.request(
                HttpMethod.GET,
                String.format("/brokerage/intx/balances/%s", request.getPortfolioUuid()),
                null,
                List.of(200),
                new TypeReference<GetPortfoliosBalancesResponse>() {});
    }

    @Override
    public OptInOutMultiAssetCollateralResponse optInOutMultiAssetCollateral(OptInOutMultiAssetCollateralRequest request) throws CoinbaseAdvancedException {
        return this.request(
                HttpMethod.POST,
                "/brokerage/intx/multi_asset_collateral",
                request,
                List.of(200),
                new TypeReference<OptInOutMultiAssetCollateralResponse>() {});
    }
}
