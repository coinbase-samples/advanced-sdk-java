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

    // Getters and Setters

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

    // Builder class
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