package com.coinbase.advanced.model.account;

import com.coinbase.advanced.model.common.Pagination;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true) // Add this annotation
public class ListAccountsResponse {

    @JsonProperty("accounts")
    private List<Account> accounts;

    @JsonProperty("has_next")  // Map these fields directly to the ListAccountsResponse class
    private boolean hasNext;

    @JsonProperty("cursor")
    private String cursor;

    @JsonProperty("size")
    private int size;

    private Pagination pagination;

    private ListAccountsRequest request;

    public ListAccountsResponse() {}

    private ListAccountsResponse(Builder builder) {
        this.accounts = builder.accounts;
        this.pagination = builder.pagination;
        this.request = builder.request;
        this.hasNext = builder.hasNext;
        this.cursor = builder.cursor;
        this.size = builder.size;
    }

    public List<Account> getAccounts() {
        return accounts;
    }

    public Pagination getPagination() {
        return pagination;
    }

    public boolean isHasNext() {
        return hasNext;
    }

    public String getCursor() {
        return cursor;
    }

    public int getSize() {
        return size;
    }

    public ListAccountsRequest getRequest() {
        return request;
    }

    public static class Builder {
        private List<Account> accounts;
        private Pagination pagination;
        private ListAccountsRequest request;
        private boolean hasNext;
        private String cursor;
        private int size;

        public Builder accounts(List<Account> accounts) {
            this.accounts = accounts;
            return this;
        }

        public Builder pagination(Pagination pagination) {
            this.pagination = pagination;
            return this;
        }

        public Builder hasNext(boolean hasNext) {
            this.hasNext = hasNext;
            return this;
        }

        public Builder cursor(String cursor) {
            this.cursor = cursor;
            return this;
        }

        public Builder size(int size) {
            this.size = size;
            return this;
        }

        public Builder request(ListAccountsRequest request) {
            this.request = request;
            return this;
        }

        public ListAccountsResponse build() {
            return new ListAccountsResponse(this);
        }
    }
}
