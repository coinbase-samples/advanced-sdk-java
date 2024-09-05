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

package com.coinbase.advanced.model.fees;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

public class GetTransactionsSummaryRequest {
    @JsonProperty("product_type")
    @JsonIgnore
    private String productType;

    @JsonProperty(required = true, value = "contract_expiry_type")
    private String contractExpiryType;

    public GetTransactionsSummaryRequest() {}

    private GetTransactionsSummaryRequest(Builder builder) {
        this.productType = builder.productType;
        this.contractExpiryType = builder.contractExpiryType;
    }

    public String getProductType() {
        return productType;
    }

    public void setProductType(String productType) {
        this.productType = productType;
    }

    public String getContractExpiryType() {
        return contractExpiryType;
    }

    public void setContractExpiryType(String contractExpiryType) {
        this.contractExpiryType = contractExpiryType;
    }

    public static class Builder {
        private String productType;
        private String contractExpiryType;

        public Builder productType(String productType) {
            this.productType = productType;
            return this;
        }

        public Builder contractExpiryType(String contractExpiryType) {
            this.contractExpiryType = contractExpiryType;
            return this;
        }

        public GetTransactionsSummaryRequest build() {
            return new GetTransactionsSummaryRequest(this);
        }
    }
}
