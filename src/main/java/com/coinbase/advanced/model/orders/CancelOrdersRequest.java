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

import com.coinbase.advanced.http.CoinbaseAdvancedPostRequest;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.core.JsonProcessingException;

import java.util.List;

public class CancelOrdersRequest implements CoinbaseAdvancedPostRequest {

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

    @Override
    public String getPath() {
        return "/brokerage/orders/batch_cancel";
    }

    @Override
    public String getBody() {
        ObjectMapper mapper = new ObjectMapper();
        try {
            return mapper.writeValueAsString(new NonRecursiveRequest(this));
        } catch (JsonProcessingException e) {
            throw new RuntimeException("Failed to serialize CancelOrdersRequest", e);
        }
    }

    public static class NonRecursiveRequest {
        @JsonProperty("order_ids")
        private List<String> orderIds;

        public NonRecursiveRequest(CancelOrdersRequest original) {
            this.orderIds = original.getOrderIds();
        }
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
