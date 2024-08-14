package com.coinbase.advanced.model.portfolio;

import com.fasterxml.jackson.annotation.JsonProperty;

public class EditPortfolioResponse {

    @JsonProperty("portfolio")
    private Portfolio portfolio;

    public EditPortfolioResponse() {}

    private EditPortfolioResponse(Builder builder) {
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

        public static Builder from(EditPortfolioResponse resp) {
            return new Builder().portfolio(resp.getPortfolio());
        }

        public EditPortfolioResponse build() {
            return new EditPortfolioResponse(this);
        }
    }
}
