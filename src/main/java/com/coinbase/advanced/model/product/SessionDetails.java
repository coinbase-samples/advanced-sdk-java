package com.coinbase.advanced.model.product;

import com.fasterxml.jackson.annotation.JsonProperty;

public class SessionDetails {

    @JsonProperty("is_session_open")
    private String isSessionOpen;

    @JsonProperty("open_time")
    private String openTime;

    @JsonProperty("close_time")
    private String closeTime;

    public String getIsSessionOpen() {
        return isSessionOpen;
    }

    public void setIsSessionOpen(String isSessionOpen) {
        this.isSessionOpen = isSessionOpen;
    }

    public String getOpenTime() {
        return openTime;
    }

    public void setOpenTime(String openTime) {
        this.openTime = openTime;
    }

    public String getCloseTime() {
        return closeTime;
    }

    public void setCloseTime(String closeTime) {
        this.closeTime = closeTime;
    }
}