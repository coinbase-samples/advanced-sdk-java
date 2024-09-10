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

package com.coinbase.advanced.model.products;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

public class GetProductCandlesRequest {

    @JsonProperty("product_id")
    @JsonIgnore
    private String productId;

    @JsonProperty("start")
    private String start;

    @JsonProperty("end")
    private String end;

    @JsonProperty("granularity")
    private String granularity;

    public GetProductCandlesRequest() {}

    private GetProductCandlesRequest(Builder builder) {
        this.productId = builder.productId;
        this.start = builder.start;
        this.end = builder.end;
        this.granularity = builder.granularity;
    }

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public String getStart() {
        return start;
    }

    public void setStart(String start) {
        this.start = start;
    }

    public String getEnd() {
        return end;
    }

    public void setEnd(String end) {
        this.end = end;
    }

    public String getGranularity() {
        return granularity;
    }

    public void setGranularity(String granularity) {
        this.granularity = granularity;
    }

    public static class Builder {
        private String productId;
        private String start;
        private String end;
        private String granularity;

        public Builder productId(String productId) {
            this.productId = productId;
            return this;
        }

        public Builder start(String start) {
            this.start = start;
            return this;
        }

        public Builder end(String end) {
            this.end = end;
            return this;
        }

        public Builder granularity(String granularity) {
            this.granularity = granularity;
            return this;
        }

        public GetProductCandlesRequest build() {
            return new GetProductCandlesRequest(this);
        }
    }
}
