/*
 * Copyright 2024-present Coinbase Global, Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *  http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.coinbase.advanced.model.portfolios;

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
