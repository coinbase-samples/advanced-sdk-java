package com.coinbase.advanced.model.fees;

import com.coinbase.advanced.http.CoinbaseAdvancedGetRequest;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

public class GetTransactionsSummaryRequest implements CoinbaseAdvancedGetRequest {

    @JsonProperty("product_type")
    private String productType;

    @JsonProperty("contract_expiry_type")
    @JsonInclude(JsonInclude.Include.NON_NULL)
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

    @Override
    public String getPath() {
        return "/brokerage/transaction_summary";
    }

    @Override
    public String getQueryString() {
        StringBuilder queryString = new StringBuilder();
        queryString.append("product_type=").append(productType);
        if (contractExpiryType != null && !contractExpiryType.isEmpty()) {
            queryString.append("&contract_expiry_type=").append(contractExpiryType);
        }
        return queryString.toString();
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
