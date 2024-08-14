package com.coinbase.advanced.model.fees;

import com.fasterxml.jackson.annotation.JsonProperty;

public class FeeTier {

    @JsonProperty("pricing_tier")
    private String pricingTier;

    @JsonProperty("usd_from")
    private String usdFrom;

    @JsonProperty("usd_to")
    private String usdTo;

    @JsonProperty("taker_fee_rate")
    private String takerFeeRate;

    @JsonProperty("maker_fee_rate")
    private String makerFeeRate;

    @JsonProperty("aop_from")
    private String aopFrom;

    @JsonProperty("aop_to")
    private String aopTo;

    public FeeTier() {}

    private FeeTier(Builder builder) {
        this.pricingTier = builder.pricingTier;
        this.usdFrom = builder.usdFrom;
        this.usdTo = builder.usdTo;
        this.takerFeeRate = builder.takerFeeRate;
        this.makerFeeRate = builder.makerFeeRate;
        this.aopFrom = builder.aopFrom;
        this.aopTo = builder.aopTo;
    }

    public String getPricingTier() {
        return pricingTier;
    }

    public void setPricingTier(String pricingTier) {
        this.pricingTier = pricingTier;
    }

    public String getUsdFrom() {
        return usdFrom;
    }

    public void setUsdFrom(String usdFrom) {
        this.usdFrom = usdFrom;
    }

    public String getUsdTo() {
        return usdTo;
    }

    public void setUsdTo(String usdTo) {
        this.usdTo = usdTo;
    }

    public String getTakerFeeRate() {
        return takerFeeRate;
    }

    public void setTakerFeeRate(String takerFeeRate) {
        this.takerFeeRate = takerFeeRate;
    }

    public String getMakerFeeRate() {
        return makerFeeRate;
    }

    public void setMakerFeeRate(String makerFeeRate) {
        this.makerFeeRate = makerFeeRate;
    }

    public String getAopFrom() {
        return aopFrom;
    }

    public void setAopFrom(String aopFrom) {
        this.aopFrom = aopFrom;
    }

    public String getAopTo() {
        return aopTo;
    }

    public void setAopTo(String aopTo) {
        this.aopTo = aopTo;
    }

    public static class Builder {
        private String pricingTier;
        private String usdFrom;
        private String usdTo;
        private String takerFeeRate;
        private String makerFeeRate;
        private String aopFrom;
        private String aopTo;

        public Builder pricingTier(String pricingTier) {
            this.pricingTier = pricingTier;
            return this;
        }

        public Builder usdFrom(String usdFrom) {
            this.usdFrom = usdFrom;
            return this;
        }

        public Builder usdTo(String usdTo) {
            this.usdTo = usdTo;
            return this;
        }

        public Builder takerFeeRate(String takerFeeRate) {
            this.takerFeeRate = takerFeeRate;
            return this;
        }

        public Builder makerFeeRate(String makerFeeRate) {
            this.makerFeeRate = makerFeeRate;
            return this;
        }

        public Builder aopFrom(String aopFrom) {
            this.aopFrom = aopFrom;
            return this;
        }

        public Builder aopTo(String aopTo) {
            this.aopTo = aopTo;
            return this;
        }

        public FeeTier build() {
            return new FeeTier(this);
        }
    }
}
