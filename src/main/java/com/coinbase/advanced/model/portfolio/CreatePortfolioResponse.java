package com.coinbase.advanced.model.portfolio;

import com.fasterxml.jackson.annotation.JsonProperty;

public class CreatePortfolioResponse {

    @JsonProperty("portfolio")
    private Portfolio portfolio;

    public CreatePortfolioResponse() {}

    private CreatePortfolioResponse(Builder builder) {
        this.portfolio = builder.portfolio;
    }

    public Portfolio getPortfolio() {
        return portfolio;
    }

    public void setPortfolio(Portfolio portfolio) {
        this.portfolio = portfolio;
    }

    public static class Builder {
        private Portfolio portfolio;

        public Builder portfolio(Portfolio portfolio) {
            this.portfolio = portfolio;
            return this;
        }

        public static Builder from(CreatePortfolioResponse resp) {
            return new Builder().portfolio(resp.getPortfolio());
        }

        public CreatePortfolioResponse build() {
            return new CreatePortfolioResponse(this);
        }
    }
}
