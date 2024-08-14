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

package com.coinbase.advanced.model.product;

import com.fasterxml.jackson.annotation.JsonProperty;

public class PerpetualDetails {

    @JsonProperty("open_interest")
    private String openInterest;

    @JsonProperty("funding_rate")
    private String fundingRate;

    @JsonProperty("funding_time")
    private String fundingTime;

    public String getOpenInterest() {
        return openInterest;
    }

    public void setOpenInterest(String openInterest) {
        this.openInterest = openInterest;
    }

    public String getFundingRate() {
        return fundingRate;
    }

    public void setFundingRate(String fundingRate) {
        this.fundingRate = fundingRate;
    }

    public String getFundingTime() {
        return fundingTime;
    }

    public void setFundingTime(String fundingTime) {
        this.fundingTime = fundingTime;
    }
}