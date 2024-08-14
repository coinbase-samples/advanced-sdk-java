package com.coinbase.advanced.model.futures;

import com.coinbase.advanced.http.CoinbaseAdvancedGetRequest;

public class GetFuturesBalanceSummaryRequest implements CoinbaseAdvancedGetRequest {

    public GetFuturesBalanceSummaryRequest() {}

    @Override
    public String getPath() {
        return "/brokerage/cfm/balance_summary";
    }

    @Override
    public String getQueryString() {
        return "";
    }
}
