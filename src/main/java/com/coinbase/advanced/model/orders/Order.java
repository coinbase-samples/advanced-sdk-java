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

package com.coinbase.advanced.model.orders;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

public class Order {

    @JsonProperty("order_id")
    private String orderId;

    @JsonProperty("product_id")
    private String productId;

    @JsonProperty("user_id")
    private String userId;

    @JsonProperty("order_configuration")
    private OrderConfiguration orderConfiguration;

    @JsonProperty("side")
    private String side;

    @JsonProperty("client_order_id")
    private String clientOrderId;

    @JsonProperty("status")
    private String status;

    @JsonProperty("time_in_force")
    private String timeInForce;

    @JsonProperty("created_time")
    private String createdTime;

    @JsonProperty("completion_percentage")
    private String completionPercentage;

    @JsonProperty("filled_size")
    private String filledSize;

    @JsonProperty("average_filled_price")
    private String averageFilledPrice;

    @JsonProperty("number_of_fills")
    private String numberOfFills;

    @JsonProperty("filled_value")
    private String filledValue;

    @JsonProperty("pending_cancel")
    private boolean pendingCancel;

    @JsonProperty("size_in_quote")
    private boolean sizeInQuote;

    @JsonProperty("total_fees")
    private String totalFees;

    @JsonProperty("size_inclusive_of_fees")
    private boolean sizeInclusiveOfFees;

    @JsonProperty("total_value_after_fees")
    private String totalValueAfterFees;

    @JsonProperty("trigger_status")
    private String triggerStatus;

    @JsonProperty("order_type")
    private String orderType;

    @JsonProperty("reject_reason")
    private String rejectReason;

    @JsonProperty("settled")
    private boolean settled;

    @JsonProperty("product_type")
    private String productType;

    @JsonProperty("reject_message")
    private String rejectMessage;

    @JsonProperty("cancel_message")
    private String cancelMessage;

    @JsonProperty("order_placement_source")
    private String orderPlacementSource;

    @JsonProperty("outstanding_hold_amount")
    private String outstandingHoldAmount;

    @JsonProperty("is_liquidation")
    private boolean isLiquidation;

    @JsonProperty("last_fill_time")
    private String lastFillTime;

    @JsonProperty("fee")
    private String fee;

    @JsonProperty("originating_order_id")
    private String originatingOrderId;

    @JsonProperty("attached_order_id")
    private String attachedOrderId;

    @JsonProperty("leverage")
    private String leverage;

    @JsonProperty("margin_type")
    private String marginType;

    @JsonProperty("retail_portfolio_id")
    private String retailPortfolioId;

    @JsonProperty("edit_history")
    private List<EditHistoryItem> editHistory;

    public Order() {}

    private Order(Builder builder) {
        this.orderId = builder.orderId;
        this.productId = builder.productId;
        this.userId = builder.userId;
        this.orderConfiguration = builder.orderConfiguration;
        this.side = builder.side;
        this.clientOrderId = builder.clientOrderId;
        this.status = builder.status;
        this.timeInForce = builder.timeInForce;
        this.createdTime = builder.createdTime;
        this.completionPercentage = builder.completionPercentage;
        this.filledSize = builder.filledSize;
        this.averageFilledPrice = builder.averageFilledPrice;
        this.numberOfFills = builder.numberOfFills;
        this.filledValue = builder.filledValue;
        this.pendingCancel = builder.pendingCancel;
        this.sizeInQuote = builder.sizeInQuote;
        this.totalFees = builder.totalFees;
        this.sizeInclusiveOfFees = builder.sizeInclusiveOfFees;
        this.totalValueAfterFees = builder.totalValueAfterFees;
        this.triggerStatus = builder.triggerStatus;
        this.orderType = builder.orderType;
        this.rejectReason = builder.rejectReason;
        this.settled = builder.settled;
        this.productType = builder.productType;
        this.rejectMessage = builder.rejectMessage;
        this.cancelMessage = builder.cancelMessage;
        this.orderPlacementSource = builder.orderPlacementSource;
        this.outstandingHoldAmount = builder.outstandingHoldAmount;
        this.isLiquidation = builder.isLiquidation;
        this.lastFillTime = builder.lastFillTime;
        this.attachedOrderId = builder.attachedOrderId;
        this.editHistory = builder.editHistory;
        this.originatingOrderId = builder.originatingOrderId;
    }

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public OrderConfiguration getOrderConfiguration() {
        return orderConfiguration;
    }

    public void setOrderConfiguration(OrderConfiguration orderConfiguration) {
        this.orderConfiguration = orderConfiguration;
    }

    public String getSide() {
        return side;
    }

    public void setSide(String side) {
        this.side = side;
    }

    public String getClientOrderId() {
        return clientOrderId;
    }

    public void setClientOrderId(String clientOrderId) {
        this.clientOrderId = clientOrderId;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getTimeInForce() {
        return timeInForce;
    }

    public void setTimeInForce(String timeInForce) {
        this.timeInForce = timeInForce;
    }

    public String getCreatedTime() {
        return createdTime;
    }

    public void setCreatedTime(String createdTime) {
        this.createdTime = createdTime;
    }

    public String getCompletionPercentage() {
        return completionPercentage;
    }

    public void setCompletionPercentage(String completionPercentage) {
        this.completionPercentage = completionPercentage;
    }

    public String getFilledSize() {
        return filledSize;
    }

    public void setFilledSize(String filledSize) {
        this.filledSize = filledSize;
    }

    public String getAverageFilledPrice() {
        return averageFilledPrice;
    }

    public void setAverageFilledPrice(String averageFilledPrice) {
        this.averageFilledPrice = averageFilledPrice;
    }

    public String getNumberOfFills() {
        return numberOfFills;
    }

    public void setNumberOfFills(String numberOfFills) {
        this.numberOfFills = numberOfFills;
    }

    public String getFilledValue() {
        return filledValue;
    }

    public void setFilledValue(String filledValue) {
        this.filledValue = filledValue;
    }

    public boolean isPendingCancel() {
        return pendingCancel;
    }

    public void setPendingCancel(boolean pendingCancel) {
        this.pendingCancel = pendingCancel;
    }

    public boolean isSizeInQuote() {
        return sizeInQuote;
    }

    public void setSizeInQuote(boolean sizeInQuote) {
        this.sizeInQuote = sizeInQuote;
    }

    public String getTotalFees() {
        return totalFees;
    }

    public void setTotalFees(String totalFees) {
        this.totalFees = totalFees;
    }

    public boolean isSizeInclusiveOfFees() {
        return sizeInclusiveOfFees;
    }

    public void setSizeInclusiveOfFees(boolean sizeInclusiveOfFees) {
        this.sizeInclusiveOfFees = sizeInclusiveOfFees;
    }

    public String getTotalValueAfterFees() {
        return totalValueAfterFees;
    }

    public void setTotalValueAfterFees(String totalValueAfterFees) {
        this.totalValueAfterFees = totalValueAfterFees;
    }

    public String getTriggerStatus() {
        return triggerStatus;
    }

    public void setTriggerStatus(String triggerStatus) {
        this.triggerStatus = triggerStatus;
    }

    public String getOrderType() {
        return orderType;
    }

    public void setOrderType(String orderType) {
        this.orderType = orderType;
    }

    public String getRejectReason() {
        return rejectReason;
    }

    public void setRejectReason(String rejectReason) {
        this.rejectReason = rejectReason;
    }

    public boolean isSettled() {
        return settled;
    }

    public void setSettled(boolean settled) {
        this.settled = settled;
    }

    public String getProductType() {
        return productType;
    }

    public void setProductType(String productType) {
        this.productType = productType;
    }

    public String getRejectMessage() {
        return rejectMessage;
    }

    public void setRejectMessage(String rejectMessage) {
        this.rejectMessage = rejectMessage;
    }

    public String getCancelMessage() {
        return cancelMessage;
    }

    public void setCancelMessage(String cancelMessage) {
        this.cancelMessage = cancelMessage;
    }

    public String getOrderPlacementSource() {
        return orderPlacementSource;
    }

    public void setOrderPlacementSource(String orderPlacementSource) {
        this.orderPlacementSource = orderPlacementSource;
    }

    public String getOutstandingHoldAmount() {
        return outstandingHoldAmount;
    }

    public void setOutstandingHoldAmount(String outstandingHoldAmount) {
        this.outstandingHoldAmount = outstandingHoldAmount;
    }

    public boolean isLiquidation() {
        return isLiquidation;
    }

    public void setLiquidation(boolean liquidation) {
        isLiquidation = liquidation;
    }

    public String getLastFillTime() {
        return lastFillTime;
    }

    public void setLastFillTime(String lastFillTime) {
        this.lastFillTime = lastFillTime;
    }

    public String getFee() {
        return fee;
    }

    public void setFee(String fee) {
        this.fee = fee;
    }

    public String getOriginatingOrderId() {
        return originatingOrderId;
    }

    public void setOriginatingOrderId(String originatingOrderId) {
        this.originatingOrderId = originatingOrderId;
    }

    public String getAttachedOrderId() {
        return attachedOrderId;
    }

    public void setAttachedOrderId(String attachedOrderId) {
        this.attachedOrderId = attachedOrderId;
    }

    public List<EditHistoryItem> getEditHistory() {
        return editHistory;
    }

    public void setEditHistory(List<EditHistoryItem> editHistory) {
        this.editHistory = editHistory;
    }

    public static class Builder {
        private String orderId;
        private String productId;
        private String userId;
        private OrderConfiguration orderConfiguration;
        private String side;
        private String clientOrderId;
        private String status;
        private String timeInForce;
        private String createdTime;
        private String completionPercentage;
        private String filledSize;
        private String averageFilledPrice;
        private String numberOfFills;
        private String filledValue;
        private boolean pendingCancel;
        private boolean sizeInQuote;
        private String totalFees;
        private boolean sizeInclusiveOfFees;
        private String totalValueAfterFees;
        private String triggerStatus;
        private String orderType;
        private String rejectReason;
        private boolean settled;
        private String productType;
        private String rejectMessage;
        private String cancelMessage;
        private String orderPlacementSource;
        private String outstandingHoldAmount;
        private boolean isLiquidation;
        private String lastFillTime;
        private String fee;
        private String originatingOrderId;
        private String attachedOrderId;
        private String leverage;
        private String marginType;
        private String retailPortfolioId;
        private List<EditHistoryItem> editHistory;

        public Builder orderId(String orderId) {
            this.orderId = orderId;
            return this;
        }

        public Builder productId(String productId) {
            this.productId = productId;
            return this;
        }

        public Builder userId(String userId) {
            this.userId = userId;
            return this;
        }

        public Builder orderConfiguration(OrderConfiguration orderConfiguration) {
            this.orderConfiguration = orderConfiguration;
            return this;
        }

        public Builder side(String side) {
            this.side = side;
            return this;
        }

        public Builder clientOrderId(String clientOrderId) {
            this.clientOrderId = clientOrderId;
            return this;
        }

        public Builder status(String status) {
            this.status = status;
            return this;
        }

        public Builder timeInForce(String timeInForce) {
            this.timeInForce = timeInForce;
            return this;
        }

        public Builder createdTime(String createdTime) {
            this.createdTime = createdTime;
            return this;
        }

        public Builder completionPercentage(String completionPercentage) {
            this.completionPercentage = completionPercentage;
            return this;
        }

        public Builder filledSize(String filledSize) {
            this.filledSize = filledSize;
            return this;
        }

        public Builder averageFilledPrice(String averageFilledPrice) {
            this.averageFilledPrice = averageFilledPrice;
            return this;
        }

        public Builder numberOfFills(String numberOfFills) {
            this.numberOfFills = numberOfFills;
            return this;
        }

        public Builder filledValue(String filledValue) {
            this.filledValue = filledValue;
            return this;
        }

        public Builder pendingCancel(boolean pendingCancel) {
            this.pendingCancel = pendingCancel;
            return this;
        }

        public Builder sizeInQuote(boolean sizeInQuote) {
            this.sizeInQuote = sizeInQuote;
            return this;
        }

        public Builder totalFees(String totalFees) {
            this.totalFees = totalFees;
            return this;
        }

        public Builder sizeInclusiveOfFees(boolean sizeInclusiveOfFees) {
            this.sizeInclusiveOfFees = sizeInclusiveOfFees;
            return this;
        }

        public Builder totalValueAfterFees(String totalValueAfterFees) {
            this.totalValueAfterFees = totalValueAfterFees;
            return this;
        }

        public Builder triggerStatus(String triggerStatus) {
            this.triggerStatus = triggerStatus;
            return this;
        }

        public Builder orderType(String orderType) {
            this.orderType = orderType;
            return this;
        }

        public Builder rejectReason(String rejectReason) {
            this.rejectReason = rejectReason;
            return this;
        }

        public Builder settled(boolean settled) {
            this.settled = settled;
            return this;
        }

        public Builder productType(String productType) {
            this.productType = productType;
            return this;
        }

        public Builder rejectMessage(String rejectMessage) {
            this.rejectMessage = rejectMessage;
            return this;
        }

        public Builder cancelMessage(String cancelMessage) {
            this.cancelMessage = cancelMessage;
            return this;
        }

        public Builder orderPlacementSource(String orderPlacementSource) {
            this.orderPlacementSource = orderPlacementSource;
            return this;
        }

        public Builder outstandingHoldAmount(String outstandingHoldAmount) {
            this.outstandingHoldAmount = outstandingHoldAmount;
            return this;
        }

        public Builder isLiquidation(boolean isLiquidation) {
            this.isLiquidation = isLiquidation;
            return this;
        }

        public Builder lastFillTime(String lastFillTime) {
            this.lastFillTime = lastFillTime;
            return this;
        }

        public Builder fee(String fee) {
            this.fee = fee;
            return this;
        }

        public Builder originatingOrderId(String originatingOrderId) {
            this.originatingOrderId = originatingOrderId;
            return this;
        }

        public Builder leverage(String leverage) {
            this.leverage = leverage;
            return this;
        }

        public Builder marginType(String marginType) {
            this.marginType = marginType;
            return this;
        }

        public Builder retailPortfolioId(String retailPortfolioId) {
            this.retailPortfolioId = retailPortfolioId;
            return this;
        }

        public Builder attachedOrderId(String attachedOrderId) {
            this.attachedOrderId = attachedOrderId;
            return this;
        }

        public Builder editHistory(List<EditHistoryItem> editHistory) {
            this.editHistory = editHistory;
            return this;
        }

        public Order build() {
            return new Order(this);
        }
    }
}
