package com.coinbase.advanced.model.convert;

import com.fasterxml.jackson.annotation.JsonProperty;

public class LedgerAccount {

    @JsonProperty("account_id")
    private String accountId;

    @JsonProperty("currency")
    private String currency;

    @JsonProperty("owner")
    private Owner owner;

    public LedgerAccount() {}

    private LedgerAccount(Builder builder) {
        this.accountId = builder.accountId;
        this.currency = builder.currency;
        this.owner = builder.owner;
    }

    // Getters and Setters

    public String getAccountId() {
        return accountId;
    }

    public void setAccountId(String accountId) {
        this.accountId = accountId;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public Owner getOwner() {
        return owner;
    }

    public void setOwner(Owner owner) {
        this.owner = owner;
    }

    // Builder class
    public static class Builder {
        private String accountId;
        private String currency;
        private Owner owner;

        public Builder() {}

        public Builder accountId(String accountId) {
            this.accountId = accountId;
            return this;
        }

        public Builder currency(String currency) {
            this.currency = currency;
            return this;
        }

        public Builder owner(Owner owner) {
            this.owner = owner;
            return this;
        }

        public LedgerAccount build() {
            return new LedgerAccount(this);
        }
    }
}
