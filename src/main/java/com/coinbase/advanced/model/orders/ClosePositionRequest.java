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

public class ClosePositionRequest {

    @JsonProperty("client_order_id")
    private String clientOrderId;

    @JsonProperty("product_id")
    private String productId;

    @JsonProperty("size")
    private String size;

    public ClosePositionRequest() {}

    private ClosePositionRequest(Builder builder) {
        this.clientOrderId = builder.clientOrderId;
        this.productId = builder.productId;
        this.size = builder.size;
    }

    public String getClientOrderId() {
        return clientOrderId;
    }

    public void setClientOrderId(String clientOrderId) {
        this.clientOrderId = clientOrderId;
    }

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public static class Builder {
        private String clientOrderId;
        private String productId;
        private String size;

        public Builder clientOrderId(String clientOrderId) {
            this.clientOrderId = clientOrderId;
            return this;
        }

        public Builder productId(String productId) {
            this.productId = productId;
            return this;
        }

        public Builder size(String size) {
            this.size = size;
            return this;
        }

        public ClosePositionRequest build() {
            return new ClosePositionRequest(this);
        }
    }
}
