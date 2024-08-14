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

package com.coinbase.advanced.model.futures;

import com.coinbase.advanced.http.CoinbaseAdvancedPostRequest;
import com.fasterxml.jackson.annotation.JsonProperty;

public class ScheduleFuturesSweepRequest implements CoinbaseAdvancedPostRequest {

    @JsonProperty("usd_amount")
    private String usdAmount;

    public ScheduleFuturesSweepRequest(String usdAmount) {
        this.usdAmount = usdAmount;
    }

    public String getUsdAmount() {
        return usdAmount;
    }

    public void setUsdAmount(String usdAmount) {
        this.usdAmount = usdAmount;
    }

    @Override
    public String getPath() {
        return "/brokerage/cfm/sweeps/schedule";
    }

    @Override
    public String getBody() {
        return "{\"usd_amount\":\"" + usdAmount + "\"}";
    }

    public static class Builder {
        private String usdAmount;

        public Builder usdAmount(String usdAmount) {
            this.usdAmount = usdAmount;
            return this;
        }

        public ScheduleFuturesSweepRequest build() {
            return new ScheduleFuturesSweepRequest(usdAmount);
        }
    }
}
