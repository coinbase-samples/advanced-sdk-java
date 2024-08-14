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

public class CreateOrderPreviewResponse {

    @JsonProperty("order_total")
    private String orderTotal;

    @JsonProperty("commission_total")
    private String commissionTotal;

    @JsonProperty("errs")
    private List<String> errs;

    @JsonProperty("warning")
    private List<String> warning;

    @JsonProperty("quote_size")
    private String quoteSize;

    @JsonProperty("base_size")
    private String baseSize;

    @JsonProperty("best_bid")
    private String bestBid;

    @JsonProperty("best_ask")
    private String bestAsk;

    @JsonProperty("is_max")
    private boolean isMax;

    @JsonProperty("order_margin_total")
    private String orderMarginTotal;

    @JsonProperty("leverage")
    private String leverage;

    @JsonProperty("long_leverage")
    private String longLeverage;

    @JsonProperty("short_leverage")
    private String shortLeverage;

    @JsonProperty("slippage")
    private String slippage;

    @JsonProperty("average_filled_price")
    private String averageFilledPrice;

    @JsonProperty("preview_id")
    private String previewId;

    @JsonProperty("current_liquidation_buffer")
    private String currentLiquidationBuffer;

    @JsonProperty("projected_liquidation_buffer")
    private String projectedLiquidationBuffer;

    @JsonProperty("max_leverage")
    private String maxLeverage;

    @JsonProperty("pnl_configuration")
    private String pnlConfiguration;

    public CreateOrderPreviewResponse() {}

    private CreateOrderPreviewResponse(Builder builder) {
        this.orderTotal = builder.orderTotal;
        this.commissionTotal = builder.commissionTotal;
        this.errs = builder.errs;
        this.warning = builder.warning;
        this.quoteSize = builder.quoteSize;
        this.baseSize = builder.baseSize;
        this.bestBid = builder.bestBid;
        this.bestAsk = builder.bestAsk;
        this.isMax = builder.isMax;
        this.orderMarginTotal = builder.orderMarginTotal;
        this.leverage = builder.leverage;
        this.longLeverage = builder.longLeverage;
        this.shortLeverage = builder.shortLeverage;
        this.slippage = builder.slippage;
        this.averageFilledPrice = builder.averageFilledPrice;
        this.previewId = builder.previewId;
        this.currentLiquidationBuffer = builder.currentLiquidationBuffer;
        this.projectedLiquidationBuffer = builder.projectedLiquidationBuffer;
        this.maxLeverage = builder.maxLeverage;
        this.pnlConfiguration = builder.pnlConfiguration;
    }

    public List<String> getErrs() {
        return errs;
    }

    public List<String> getWarning() {
        return warning;
    }

    public String getOrderTotal() {
        return orderTotal;
    }

    public String getCommissionTotal() {
        return commissionTotal;
    }

    public String getQuoteSize() {
        return quoteSize;
    }

    public String getBaseSize() {
        return baseSize;
    }

    public String getBestBid() {
        return bestBid;
    }

    public String getBestAsk() {
        return bestAsk;
    }

    public boolean isMax() {
        return isMax;
    }

    public String getOrderMarginTotal() {
        return orderMarginTotal;
    }

    public String getLeverage() {
        return leverage;
    }

    public String getLongLeverage() {
        return longLeverage;
    }

    public String getShortLeverage() {
        return shortLeverage;
    }

    public String getSlippage() {
        return slippage;
    }

    public String getAverageFilledPrice() {
        return averageFilledPrice;
    }

    public String getPreviewId() {
        return previewId;
    }

    public String getCurrentLiquidationBuffer() {
        return currentLiquidationBuffer;
    }

    public String getProjectedLiquidationBuffer() {
        return projectedLiquidationBuffer;
    }

    public String getMaxLeverage() {
        return maxLeverage;
    }

    public String getPnlConfiguration() {
        return pnlConfiguration;
    }

    public static class Builder {
        private String orderTotal;
        private String commissionTotal;
        private List<String> errs;
        private List<String> warning;
        private String quoteSize;
        private String baseSize;
        private String bestBid;
        private String bestAsk;
        private boolean isMax;
        private String orderMarginTotal;
        private String leverage;
        private String longLeverage;
        private String shortLeverage;
        private String slippage;
        private String averageFilledPrice;
        private String previewId;
        private String currentLiquidationBuffer;
        private String projectedLiquidationBuffer;
        private String maxLeverage;
        private String pnlConfiguration;

        public Builder orderTotal(String orderTotal) {
            this.orderTotal = orderTotal;
            return this;
        }

        public Builder commissionTotal(String commissionTotal) {
            this.commissionTotal = commissionTotal;
            return this;
        }

        public Builder errs(List<String> errs) {
            this.errs = errs;
            return this;
        }

        public Builder warning(List<String> warning) {
            this.warning = warning;
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

        public Builder isMax(boolean isMax) {
            this.isMax = isMax;
            return this;
        }

        public Builder orderMarginTotal(String orderMarginTotal) {
            this.orderMarginTotal = orderMarginTotal;
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

        public Builder slippage(String slippage) {
            this.slippage = slippage;
            return this;
        }

        public Builder averageFilledPrice(String averageFilledPrice) {
            this.averageFilledPrice = averageFilledPrice;
            return this;
        }

        public Builder previewId(String previewId) {
            this.previewId = previewId;
            return this;
        }

        public Builder currentLiquidationBuffer(String currentLiquidationBuffer) {
            this.currentLiquidationBuffer = currentLiquidationBuffer;
            return this;
        }

        public Builder projectedLiquidationBuffer(String projectedLiquidationBuffer) {
            this.projectedLiquidationBuffer = projectedLiquidationBuffer;
            return this;
        }

        public Builder maxLeverage(String maxLeverage) {
            this.maxLeverage = maxLeverage;
            return this;
        }

        public Builder pnlConfiguration(String pnlConfiguration) {
            this.pnlConfiguration = pnlConfiguration;
            return this;
        }

        public static Builder from(CreateOrderPreviewResponse resp) {
            return new Builder()
                    .orderTotal(resp.getOrderTotal())
                    .commissionTotal(resp.getCommissionTotal())
                    .errs(resp.getErrs())
                    .warning(resp.getWarning())
                    .quoteSize(resp.getQuoteSize())
                    .baseSize(resp.getBaseSize())
                    .bestBid(resp.getBestBid())
                    .bestAsk(resp.getBestAsk())
                    .isMax(resp.isMax())
                    .orderMarginTotal(resp.getOrderMarginTotal())
                    .leverage(resp.getLeverage())
                    .longLeverage(resp.getLongLeverage())
                    .shortLeverage(resp.getShortLeverage())
                    .slippage(resp.getSlippage())
                    .averageFilledPrice(resp.getAverageFilledPrice())
                    .previewId(resp.getPreviewId())
                    .currentLiquidationBuffer(resp.getCurrentLiquidationBuffer())
                    .projectedLiquidationBuffer(resp.getProjectedLiquidationBuffer())
                    .maxLeverage(resp.getMaxLeverage())
                    .pnlConfiguration(resp.getPnlConfiguration());
        }

        public CreateOrderPreviewResponse build() {
            return new CreateOrderPreviewResponse(this);
        }
    }
}
