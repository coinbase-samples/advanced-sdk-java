package com.coinbase.advanced.model.account;

import com.coinbase.advanced.http.CoinbaseAdvancedGetRequest;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

public class GetAccountRequest implements CoinbaseAdvancedGetRequest {

    @JsonProperty("account_uuid")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String accountUuid;

    public GetAccountRequest() {}

    public GetAccountRequest(String accountUuid) {
        this.accountUuid = accountUuid;
    }

    public String getAccountUuid() {
        return accountUuid;
    }

    public void setAccountUuid(String accountUuid) {
        this.accountUuid = accountUuid;
    }

    @Override
    public String getPath() {
        return "/brokerage/accounts/" + accountUuid;
    }

    @Override
    public String getQueryString() {
        return "";
    }
}
