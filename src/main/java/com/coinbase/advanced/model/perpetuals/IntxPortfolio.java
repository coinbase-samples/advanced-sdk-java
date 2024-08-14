package com.coinbase.advanced.model.perpetuals;

import com.coinbase.advanced.model.common.Amount;
import com.fasterxml.jackson.annotation.JsonProperty;

public class IntxPortfolio {

    @JsonProperty("portfolio_uuid")
    private String portfolioUuid;

    @JsonProperty("collateral")
    private String collateral;

    @JsonProperty("position_notional")
    private String positionNotional;

    @JsonProperty("open_position_notional")
    private String openPositionNotional;

    @JsonProperty("pending_fees")
    private String pendingFees;

    @JsonProperty("borrow")
    private String borrow;

    @JsonProperty("accrued_interest")
    private String accruedInterest;

    @JsonProperty("rolling_debt")
    private String rollingDebt;

    @JsonProperty("portfolio_initial_margin")
    private String portfolioInitialMargin;

    @JsonProperty("portfolio_im_notional")
    private Amount portfolioImNotional;

    @JsonProperty("portfolio_maintenance_margin")
    private String portfolioMaintenanceMargin;

    @JsonProperty("portfolio_mm_notional")
    private Amount portfolioMmNotional;

    @JsonProperty("liquidation_percentage")
    private String liquidationPercentage;

    @JsonProperty("liquidation_buffer")
    private String liquidationBuffer;

    @JsonProperty("margin_type")
    private String marginType;

    @JsonProperty("margin_flags")
    private String marginFlags;

    @JsonProperty("liquidation_status")
    private String liquidationStatus;

    @JsonProperty("unrealized_pnl")
    private Amount unrealizedPnl;

    @JsonProperty("total_balance")
    private Amount totalBalance;

    @JsonProperty("summary")
    private PerpsSummary summary;

    public IntxPortfolio() {}

    private IntxPortfolio(Builder builder) {
        this.portfolioUuid = builder.portfolioUuid;
        this.collateral = builder.collateral;
        this.positionNotional = builder.positionNotional;
        this.openPositionNotional = builder.openPositionNotional;
        this.pendingFees = builder.pendingFees;
        this.borrow = builder.borrow;
        this.accruedInterest = builder.accruedInterest;
        this.rollingDebt = builder.rollingDebt;
        this.portfolioInitialMargin = builder.portfolioInitialMargin;
        this.portfolioImNotional = builder.portfolioImNotional;
        this.portfolioMaintenanceMargin = builder.portfolioMaintenanceMargin;
        this.portfolioMmNotional = builder.portfolioMmNotional;
        this.liquidationPercentage = builder.liquidationPercentage;
        this.liquidationBuffer = builder.liquidationBuffer;
        this.marginType = builder.marginType;
        this.marginFlags = builder.marginFlags;
        this.liquidationStatus = builder.liquidationStatus;
        this.unrealizedPnl = builder.unrealizedPnl;
        this.totalBalance = builder.totalBalance;
        this.summary = builder.summary;
    }

    public String getPortfolioUuid() {
        return portfolioUuid;
    }

    public void setPortfolioUuid(String portfolioUuid) {
        this.portfolioUuid = portfolioUuid;
    }

    public String getCollateral() {
        return collateral;
    }

    public void setCollateral(String collateral) {
        this.collateral = collateral;
    }

    public String getPositionNotional() {
        return positionNotional;
    }

    public void setPositionNotional(String positionNotional) {
        this.positionNotional = positionNotional;
    }

    public String getOpenPositionNotional() {
        return openPositionNotional;
    }

    public void setOpenPositionNotional(String openPositionNotional) {
        this.openPositionNotional = openPositionNotional;
    }

    public String getPendingFees() {
        return pendingFees;
    }

    public void setPendingFees(String pendingFees) {
        this.pendingFees = pendingFees;
    }

    public String getBorrow() {
        return borrow;
    }

    public void setBorrow(String borrow) {
        this.borrow = borrow;
    }

    public String getAccruedInterest() {
        return accruedInterest;
    }

    public void setAccruedInterest(String accruedInterest) {
        this.accruedInterest = accruedInterest;
    }

    public String getRollingDebt() {
        return rollingDebt;
    }

    public void setRollingDebt(String rollingDebt) {
        this.rollingDebt = rollingDebt;
    }

    public String getPortfolioInitialMargin() {
        return portfolioInitialMargin;
    }

    public void setPortfolioInitialMargin(String portfolioInitialMargin) {
        this.portfolioInitialMargin = portfolioInitialMargin;
    }

    public Amount getPortfolioImNotional() {
        return portfolioImNotional;
    }

    public void setPortfolioImNotional(Amount portfolioImNotional) {
        this.portfolioImNotional = portfolioImNotional;
    }

    public String getPortfolioMaintenanceMargin() {
        return portfolioMaintenanceMargin;
    }

    public void setPortfolioMaintenanceMargin(String portfolioMaintenanceMargin) {
        this.portfolioMaintenanceMargin = portfolioMaintenanceMargin;
    }

    public Amount getPortfolioMmNotional() {
        return portfolioMmNotional;
    }

    public void setPortfolioMmNotional(Amount portfolioMmNotional) {
        this.portfolioMmNotional = portfolioMmNotional;
    }

    public String getLiquidationPercentage() {
        return liquidationPercentage;
    }

    public void setLiquidationPercentage(String liquidationPercentage) {
        this.liquidationPercentage = liquidationPercentage;
    }

    public String getLiquidationBuffer() {
        return liquidationBuffer;
    }

    public void setLiquidationBuffer(String liquidationBuffer) {
        this.liquidationBuffer = liquidationBuffer;
    }

    public String getMarginType() {
        return marginType;
    }

    public void setMarginType(String marginType) {
        this.marginType = marginType;
    }

    public String getMarginFlags() {
        return marginFlags;
    }

    public void setMarginFlags(String marginFlags) {
        this.marginFlags = marginFlags;
    }

    public String getLiquidationStatus() {
        return liquidationStatus;
    }

    public void setLiquidationStatus(String liquidationStatus) {
        this.liquidationStatus = liquidationStatus;
    }

    public Amount getUnrealizedPnl() {
        return unrealizedPnl;
    }

    public void setUnrealizedPnl(Amount unrealizedPnl) {
        this.unrealizedPnl = unrealizedPnl;
    }

    public Amount getTotalBalance() {
        return totalBalance;
    }

    public void setTotalBalance(Amount totalBalance) {
        this.totalBalance = totalBalance;
    }

    public PerpsSummary getSummary() {
        return summary;
    }

    public void setSummary(PerpsSummary summary) {
        this.summary = summary;
    }

    public static class Builder {
        private String portfolioUuid;
        private String collateral;
        private String positionNotional;
        private String openPositionNotional;
        private String pendingFees;
        private String borrow;
        private String accruedInterest;
        private String rollingDebt;
        private String portfolioInitialMargin;
        private Amount portfolioImNotional;
        private String portfolioMaintenanceMargin;
        private Amount portfolioMmNotional;
        private String liquidationPercentage;
        private String liquidationBuffer;
        private String marginType;
        private String marginFlags;
        private String liquidationStatus;
        private Amount unrealizedPnl;
        private Amount totalBalance;
        private PerpsSummary summary;

        public Builder() {}

        public Builder portfolioUuid(String portfolioUuid) {
            this.portfolioUuid = portfolioUuid;
            return this;
        }

        public Builder collateral(String collateral) {
            this.collateral = collateral;
            return this;
        }

        public Builder positionNotional(String positionNotional) {
            this.positionNotional = positionNotional;
            return this;
        }

        public Builder openPositionNotional(String openPositionNotional) {
            this.openPositionNotional = openPositionNotional;
            return this;
        }

        public Builder pendingFees(String pendingFees) {
            this.pendingFees = pendingFees;
            return this;
        }

        public Builder borrow(String borrow) {
            this.borrow = borrow;
            return this;
        }

        public Builder accruedInterest(String accruedInterest) {
            this.accruedInterest = accruedInterest;
            return this;
        }

        public Builder rollingDebt(String rollingDebt) {
            this.rollingDebt = rollingDebt;
            return this;
        }

        public Builder portfolioInitialMargin(String portfolioInitialMargin) {
            this.portfolioInitialMargin = portfolioInitialMargin;
            return this;
        }

        public Builder portfolioImNotional(Amount portfolioImNotional) {
            this.portfolioImNotional = portfolioImNotional;
            return this;
        }

        public Builder portfolioMaintenanceMargin(String portfolioMaintenanceMargin) {
            this.portfolioMaintenanceMargin = portfolioMaintenanceMargin;
            return this;
        }

        public Builder portfolioMmNotional(Amount portfolioMmNotional) {
            this.portfolioMmNotional = portfolioMmNotional;
            return this;
        }

        public Builder liquidationPercentage(String liquidationPercentage) {
            this.liquidationPercentage = liquidationPercentage;
            return this;
        }

        public Builder liquidationBuffer(String liquidationBuffer) {
            this.liquidationBuffer = liquidationBuffer;
            return this;
        }

        public Builder marginType(String marginType) {
            this.marginType = marginType;
            return this;
        }

        public Builder marginFlags(String marginFlags) {
            this.marginFlags = marginFlags;
            return this;
        }

        public Builder liquidationStatus(String liquidationStatus) {
            this.liquidationStatus = liquidationStatus;
            return this;
        }

        public Builder unrealizedPnl(Amount unrealizedPnl) {
            this.unrealizedPnl = unrealizedPnl;
            return this;
        }

        public Builder totalBalance(Amount totalBalance) {
            this.totalBalance = totalBalance;
            return this;
        }

        public Builder summary(PerpsSummary summary) {
            this.summary = summary;
            return this;
        }

        public IntxPortfolio build() {
            return new IntxPortfolio(this);
        }
    }
}
