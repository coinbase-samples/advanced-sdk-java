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

import com.coinbase.advanced.model.common.Amount;
import com.fasterxml.jackson.annotation.JsonProperty;

public class TradeIncentive {

    @JsonProperty("applied_incentive")
    private boolean appliedIncentive;

    @JsonProperty("user_incentive_id")
    private String userIncentiveId;

    @JsonProperty("code_val")
    private String codeVal;

    @JsonProperty("ends_at")
    private String endsAt;

    @JsonProperty("fee_without_incentive")
    private Amount feeWithoutIncentive;

    @JsonProperty("redeemed")
    private boolean redeemed;

    public TradeIncentive() {}

    private TradeIncentive(Builder builder) {
        this.appliedIncentive = builder.appliedIncentive;
        this.userIncentiveId = builder.userIncentiveId;
        this.codeVal = builder.codeVal;
        this.endsAt = builder.endsAt;
        this.feeWithoutIncentive = builder.feeWithoutIncentive;
        this.redeemed = builder.redeemed;
    }

    public boolean isAppliedIncentive() {
        return appliedIncentive;
    }

    public void setAppliedIncentive(boolean appliedIncentive) {
        this.appliedIncentive = appliedIncentive;
    }

    public String getUserIncentiveId() {
        return userIncentiveId;
    }

    public void setUserIncentiveId(String userIncentiveId) {
        this.userIncentiveId = userIncentiveId;
    }

    public String getCodeVal() {
        return codeVal;
    }

    public void setCodeVal(String codeVal) {
        this.codeVal = codeVal;
    }

    public String getEndsAt() {
        return endsAt;
    }

    public void setEndsAt(String endsAt) {
        this.endsAt = endsAt;
    }

    public Amount getFeeWithoutIncentive() {
        return feeWithoutIncentive;
    }

    public void setFeeWithoutIncentive(Amount feeWithoutIncentive) {
        this.feeWithoutIncentive = feeWithoutIncentive;
    }

    public boolean isRedeemed() {
        return redeemed;
    }

    public void setRedeemed(boolean redeemed) {
        this.redeemed = redeemed;
    }

    public static class Builder {
        private boolean appliedIncentive;
        private String userIncentiveId;
        private String codeVal;
        private String endsAt;
        private Amount feeWithoutIncentive;
        private boolean redeemed;

        public Builder() {}

        public Builder appliedIncentive(boolean appliedIncentive) {
            this.appliedIncentive = appliedIncentive;
            return this;
        }

        public Builder userIncentiveId(String userIncentiveId) {
            this.userIncentiveId = userIncentiveId;
            return this;
        }

        public Builder codeVal(String codeVal) {
            this.codeVal = codeVal;
            return this;
        }

        public Builder endsAt(String endsAt) {
            this.endsAt = endsAt;
            return this;
        }

        public Builder feeWithoutIncentive(Amount feeWithoutIncentive) {
            this.feeWithoutIncentive = feeWithoutIncentive;
            return this;
        }

        public Builder redeemed(boolean redeemed) {
            this.redeemed = redeemed;
            return this;
        }

        public TradeIncentive build() {
            return new TradeIncentive(this);
        }
    }
}