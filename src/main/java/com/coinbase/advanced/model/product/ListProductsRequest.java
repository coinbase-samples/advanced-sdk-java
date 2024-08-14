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
import com.coinbase.advanced.model.common.PaginationParams;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public class ListProductsRequest implements CoinbaseAdvancedGetRequest {

    @JsonProperty("product_type")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String productType;

    @JsonProperty("product_ids")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private List<String> productIds;

    @JsonProperty("contract_expiry_type")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String contractExpiryType;

    @JsonProperty("expiring_contract_status")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String expiringContractStatus;

    @JsonProperty("pagination_params")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private PaginationParams paginationParams;

    public ListProductsRequest() {}

    private ListProductsRequest(Builder builder) {
        this.productType = builder.productType;
        this.productIds = builder.productIds;
        this.contractExpiryType = builder.contractExpiryType;
        this.expiringContractStatus = builder.expiringContractStatus;
        this.paginationParams = builder.paginationParams;
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

    public PaginationParams getPaginationParams() {
        return paginationParams;
    }

    public void setPaginationParams(PaginationParams paginationParams) {
        this.paginationParams = paginationParams;
    }

    @Override
    public String getPath() {
        return "/brokerage/products";
    }

    @Override
    public String getQueryString() {
        StringBuilder query = new StringBuilder();
        if (productType != null) {
            query.append("product_type=").append(productType).append("&");
        }
        if (productIds != null && !productIds.isEmpty()) {
            for (String id : productIds) {
                query.append("product_ids=").append(id).append("&");
            }
        }
        if (contractExpiryType != null) {
            query.append("contract_expiry_type=").append(contractExpiryType).append("&");
        }
        if (expiringContractStatus != null) {
            query.append("expiring_contract_status=").append(expiringContractStatus).append("&");
        }
        if (paginationParams != null) {
            if (paginationParams.getCursor() != null) {
                query.append("cursor=").append(paginationParams.getCursor()).append("&");
            }
            if (paginationParams.getLimit() != null) {
                query.append("limit=").append(paginationParams.getLimit()).append("&");
            }
        }
        if (query.length() > 0) {
            query.setLength(query.length() - 1);
        }
        return query.toString();
    }

    public static class Builder {
        private String productType;
        private List<String> productIds;
        private String contractExpiryType;
        private String expiringContractStatus;
        private PaginationParams paginationParams;

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

        public Builder paginationParams(PaginationParams paginationParams) {
            this.paginationParams = paginationParams;
            return this;
        }

        public ListProductsRequest build() {
            return new ListProductsRequest(this);
        }
    }
}
