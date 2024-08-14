package com.coinbase.advanced.model.orders;

import com.coinbase.advanced.http.CoinbaseAdvancedGetRequest;

public class ListFillsRequest implements CoinbaseAdvancedGetRequest {

    private String orderId;
    private String productId;
    private String startSequenceTimestamp;
    private String endSequenceTimestamp;
    private String limit;
    private String cursor;

    public ListFillsRequest() {}

    private ListFillsRequest(Builder builder) {
        this.orderId = builder.orderId;
        this.productId = builder.productId;
        this.startSequenceTimestamp = builder.startSequenceTimestamp;
        this.endSequenceTimestamp = builder.endSequenceTimestamp;
        this.limit = builder.limit;
        this.cursor = builder.cursor;
    }

    public String getOrderId() {
        return orderId;
    }

    public String getProductId() {
        return productId;
    }

    public String getStartSequenceTimestamp() {
        return startSequenceTimestamp;
    }

    public String getEndSequenceTimestamp() {
        return endSequenceTimestamp;
    }

    public String getLimit() {
        return limit;
    }

    public String getCursor() {
        return cursor;
    }

    @Override
    public String getPath() {
        return "/brokerage/orders/historical/fills";
    }

    @Override
    public String getQueryString() {
        StringBuilder queryString = new StringBuilder();

        if (orderId != null && !orderId.isEmpty()) {
            queryString.append("order_id=").append(orderId).append("&");
        }
        if (productId != null && !productId.isEmpty()) {
            queryString.append("product_id=").append(productId).append("&");
        }
        if (startSequenceTimestamp != null && !startSequenceTimestamp.isEmpty()) {
            queryString.append("start_sequence_timestamp=").append(startSequenceTimestamp).append("&");
        }
        if (endSequenceTimestamp != null && !endSequenceTimestamp.isEmpty()) {
            queryString.append("end_sequence_timestamp=").append(endSequenceTimestamp).append("&");
        }
        if (limit != null && !limit.isEmpty()) {
            queryString.append("limit=").append(limit).append("&");
        }
        if (cursor != null && !cursor.isEmpty()) {
            queryString.append("cursor=").append(cursor).append("&");
        }

        // Remove the last "&" if present
        if (queryString.length() > 0 && queryString.charAt(queryString.length() - 1) == '&') {
            queryString.deleteCharAt(queryString.length() - 1);
        }

        return queryString.toString();
    }

    public static class Builder {
        private String orderId;
        private String productId;
        private String startSequenceTimestamp;
        private String endSequenceTimestamp;
        private String limit;
        private String cursor;

        public Builder orderId(String orderId) {
            this.orderId = orderId;
            return this;
        }

        public Builder productId(String productId) {
            this.productId = productId;
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

        public ListFillsRequest build() {
            return new ListFillsRequest(this);
        }
    }
}
