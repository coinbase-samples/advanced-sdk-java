package com.coinbase.advanced.model.convert;

import com.fasterxml.jackson.annotation.JsonProperty;

public class UserWarning {

    @JsonProperty("id")
    private String id;

    @JsonProperty("link")
    private Link link;

    @JsonProperty("context")
    private Context context;

    @JsonProperty("code")
    private String code;

    @JsonProperty("message")
    private String message;

    public UserWarning() {}

    private UserWarning(Builder builder) {
        this.id = builder.id;
        this.link = builder.link;
        this.context = builder.context;
        this.code = builder.code;
        this.message = builder.message;
    }

    // Getters and Setters

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Link getLink() {
        return link;
    }

    public void setLink(Link link) {
        this.link = link;
    }

    public Context getContext() {
        return context;
    }

    public void setContext(Context context) {
        this.context = context;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    // Builder class
    public static class Builder {
        private String id;
        private Link link;
        private Context context;
        private String code;
        private String message;

        public Builder() {}

        public Builder id(String id) {
            this.id = id;
            return this;
        }

        public Builder link(Link link) {
            this.link = link;
            return this;
        }

        public Builder context(Context context) {
            this.context = context;
            return this;
        }

        public Builder code(String code) {
            this.code = code;
            return this;
        }

        public Builder message(String message) {
            this.message = message;
            return this;
        }

        public UserWarning build() {
            return new UserWarning(this);
        }
    }
}