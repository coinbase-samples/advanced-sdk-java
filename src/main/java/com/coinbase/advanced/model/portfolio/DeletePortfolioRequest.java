package com.coinbase.advanced.model.portfolio;

import com.coinbase.advanced.http.CoinbaseAdvancedDeleteRequest;
import com.fasterxml.jackson.annotation.JsonProperty;

public class DeletePortfolioRequest implements CoinbaseAdvancedDeleteRequest {

    @JsonProperty("portfolio_uuid")
    private String portfolioUuid;

    public DeletePortfolioRequest() {}

    private DeletePortfolioRequest(Builder builder) {
        this.portfolioUuid = builder.portfolioUuid;
    }

    public String getPortfolioUuid() {
        return portfolioUuid;
    }

    public void setPortfolioUuid(String portfolioUuid) {
        this.portfolioUuid = portfolioUuid;
    }

    @Override
    public String getPath() {
        return "/brokerage/portfolios/" + portfolioUuid;
    }

    @Override
    public String getQueryString() {
        // Since this request doesn't require query parameters, return an empty string
        return "";
    }

    public static class Builder {
        private String portfolioUuid;

        public Builder portfolioUuid(String portfolioUuid) {
            this.portfolioUuid = portfolioUuid;
            return this;
        }

        public DeletePortfolioRequest build() {
            return new DeletePortfolioRequest(this);
        }
    }
}
