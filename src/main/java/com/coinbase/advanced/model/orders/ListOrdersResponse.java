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

public class ListOrdersResponse {

    @JsonProperty("orders")
    private List<Order> orders;

    @JsonProperty("sequence")
    private String sequence;

    @JsonProperty("has_next")
    private boolean hasNext;

    @JsonProperty("cursor")
    private String cursor;

    public ListOrdersResponse() {}

    private ListOrdersResponse(Builder builder) {
        this.orders = builder.orders;
        this.sequence = builder.sequence;
        this.hasNext = builder.hasNext;
        this.cursor = builder.cursor;
    }

    public List<Order> getOrders() {
        return orders;
    }

    public void setOrders(List<Order> orders) {
        this.orders = orders;
    }

    public String getSequence() {
        return sequence;
    }

    public void setSequence(String sequence) {
        this.sequence = sequence;
    }

    public boolean isHasNext() {
        return hasNext;
    }

    public void setHasNext(boolean hasNext) {
        this.hasNext = hasNext;
    }

    public String getCursor() {
        return cursor;
    }

    public void setCursor(String cursor) {
        this.cursor = cursor;
    }

    public static class Builder {
        private List<Order> orders;
        private String sequence;
        private boolean hasNext;
        private String cursor;

        public Builder orders(List<Order> orders) {
            this.orders = orders;
            return this;
        }

        public Builder sequence(String sequence) {
            this.sequence = sequence;
            return this;
        }

        public Builder hasNext(boolean hasNext) {
            this.hasNext = hasNext;
            return this;
        }

        public Builder cursor(String cursor) {
            this.cursor = cursor;
            return this;
        }

        public ListOrdersResponse build() {
            return new ListOrdersResponse(this);
        }
    }
}
