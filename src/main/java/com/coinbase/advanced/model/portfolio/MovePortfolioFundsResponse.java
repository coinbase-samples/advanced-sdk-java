package com.coinbase.advanced.model.portfolio;

import com.fasterxml.jackson.annotation.JsonProperty;

public class MovePortfolioFundsResponse {

    @JsonProperty("source_portfolio_uuid")
    private String sourcePortfolioUuid;

    @JsonProperty("target_portfolio_uuid")
    private String targetPortfolioUuid;

    public MovePortfolioFundsResponse() {}

    private MovePortfolioFundsResponse(Builder builder) {
        this.sourcePortfolioUuid = builder.sourcePortfolioUuid;
        this.targetPortfolioUuid = builder.targetPortfolioUuid;
    }

    public String getSourcePortfolioUuid() {
        return sourcePortfolioUuid;
    }

    public void setSourcePortfolioUuid(String sourcePortfolioUuid) {
        this.sourcePortfolioUuid = sourcePortfolioUuid;
    }

    public String getTargetPortfolioUuid() {
        return targetPortfolioUuid;
    }

    public void setTargetPortfolioUuid(String targetPortfolioUuid) {
        this.targetPortfolioUuid = targetPortfolioUuid;
    }

    public static class Builder {
        private String sourcePortfolioUuid;
        private String targetPortfolioUuid;

        public Builder sourcePortfolioUuid(String sourcePortfolioUuid) {
            this.sourcePortfolioUuid = sourcePortfolioUuid;
            return this;
        }

        public Builder targetPortfolioUuid(String targetPortfolioUuid) {
            this.targetPortfolioUuid = targetPortfolioUuid;
            return this;
        }

        public static Builder from(MovePortfolioFundsResponse resp) {
            return new Builder()
                    .sourcePortfolioUuid(resp.getSourcePortfolioUuid())
                    .targetPortfolioUuid(resp.getTargetPortfolioUuid());
        }

        public MovePortfolioFundsResponse build() {
            return new MovePortfolioFundsResponse(this);
        }
    }
}
