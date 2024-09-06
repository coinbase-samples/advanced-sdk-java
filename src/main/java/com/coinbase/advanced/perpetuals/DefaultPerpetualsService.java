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

public class DefaultPerpetualsService implements PerpetualsService {

    private final CoinbaseAdvancedClient httpClient;

    public DefaultPerpetualsService(CoinbaseAdvancedClient httpClient) {
        this.httpClient = httpClient;
    }

    @Override
    public AllocatePortfolioResponse allocatePortfolio(AllocatePortfolioRequest request) throws CoinbaseAdvancedException {
        AllocatePortfolioResponse resp = httpClient.doPost(request, AllocatePortfolioResponse.class);
        return AllocatePortfolioResponse.Builder.from(resp)
                .build();
    }

    @Override
    public GetPerpetualsPortfolioSummaryResponse getPerpetualsPortfolioSummary(GetPerpetualsPortfolioSummaryRequest request) throws CoinbaseAdvancedException {
        GetPerpetualsPortfolioSummaryResponse resp = httpClient.doGet(request, GetPerpetualsPortfolioSummaryResponse.class);
        return GetPerpetualsPortfolioSummaryResponse.Builder.from(resp)
                .build();
    }

    @Override
    public ListPerpetualsPositionsResponse listPerpetualsPositions(ListPerpetualsPositionsRequest request) throws CoinbaseAdvancedException {
        ListPerpetualsPositionsResponse resp = httpClient.doGet(request, ListPerpetualsPositionsResponse.class);
        return new ListPerpetualsPositionsResponse.Builder()
                .positions(resp.getPositions())
                .summary(resp.getSummary())
                .build();
    }

    @Override
    public GetPerpetualsPositionResponse getPerpetualsPosition(GetPerpetualsPositionRequest request) throws CoinbaseAdvancedException {
        GetPerpetualsPositionResponse resp = httpClient.doGet(request, GetPerpetualsPositionResponse.class);
        return GetPerpetualsPositionResponse.Builder.from(resp)
                .build();
    }

    @Override
    public GetPortfoliosBalancesResponse getPortfoliosBalances(GetPortfoliosBalancesRequest request) throws CoinbaseAdvancedException {
        GetPortfoliosBalancesResponse resp = httpClient.doGet(request, GetPortfoliosBalancesResponse.class);
        return GetPortfoliosBalancesResponse.Builder.from(resp)
                .build();
    }

    @Override
    public OptInOutMultiAssetCollateralResponse optInOutMultiAssetCollateral(OptInOutMultiAssetCollateralRequest request) throws CoinbaseAdvancedException {
        OptInOutMultiAssetCollateralResponse resp = httpClient.doPost(request, OptInOutMultiAssetCollateralResponse.class);
        return OptInOutMultiAssetCollateralResponse.Builder.from(resp)
                .build();
    }

}
