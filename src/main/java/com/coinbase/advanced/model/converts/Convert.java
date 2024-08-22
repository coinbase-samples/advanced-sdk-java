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

package com.coinbase.advanced.model.converts;

import com.coinbase.advanced.model.common.Amount;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public class Convert {

    @JsonProperty("id")
    private String id;

    @JsonProperty("status")
    private String status;

    @JsonProperty("user_entered_amount")
    private Amount userEnteredAmount;

    @JsonProperty("amount")
    private Amount amount;

    @JsonProperty("subtotal")
    private Amount subtotal;

    @JsonProperty("total")
    private Amount total;

    @JsonProperty("fees")
    private List<Fee> fees;

    @JsonProperty("total_fee")
    private Fee totalFee;

    @JsonProperty("source")
    private SourceTargetInfo source;

    @JsonProperty("target")
    private SourceTargetInfo target;

    @JsonProperty("unit_price")
    private UnitPriceInfo unitPrice;

    @JsonProperty("user_warnings")
    private List<UserWarning> userWarnings;

    @JsonProperty("user_reference")
    private String userReference;

    @JsonProperty("source_currency")
    private String sourceCurrency;

    @JsonProperty("target_currency")
    private String targetCurrency;

    @JsonProperty("cancellation_reason")
    private ErrorInfo cancellationReason;

    @JsonProperty("source_id")
    private String sourceId;

    @JsonProperty("target_id")
    private String targetId;

    @JsonProperty("exchange_rate")
    private Amount exchangeRate;

    @JsonProperty("tax_details")
    private List<TaxDetail> taxDetails;

    @JsonProperty("trade_incentive_info")
    private TradeIncentive tradeIncentiveInfo;

    @JsonProperty("total_fee_without_tax")
    private Fee totalFeeWithoutTax;

    @JsonProperty("fiat_denoted_total")
    private Amount fiatDenotedTotal;

    public Convert() {}

    private Convert(Builder builder) {
        this.id = builder.id;
        this.status = builder.status;
        this.userEnteredAmount = builder.userEnteredAmount;
        this.amount = builder.amount;
        this.subtotal = builder.subtotal;
        this.total = builder.total;
        this.fees = builder.fees;
        this.totalFee = builder.totalFee;
        this.source = builder.source;
        this.target = builder.target;
        this.unitPrice = builder.unitPrice;
        this.userWarnings = builder.userWarnings;
        this.userReference = builder.userReference;
        this.sourceCurrency = builder.sourceCurrency;
        this.targetCurrency = builder.targetCurrency;
        this.cancellationReason = builder.cancellationReason;
        this.sourceId = builder.sourceId;
        this.targetId = builder.targetId;
        this.exchangeRate = builder.exchangeRate;
        this.taxDetails = builder.taxDetails;
        this.tradeIncentiveInfo = builder.tradeIncentiveInfo;
        this.totalFeeWithoutTax = builder.totalFeeWithoutTax;
        this.fiatDenotedTotal = builder.fiatDenotedTotal;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Amount getUserEnteredAmount() {
        return userEnteredAmount;
    }

    public void setUserEnteredAmount(Amount userEnteredAmount) {
        this.userEnteredAmount = userEnteredAmount;
    }

    public Amount getAmount() {
        return amount;
    }

    public void setAmount(Amount amount) {
        this.amount = amount;
    }

    public Amount getSubtotal() {
        return subtotal;
    }

    public void setSubtotal(Amount subtotal) {
        this.subtotal = subtotal;
    }

    public Amount getTotal() {
        return total;
    }

    public void setTotal(Amount total) {
        this.total = total;
    }

    public List<Fee> getFees() {
        return fees;
    }

    public void setFees(List<Fee> fees) {
        this.fees = fees;
    }

    public Fee getTotalFee() {
        return totalFee;
    }

    public void setTotalFee(Fee totalFee) {
        this.totalFee = totalFee;
    }

    public SourceTargetInfo getSource() {
        return source;
    }

    public void setSource(SourceTargetInfo source) {
        this.source = source;
    }

    public SourceTargetInfo getTarget() {
        return target;
    }

    public void setTarget(SourceTargetInfo target) {
        this.target = target;
    }

    public UnitPriceInfo getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(UnitPriceInfo unitPrice) {
        this.unitPrice = unitPrice;
    }

    public List<UserWarning> getUserWarnings() {
        return userWarnings;
    }

    public void setUserWarnings(List<UserWarning> userWarnings) {
        this.userWarnings = userWarnings;
    }

    public String getUserReference() {
        return userReference;
    }

    public void setUserReference(String userReference) {
        this.userReference = userReference;
    }

    public String getSourceCurrency() {
        return sourceCurrency;
    }

    public void setSourceCurrency(String sourceCurrency) {
        this.sourceCurrency = sourceCurrency;
    }

    public String getTargetCurrency() {
        return targetCurrency;
    }

    public void setTargetCurrency(String targetCurrency) {
        this.targetCurrency = targetCurrency;
    }

    public ErrorInfo getCancellationReason() {
        return cancellationReason;
    }

    public void setCancellationReason(ErrorInfo cancellationReason) {
        this.cancellationReason = cancellationReason;
    }

    public String getSourceId() {
        return sourceId;
    }

    public void setSourceId(String sourceId) {
        this.sourceId = sourceId;
    }

    public String getTargetId() {
        return targetId;
    }

    public void setTargetId(String targetId) {
        this.targetId = targetId;
    }

    public Amount getExchangeRate() {
        return exchangeRate;
    }

    public void setExchangeRate(Amount exchangeRate) {
        this.exchangeRate = exchangeRate;
    }

    public List<TaxDetail> getTaxDetails() {
        return taxDetails;
    }

    public void setTaxDetails(List<TaxDetail> taxDetails) {
        this.taxDetails = taxDetails;
    }

    public TradeIncentive getTradeIncentiveInfo() {
        return tradeIncentiveInfo;
    }

    public void setTradeIncentiveInfo(TradeIncentive tradeIncentiveInfo) {
        this.tradeIncentiveInfo = tradeIncentiveInfo;
    }

    public Fee getTotalFeeWithoutTax() {
        return totalFeeWithoutTax;
    }

    public void setTotalFeeWithoutTax(Fee totalFeeWithoutTax) {
        this.totalFeeWithoutTax = totalFeeWithoutTax;
    }

    public Amount getFiatDenotedTotal() {
        return fiatDenotedTotal;
    }

    public void setFiatDenotedTotal(Amount fiatDenotedTotal) {
        this.fiatDenotedTotal = fiatDenotedTotal;
    }

    public static class Builder {
        private String id;
        private String status;
        private Amount userEnteredAmount;
        private Amount amount;
        private Amount subtotal;
        private Amount total;
        private List<Fee> fees;
        private Fee totalFee;
        private SourceTargetInfo source;
        private SourceTargetInfo target;
        private UnitPriceInfo unitPrice;
        private List<UserWarning> userWarnings;
        private String userReference;
        private String sourceCurrency;
        private String targetCurrency;
        private ErrorInfo cancellationReason;
        private String sourceId;
        private String targetId;
        private Amount exchangeRate;
        private List<TaxDetail> taxDetails;
        private TradeIncentive tradeIncentiveInfo;
        private Fee totalFeeWithoutTax;
        private Amount fiatDenotedTotal;

        public Builder() {}

        public Builder id(String id) {
            this.id = id;
            return this;
        }

        public Builder status(String status) {
            this.status = status;
            return this;
        }

        public Builder userEnteredAmount(Amount userEnteredAmount) {
            this.userEnteredAmount = userEnteredAmount;
            return this;
        }

        public Builder amount(Amount amount) {
            this.amount = amount;
            return this;
        }

        public Builder subtotal(Amount subtotal) {
            this.subtotal = subtotal;
            return this;
        }

        public Builder total(Amount total) {
            this.total = total;
            return this;
        }

        public Builder fees(List<Fee> fees) {
            this.fees = fees;
            return this;
        }

        public Builder totalFee(Fee totalFee) {
            this.totalFee = totalFee;
            return this;
        }

        public Builder source(SourceTargetInfo source) {
            this.source = source;
            return this;
        }

        public Builder target(SourceTargetInfo target) {
            this.target = target;
            return this;
        }

        public Builder unitPrice(UnitPriceInfo unitPrice) {
            this.unitPrice = unitPrice;
            return this;
        }

        public Builder userWarnings(List<UserWarning> userWarnings) {
            this.userWarnings = userWarnings;
            return this;
        }

        public Builder userReference(String userReference) {
            this.userReference = userReference;
            return this;
        }

        public Builder sourceCurrency(String sourceCurrency) {
            this.sourceCurrency = sourceCurrency;
            return this;
        }

        public Builder targetCurrency(String targetCurrency) {
            this.targetCurrency = targetCurrency;
            return this;
        }

        public Builder cancellationReason(ErrorInfo cancellationReason) {
            this.cancellationReason = cancellationReason;
            return this;
        }

        public Builder sourceId(String sourceId) {
            this.sourceId = sourceId;
            return this;
        }

        public Builder targetId(String targetId) {
            this.targetId = targetId;
            return this;
        }

        public Builder exchangeRate(Amount exchangeRate) {
            this.exchangeRate = exchangeRate;
            return this;
        }

        public Builder taxDetails(List<TaxDetail> taxDetails) {
            this.taxDetails = taxDetails;
            return this;
        }

        public Builder tradeIncentiveInfo(TradeIncentive tradeIncentiveInfo) {
            this.tradeIncentiveInfo = tradeIncentiveInfo;
            return this;
        }

        public Builder totalFeeWithoutTax(Fee totalFeeWithoutTax) {
            this.totalFeeWithoutTax = totalFeeWithoutTax;
            return this;
        }

        public Builder fiatDenotedTotal(Amount fiatDenotedTotal) {
            this.fiatDenotedTotal = fiatDenotedTotal;
            return this;
        }

        public Convert build() {
            return new Convert(this);
        }
    }
}
