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

import com.coinbase.advanced.model.common.PaginationParams;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public class ListProductsRequest {

    @JsonProperty("product_type")
    private String productType;

    @JsonProperty("product_ids")
    private List<String> productIds;

    @JsonProperty("contract_expiry_type")
    private String contractExpiryType;

    @JsonProperty("expiring_contract_status")
    private String expiringContractStatus;

    private Integer limit;

    private Integer offset;

    public ListProductsRequest() {}

    private ListProductsRequest(Builder builder) {
        this.productType = builder.productType;
        this.productIds = builder.productIds;
        this.contractExpiryType = builder.contractExpiryType;
        this.expiringContractStatus = builder.expiringContractStatus;
        this.limit = builder.limit;
        this.offset = builder.offset;
    }

    public String getProductType() {
        return productType;
    }

    public void setProductType(String productType) {
        this.productType = productType;
    }

    public List<String> getProductIds() {
        return productIds;
    }

    public void setProductIds(List<String> productIds) {
        this.productIds = productIds;
    }

    public String getContractExpiryType() {
        return contractExpiryType;
    }

    public void setContractExpiryType(String contractExpiryType) {
        this.contractExpiryType = contractExpiryType;
    }

    public String getExpiringContractStatus() {
        return expiringContractStatus;
    }

    public void setExpiringContractStatus(String expiringContractStatus) {
        this.expiringContractStatus = expiringContractStatus;
    }

    public Integer getLimit() {
        return limit;
    }

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    public Integer getOffset() {
        return offset;
    }

    public void setOffset(Integer offset) {
        this.offset = offset;
    }

    @Override
    public String getPath() {
        return ;
    }

    public static class Builder {
        private String productType;
        private List<String> productIds;
        private String contractExpiryType;
        private String expiringContractStatus;
        private Integer limit;
        private Integer offset;

        public Builder productType(String productType) {
            this.productType = productType;
            return this;
        }

        public Builder productIds(List<String> productIds) {
            this.productIds = productIds;
            return this;
        }

        public Builder contractExpiryType(String contractExpiryType) {
            this.contractExpiryType = contractExpiryType;
            return this;
        }

        public Builder expiringContractStatus(String expiringContractStatus) {
            this.expiringContractStatus = expiringContractStatus;
            return this;
        }

        public Builder limit(Integer limit) {
            this.limit = limit;
            return this;
        }

        public Builder offset(Integer offset) {
            this.offset = offset;
            return this;
        }

        public ListProductsRequest build() {
            return new ListProductsRequest(this);
        }
    }
}
