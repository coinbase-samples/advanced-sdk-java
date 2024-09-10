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

package com.coinbase.advanced.model.paymentmethods;

import com.fasterxml.jackson.annotation.JsonProperty;

public class PaymentMethod {

    @JsonProperty("id")
    private String id;

    @JsonProperty("type")
    private String type;

    @JsonProperty("name")
    private String name;

    @JsonProperty("currency")
    private String currency;

    @JsonProperty("verified")
    private boolean verified;

    @JsonProperty("allow_buy")
    private boolean allowBuy;

    @JsonProperty("allow_sell")
    private boolean allowSell;

    @JsonProperty("allow_deposit")
    private boolean allowDeposit;

    @JsonProperty("allow_withdraw")
    private boolean allowWithdraw;

    @JsonProperty("created_at")
    private String createdAt;

    @JsonProperty("updated_at")
    private String updatedAt;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
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

    public boolean isVerified() {
        return verified;
    }

    public void setVerified(boolean verified) {
        this.verified = verified;
    }

    public boolean isAllowBuy() {
        return allowBuy;
    }

    public void setAllowBuy(boolean allowBuy) {
        this.allowBuy = allowBuy;
    }

    public boolean isAllowSell() {
        return allowSell;
    }

    public void setAllowSell(boolean allowSell) {
        this.allowSell = allowSell;
    }

    public boolean isAllowDeposit() {
        return allowDeposit;
    }

    public void setAllowDeposit(boolean allowDeposit) {
        this.allowDeposit = allowDeposit;
    }

    public boolean isAllowWithdraw() {
        return allowWithdraw;
    }

    public void setAllowWithdraw(boolean allowWithdraw) {
        this.allowWithdraw = allowWithdraw;
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

    public static class Builder {
        private String id;
        private String type;
        private String name;
        private String currency;
        private boolean verified;
        private boolean allowBuy;
        private boolean allowSell;
        private boolean allowDeposit;
        private boolean allowWithdraw;
        private String createdAt;
        private String updatedAt;

        public Builder id(String id) {
            this.id = id;
            return this;
        }

        public Builder type(String type) {
            this.type = type;
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

        public Builder verified(boolean verified) {
            this.verified = verified;
            return this;
        }

        public Builder allowBuy(boolean allowBuy) {
            this.allowBuy = allowBuy;
            return this;
        }

        public Builder allowSell(boolean allowSell) {
            this.allowSell = allowSell;
            return this;
        }

        public Builder allowDeposit(boolean allowDeposit) {
            this.allowDeposit = allowDeposit;
            return this;
        }

        public Builder allowWithdraw(boolean allowWithdraw) {
            this.allowWithdraw = allowWithdraw;
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

        public PaymentMethod build() {
            PaymentMethod paymentMethod = new PaymentMethod();
            paymentMethod.id = this.id;
            paymentMethod.type = this.type;
            paymentMethod.name = this.name;
            paymentMethod.currency = this.currency;
            paymentMethod.verified = this.verified;
            paymentMethod.allowBuy = this.allowBuy;
            paymentMethod.allowSell = this.allowSell;
            paymentMethod.allowDeposit = this.allowDeposit;
            paymentMethod.allowWithdraw = this.allowWithdraw;
            paymentMethod.createdAt = this.createdAt;
            paymentMethod.updatedAt = this.updatedAt;
            return paymentMethod;
        }
    }
}
