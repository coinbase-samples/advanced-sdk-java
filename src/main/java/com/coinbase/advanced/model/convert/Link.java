package com.coinbase.advanced.model.convert;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Link {

    @JsonProperty("text")
    private String text;

    @JsonProperty("url")
    private String url;

    public Link() {}

    private Link(Builder builder) {
        this.text = builder.text;
        this.url = builder.url;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public static class Builder {
        private String text;
        private String url;

        public Builder() {}

        public Builder text(String text) {
            this.text = text;
            return this;
        }

        public Builder url(String url) {
            this.url = url;
            return this;
        }

        public Link build() {
            return new Link(this);
        }
    }
}
