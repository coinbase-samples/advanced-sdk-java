package com.coinbase.advanced.model.portfolio;

import com.coinbase.advanced.http.CoinbaseAdvancedPostRequest;
import com.fasterxml.jackson.annotation.JsonProperty;

public class CreatePortfolioRequest implements CoinbaseAdvancedPostRequest {

    @JsonProperty("name")
    private String name;

    public CreatePortfolioRequest() {}

    private CreatePortfolioRequest(Builder builder) {
        this.name = builder.name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String getPath() {
        return "/brokerage/portfolios";
    }

    @Override
    public String getBody() {
        return "{\"name\":\"" + this.name + "\"}";
    }

    public static class Builder {
        private String name;

        public Builder name(String name) {
            this.name = name;
            return this;
        }

        public CreatePortfolioRequest build() {
            return new CreatePortfolioRequest(this);
        }
    }
}
