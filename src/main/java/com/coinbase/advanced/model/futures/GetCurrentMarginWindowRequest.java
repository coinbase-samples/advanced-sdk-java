package com.coinbase.advanced.model.futures;

import com.coinbase.advanced.http.CoinbaseAdvancedGetRequest;
import com.fasterxml.jackson.annotation.JsonProperty;

public class GetCurrentMarginWindowRequest implements CoinbaseAdvancedGetRequest {

    @JsonProperty("margin_profile_type")
    private String marginProfileType;

    public GetCurrentMarginWindowRequest() {}

    private GetCurrentMarginWindowRequest(Builder builder) {
        this.marginProfileType = builder.marginProfileType;
    }

    public String getMarginProfileType() {
        return marginProfileType;
    }

    public void setMarginProfileType(String marginProfileType) {
        this.marginProfileType = marginProfileType;
    }

    @Override
    public String getPath() {
        return "/brokerage/cfm/intraday/current_margin_window";
    }

    @Override
    public String getQueryString() {
        return "margin_profile_type=" + marginProfileType;
    }

    public static class Builder {
        private String marginProfileType;

        public Builder marginProfileType(String marginProfileType) {
            this.marginProfileType = marginProfileType;
            return this;
        }

        public GetCurrentMarginWindowRequest build() {
            return new GetCurrentMarginWindowRequest(this);
        }
    }
}
