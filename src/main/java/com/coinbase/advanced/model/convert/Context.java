package com.coinbase.advanced.model.convert;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

public class Context {

    @JsonProperty("details")
    private List<String> details;

    @JsonProperty("title")
    private String title;

    @JsonProperty("link_text")
    private String linkText;

    public Context() {}

    private Context(Builder builder) {
        this.details = builder.details;
        this.title = builder.title;
        this.linkText = builder.linkText;
    }

    public List<String> getDetails() {
        return details;
    }

    public void setDetails(List<String> details) {
        this.details = details;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getLinkText() {
        return linkText;
    }

    public void setLinkText(String linkText) {
        this.linkText = linkText;
    }

    public static class Builder {
        private List<String> details;
        private String title;
        private String linkText;

        public Builder() {}

        public Builder details(List<String> details) {
            this.details = details;
            return this;
        }

        public Builder title(String title) {
            this.title = title;
            return this;
        }

        public Builder linkText(String linkText) {
            this.linkText = linkText;
            return this;
        }

        public Context build() {
            return new Context(this);
        }
    }
}
