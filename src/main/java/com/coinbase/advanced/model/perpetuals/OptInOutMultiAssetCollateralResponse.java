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
