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

import com.coinbase.advanced.model.common.Rate;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.core.JsonProcessingException;

public class CreateOrderPreviewRequest {
    @JsonProperty("product_id")
    private String productId;

    @JsonProperty("side")
    private String side;

    @JsonProperty("order_configuration")
    private OrderConfiguration orderConfiguration;

    @JsonProperty("commission_rate")
    private Rate commissionRate;

    @JsonProperty("is_max")
    private Boolean isMax;

    @JsonProperty("tradable_balance")
    private String tradableBalance;

    @JsonProperty("skip_fcm_risk_check")
    private Boolean skipFcmRiskCheck;

    @JsonProperty("leverage")
    private String leverage;

    @JsonProperty("margin_type")
    private String marginType;

    @JsonProperty("retail_portfolio_id")
    private String retailPortfolioId;

    public CreateOrderPreviewRequest() {}

    private CreateOrderPreviewRequest(Builder builder) {
        this.productId = builder.productId;
        this.side = builder.side;
        this.orderConfiguration = builder.orderConfiguration;
        this.commissionRate = builder.commissionRate;
        this.isMax = builder.isMax;
        this.tradableBalance = builder.tradableBalance;
        this.skipFcmRiskCheck = builder.skipFcmRiskCheck;
        this.leverage = builder.leverage;
        this.marginType = builder.marginType;
        this.retailPortfolioId = builder.retailPortfolioId;
    }

    private static class NonRecursiveRequest {
        @JsonProperty("product_id")
        private final String productId;

        @JsonProperty("side")
        private final String side;

        @JsonProperty("order_configuration")
        private final OrderConfiguration orderConfiguration;

        @JsonProperty("commission_rate")
        private final Rate commissionRate;

        @JsonProperty("is_max")
        private final Boolean isMax;

        @JsonProperty("tradable_balance")
        private final String tradableBalance;

        @JsonProperty("skip_fcm_risk_check")
        private final Boolean skipFcmRiskCheck;

        @JsonProperty("leverage")
        private final String leverage;

        @JsonProperty("margin_type")
        private final String marginType;

        @JsonProperty("retail_portfolio_id")
        private final String retailPortfolioId;

        public NonRecursiveRequest(CreateOrderPreviewRequest original) {
            this.productId = original.productId;
            this.side = original.side;
            this.orderConfiguration = original.orderConfiguration;
            this.commissionRate = original.commissionRate;
            this.isMax = original.isMax;
            this.tradableBalance = original.tradableBalance;
            this.skipFcmRiskCheck = original.skipFcmRiskCheck;
            this.leverage = original.leverage;
            this.marginType = original.marginType;
            this.retailPortfolioId = original.retailPortfolioId;
        }
    }

    public static class Builder {
        private String productId;
        private String side;
        private OrderConfiguration orderConfiguration;
        private Rate commissionRate;
        private Boolean isMax;
        private String tradableBalance;
        private Boolean skipFcmRiskCheck;
        private String leverage;
        private String marginType;
        private String retailPortfolioId;

        public Builder productId(String productId) {
            this.productId = productId;
            return this;
        }

        public Builder side(String side) {
            this.side = side;
            return this;
        }

        public Builder orderConfiguration(OrderConfiguration orderConfiguration) {
            this.orderConfiguration = orderConfiguration;
            return this;
        }

        public Builder commissionRate(Rate commissionRate) {
            this.commissionRate = commissionRate;
            return this;
        }

        public Builder isMax(Boolean isMax) {
            this.isMax = isMax;
            return this;
        }

        public Builder tradableBalance(String tradableBalance) {
            this.tradableBalance = tradableBalance;
            return this;
        }

        public Builder skipFcmRiskCheck(Boolean skipFcmRiskCheck) {
            this.skipFcmRiskCheck = skipFcmRiskCheck;
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

        public CreateOrderPreviewRequest build() {
            return new CreateOrderPreviewRequest(this);
        }
    }
}
