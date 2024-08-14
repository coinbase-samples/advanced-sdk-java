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

public class GetProductRequest implements CoinbaseAdvancedGetRequest {

    private final String productId;

    private GetProductRequest(Builder builder) {
        this.productId = builder.productId;
    }

    public String getProductId() {
        return productId;
    }

    @Override
    public String getPath() {
        return "/brokerage/products/" + productId;
    }

    @Override
    public String getQueryString() {
        return "";
    }

    public static class Builder {
        private String productId;

        public Builder productId(String productId) {
            this.productId = productId;
            return this;
        }

        public GetProductRequest build() {
            return new GetProductRequest(this);
        }
    }
}