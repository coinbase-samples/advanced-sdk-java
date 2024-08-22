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
