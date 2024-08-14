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

import com.fasterxml.jackson.annotation.JsonProperty;

public class GetFuturesBalanceSummaryResponse {

    @JsonProperty("balance_summary")
    private BalanceSummary balanceSummary;

    public GetFuturesBalanceSummaryResponse() {}

    private GetFuturesBalanceSummaryResponse(Builder builder) {
        this.balanceSummary = builder.balanceSummary;
    }

    public BalanceSummary getBalanceSummary() {
        return balanceSummary;
    }

    public void setBalanceSummary(BalanceSummary balanceSummary) {
        this.balanceSummary = balanceSummary;
    }

    public static class Builder {
        private BalanceSummary balanceSummary;

        public Builder balanceSummary(BalanceSummary balanceSummary) {
            this.balanceSummary = balanceSummary;
            return this;
        }

        public static Builder from(GetFuturesBalanceSummaryResponse resp) {
            return new Builder().balanceSummary(resp.getBalanceSummary());
        }

        public GetFuturesBalanceSummaryResponse build() {
            return new GetFuturesBalanceSummaryResponse(this);
        }
    }
}
