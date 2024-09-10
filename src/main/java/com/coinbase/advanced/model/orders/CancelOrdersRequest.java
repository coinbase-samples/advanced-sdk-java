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

public class CancelOrdersRequest {

    @JsonProperty("order_ids")
    private List<String> orderIds;

    public CancelOrdersRequest() {}

    private CancelOrdersRequest(Builder builder) {
        this.orderIds = builder.orderIds;
    }

    public List<String> getOrderIds() {
        return orderIds;
    }

    public void setOrderIds(List<String> orderIds) {
        this.orderIds = orderIds;
    }

    public static class Builder {
        private List<String> orderIds;

        public Builder orderIds(List<String> orderIds) {
            this.orderIds = orderIds;
            return this;
        }

        public CancelOrdersRequest build() {
            return new CancelOrdersRequest(this);
        }
    }
}
