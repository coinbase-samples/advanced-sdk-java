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

public class SuccessResponse {

    @JsonProperty("order_id")
    private String orderId;

    @JsonProperty("product_id")
    private String productId;

    @JsonProperty("side")
    private String side;

    @JsonProperty("client_order_id")
    private String clientOrderId;

    @JsonProperty("attached_order_id")
    private String attachedOrderId;

    public SuccessResponse() {}

    private SuccessResponse(Builder builder) {
        this.orderId = builder.orderId;
        this.productId = builder.productId;
        this.side = builder.side;
        this.clientOrderId = builder.clientOrderId;
        this.attachedOrderId = builder.attachedOrderId;
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

    public String getAttachedOrderId() {
        return attachedOrderId;
    }

    public static class Builder {
        private String orderId;
        private String productId;
        private String side;
        private String clientOrderId;
        private String attachedOrderId;

        public Builder orderId(String orderId) {
            this.orderId = orderId;
            return this;
        }

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

        public Builder attachedOrderId(String attachedOrderId) {
            this.attachedOrderId = attachedOrderId;
            return this;
        }

        public SuccessResponse build() {
            return new SuccessResponse(this);
        }
    }
}
