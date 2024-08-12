package com.coinbase.advanced.model.common;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Pagination {

    @JsonProperty("has_next")
    private boolean hasNext;

    @JsonProperty("cursor")
    private String cursor;

    @JsonProperty("size")
    private int size;

    public Pagination() {}

    private Pagination(Builder builder) {
        this.hasNext = builder.hasNext;
        this.cursor = builder.cursor;
        this.size = builder.size;
    }

    public boolean isHasNext() {
        return hasNext;
    }

    public void setHasNext(boolean hasNext) {
        this.hasNext = hasNext;
    }

    public String getCursor() {
        return cursor;
    }

    public void setCursor(String cursor) {
        this.cursor = cursor;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public static class Builder {
        private boolean hasNext;
        private String cursor;
        private int size;

        public Builder() {}

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

        public Pagination build() {
            return new Pagination(this);
        }
    }
}
