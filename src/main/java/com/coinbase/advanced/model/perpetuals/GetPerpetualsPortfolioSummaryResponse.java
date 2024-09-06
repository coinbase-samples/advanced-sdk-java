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

package com.coinbase.advanced.model.perpetuals;

import com.fasterxml.jackson.annotation.JsonProperty;

public class GetPerpetualsPortfolioSummaryResponse {

    @JsonProperty("portfolios")
    private IntxPortfolio portfolios;

    public GetPerpetualsPortfolioSummaryResponse() {}

    private GetPerpetualsPortfolioSummaryResponse(Builder builder) {
        this.portfolios = builder.portfolios;
    }

    public IntxPortfolio getPortfolios() {
        return portfolios;
    }

    public void setPortfolios(IntxPortfolio portfolios) {
        this.portfolios = portfolios;
    }

    public static class Builder {
        private IntxPortfolio portfolios;

        public Builder portfolios(IntxPortfolio portfolios) {
            this.portfolios = portfolios;
            return this;
        }

        public GetPerpetualsPortfolioSummaryResponse build() {
            return new GetPerpetualsPortfolioSummaryResponse(this);
        }
    }
}
