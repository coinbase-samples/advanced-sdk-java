package com.coinbase.advanced.model.perpetuals;

import com.coinbase.advanced.http.CoinbaseAdvancedGetRequest;
import com.fasterxml.jackson.annotation.JsonProperty;

public class GetPerpetualsPortfolioSummaryRequest implements CoinbaseAdvancedGetRequest {

    @JsonProperty("portfolio_uuid")
    private String portfolioUuid;

    public GetPerpetualsPortfolioSummaryRequest() {}

    private GetPerpetualsPortfolioSummaryRequest(Builder builder) {
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
        return "/brokerage/intx/portfolio/" + portfolioUuid;
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

        public GetPerpetualsPortfolioSummaryRequest build() {
            return new GetPerpetualsPortfolioSummaryRequest(this);
        }
    }
}
