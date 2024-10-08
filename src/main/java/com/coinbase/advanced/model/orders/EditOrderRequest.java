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

public class EditOrderRequest {

    @JsonProperty("order_id")
    private String orderId;

    @JsonProperty("price")
    private String price;

    @JsonProperty("size")
    private String size;

    public EditOrderRequest() {}

    private EditOrderRequest(Builder builder) {
        this.orderId = builder.orderId;
        this.price = builder.price;
        this.size = builder.size;
    }

    public String getOrderId() {
        return orderId;
    }

    public String getPrice() {
        return price;
    }

    public String getSize() {
        return size;
    }

    public static class Builder {
        private String orderId;
        private String price;
        private String size;

        public Builder orderId(String orderId) {
            this.orderId = orderId;
            return this;
        }

        public Builder price(String price) {
            this.price = price;
            return this;
        }

        public Builder size(String size) {
            this.size = size;
            return this;
        }

        public EditOrderRequest build() {
            return new EditOrderRequest(this);
        }
    }
}
