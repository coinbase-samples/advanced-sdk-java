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

import com.coinbase.advanced.model.common.Amount;
import com.fasterxml.jackson.annotation.JsonProperty;

public class Account {

    @JsonProperty("uuid")
    private String uuid;

    @JsonProperty("name")
    private String name;

    @JsonProperty("currency")
    private String currency;

    @JsonProperty("available_balance")
    private Amount availableBalance;

    @JsonProperty("default")
    private boolean isDefault;

    @JsonProperty("active")
    private boolean active;

    @JsonProperty("created_at")
    private String createdAt;

    @JsonProperty("updated_at")
    private String updatedAt;

    @JsonProperty("deleted_at")
    private String deletedAt;

    @JsonProperty("type")
    private String type;

    @JsonProperty("ready")
    private boolean ready;

    @JsonProperty("hold")
    private Amount hold;

    @JsonProperty("retail_portfolio_id")
    private String retailPortfolioId;

    public Account() {}

    private Account(Builder builder) {
        this.uuid = builder.uuid;
        this.name = builder.name;
        this.currency = builder.currency;
        this.availableBalance = builder.availableBalance;
        this.isDefault = builder.isDefault;
        this.active = builder.active;
        this.createdAt = builder.createdAt;
        this.updatedAt = builder.updatedAt;
        this.deletedAt = builder.deletedAt;
        this.type = builder.type;
        this.ready = builder.ready;
        this.hold = builder.hold;
        this.retailPortfolioId = builder.retailPortfolioId;
    }

    public static class Builder {
        private String uuid;
        private String name;
        private String currency;
        private Amount availableBalance;
        private boolean isDefault;
        private boolean active;
        private String createdAt;
        private String updatedAt;
        private String deletedAt;
        private String type;
        private boolean ready;
        private Amount hold;
        private String retailPortfolioId;

        public Builder() {}

        public Builder uuid(String uuid) {
            this.uuid = uuid;
            return this;
        }

        public Builder name(String name) {
            this.name = name;
            return this;
        }

        public Builder currency(String currency) {
            this.currency = currency;
            return this;
        }

        public Builder availableBalance(Amount availableBalance) {
            this.availableBalance = availableBalance;
            return this;
        }

        public Builder isDefault(boolean isDefault) {
            this.isDefault = isDefault;
            return this;
        }

        public Builder active(boolean active) {
            this.active = active;
            return this;
        }

        public Builder createdAt(String createdAt) {
            this.createdAt = createdAt;
            return this;
        }

        public Builder updatedAt(String updatedAt) {
            this.updatedAt = updatedAt;
            return this;
        }

        public Builder deletedAt(String deletedAt) {
            this.deletedAt = deletedAt;
            return this;
        }

        public Builder type(String type) {
            this.type = type;
            return this;
        }

        public Builder ready(boolean ready) {
            this.ready = ready;
            return this;
        }

        public Builder hold(Amount hold) {
            this.hold = hold;
            return this;
        }

        public Builder retailPortfolioId(String retailPortfolioId) {
            this.retailPortfolioId = retailPortfolioId;
            return this;
        }

        public Account build() {
            return new Account(this);
        }
    }

    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public Amount getAvailableBalance() {
        return availableBalance;
    }

    public void setAvailableBalance(Amount availableBalance) {
        this.availableBalance = availableBalance;
    }

    public boolean isDefault() {
        return isDefault;
    }

    public void setDefault(boolean isDefault) {
        this.isDefault = isDefault;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    public String getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    public String getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
    }

    public String getDeletedAt() {
        return deletedAt;
    }

    public void setDeletedAt(String deletedAt) {
        this.deletedAt = deletedAt;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public boolean isReady() {
        return ready;
    }

    public void setReady(boolean ready) {
        this.ready = ready;
    }

    public Amount getHold() {
        return hold;
    }

    public void setHold(Amount hold) {
        this.hold = hold;
    }

    public String getRetailPortfolioId() {
        return retailPortfolioId;
    }

    public void setRetailPortfolioId(String retailPortfolioId) {
        this.retailPortfolioId = retailPortfolioId;
    }
}
