package com.coinbase.advanced.model.convert;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ErrorInfo {

    @JsonProperty("message")
    private String message;

    @JsonProperty("code")
    private String code;

    @JsonProperty("error_code")
    private String errorCode;

    @JsonProperty("error_cta")
    private String errorCta;

    public ErrorInfo() {}

    private ErrorInfo(Builder builder) {
        this.message = builder.message;
        this.code = builder.code;
        this.errorCode = builder.errorCode;
        this.errorCta = builder.errorCta;
    }

    // Getters and Setters

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getErrorCode() {
        return errorCode;
    }

    public void setErrorCode(String errorCode) {
        this.errorCode = errorCode;
    }

    public String getErrorCta() {
        return errorCta;
    }

    public void setErrorCta(String errorCta) {
        this.errorCta = errorCta;
    }

    // Builder class
    public static class Builder {
        private String message;
        private String code;
        private String errorCode;
        private String errorCta;

        public Builder() {}

        public Builder message(String message) {
            this.message = message;
            return this;
        }

        public Builder code(String code) {
            this.code = code;
            return this;
        }

        public Builder errorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }

        public Builder errorCta(String errorCta) {
            this.errorCta = errorCta;
            return this;
        }

        public ErrorInfo build() {
            return new ErrorInfo(this);
        }
    }
}