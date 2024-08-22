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

package com.coinbase.advanced.model.portfolios;

import com.coinbase.advanced.http.CoinbaseAdvancedGetRequest;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

public class ListPortfoliosRequest implements CoinbaseAdvancedGetRequest {

    @JsonProperty("portfolio_type")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String portfolioType;

    public ListPortfoliosRequest() {}

    private ListPortfoliosRequest(Builder builder) {
        this.portfolioType = builder.portfolioType;
    }

    public String getPortfolioType() {
        return portfolioType;
    }

    public void setPortfolioType(String portfolioType) {
        this.portfolioType = portfolioType;
    }

    @Override
    public String getPath() {
        return "/brokerage/portfolios";
    }

    @Override
    public String getQueryString() {
        if (portfolioType != null) {
            return "portfolio_type=" + portfolioType;
        }
        return "";
    }

    public static class Builder {
        private String portfolioType;

        public Builder portfolioType(String portfolioType) {
            this.portfolioType = portfolioType;
            return this;
        }

        public ListPortfoliosRequest build() {
            return new ListPortfoliosRequest(this);
        }
    }
}
