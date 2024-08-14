package com.coinbase.advanced.model.portfolio;

import com.coinbase.advanced.http.CoinbaseAdvancedGetRequest;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

public class GetPortfolioBreakdownRequest implements CoinbaseAdvancedGetRequest {

    @JsonProperty("portfolio_uuid")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String portfolioUuid;

    public GetPortfolioBreakdownRequest() {}

    public GetPortfolioBreakdownRequest(String portfolioUuid) {
        this.portfolioUuid = portfolioUuid;
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
        return "";
    }
}
