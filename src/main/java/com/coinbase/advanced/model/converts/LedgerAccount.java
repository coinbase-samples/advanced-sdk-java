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

package com.coinbase.advanced.model.converts;

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
