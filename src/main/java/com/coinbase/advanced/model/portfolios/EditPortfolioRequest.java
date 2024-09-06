package com.coinbase.advanced.model.portfolios;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

public class EditPortfolioRequest {

    @JsonProperty("portfolio_uuid")
    @JsonIgnore
    private String portfolioUuid;

    @JsonProperty("name")
    private String name;

    public EditPortfolioRequest() {}

    private EditPortfolioRequest(Builder builder) {
        this.portfolioUuid = builder.portfolioUuid;
        this.name = builder.name;
    }

    public String getPortfolioUuid() {
        return portfolioUuid;
    }

    public void setPortfolioUuid(String portfolioUuid) {
        this.portfolioUuid = portfolioUuid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static class Builder {
        private String portfolioUuid;
        private String name;

        public Builder portfolioUuid(String portfolioUuid) {
            this.portfolioUuid = portfolioUuid;
            return this;
        }

        public Builder name(String name) {
            this.name = name;
            return this;
        }

        public EditPortfolioRequest build() {
            return new EditPortfolioRequest(this);
        }
    }
}
