package com.coinbase.advanced.model.perpetuals;

import com.coinbase.advanced.http.CoinbaseAdvancedGetRequest;

public class ListPerpetualsPositionsRequest implements CoinbaseAdvancedGetRequest {

    private String portfolioUuid;

    public ListPerpetualsPositionsRequest() {}

    private ListPerpetualsPositionsRequest(Builder builder) {
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
        return "/brokerage/intx/positions/" + portfolioUuid;
    }

    @Override
    public String getQueryString() {
        return "";
    }

    public static class Builder {
        private String portfolioUuid;

        public Builder portfolioUuid(String portfolioUuid) {
            this.portfolioUuid = portfolioUuid;
            return this;
        }

        public ListPerpetualsPositionsRequest build() {
            return new ListPerpetualsPositionsRequest(this);
        }
    }
}
