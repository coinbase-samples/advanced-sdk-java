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

package com.coinbase.advanced.model.portfolio;

import com.fasterxml.jackson.annotation.JsonProperty;

public class GetPortfolioBreakdownResponse {

    @JsonProperty("breakdown")
    private Breakdown breakdown;

    public GetPortfolioBreakdownResponse() {}

    private GetPortfolioBreakdownResponse(Builder builder) {
        this.breakdown = builder.breakdown;
    }

    public Breakdown getBreakdown() {
        return breakdown;
    }

    public void setBreakdown(Breakdown breakdown) {
        this.breakdown = breakdown;
    }

    public static class Builder {
        private Breakdown breakdown;

        public Builder breakdown(Breakdown breakdown) {
            this.breakdown = breakdown;
            return this;
        }

        public GetPortfolioBreakdownResponse build() {
            return new GetPortfolioBreakdownResponse(this);
        }
    }
}
