package com.coinbase.advanced.model.convert;

import com.fasterxml.jackson.annotation.JsonProperty;

public class TradeIncentiveMetadata {

    @JsonProperty("user_incentive_id")
    private String userIncentiveId;

    @JsonProperty("code_val")
    private String codeVal;

    public TradeIncentiveMetadata() {}

    public TradeIncentiveMetadata(String userIncentiveId, String codeVal) {
        this.userIncentiveId = userIncentiveId;
        this.codeVal = codeVal;
    }

    public String getUserIncentiveId() {
        return userIncentiveId;
    }

    public String getCodeVal() {
        return codeVal;
    }
}

