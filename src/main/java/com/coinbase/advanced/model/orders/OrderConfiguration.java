/*
 * Copyright 2024-present Coinbase Global, Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *  http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.coinbase.advanced.model.orders;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

public class OrderConfiguration {

    @JsonProperty("market_market_ioc")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private MarketIoc marketMarketIoc;

    @JsonProperty("sor_limit_ioc")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private SorLimitIoc sorLimitIoc;

    @JsonProperty("limit_limit_gtc")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private LimitGtc limitLimitGtc;

    @JsonProperty("limit_limit_gtd")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private LimitGtd limitLimitGtd;

    @JsonProperty("limit_limit_fok")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private LimitFok limitLimitFok;

    @JsonProperty("stop_limit_stop_limit_gtc")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private StopLimitGtc stopLimitStopLimitGtc;

    @JsonProperty("stop_limit_stop_limit_gtd")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private StopLimitGtd stopLimitStopLimitGtd;

    @JsonProperty("trigger_bracket_gtc")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private TriggerGtc triggerBracketGtc;

    @JsonProperty("trigger_bracket_gtd")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private TriggerGtd triggerBracketGtd;

    // Getters and Setters
    public MarketIoc getMarketMarketIoc() {
        return marketMarketIoc;
    }

    public void setMarketMarketIoc(MarketIoc marketMarketIoc) {
        this.marketMarketIoc = marketMarketIoc;
    }

    public SorLimitIoc getSorLimitIoc() {
        return sorLimitIoc;
    }

    public void setSorLimitIoc(SorLimitIoc sorLimitIoc) {
        this.sorLimitIoc = sorLimitIoc;
    }

    public LimitGtc getLimitLimitGtc() {
        return limitLimitGtc;
    }

    public void setLimitLimitGtc(LimitGtc limitLimitGtc) {
        this.limitLimitGtc = limitLimitGtc;
    }

    public LimitGtd getLimitLimitGtd() {
        return limitLimitGtd;
    }

    public void setLimitLimitGtd(LimitGtd limitLimitGtd) {
        this.limitLimitGtd = limitLimitGtd;
    }

    public LimitFok getLimitLimitFok() {
        return limitLimitFok;
    }

    public void setLimitLimitFok(LimitFok limitLimitFok) {
        this.limitLimitFok = limitLimitFok;
    }

    public StopLimitGtc getStopLimitStopLimitGtc() {
        return stopLimitStopLimitGtc;
    }

    public void setStopLimitStopLimitGtc(StopLimitGtc stopLimitStopLimitGtc) {
        this.stopLimitStopLimitGtc = stopLimitStopLimitGtc;
    }

    public StopLimitGtd getStopLimitStopLimitGtd() {
        return stopLimitStopLimitGtd;
    }

    public void setStopLimitStopLimitGtd(StopLimitGtd stopLimitStopLimitGtd) {
        this.stopLimitStopLimitGtd = stopLimitStopLimitGtd;
    }

    public TriggerGtc getTriggerBracketGtc() {
        return triggerBracketGtc;
    }

    public void setTriggerBracketGtc(TriggerGtc triggerBracketGtc) {
        this.triggerBracketGtc = triggerBracketGtc;
    }

    public TriggerGtd getTriggerBracketGtd() {
        return triggerBracketGtd;
    }

    public void setTriggerBracketGtd(TriggerGtd triggerBracketGtd) {
        this.triggerBracketGtd = triggerBracketGtd;
    }

    // Builder Class
    public static class Builder {
        private MarketIoc marketMarketIoc;
        private SorLimitIoc sorLimitIoc;
        private LimitGtc limitLimitGtc;
        private LimitGtd limitLimitGtd;
        private LimitFok limitLimitFok;
        private StopLimitGtc stopLimitStopLimitGtc;
        private StopLimitGtd stopLimitStopLimitGtd;
        private TriggerGtc triggerBracketGtc;
        private TriggerGtd triggerBracketGtd;

        public Builder marketMarketIoc(MarketIoc marketMarketIoc) {
            this.marketMarketIoc = marketMarketIoc;
            return this;
        }

        public Builder sorLimitIoc(SorLimitIoc sorLimitIoc) {
            this.sorLimitIoc = sorLimitIoc;
            return this;
        }

        public Builder limitLimitGtc(LimitGtc limitLimitGtc) {
            this.limitLimitGtc = limitLimitGtc;
            return this;
        }

        public Builder limitLimitGtd(LimitGtd limitLimitGtd) {
            this.limitLimitGtd = limitLimitGtd;
            return this;
        }

        public Builder limitLimitFok(LimitFok limitLimitFok) {
            this.limitLimitFok = limitLimitFok;
            return this;
        }

        public Builder stopLimitStopLimitGtc(StopLimitGtc stopLimitStopLimitGtc) {
            this.stopLimitStopLimitGtc = stopLimitStopLimitGtc;
            return this;
        }

        public Builder stopLimitStopLimitGtd(StopLimitGtd stopLimitStopLimitGtd) {
            this.stopLimitStopLimitGtd = stopLimitStopLimitGtd;
            return this;
        }

        public Builder triggerBracketGtc(TriggerGtc triggerBracketGtc) {
            this.triggerBracketGtc = triggerBracketGtc;
            return this;
        }

        public Builder triggerBracketGtd(TriggerGtd triggerBracketGtd) {
            this.triggerBracketGtd = triggerBracketGtd;
            return this;
        }

        public OrderConfiguration build() {
            OrderConfiguration config = new OrderConfiguration();
            config.marketMarketIoc = this.marketMarketIoc;
            config.sorLimitIoc = this.sorLimitIoc;
            config.limitLimitGtc = this.limitLimitGtc;
            config.limitLimitGtd = this.limitLimitGtd;
            config.limitLimitFok = this.limitLimitFok;
            config.stopLimitStopLimitGtc = this.stopLimitStopLimitGtc;
            config.stopLimitStopLimitGtd = this.stopLimitStopLimitGtd;
            config.triggerBracketGtc = this.triggerBracketGtc;
            config.triggerBracketGtd = this.triggerBracketGtd;
            return config;
        }
    }
}
