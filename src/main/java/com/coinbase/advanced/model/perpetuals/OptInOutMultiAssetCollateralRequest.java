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

package com.coinbase.advanced.model.perpetuals;

import com.coinbase.advanced.http.CoinbaseAdvancedPostRequest;
import com.fasterxml.jackson.annotation.JsonProperty;

public class OptInOutMultiAssetCollateralRequest implements CoinbaseAdvancedPostRequest {

    @JsonProperty("portfolio_uuid")
    private String portfolioUuid;

    @JsonProperty("multi_asset_collateral_enabled")
    private boolean multiAssetCollateralEnabled;

    public OptInOutMultiAssetCollateralRequest() {}

    private OptInOutMultiAssetCollateralRequest(Builder builder) {
        this.portfolioUuid = builder.portfolioUuid;
        this.multiAssetCollateralEnabled = builder.multiAssetCollateralEnabled;
    }

    public String getPortfolioUuid() {
        return portfolioUuid;
    }

    public void setPortfolioUuid(String portfolioUuid) {
        this.portfolioUuid = portfolioUuid;
    }

    public boolean isMultiAssetCollateralEnabled() {
        return multiAssetCollateralEnabled;
    }

    public void setMultiAssetCollateralEnabled(boolean multiAssetCollateralEnabled) {
        this.multiAssetCollateralEnabled = multiAssetCollateralEnabled;
    }

    @Override
    public String getPath() {
        return "/brokerage/intx/multi_asset_collateral";
    }

    @Override
    public String getBody() {
        return "{\"portfolio_uuid\":\"" + portfolioUuid + "\",\"multi_asset_collateral_enabled\":" + multiAssetCollateralEnabled + "}";
    }

    public static class Builder {
        private String portfolioUuid;
        private boolean multiAssetCollateralEnabled;

        public Builder portfolioUuid(String portfolioUuid) {
            this.portfolioUuid = portfolioUuid;
            return this;
        }

        public Builder multiAssetCollateralEnabled(boolean multiAssetCollateralEnabled) {
            this.multiAssetCollateralEnabled = multiAssetCollateralEnabled;
            return this;
        }

        public OptInOutMultiAssetCollateralRequest build() {
            return new OptInOutMultiAssetCollateralRequest(this);
        }
    }
}
