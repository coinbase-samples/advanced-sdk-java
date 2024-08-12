package com.coinbase.advanced.model.portfolio;

import com.coinbase.advanced.model.common.Pagination;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public class ListPortfoliosResponse {

    @JsonProperty("portfolios")
    private List<Portfolio> portfolios;

    private ListPortfoliosRequest request;

    public ListPortfoliosResponse() {}

    private ListPortfoliosResponse(Builder builder) {
        this.portfolios = builder.portfolios;
        this.request = builder.request;
    }

    public List<Portfolio> getPortfolios() {
        return portfolios;
    }

    public ListPortfoliosRequest getRequest() {
        return request;
    }

    public static class Builder {
        private List<Portfolio> portfolios;
        private ListPortfoliosRequest request;

        public Builder portfolios(List<Portfolio> portfolios) {
            this.portfolios = portfolios;
            return this;
        }

        public Builder request(ListPortfoliosRequest request) {
            this.request = request;
            return this;
        }

        public ListPortfoliosResponse build() {
            return new ListPortfoliosResponse(this);
        }
    }
}
