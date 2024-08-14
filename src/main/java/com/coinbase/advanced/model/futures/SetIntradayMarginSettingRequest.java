package com.coinbase.advanced.model.futures;

import com.coinbase.advanced.http.CoinbaseAdvancedPostRequest;
import com.fasterxml.jackson.annotation.JsonProperty;

public class SetIntradayMarginSettingRequest implements CoinbaseAdvancedPostRequest {

    @JsonProperty("setting")
    private String setting;

    public SetIntradayMarginSettingRequest() {}

    private SetIntradayMarginSettingRequest(Builder builder) {
        this.setting = builder.setting;
    }

    public String getSetting() {
        return setting;
    }

    public void setSetting(String setting) {
        this.setting = setting;
    }

    @Override
    public String getPath() {
        return "/brokerage/cfm/intraday/margin_setting";
    }

    @Override
    public String getBody() {
        return "{\"setting\":\"" + setting + "\"}";
    }

    public static class Builder {
        private String setting;

        public Builder setting(String setting) {
            this.setting = setting;
            return this;
        }

        public SetIntradayMarginSettingRequest build() {
            return new SetIntradayMarginSettingRequest(this);
        }
    }
}
