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

public class GetOrderRequest {
    private String orderId;

    public GetOrderRequest() {}

    private GetOrderRequest(Builder builder) {
        this.orderId = builder.orderId;
    }

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    @Override
    public String getPath() {
        return ;
    }

    @Override
    public String getQueryString() {
        return "";
    }

    public static class Builder {
        private String orderId;

        public Builder orderId(String orderId) {
            this.orderId = orderId;
            return this;
        }

        public GetOrderRequest build() {
            return new GetOrderRequest(this);
        }
    }
}
