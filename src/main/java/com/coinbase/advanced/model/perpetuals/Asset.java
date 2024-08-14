package com.coinbase.advanced.model.perpetuals;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Asset {

    @JsonProperty("asset_id")
    private String assetId;

    @JsonProperty("asset_uuid")
    private String assetUuid;

    @JsonProperty("asset_name")
    private String assetName;

    @JsonProperty("status")
    private String status;

    @JsonProperty("collateral_weight")
    private String collateralWeight;

    @JsonProperty("account_collateral_limit")
    private String accountCollateralLimit;

    @JsonProperty("ecosystem_collateral_limit_breached")
    private boolean ecosystemCollateralLimitBreached;

    @JsonProperty("asset_icon_url")
    private String assetIconUrl;

    @JsonProperty("supported_networks_enabled")
    private boolean supportedNetworksEnabled;

    public Asset() {}

    private Asset(Builder builder) {
        this.assetId = builder.assetId;
        this.assetUuid = builder.assetUuid;
        this.assetName = builder.assetName;
        this.status = builder.status;
        this.collateralWeight = builder.collateralWeight;
        this.accountCollateralLimit = builder.accountCollateralLimit;
        this.ecosystemCollateralLimitBreached = builder.ecosystemCollateralLimitBreached;
        this.assetIconUrl = builder.assetIconUrl;
        this.supportedNetworksEnabled = builder.supportedNetworksEnabled;
    }

    public String getAssetId() {
        return assetId;
    }

    public void setAssetId(String assetId) {
        this.assetId = assetId;
    }

    public String getAssetUuid() {
        return assetUuid;
    }

    public void setAssetUuid(String assetUuid) {
        this.assetUuid = assetUuid;
    }

    public String getAssetName() {
        return assetName;
    }

    public void setAssetName(String assetName) {
        this.assetName = assetName;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getCollateralWeight() {
        return collateralWeight;
    }

    public void setCollateralWeight(String collateralWeight) {
        this.collateralWeight = collateralWeight;
    }

    public String getAccountCollateralLimit() {
        return accountCollateralLimit;
    }

    public void setAccountCollateralLimit(String accountCollateralLimit) {
        this.accountCollateralLimit = accountCollateralLimit;
    }

    public boolean isEcosystemCollateralLimitBreached() {
        return ecosystemCollateralLimitBreached;
    }

    public void setEcosystemCollateralLimitBreached(boolean ecosystemCollateralLimitBreached) {
        this.ecosystemCollateralLimitBreached = ecosystemCollateralLimitBreached;
    }

    public String getAssetIconUrl() {
        return assetIconUrl;
    }

    public void setAssetIconUrl(String assetIconUrl) {
        this.assetIconUrl = assetIconUrl;
    }

    public boolean isSupportedNetworksEnabled() {
        return supportedNetworksEnabled;
    }

    public void setSupportedNetworksEnabled(boolean supportedNetworksEnabled) {
        this.supportedNetworksEnabled = supportedNetworksEnabled;
    }

    public static class Builder {
        private String assetId;
        private String assetUuid;
        private String assetName;
        private String status;
        private String collateralWeight;
        private String accountCollateralLimit;
        private boolean ecosystemCollateralLimitBreached;
        private String assetIconUrl;
        private boolean supportedNetworksEnabled;

        public Builder assetId(String assetId) {
            this.assetId = assetId;
            return this;
        }

        public Builder assetUuid(String assetUuid) {
            this.assetUuid = assetUuid;
            return this;
        }

        public Builder assetName(String assetName) {
            this.assetName = assetName;
            return this;
        }

        public Builder status(String status) {
            this.status = status;
            return this;
        }

        public Builder collateralWeight(String collateralWeight) {
            this.collateralWeight = collateralWeight;
            return this;
        }

        public Builder accountCollateralLimit(String accountCollateralLimit) {
            this.accountCollateralLimit = accountCollateralLimit;
            return this;
        }

        public Builder ecosystemCollateralLimitBreached(boolean ecosystemCollateralLimitBreached) {
            this.ecosystemCollateralLimitBreached = ecosystemCollateralLimitBreached;
            return this;
        }

        public Builder assetIconUrl(String assetIconUrl) {
            this.assetIconUrl = assetIconUrl;
            return this;
        }

        public Builder supportedNetworksEnabled(boolean supportedNetworksEnabled) {
            this.supportedNetworksEnabled = supportedNetworksEnabled;
            return this;
        }

        public Asset build() {
            return new Asset(this);
        }
    }
}
