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

package com.coinbase.advanced.model.convert;

import com.fasterxml.jackson.annotation.JsonProperty;

public class SourceTargetInfo {

    @JsonProperty("type")
    private String type;

    @JsonProperty("network")
    private String network;

    @JsonProperty("ledger_account")
    private LedgerAccount ledgerAccount;

    public SourceTargetInfo() {}

    private SourceTargetInfo(Builder builder) {
        this.type = builder.type;
        this.network = builder.network;
        this.ledgerAccount = builder.ledgerAccount;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getNetwork() {
        return network;
    }

    public void setNetwork(String network) {
        this.network = network;
    }

    public LedgerAccount getLedgerAccount() {
        return ledgerAccount;
    }

    public void setLedgerAccount(LedgerAccount ledgerAccount) {
        this.ledgerAccount = ledgerAccount;
    }

    public static class Builder {
        private String type;
        private String network;
        private LedgerAccount ledgerAccount;

        public Builder() {}

        public Builder type(String type) {
            this.type = type;
            return this;
        }

        public Builder network(String network) {
            this.network = network;
            return this;
        }

        public Builder ledgerAccount(LedgerAccount ledgerAccount) {
            this.ledgerAccount = ledgerAccount;
            return this;
        }

        public SourceTargetInfo build() {
            return new SourceTargetInfo(this);
        }
    }
}