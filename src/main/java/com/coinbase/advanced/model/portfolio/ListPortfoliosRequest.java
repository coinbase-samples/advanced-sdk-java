package com.coinbase.advanced.model.portfolio;

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
