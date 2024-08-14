package com.coinbase.advanced.model.perpetuals;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

public class GetPortfoliosBalancesResponse {

    @JsonProperty("portfolio_balances")
    private PortfolioBalances portfolioBalances;

    public GetPortfoliosBalancesResponse() {}

    private GetPortfoliosBalancesResponse(Builder builder) {
        this.portfolioBalances = builder.portfolioBalances;
    }

    public PortfolioBalances getPortfolioBalances() {
        return portfolioBalances;
    }

    public void setPortfolioBalances(PortfolioBalances portfolioBalances) {
        this.portfolioBalances = portfolioBalances;
    }

    public static class Builder {
        private PortfolioBalances portfolioBalances;

        public Builder portfolioBalances(PortfolioBalances portfolioBalances) {
            this.portfolioBalances = portfolioBalances;
            return this;
        }

        public static Builder from(GetPortfoliosBalancesResponse resp) {
            return new Builder()
                    .portfolioBalances(resp.getPortfolioBalances());
        }

        public GetPortfoliosBalancesResponse build() {
            return new GetPortfoliosBalancesResponse(this);
        }
    }

    public static class PortfolioBalances {

        @JsonProperty("portfolio_uuid")
        private String portfolioUuid;

        @JsonProperty("balances")
        private List<Balance> balances;

        @JsonProperty("is_margin_limit_reached")
        private boolean isMarginLimitReached;

        public PortfolioBalances() {}

        private PortfolioBalances(Builder builder) {
            this.portfolioUuid = builder.portfolioUuid;
            this.balances = builder.balances;
            this.isMarginLimitReached = builder.isMarginLimitReached;
        }

        public String getPortfolioUuid() {
            return portfolioUuid;
        }

        public void setPortfolioUuid(String portfolioUuid) {
            this.portfolioUuid = portfolioUuid;
        }

        public List<Balance> getBalances() {
            return balances;
        }

        public void setBalances(List<Balance> balances) {
            this.balances = balances;
        }

        public boolean isMarginLimitReached() {
            return isMarginLimitReached;
        }

        public void setMarginLimitReached(boolean marginLimitReached) {
            isMarginLimitReached = marginLimitReached;
        }

        public static class Builder {
            private String portfolioUuid;
            private List<Balance> balances;
            private boolean isMarginLimitReached;

            public Builder portfolioUuid(String portfolioUuid) {
                this.portfolioUuid = portfolioUuid;
                return this;
            }

            public Builder balances(List<Balance> balances) {
                this.balances = balances;
                return this;
            }

            public Builder isMarginLimitReached(boolean isMarginLimitReached) {
                this.isMarginLimitReached = isMarginLimitReached;
                return this;
            }

            public PortfolioBalances build() {
                return new PortfolioBalances(this);
            }
        }
    }
}
