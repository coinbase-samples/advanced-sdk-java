package com.coinbase.advanced.model.perpetuals;

import com.fasterxml.jackson.annotation.JsonProperty;

public class GetPerpetualsPortfolioSummaryResponse {

    @JsonProperty("portfolios")
    private IntxPortfolio portfolios;

    public GetPerpetualsPortfolioSummaryResponse() {}

    private GetPerpetualsPortfolioSummaryResponse(Builder builder) {
        this.portfolios = builder.portfolios;
    }

    public IntxPortfolio getPortfolios() {
        return portfolios;
    }

    public void setPortfolios(IntxPortfolio portfolios) {
        this.portfolios = portfolios;
    }

    public static class Builder {
        private IntxPortfolio portfolios;

        public Builder portfolios(IntxPortfolio portfolios) {
            this.portfolios = portfolios;
            return this;
        }

        public static Builder from(GetPerpetualsPortfolioSummaryResponse resp) {
            return new Builder()
                    .portfolios(resp.getPortfolios());
        }

        public GetPerpetualsPortfolioSummaryResponse build() {
            return new GetPerpetualsPortfolioSummaryResponse(this);
        }
    }
}
