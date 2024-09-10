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

public class PreviewEditOrderResponse {

    @JsonProperty("errors")
    private List<EditError> editErrors;

    @JsonProperty("slippage")
    private String slippage;

    @JsonProperty("order_total")
    private String orderTotal;

    @JsonProperty("commission_total")
    private String commissionTotal;

    @JsonProperty("quote_size")
    private String quoteSize;

    @JsonProperty("base_size")
    private String baseSize;

    @JsonProperty("best_bid")
    private String bestBid;

    @JsonProperty("best_ask")
    private String bestAsk;

    @JsonProperty("leverage")
    private String leverage;

    @JsonProperty("long_leverage")
    private String longLeverage;

    @JsonProperty("short_leverage")
    private String shortLeverage;

    @JsonProperty("request")
    private PreviewEditOrderRequest request;

    public List<EditError> getEditErrors() {
        return editErrors;
    }

    public void setEditErrors(List<EditError> editErrors) {
        this.editErrors = editErrors;
    }

    public String getSlippage() {
        return slippage;
    }

    public void setSlippage(String slippage) {
        this.slippage = slippage;
    }

    public String getOrderTotal() {
        return orderTotal;
    }

    public void setOrderTotal(String orderTotal) {
        this.orderTotal = orderTotal;
    }

    public String getCommissionTotal() {
        return commissionTotal;
    }

    public void setCommissionTotal(String commissionTotal) {
        this.commissionTotal = commissionTotal;
    }

    public String getQuoteSize() {
        return quoteSize;
    }

    public void setQuoteSize(String quoteSize) {
        this.quoteSize = quoteSize;
    }

    public String getBaseSize() {
        return baseSize;
    }

    public void setBaseSize(String baseSize) {
        this.baseSize = baseSize;
    }

    public String getBestBid() {
        return bestBid;
    }

    public void setBestBid(String bestBid) {
        this.bestBid = bestBid;
    }

    public String getBestAsk() {
        return bestAsk;
    }

    public void setBestAsk(String bestAsk) {
        this.bestAsk = bestAsk;
    }

    public String getLeverage() {
        return leverage;
    }

    public void setLeverage(String leverage) {
        this.leverage = leverage;
    }

    public String getLongLeverage() {
        return longLeverage;
    }

    public void setLongLeverage(String longLeverage) {
        this.longLeverage = longLeverage;
    }

    public String getShortLeverage() {
        return shortLeverage;
    }

    public void setShortLeverage(String shortLeverage) {
        this.shortLeverage = shortLeverage;
    }

    public PreviewEditOrderRequest getRequest() {
        return request;
    }

    public void setRequest(PreviewEditOrderRequest request) {
        this.request = request;
    }

    public static class Builder {
        private List<EditError> editErrors;
        private String slippage;
        private String orderTotal;
        private String commissionTotal;
        private String quoteSize;
        private String baseSize;
        private String bestBid;
        private String bestAsk;
        private String leverage;
        private String longLeverage;
        private String shortLeverage;
        private PreviewEditOrderRequest request;

        public Builder editErrors(List<EditError> editErrors) {
            this.editErrors = editErrors;
            return this;
        }

        public Builder slippage(String slippage) {
            this.slippage = slippage;
            return this;
        }

        public Builder orderTotal(String orderTotal) {
            this.orderTotal = orderTotal;
            return this;
        }

        public Builder commissionTotal(String commissionTotal) {
            this.commissionTotal = commissionTotal;
            return this;
        }

        public Builder quoteSize(String quoteSize) {
            this.quoteSize = quoteSize;
            return this;
        }

        public Builder baseSize(String baseSize) {
            this.baseSize = baseSize;
            return this;
        }

        public Builder bestBid(String bestBid) {
            this.bestBid = bestBid;
            return this;
        }

        public Builder bestAsk(String bestAsk) {
            this.bestAsk = bestAsk;
            return this;
        }

        public Builder leverage(String leverage) {
            this.leverage = leverage;
            return this;
        }

        public Builder longLeverage(String longLeverage) {
            this.longLeverage = longLeverage;
            return this;
        }

        public Builder shortLeverage(String shortLeverage) {
            this.shortLeverage = shortLeverage;
            return this;
        }

        public Builder request(PreviewEditOrderRequest request) {
            this.request = request;
            return this;
        }

        public PreviewEditOrderResponse build() {
            return new PreviewEditOrderResponse(this);
        }
    }

    private PreviewEditOrderResponse(Builder builder) {
        this.editErrors = builder.editErrors;
        this.slippage = builder.slippage;
        this.orderTotal = builder.orderTotal;
        this.commissionTotal = builder.commissionTotal;
        this.quoteSize = builder.quoteSize;
        this.baseSize = builder.baseSize;
        this.bestBid = builder.bestBid;
        this.bestAsk = builder.bestAsk;
        this.leverage = builder.leverage;
        this.longLeverage = builder.longLeverage;
        this.shortLeverage = builder.shortLeverage;
        this.request = builder.request;
    }
}
