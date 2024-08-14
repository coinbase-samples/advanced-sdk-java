package com.coinbase.advanced.model.perpetuals;

import com.coinbase.advanced.http.CoinbaseAdvancedGetRequest;

public class GetPortfoliosBalancesRequest implements CoinbaseAdvancedGetRequest {

    private String portfolioUuid;

    public GetPortfoliosBalancesRequest() {}

    private GetPortfoliosBalancesRequest(Builder builder) {
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
        return "/brokerage/intx/balances/" + portfolioUuid;
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

        public GetPortfoliosBalancesRequest build() {
            return new GetPortfoliosBalancesRequest(this);
        }
    }
}
