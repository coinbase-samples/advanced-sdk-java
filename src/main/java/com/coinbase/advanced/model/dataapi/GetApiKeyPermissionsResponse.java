/*
 * Copyright 2025-present Coinbase Global, Inc.
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

package com.coinbase.advanced.model.dataapi;

import com.fasterxml.jackson.annotation.JsonProperty;

public class GetApiKeyPermissionsResponse {

    @JsonProperty("can_view")
    private boolean canView;

    @JsonProperty("can_trade")
    private boolean canTrade;

    @JsonProperty("can_transfer")
    private boolean canTransfer;

    @JsonProperty("portfolio_uuid")
    private String portfolioUuid;

    @JsonProperty("portfolio_type")
    private String portfolioType;

    public GetApiKeyPermissionsResponse() {}

    private GetApiKeyPermissionsResponse(Builder builder) {
        this.canView = builder.canView;
        this.canTrade = builder.canTrade;
        this.canTransfer = builder.canTransfer;
        this.portfolioUuid = builder.portfolioUuid;
        this.portfolioType = builder.portfolioType;
    }

    public boolean isCanView() {
        return canView;
    }

    public void setCanView(boolean canView) {
        this.canView = canView;
    }

    public boolean isCanTrade() {
        return canTrade;
    }

    public void setCanTrade(boolean canTrade) {
        this.canTrade = canTrade;
    }

    public boolean isCanTransfer() {
        return canTransfer;
    }

    public void setCanTransfer(boolean canTransfer) {
        this.canTransfer = canTransfer;
    }

    public String getPortfolioUuid() {
        return portfolioUuid;
    }

    public void setPortfolioUuid(String portfolioUuid) {
        this.portfolioUuid = portfolioUuid;
    }

    public String getPortfolioType() {
        return portfolioType;
    }

    public void setPortfolioType(String portfolioType) {
        this.portfolioType = portfolioType;
    }

    public static class Builder {
        private boolean canView;
        private boolean canTrade;
        private boolean canTransfer;
        private String portfolioUuid;
        private String portfolioType;

        public Builder canView(boolean canView) {
            this.canView = canView;
            return this;
        }

        public Builder canTrade(boolean canTrade) {
            this.canTrade = canTrade;
            return this;
        }

        public Builder canTransfer(boolean canTransfer) {
            this.canTransfer = canTransfer;
            return this;
        }

        public Builder portfolioUuid(String portfolioUuid) {
            this.portfolioUuid = portfolioUuid;
            return this;
        }

        public Builder portfolioType(String portfolioType) {
            this.portfolioType = portfolioType;
            return this;
        }

        public GetApiKeyPermissionsResponse build() {
            return new GetApiKeyPermissionsResponse(this);
        }
    }
}
