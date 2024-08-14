package com.coinbase.advanced.model.convert;

import com.coinbase.advanced.model.common.Amount;
import com.fasterxml.jackson.annotation.JsonProperty;

public class UnitPriceInfo {

    @JsonProperty("target_to_fiat")
    private Amount targetToFiat;

    @JsonProperty("target_to_source")
    private Amount targetToSource;

    @JsonProperty("source_to_fiat")
    private Amount sourceToFiat;

    public UnitPriceInfo() {}

    private UnitPriceInfo(Builder builder) {
        this.targetToFiat = builder.targetToFiat;
        this.targetToSource = builder.targetToSource;
        this.sourceToFiat = builder.sourceToFiat;
    }

    public Amount getTargetToFiat() {
        return targetToFiat;
    }

    public void setTargetToFiat(Amount targetToFiat) {
        this.targetToFiat = targetToFiat;
    }

    public Amount getTargetToSource() {
        return targetToSource;
    }

    public void setTargetToSource(Amount targetToSource) {
        this.targetToSource = targetToSource;
    }

    public Amount getSourceToFiat() {
        return sourceToFiat;
    }

    public void setSourceToFiat(Amount sourceToFiat) {
        this.sourceToFiat = sourceToFiat;
    }

    // Builder class
    public static class Builder {
        private Amount targetToFiat;
        private Amount targetToSource;
        private Amount sourceToFiat;

        public Builder() {}

        public Builder targetToFiat(Amount targetToFiat) {
            this.targetToFiat = targetToFiat;
            return this;
        }

        public Builder targetToSource(Amount targetToSource) {
            this.targetToSource = targetToSource;
            return this;
        }

        public Builder sourceToFiat(Amount sourceToFiat) {
            this.sourceToFiat = sourceToFiat;
            return this;
        }

        public UnitPriceInfo build() {
            return new UnitPriceInfo(this);
        }
    }
}