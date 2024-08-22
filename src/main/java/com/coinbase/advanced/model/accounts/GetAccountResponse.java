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

package com.coinbase.advanced.model.accounts;

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
