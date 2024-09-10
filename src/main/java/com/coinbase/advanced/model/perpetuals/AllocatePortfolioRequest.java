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

public class AllocatePortfolioRequest {

    @JsonProperty("portfolio_uuid")
    private String portfolioUuid;

    @JsonProperty("symbol")
    private String symbol;

    @JsonProperty("amount")
    private String amount;

    @JsonProperty("currency")
    private String currency;

    public AllocatePortfolioRequest() {}

    private AllocatePortfolioRequest(Builder builder) {
        this.portfolioUuid = builder.portfolioUuid;
        this.symbol = builder.symbol;
        this.amount = builder.amount;
        this.currency = builder.currency;
    }

    public String getPortfolioUuid() {
        return portfolioUuid;
    }

    public void setPortfolioUuid(String portfolioUuid) {
        this.portfolioUuid = portfolioUuid;
    }

    public String getSymbol() {
        return symbol;
    }

    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }

    public String getAmount() {
        return amount;
    }

    public void setAmount(String amount) {
        this.amount = amount;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public static class Builder {
        private String portfolioUuid;
        private String symbol;
        private String amount;
        private String currency;

        public Builder() {}

        public Builder portfolioUuid(String portfolioUuid) {
            this.portfolioUuid = portfolioUuid;
            return this;
        }

        public Builder symbol(String symbol) {
            this.symbol = symbol;
            return this;
        }

        public Builder amount(String amount) {
            this.amount = amount;
            return this;
        }

        public Builder currency(String currency) {
            this.currency = currency;
            return this;
        }

        public AllocatePortfolioRequest build() {
            return new AllocatePortfolioRequest(this);
        }
    }
}
