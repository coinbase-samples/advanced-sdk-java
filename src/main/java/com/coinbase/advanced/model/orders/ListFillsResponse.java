package com.coinbase.advanced.model.orders;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

public class ListFillsResponse {

    @JsonProperty("fills")
    private List<Fill> fills;

    @JsonProperty("cursor")
    private String cursor;

    public ListFillsResponse() {}

    private ListFillsResponse(Builder builder) {
        this.fills = builder.fills;
        this.cursor = builder.cursor;
    }

    public List<Fill> getFills() {
        return fills;
    }

    public void setFills(List<Fill> fills) {
        this.fills = fills;
    }

    public String getCursor() {
        return cursor;
    }

    public void setCursor(String cursor) {
        this.cursor = cursor;
    }

    public static class Builder {
        private List<Fill> fills;
        private String cursor;

        public Builder fills(List<Fill> fills) {
            this.fills = fills;
            return this;
        }

        public Builder cursor(String cursor) {
            this.cursor = cursor;
            return this;
        }

        public static Builder from(ListFillsResponse resp) {
            return new Builder()
                    .fills(resp.getFills())
                    .cursor(resp.getCursor());
        }

        public ListFillsResponse build() {
            return new ListFillsResponse(this);
        }
    }
}
