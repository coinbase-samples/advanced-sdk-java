package com.coinbase.advanced.model.convert;

import com.coinbase.advanced.model.common.Amount;
import com.fasterxml.jackson.annotation.JsonProperty;

public class TradeIncentive {

    @JsonProperty("applied_incentive")
    private boolean appliedIncentive;

    @JsonProperty("user_incentive_id")
    private String userIncentiveId;

    @JsonProperty("code_val")
    private String codeVal;

    @JsonProperty("ends_at")
    private String endsAt;

    @JsonProperty("fee_without_incentive")
    private Amount feeWithoutIncentive;

    @JsonProperty("redeemed")
    private boolean redeemed;

    public TradeIncentive() {}

    private TradeIncentive(Builder builder) {
        this.appliedIncentive = builder.appliedIncentive;
        this.userIncentiveId = builder.userIncentiveId;
        this.codeVal = builder.codeVal;
        this.endsAt = builder.endsAt;
        this.feeWithoutIncentive = builder.feeWithoutIncentive;
        this.redeemed = builder.redeemed;
    }

    // Getters and Setters

    public boolean isAppliedIncentive() {
        return appliedIncentive;
    }

    public void setAppliedIncentive(boolean appliedIncentive) {
        this.appliedIncentive = appliedIncentive;
    }

    public String getUserIncentiveId() {
        return userIncentiveId;
    }

    public void setUserIncentiveId(String userIncentiveId) {
        this.userIncentiveId = userIncentiveId;
    }

    public String getCodeVal() {
        return codeVal;
    }

    public void setCodeVal(String codeVal) {
        this.codeVal = codeVal;
    }

    public String getEndsAt() {
        return endsAt;
    }

    public void setEndsAt(String endsAt) {
        this.endsAt = endsAt;
    }

    public Amount getFeeWithoutIncentive() {
        return feeWithoutIncentive;
    }

    public void setFeeWithoutIncentive(Amount feeWithoutIncentive) {
        this.feeWithoutIncentive = feeWithoutIncentive;
    }

    public boolean isRedeemed() {
        return redeemed;
    }

    public void setRedeemed(boolean redeemed) {
        this.redeemed = redeemed;
    }

    // Builder class
    public static class Builder {
        private boolean appliedIncentive;
        private String userIncentiveId;
        private String codeVal;
        private String endsAt;
        private Amount feeWithoutIncentive;
        private boolean redeemed;

        public Builder() {}

        public Builder appliedIncentive(boolean appliedIncentive) {
            this.appliedIncentive = appliedIncentive;
            return this;
        }

        public Builder userIncentiveId(String userIncentiveId) {
            this.userIncentiveId = userIncentiveId;
            return this;
        }

        public Builder codeVal(String codeVal) {
            this.codeVal = codeVal;
            return this;
        }

        public Builder endsAt(String endsAt) {
            this.endsAt = endsAt;
            return this;
        }

        public Builder feeWithoutIncentive(Amount feeWithoutIncentive) {
            this.feeWithoutIncentive = feeWithoutIncentive;
            return this;
        }

        public Builder redeemed(boolean redeemed) {
            this.redeemed = redeemed;
            return this;
        }

        public TradeIncentive build() {
            return new TradeIncentive(this);
        }
    }
}