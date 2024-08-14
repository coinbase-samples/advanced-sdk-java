package com.coinbase.advanced.model.convert;

import com.coinbase.advanced.http.CoinbaseAdvancedGetRequest;
import com.fasterxml.jackson.annotation.JsonProperty;

public class GetConvertTradeRequest implements CoinbaseAdvancedGetRequest {

    @JsonProperty("trade_id")
    private String tradeId;

    @JsonProperty("from_account")
    private String fromAccount;

    @JsonProperty("to_account")
    private String toAccount;

    public GetConvertTradeRequest() {}

    private GetConvertTradeRequest(Builder builder) {
        this.tradeId = builder.tradeId;
        this.fromAccount = builder.fromAccount;
        this.toAccount = builder.toAccount;
    }

    public String getTradeId() {
        return tradeId;
    }

    public String getFromAccount() {
        return fromAccount;
    }

    public String getToAccount() {
        return toAccount;
    }

    @Override
    public String getPath() {
        return "/brokerage/convert/trade/" + tradeId;
    }

    @Override
    public String getQueryString() {
        return "";  // No additional query parameters needed
    }

    public static class Builder {
        private String tradeId;
        private String fromAccount;
        private String toAccount;

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

        public GetConvertTradeRequest build() {
            return new GetConvertTradeRequest(this);
        }
    }
}
