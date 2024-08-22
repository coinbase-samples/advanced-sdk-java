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
import com.coinbase.advanced.model.futures.*;

public class DefaultFuturesService implements FuturesService {

    private final CoinbaseAdvancedHttpClient httpClient;

    public DefaultFuturesService(CoinbaseAdvancedHttpClient httpClient) {
        this.httpClient = httpClient;
    }

    @Override
    public GetFuturesBalanceSummaryResponse getFuturesBalanceSummary(GetFuturesBalanceSummaryRequest request) throws CoinbaseAdvancedException {
        GetFuturesBalanceSummaryResponse resp = httpClient.doGet(request, GetFuturesBalanceSummaryResponse.class);
        return GetFuturesBalanceSummaryResponse.Builder.from(resp)
                .build();
    }

    @Override
    public GetIntradayMarginSettingResponse getIntradayMarginSetting(GetIntradayMarginSettingRequest request) throws CoinbaseAdvancedException {
        GetIntradayMarginSettingResponse resp = httpClient.doGet(request, GetIntradayMarginSettingResponse.class);
        return GetIntradayMarginSettingResponse.Builder.from(resp)
                .build();
    }

    @Override
    public SetIntradayMarginSettingResponse setIntradayMarginSetting(SetIntradayMarginSettingRequest request) throws CoinbaseAdvancedException {
        SetIntradayMarginSettingResponse resp = httpClient.doPost(request, SetIntradayMarginSettingResponse.class);
        return SetIntradayMarginSettingResponse.Builder.from(resp)
                .build();
    }

    @Override
    public GetCurrentMarginWindowResponse getCurrentMarginWindow(GetCurrentMarginWindowRequest request) throws CoinbaseAdvancedException {
        GetCurrentMarginWindowResponse resp = httpClient.doGet(request, GetCurrentMarginWindowResponse.class);
        return GetCurrentMarginWindowResponse.Builder.from(resp)
                .build();
    }

    @Override
    public ListFuturesPositionsResponse listFuturesPositions(ListFuturesPositionsRequest request) throws CoinbaseAdvancedException {
        ListFuturesPositionsResponse resp = httpClient.doGet(request, ListFuturesPositionsResponse.class);
        return ListFuturesPositionsResponse.Builder.from(resp)
                .build();
    }

    @Override
    public GetFuturesPositionResponse getFuturesPosition(GetFuturesPositionRequest request) throws CoinbaseAdvancedException {
        GetFuturesPositionResponse resp = httpClient.doGet(request, GetFuturesPositionResponse.class);
        return GetFuturesPositionResponse.Builder.from(resp).build();
    }

    @Override
    public ScheduleFuturesSweepResponse scheduleFuturesSweep(ScheduleFuturesSweepRequest request) throws CoinbaseAdvancedException {
        ScheduleFuturesSweepResponse resp = httpClient.doPost(request, ScheduleFuturesSweepResponse.class);
        return ScheduleFuturesSweepResponse.Builder.from(resp).build();
    }

    @Override
    public ListFuturesSweepsResponse listFuturesSweeps(ListFuturesSweepsRequest request) throws CoinbaseAdvancedException {
        ListFuturesSweepsResponse resp = httpClient.doGet(request, ListFuturesSweepsResponse.class);
        return ListFuturesSweepsResponse.Builder.from(resp).build();
    }

    @Override
    public CancelPendingFuturesSweepResponse cancelPendingFuturesSweep(CancelPendingFuturesSweepRequest request) throws CoinbaseAdvancedException {
        CancelPendingFuturesSweepResponse resp = httpClient.doDelete(request, CancelPendingFuturesSweepResponse.class);
        return CancelPendingFuturesSweepResponse.Builder.from(resp).build();
    }

}
