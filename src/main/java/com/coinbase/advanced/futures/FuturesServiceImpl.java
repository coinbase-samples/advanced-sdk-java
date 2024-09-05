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

package com.coinbase.advanced.futures;

import com.coinbase.advanced.client.CoinbaseAdvancedClient;
import com.coinbase.advanced.errors.CoinbaseAdvancedException;
import com.coinbase.advanced.model.futures.*;
import com.coinbase.core.common.HttpMethod;
import com.coinbase.core.service.CoinbaseServiceImpl;
import com.fasterxml.jackson.core.type.TypeReference;

import java.util.List;

public class FuturesServiceImpl extends CoinbaseServiceImpl implements FuturesService {
    public FuturesServiceImpl(CoinbaseAdvancedClient client) {
        super(client);
    }

    @Override
    public GetFuturesBalanceSummaryResponse getFuturesBalanceSummary() throws CoinbaseAdvancedException {
        return this.request(
                HttpMethod.GET,
                "/brokerage/cfm/balance_summary",
                null,
                List.of(200),
                new TypeReference<GetFuturesBalanceSummaryResponse>() {});
    }

    @Override
    public GetIntradayMarginSettingResponse getIntradayMarginSetting() throws CoinbaseAdvancedException {
        return this.request(
                HttpMethod.GET,
                "/brokerage/cfm/intraday/margin_setting",
                null,
                List.of(200),
                new TypeReference<GetIntradayMarginSettingResponse>() {});
    }

    @Override
    public SetIntradayMarginSettingResponse setIntradayMarginSetting(SetIntradayMarginSettingRequest request) throws CoinbaseAdvancedException {
        return this.request(
                HttpMethod.POST,
                "/brokerage/cfm/intraday/margin_setting",
                request,
                List.of(200),
                new TypeReference<SetIntradayMarginSettingResponse>() {});

    }

    @Override
    public GetCurrentMarginWindowResponse getCurrentMarginWindow(GetCurrentMarginWindowRequest request) throws CoinbaseAdvancedException {
        return this.request(
                HttpMethod.GET,
                "/brokerage/cfm/intraday/current_margin_window",
                request,
                List.of(200),
                new TypeReference<GetCurrentMarginWindowResponse>() {});
    }

    @Override
    public ListFuturesPositionsResponse listFuturesPositions() throws CoinbaseAdvancedException {
        return this.request(
                HttpMethod.GET,
                "/brokerage/cfm/positions",
                null,
                List.of(200),
                new TypeReference<ListFuturesPositionsResponse>() {});
    }

    @Override
    public GetFuturesPositionResponse getFuturesPosition(GetFuturesPositionRequest request) throws CoinbaseAdvancedException {
        return this.request(
                HttpMethod.GET,
                String.format("/brokerage/cfm/positions/%s", request.getProductId()),
                null,
                List.of(200),
                new TypeReference<GetFuturesPositionResponse>() {});
    }

    @Override
    public ScheduleFuturesSweepResponse scheduleFuturesSweep(ScheduleFuturesSweepRequest request) throws CoinbaseAdvancedException {
        return this.request(
                HttpMethod.POST,
                "/brokerage/cfm/sweeps/schedule",
                request,
                List.of(200),
                new TypeReference<ScheduleFuturesSweepResponse>() {});
    }

    @Override
    public ListFuturesSweepsResponse listFuturesSweeps() throws CoinbaseAdvancedException {
        return this.request(
                HttpMethod.GET,
                "/brokerage/cfm/sweeps",
                null,
                List.of(200),
                new TypeReference<ListFuturesSweepsResponse>() {});
    }

    @Override
    public CancelPendingFuturesSweepResponse cancelPendingFuturesSweep() throws CoinbaseAdvancedException {
        return this.request(
                HttpMethod.DELETE,
                "/brokerage/cfm/sweeps",
                null,
                List.of(200),
                new TypeReference<CancelPendingFuturesSweepResponse>() {});
    }

}
