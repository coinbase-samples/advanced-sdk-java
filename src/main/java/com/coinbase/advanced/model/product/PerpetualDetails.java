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