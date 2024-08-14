package com.coinbase.advanced.model.futures;

import com.coinbase.advanced.http.CoinbaseAdvancedGetRequest;

public class ListFuturesSweepsRequest implements CoinbaseAdvancedGetRequest {

    @Override
    public String getPath() {
        return "/brokerage/cfm/sweeps";
    }

    @Override
    public String getQueryString() {
        return "";
    }
}
