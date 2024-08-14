package com.coinbase.advanced.model.convert;

import com.coinbase.advanced.http.CoinbaseAdvancedPostRequest;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class CommitConvertQuoteRequest implements CoinbaseAdvancedPostRequest {

    @JsonProperty("trade_id")
    private String tradeId;

    @JsonProperty("from_account")
    private String fromAccount;

    @JsonProperty("to_account")
    private String toAccount;

    public CommitConvertQuoteRequest() {}

    private CommitConvertQuoteRequest(Builder builder) {
        this.tradeId = builder.tradeId;
        this.fromAccount = builder.fromAccount;
        this.toAccount = builder.toAccount;
    }

    @Override
    public String getPath() {
        return "/brokerage/convert/trade/" + tradeId;
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

    public String getTradeId() {
        return tradeId;
    }

    public void setTradeId(String tradeId) {
        this.tradeId = tradeId;
    }

    public String getFromAccount() {
        return fromAccount;
    }

    public void setFromAccount(String fromAccount) {
        this.fromAccount = fromAccount;
    }

    public String getToAccount() {
        return toAccount;
    }

    public void setToAccount(String toAccount) {
        this.toAccount = toAccount;
    }

    public static class Builder {
        private String tradeId;
        private String fromAccount;
        private String toAccount;

        public Builder() {}

        public Builder tradeId(String tradeId) {
            this.tradeId = tradeId;
            return this;
        }

        public Builder fromAccount(String fromAccount) {
            this.fromAccount = fromAccount;
            return this;
        }

        public Builder toAccount(String toAccount) {
            this.toAccount = toAccount;
            return this;
        }

        public CommitConvertQuoteRequest build() {
            return new CommitConvertQuoteRequest(this);
        }
    }
}
