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
