package com.coinbase.advanced.model.futures;

import com.coinbase.advanced.http.CoinbaseAdvancedDeleteRequest;

public class CancelPendingFuturesSweepRequest implements CoinbaseAdvancedDeleteRequest {

    @Override
    public String getPath() {
        return "/brokerage/cfm/sweeps";
    }

    @Override
    public String getQueryString() {
        return "";  // No query parameters for this request
    }
}
