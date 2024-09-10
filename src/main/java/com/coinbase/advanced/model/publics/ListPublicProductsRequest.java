package com.coinbase.advanced.model.publics;

import com.coinbase.advanced.model.common.ContractExpiryType;
import com.coinbase.advanced.model.common.ExpiringContractStatus;
import com.coinbase.advanced.model.common.ProductType;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public class ListPublicProductsRequest {
    private Integer limit;
    private Integer offset;
    @JsonProperty("product_type")
    private ProductType productType;
    @JsonProperty("product_ids")
    private List<String> productIds;
    @JsonProperty("contract_expiry_type")
    private ContractExpiryType contractExpiryType;
    @JsonProperty("expiring_contract_status")
    private ExpiringContractStatus expiringContractStatus;
    @JsonProperty("get_all_products")
    private Boolean getAllProducts;

    public ListPublicProductsRequest() {}

    private ListPublicProductsRequest(Builder builder) {
        this.limit = builder.limit;
        this.offset = builder.offset;
        this.productType = builder.productType;
        this.productIds = builder.productIds;
        this.contractExpiryType = builder.contractExpiryType;
        this.expiringContractStatus = builder.expiringContractStatus;
        this.getAllProducts = builder.getAllProducts;
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

    public ProductType getProductType() {
        return productType;
    }

    public void setProductType(ProductType productType) {
        this.productType = productType;
    }

    public List<String> getProductIds() {
        return productIds;
    }

    public void setProductIds(List<String> productIds) {
        this.productIds = productIds;
    }

    public ContractExpiryType getContractExpiryType() {
        return contractExpiryType;
    }

    public void setContractExpiryType(ContractExpiryType contractExpiryType) {
        this.contractExpiryType = contractExpiryType;
    }

    public ExpiringContractStatus getExpiringContractStatus() {
        return expiringContractStatus;
    }

    public void setExpiringContractStatus(ExpiringContractStatus expiringContractStatus) {
        this.expiringContractStatus = expiringContractStatus;
    }

    public Boolean getGetAllProducts() {
        return getAllProducts;
    }

    public void setGetAllProducts(Boolean getAllProducts) {
        this.getAllProducts = getAllProducts;
    }

    public static class Builder {
        private Integer limit;
        private Integer offset;
        private ProductType productType;
        private List<String> productIds;
        private ContractExpiryType contractExpiryType;
        private ExpiringContractStatus expiringContractStatus;
        private Boolean getAllProducts;

        public Builder limit(Integer limit) {
            this.limit = limit;
            return this;
        }

        public Builder offset(Integer offset) {
            this.offset = offset;
            return this;
        }

        public Builder productType(ProductType productType) {
            this.productType = productType;
            return this;
        }

        public Builder productIds(List<String> productIds) {
            this.productIds = productIds;
            return this;
        }

        public Builder contractExpiryType(ContractExpiryType contractExpiryType) {
            this.contractExpiryType = contractExpiryType;
            return this;
        }

        public Builder expiringContractStatus(ExpiringContractStatus expiringContractStatus) {
            this.expiringContractStatus = expiringContractStatus;
            return this;
        }

        public Builder getAllProducts(Boolean getAllProducts) {
            this.getAllProducts = getAllProducts;
            return this;
        }

        public ListPublicProductsRequest build() {
            return new ListPublicProductsRequest(this);
        }
    }
}
