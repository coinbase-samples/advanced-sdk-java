package com.coinbase.advanced.model.perpetuals;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Balance {

    @JsonProperty("asset")
    private Asset asset;

    @JsonProperty("quantity")
    private String quantity;

    @JsonProperty("hold")
    private String hold;

    @JsonProperty("transfer_hold")
    private String transferHold;

    @JsonProperty("collateral_value")
    private String collateralValue;

    @JsonProperty("collateral_weight")
    private String collateralWeight;

    @JsonProperty("max_withdraw_amount")
    private String maxWithdrawAmount;

    @JsonProperty("loan")
    private String loan;

    @JsonProperty("loan_collateral_requirement_usd")
    private String loanCollateralRequirementUsd;

    @JsonProperty("pledged_quantity")
    private String pledgedQuantity;

    public Balance() {}

    private Balance(Builder builder) {
        this.asset = builder.asset;
        this.quantity = builder.quantity;
        this.hold = builder.hold;
        this.transferHold = builder.transferHold;
        this.collateralValue = builder.collateralValue;
        this.collateralWeight = builder.collateralWeight;
        this.maxWithdrawAmount = builder.maxWithdrawAmount;
        this.loan = builder.loan;
        this.loanCollateralRequirementUsd = builder.loanCollateralRequirementUsd;
        this.pledgedQuantity = builder.pledgedQuantity;
    }

    public Asset getAsset() {
        return asset;
    }

    public void setAsset(Asset asset) {
        this.asset = asset;
    }

    public String getQuantity() {
        return quantity;
    }

    public void setQuantity(String quantity) {
        this.quantity = quantity;
    }

    public String getHold() {
        return hold;
    }

    public void setHold(String hold) {
        this.hold = hold;
    }

    public String getTransferHold() {
        return transferHold;
    }

    public void setTransferHold(String transferHold) {
        this.transferHold = transferHold;
    }

    public String getCollateralValue() {
        return collateralValue;
    }

    public void setCollateralValue(String collateralValue) {
        this.collateralValue = collateralValue;
    }

    public String getCollateralWeight() {
        return collateralWeight;
    }

    public void setCollateralWeight(String collateralWeight) {
        this.collateralWeight = collateralWeight;
    }

    public String getMaxWithdrawAmount() {
        return maxWithdrawAmount;
    }

    public void setMaxWithdrawAmount(String maxWithdrawAmount) {
        this.maxWithdrawAmount = maxWithdrawAmount;
    }

    public String getLoan() {
        return loan;
    }

    public void setLoan(String loan) {
        this.loan = loan;
    }

    public String getLoanCollateralRequirementUsd() {
        return loanCollateralRequirementUsd;
    }

    public void setLoanCollateralRequirementUsd(String loanCollateralRequirementUsd) {
        this.loanCollateralRequirementUsd = loanCollateralRequirementUsd;
    }

    public String getPledgedQuantity() {
        return pledgedQuantity;
    }

    public void setPledgedQuantity(String pledgedQuantity) {
        this.pledgedQuantity = pledgedQuantity;
    }

    public static class Builder {
        private Asset asset;
        private String quantity;
        private String hold;
        private String transferHold;
        private String collateralValue;
        private String collateralWeight;
        private String maxWithdrawAmount;
        private String loan;
        private String loanCollateralRequirementUsd;
        private String pledgedQuantity;

        public Builder asset(Asset asset) {
            this.asset = asset;
            return this;
        }

        public Builder quantity(String quantity) {
            this.quantity = quantity;
            return this;
        }

        public Builder hold(String hold) {
            this.hold = hold;
            return this;
        }

        public Builder transferHold(String transferHold) {
            this.transferHold = transferHold;
            return this;
        }

        public Builder collateralValue(String collateralValue) {
            this.collateralValue = collateralValue;
            return this;
        }

        public Builder collateralWeight(String collateralWeight) {
            this.collateralWeight = collateralWeight;
            return this;
        }

        public Builder maxWithdrawAmount(String maxWithdrawAmount) {
            this.maxWithdrawAmount = maxWithdrawAmount;
            return this;
        }

        public Builder loan(String loan) {
            this.loan = loan;
            return this;
        }

        public Builder loanCollateralRequirementUsd(String loanCollateralRequirementUsd) {
            this.loanCollateralRequirementUsd = loanCollateralRequirementUsd;
            return this;
        }

        public Builder pledgedQuantity(String pledgedQuantity) {
            this.pledgedQuantity = pledgedQuantity;
            return this;
        }

        public Balance build() {
            return new Balance(this);
        }
    }
}
