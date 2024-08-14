package com.coinbase.advanced.model.convert;

import com.coinbase.advanced.http.CoinbaseAdvancedPostRequest;
import com.coinbase.advanced.model.common.TradeIncentiveMetadata;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class CreateConvertQuoteRequest implements CoinbaseAdvancedPostRequest {

    @JsonProperty("from_account")
    private String fromAccount;

    @JsonProperty("to_account")
    private String toAccount;

    @JsonProperty("amount")
    private String amount;

    @JsonProperty("trade_incentive_metadata")
    private TradeIncentiveMetadata tradeIncentiveMetadata;

    public CreateConvertQuoteRequest() {}

    private CreateConvertQuoteRequest(Builder builder) {
        this.fromAccount = builder.fromAccount;
        this.toAccount = builder.toAccount;
        this.amount = builder.amount;
        this.tradeIncentiveMetadata = builder.tradeIncentiveMetadata;
    }

    public String getFromAccount() {
        return fromAccount;
    }

    public String getToAccount() {
        return toAccount;
    }

    public String getAmount() {
        return amount;
    }

    public TradeIncentiveMetadata getTradeIncentiveMetadata() {
        return tradeIncentiveMetadata;
    }

    @Override
    public String getPath() {
        return "/brokerage/convert/quote";
    }

    @Override
    public String getBody() {
        try {
            ObjectMapper mapper = new ObjectMapper();
            return mapper.writeValueAsString(this);
        } catch (JsonProcessingException e) {
            throw new RuntimeException("Failed to convert request to JSON", e);
        }
    }

    public static class Builder {
        private String fromAccount;
        private String toAccount;
        private String amount;
        private TradeIncentiveMetadata tradeIncentiveMetadata;

        public Builder fromAccount(String fromAccount) {
            this.fromAccount = fromAccount;
            return this;
        }

        public Builder toAccount(String toAccount) {
            this.toAccount = toAccount;
            return this;
        }

        public Builder amount(String amount) {
            this.amount = amount;
            return this;
        }

        public Builder tradeIncentiveMetadata(TradeIncentiveMetadata tradeIncentiveMetadata) {
            this.tradeIncentiveMetadata = tradeIncentiveMetadata;
            return this;
        }

        public CreateConvertQuoteRequest build() {
            return new CreateConvertQuoteRequest(this);
        }
    }
}
