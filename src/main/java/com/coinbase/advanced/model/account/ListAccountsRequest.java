package com.coinbase.advanced.model.account;

import com.coinbase.advanced.http.CoinbaseAdvancedGetRequest;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class ListAccountsRequest implements CoinbaseAdvancedGetRequest {

    @Override
    public String getPath() {
        return "/brokerage/accounts";
    }

    @Override
    public String getQueryString() {
        return "";
    }
}