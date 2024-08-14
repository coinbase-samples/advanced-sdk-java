package com.coinbase.advanced.model.perpetuals;

import com.coinbase.advanced.http.CoinbaseAdvancedGetRequest;

public class GetPerpetualsPositionRequest implements CoinbaseAdvancedGetRequest {

    private String portfolioUuid;
    private String symbol;

    public GetPerpetualsPositionRequest() {}

    private GetPerpetualsPositionRequest(Builder builder) {
        this.portfolioUuid = builder.portfolioUuid;
        this.symbol = builder.symbol;
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

    @Override
    public String getPath() {
        return "/brokerage/intx/positions/" + portfolioUuid + "/" + symbol;
    }

    @Override
    public String getQueryString() {
        return ""; // No query parameters needed
    }

    public static class Builder {
        private String portfolioUuid;
        private String symbol;

        public Builder portfolioUuid(String portfolioUuid) {
            this.portfolioUuid = portfolioUuid;
            return this;
        }

        public Builder symbol(String symbol) {
            this.symbol = symbol;
            return this;
        }

        public GetPerpetualsPositionRequest build() {
            return new GetPerpetualsPositionRequest(this);
        }
    }
}
