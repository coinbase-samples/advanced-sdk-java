package com.coinbase.advanced.model.futures;

import com.coinbase.advanced.http.CoinbaseAdvancedGetRequest;

public class ListFuturesPositionsRequest implements CoinbaseAdvancedGetRequest {

    public ListFuturesPositionsRequest() {}

    @Override
    public String getPath() {
        return "/brokerage/cfm/positions";
    }

    @Override
    public String getQueryString() {
        return "";
    }

    public static class Builder {

        public ListFuturesPositionsRequest build() {
            return new ListFuturesPositionsRequest();
        }
    }
}
