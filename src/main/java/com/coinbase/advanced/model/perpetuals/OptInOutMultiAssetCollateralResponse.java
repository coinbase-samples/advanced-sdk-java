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

import com.fasterxml.jackson.annotation.JsonProperty;

public class OptInOutMultiAssetCollateralResponse {

    @JsonProperty("multi_asset_collateral_enabled")
    private boolean multiAssetCollateralEnabled;

    public OptInOutMultiAssetCollateralResponse() {}

    private OptInOutMultiAssetCollateralResponse(Builder builder) {
        this.multiAssetCollateralEnabled = builder.multiAssetCollateralEnabled;
    }

    public boolean isMultiAssetCollateralEnabled() {
        return multiAssetCollateralEnabled;
    }

    public void setMultiAssetCollateralEnabled(boolean multiAssetCollateralEnabled) {
        this.multiAssetCollateralEnabled = multiAssetCollateralEnabled;
    }

    public static class Builder {
        private boolean multiAssetCollateralEnabled;

        public Builder multiAssetCollateralEnabled(boolean multiAssetCollateralEnabled) {
            this.multiAssetCollateralEnabled = multiAssetCollateralEnabled;
            return this;
        }

        public static Builder from(OptInOutMultiAssetCollateralResponse resp) {
            return new Builder().multiAssetCollateralEnabled(resp.isMultiAssetCollateralEnabled());
        }

        public OptInOutMultiAssetCollateralResponse build() {
            return new OptInOutMultiAssetCollateralResponse(this);
        }
    }
}
