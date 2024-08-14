package com.coinbase.advanced.model.futures;

import com.coinbase.advanced.http.CoinbaseAdvancedGetRequest;

public class GetIntradayMarginSettingRequest implements CoinbaseAdvancedGetRequest {

    public GetIntradayMarginSettingRequest() {}

    @Override
    public String getPath() {
        return "/brokerage/cfm/intraday/margin_setting";
    }

    @Override
    public String getQueryString() {
        return "";
    }
}
