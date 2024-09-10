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

import com.coinbase.advanced.model.common.SortBy;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public class ListFillsRequest {
    @JsonProperty("order_ids")
    private List<String> orderIds;

    @JsonProperty("product_ids")
    private List<String> productIds;

    @JsonProperty("trade_ids")
    private List<String> tradeIds;

    @JsonProperty("start_sequence_timestamp")
    private String startSequenceTimestamp;

    @JsonProperty("end_sequence_timestamp")
    private String endSequenceTimestamp;

    private String limit;

    private String cursor;

    @JsonProperty("sort_by")
    private SortBy sortBy;

    public ListFillsRequest() {}

    private ListFillsRequest(Builder builder) {
        this.orderIds = builder.orderIds;
        this.productIds = builder.productIds;
        this.tradeIds = builder.tradeIds;
        this.startSequenceTimestamp = builder.startSequenceTimestamp;
        this.endSequenceTimestamp = builder.endSequenceTimestamp;
        this.limit = builder.limit;
        this.cursor = builder.cursor;
        this.sortBy = builder.sortBy;
    }

    public List<String> getOrderIds() {
        return orderIds;
    }

    public void setOrderIds(List<String> orderIds) {
        this.orderIds = orderIds;
    }

    public List<String> getProductIds() {
        return productIds;
    }

    public void setProductIds(List<String> productIds) {
        this.productIds = productIds;
    }

    public List<String> getTradeIds() {
        return tradeIds;
    }

    public void setTradeIds(List<String> tradeIds) {
        this.tradeIds = tradeIds;
    }

    public String getStartSequenceTimestamp() {
        return startSequenceTimestamp;
    }

    public void setStartSequenceTimestamp(String startSequenceTimestamp) {
        this.startSequenceTimestamp = startSequenceTimestamp;
    }

    public String getEndSequenceTimestamp() {
        return endSequenceTimestamp;
    }

    public void setEndSequenceTimestamp(String endSequenceTimestamp) {
        this.endSequenceTimestamp = endSequenceTimestamp;
    }

    public String getLimit() {
        return limit;
    }

    public void setLimit(String limit) {
        this.limit = limit;
    }

    public String getCursor() {
        return cursor;
    }

    public void setCursor(String cursor) {
        this.cursor = cursor;
    }

    public SortBy getSortBy() {
        return sortBy;
    }

    public void setSortBy(SortBy sortBy) {
        this.sortBy = sortBy;
    }

    public static class Builder {
        private List<String> orderIds;
        private List<String> productIds;
        private List<String> tradeIds;
        private String startSequenceTimestamp;
        private String endSequenceTimestamp;
        private String limit;
        private String cursor;
        private SortBy sortBy;

        public Builder orderId(List<String> orderIds) {
            this.orderIds = orderIds;
            return this;
        }

        public Builder productIds(List<String> productIds) {
            this.productIds = productIds;
            return this;
        }

        public Builder tradeIds(List<String> tradeIds) {
            this.tradeIds = tradeIds;
            return this;
        }

        public Builder startSequenceTimestamp(String startSequenceTimestamp) {
            this.startSequenceTimestamp = startSequenceTimestamp;
            return this;
        }

        public Builder endSequenceTimestamp(String endSequenceTimestamp) {
            this.endSequenceTimestamp = endSequenceTimestamp;
            return this;
        }

        public Builder limit(String limit) {
            this.limit = limit;
            return this;
        }

        public Builder cursor(String cursor) {
            this.cursor = cursor;
            return this;
        }

        public Builder sortBy(SortBy sortBy) {
            this.sortBy = sortBy;
            return this;
        }

        public ListFillsRequest build() {
            return new ListFillsRequest(this);
        }
    }
}
