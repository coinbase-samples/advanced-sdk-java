package com.coinbase.advanced.model.convert;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Disclosure {

    @JsonProperty("title")
    private String title;

    @JsonProperty("description")
    private String description;

    @JsonProperty("link")
    private Link link;

    public Disclosure() {}

    private Disclosure(Builder builder) {
        this.title = builder.title;
        this.description = builder.description;
        this.link = builder.link;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Link getLink() {
        return link;
    }

    public void setLink(Link link) {
        this.link = link;
    }

    // Builder class
    public static class Builder {
        private String title;
        private String description;
        private Link link;

        public Builder() {}

        public Builder title(String title) {
            this.title = title;
            return this;
        }

        public Builder description(String description) {
            this.description = description;
            return this;
        }

        public Builder link(Link link) {
            this.link = link;
            return this;
        }

        public Disclosure build() {
            return new Disclosure(this);
        }
    }
}
