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

package com.coinbase.advanced.model.product;

import com.coinbase.advanced.http.CoinbaseAdvancedGetRequest;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

public class GetProductBookRequest implements CoinbaseAdvancedGetRequest {

    @JsonProperty("product_id")
    private String productId;

    @JsonProperty("limit")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String limit;

    public GetProductBookRequest() {}

    private GetProductBookRequest(Builder builder) {
        this.productId = builder.productId;
        this.limit = builder.limit;
    }

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public String getLimit() {
        return limit;
    }

    public void setLimit(String limit) {
        this.limit = limit;
    }

    @Override
    public String getPath() {
        return "/brokerage/product_book";
    }

    @Override
    public String getQueryString() {
        StringBuilder queryString = new StringBuilder();
        queryString.append("product_id=").append(productId);
        if (limit != null && !limit.isEmpty()) {
            queryString.append("&limit=").append(limit);
        }
        return queryString.toString();
    }

    public static class Builder {
        private String productId;
        private String limit;

        public Builder productId(String productId) {
            this.productId = productId;
            return this;
        }

        public Builder limit(String limit) {
            this.limit = limit;
            return this;
        }

        public GetProductBookRequest build() {
            return new GetProductBookRequest(this);
        }
    }
}
