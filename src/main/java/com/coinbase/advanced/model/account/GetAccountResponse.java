package com.coinbase.advanced.model.account;

import com.fasterxml.jackson.annotation.JsonProperty;

public class GetAccountResponse {

    @JsonProperty("account")
    private Account account;

    public GetAccountResponse() {}

    private GetAccountResponse(Builder builder) {
        this.account = builder.account;
    }

    public Account getAccount() {
        return account;
    }

    public void setAccount(Account account) {
        this.account = account;
    }

    public static class Builder {
        private Account account;

        public Builder account(Account account) {
            this.account = account;
            return this;
        }

        public GetAccountResponse build() {
            return new GetAccountResponse(this);
        }
    }
}
