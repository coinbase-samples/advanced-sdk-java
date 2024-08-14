package com.coinbase.advanced.model.futures;

import com.fasterxml.jackson.annotation.JsonProperty;

public class GetIntradayMarginSettingResponse {

    @JsonProperty("setting")
    private String setting;

    public GetIntradayMarginSettingResponse() {}

    private GetIntradayMarginSettingResponse(Builder builder) {
        this.setting = builder.setting;
    }

    public String getSetting() {
        return setting;
    }

    public void setSetting(String setting) {
        this.setting = setting;
    }

    public static class Builder {
        private String setting;

        public Builder setting(String setting) {
            this.setting = setting;
            return this;
        }

        public static Builder from(GetIntradayMarginSettingResponse resp) {
            return new Builder().setting(resp.getSetting());
        }

        public GetIntradayMarginSettingResponse build() {
            return new GetIntradayMarginSettingResponse(this);
        }
    }
}
