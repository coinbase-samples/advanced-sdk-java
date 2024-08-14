package com.coinbase.advanced.model.perpetuals;

import com.coinbase.advanced.http.CoinbaseAdvancedPostRequest;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class AllocatePortfolioRequest implements CoinbaseAdvancedPostRequest {

    @JsonProperty("portfolio_uuid")
    private String portfolioUuid;

    @JsonProperty("symbol")
    private String symbol;

    @JsonProperty("amount")
    private String amount;

    @JsonProperty("currency")
    private String currency;

    public AllocatePortfolioRequest() {}

    private AllocatePortfolioRequest(Builder builder) {
        this.portfolioUuid = builder.portfolioUuid;
        this.symbol = builder.symbol;
        this.amount = builder.amount;
        this.currency = builder.currency;
    }

    @Override
    public String getPath() {
        return "/brokerage/intx/allocate";
    }

    @Override
    public String getBody() {
        ObjectMapper objectMapper = new ObjectMapper();
        try {
            return objectMapper.writeValueAsString(this);
        } catch (JsonProcessingException e) {
            throw new RuntimeException("Failed to convert request to JSON", e);
        }
    }

    // Getters and Setters
    public String getPortfolioUuid() {
        return portfolioUuid;
    }

    public void setPortfolioUuid(String portfolioUuid) {
        this.portfolioUuid = portfolioUuid;
    }

    public String getSymbol() {
        return symbol;
    }

    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }

    public String getAmount() {
        return amount;
    }

    public void setAmount(String amount) {
        this.amount = amount;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    // Builder Class
    public static class Builder {
        private String portfolioUuid;
        private String symbol;
        private String amount;
        private String currency;

        public Builder() {}

        public Builder portfolioUuid(String portfolioUuid) {
            this.portfolioUuid = portfolioUuid;
            return this;
        }

        public Builder symbol(String symbol) {
            this.symbol = symbol;
            return this;
        }

        public Builder amount(String amount) {
            this.amount = amount;
            return this;
        }

        public Builder currency(String currency) {
            this.currency = currency;
            return this;
        }

        public AllocatePortfolioRequest build() {
            return new AllocatePortfolioRequest(this);
        }
    }
}