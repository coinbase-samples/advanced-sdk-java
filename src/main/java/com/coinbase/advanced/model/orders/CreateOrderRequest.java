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

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.core.JsonProcessingException;

public class CreateOrderRequest {

    @JsonProperty("product_id")
    private String productId;

    @JsonProperty("side")
    private String side;

    @JsonProperty("client_order_id")
    private String clientOrderId;

    @JsonProperty("order_configuration")
    private OrderConfiguration orderConfiguration;

    @JsonProperty("leverage")
    private String leverage;

    @JsonProperty("margin_type")
    private String marginType;

    @JsonProperty("retail_portfolio_id")
    private String retailPortfolioId;

    public CreateOrderRequest() {}

    private CreateOrderRequest(Builder builder) {
        this.productId = builder.productId;
        this.side = builder.side;
        this.clientOrderId = builder.clientOrderId;
        this.orderConfiguration = builder.orderConfiguration;
        this.leverage = builder.leverage;
        this.marginType = builder.marginType;
        this.retailPortfolioId = builder.retailPortfolioId;
    }

    public static class NonRecursiveRequest {

        @JsonProperty("product_id")
        private String productId;

        @JsonProperty("side")
        private String side;

        @JsonProperty("client_order_id")
        private String clientOrderId;

        @JsonProperty("order_configuration")
        private OrderConfiguration orderConfiguration;

        @JsonProperty("leverage")
        private String leverage;

        @JsonProperty("margin_type")
        private String marginType;

        @JsonProperty("retail_portfolio_id")
        private String retailPortfolioId;

        public NonRecursiveRequest(CreateOrderRequest original) {
            this.productId = original.productId;
            this.side = original.side;
            this.clientOrderId = original.clientOrderId;
            this.orderConfiguration = original.orderConfiguration;
            this.leverage = original.leverage;
            this.marginType = original.marginType;
            this.retailPortfolioId = original.retailPortfolioId;
        }
    }

    public static class Builder {
        private String productId;
        private String side;
        private String clientOrderId;
        private OrderConfiguration orderConfiguration;
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

        public Builder clientOrderId(String clientOrderId) {
            this.clientOrderId = clientOrderId;
            return this;
        }

        public Builder orderConfiguration(OrderConfiguration orderConfiguration) {
            this.orderConfiguration = orderConfiguration;
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

        public CreateOrderRequest build() {
            return new CreateOrderRequest(this);
        }
    }
}
