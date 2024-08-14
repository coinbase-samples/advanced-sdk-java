package com.coinbase.advanced.model.portfolio;

import com.coinbase.advanced.http.CoinbaseAdvancedPostRequest;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.coinbase.advanced.model.common.Amount;

public class MovePortfolioFundsRequest implements CoinbaseAdvancedPostRequest {

    @JsonProperty("funds")
    private Amount funds;

    @JsonProperty("source_portfolio_uuid")
    private String sourcePortfolioUuid;

    @JsonProperty("target_portfolio_uuid")
    private String targetPortfolioUuid;

    public MovePortfolioFundsRequest() {}

    private MovePortfolioFundsRequest(Builder builder) {
        this.funds = builder.funds;
        this.sourcePortfolioUuid = builder.sourcePortfolioUuid;
        this.targetPortfolioUuid = builder.targetPortfolioUuid;
    }

    public Amount getFunds() {
        return funds;
    }

    public void setFunds(Amount funds) {
        this.funds = funds;
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

    @Override
    public String getPath() {
        return "/brokerage/portfolios/move_funds";
    }

    @Override
    public String getBody() {
        ObjectMapper mapper = new ObjectMapper();
        try {
            return mapper.writeValueAsString(this);
        } catch (JsonProcessingException e) {
            throw new RuntimeException("Failed to serialize MovePortfolioFundsRequest", e);
        }
    }

    public static class Builder {
        private Amount funds;
        private String sourcePortfolioUuid;
        private String targetPortfolioUuid;

        public Builder funds(Amount funds) {
            this.funds = funds;
            return this;
        }

        public Builder sourcePortfolioUuid(String sourcePortfolioUuid) {
            this.sourcePortfolioUuid = sourcePortfolioUuid;
            return this;
        }

        public Builder targetPortfolioUuid(String targetPortfolioUuid) {
            this.targetPortfolioUuid = targetPortfolioUuid;
            return this;
        }

        public MovePortfolioFundsRequest build() {
            return new MovePortfolioFundsRequest(this);
        }
    }
}
