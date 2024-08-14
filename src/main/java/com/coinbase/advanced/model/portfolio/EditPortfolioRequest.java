package com.coinbase.advanced.model.portfolio;

import com.coinbase.advanced.http.CoinbaseAdvancedPutRequest;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class EditPortfolioRequest implements CoinbaseAdvancedPutRequest {

    @JsonProperty("portfolio_uuid")
    private String portfolioUuid;

    @JsonProperty("name")
    private String name;

    public EditPortfolioRequest() {}

    private EditPortfolioRequest(Builder builder) {
        this.portfolioUuid = builder.portfolioUuid;
        this.name = builder.name;
    }

    public String getPortfolioUuid() {
        return portfolioUuid;
    }

    public void setPortfolioUuid(String portfolioUuid) {
        this.portfolioUuid = portfolioUuid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String getPath() {
        return "/brokerage/portfolios/" + portfolioUuid;
    }

    @Override
    public String getBody() {
        // Construct JSON body manually to avoid serialization issues
        try {
            ObjectMapper mapper = new ObjectMapper();
            return mapper.writeValueAsString(new BodyContent(name));
        } catch (JsonProcessingException e) {
            throw new RuntimeException("Failed to serialize EditPortfolioRequest", e);
        }
    }

    @Override
    public String getQueryString() {
        // No query string required, return empty
        return "";
    }

    private static class BodyContent {
        @JsonProperty("name")
        private String name;

        public BodyContent(String name) {
            this.name = name;
        }
    }

    public static class Builder {
        private String portfolioUuid;
        private String name;

        public Builder portfolioUuid(String portfolioUuid) {
            this.portfolioUuid = portfolioUuid;
            return this;
        }

        public Builder name(String name) {
            this.name = name;
            return this;
        }

        public EditPortfolioRequest build() {
            return new EditPortfolioRequest(this);
        }
    }
}
