package com.coinbase.advanced.model.market;

import com.fasterxml.jackson.annotation.JsonProperty;

public class GetServerTimeResponse {

    @JsonProperty("iso")
    private String iso;

    @JsonProperty("epochSeconds")
    private String epochSeconds;

    @JsonProperty("epochMillis")
    private String epochMillis;

    public GetServerTimeResponse() {}

    private GetServerTimeResponse(Builder builder) {
        this.iso = builder.iso;
        this.epochSeconds = builder.epochSeconds;
        this.epochMillis = builder.epochMillis;
    }

    public String getIso() {
        return iso;
    }

    public void setIso(String iso) {
        this.iso = iso;
    }

    public String getEpochSeconds() {
        return epochSeconds;
    }

    public void setEpochSeconds(String epochSeconds) {
        this.epochSeconds = epochSeconds;
    }

    public String getEpochMillis() {
        return epochMillis;
    }

    public void setEpochMillis(String epochMillis) {
        this.epochMillis = epochMillis;
    }

    public static class Builder {
        private String iso;
        private String epochSeconds;
        private String epochMillis;

        public Builder() {}

        public Builder iso(String iso) {
            this.iso = iso;
            return this;
        }

        public Builder epochSeconds(String epochSeconds) {
            this.epochSeconds = epochSeconds;
            return this;
        }

        public Builder epochMillis(String epochMillis) {
            this.epochMillis = epochMillis;
            return this;
        }

        public static Builder from(GetServerTimeResponse resp) {
            return new Builder()
                    .iso(resp.getIso())
                    .epochSeconds(resp.getEpochSeconds())
                    .epochMillis(resp.getEpochMillis());
        }

        public GetServerTimeResponse build() {
            return new GetServerTimeResponse(this);
        }
    }
}
