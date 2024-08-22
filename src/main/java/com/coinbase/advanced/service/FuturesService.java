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
import com.coinbase.advanced.model.futures.*;

public interface FuturesService {
    GetFuturesBalanceSummaryResponse getFuturesBalanceSummary(GetFuturesBalanceSummaryRequest request) throws CoinbaseAdvancedException;
    GetIntradayMarginSettingResponse getIntradayMarginSetting(GetIntradayMarginSettingRequest request) throws CoinbaseAdvancedException;
    SetIntradayMarginSettingResponse setIntradayMarginSetting(SetIntradayMarginSettingRequest request) throws CoinbaseAdvancedException;
    GetCurrentMarginWindowResponse getCurrentMarginWindow(GetCurrentMarginWindowRequest request) throws CoinbaseAdvancedException;
    ListFuturesPositionsResponse listFuturesPositions(ListFuturesPositionsRequest request) throws CoinbaseAdvancedException;
    GetFuturesPositionResponse getFuturesPosition(GetFuturesPositionRequest request) throws CoinbaseAdvancedException;
    ScheduleFuturesSweepResponse scheduleFuturesSweep(ScheduleFuturesSweepRequest request) throws CoinbaseAdvancedException;
    ListFuturesSweepsResponse listFuturesSweeps(ListFuturesSweepsRequest request) throws CoinbaseAdvancedException;
    CancelPendingFuturesSweepResponse cancelPendingFuturesSweep(CancelPendingFuturesSweepRequest request) throws CoinbaseAdvancedException;
}
