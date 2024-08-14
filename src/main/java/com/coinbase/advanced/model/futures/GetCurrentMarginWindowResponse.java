package com.coinbase.advanced.model.futures;

import com.fasterxml.jackson.annotation.JsonProperty;

public class GetCurrentMarginWindowResponse {

    @JsonProperty("margin_window")
    private MarginWindow marginWindow;

    @JsonProperty("is_intraday_margin_killswitch_enabled")
    private boolean isIntradayMarginKillswitchEnabled;

    @JsonProperty("is_intraday_margin_enrollment_killswitch_enabled")
    private boolean isIntradayMarginEnrollmentKillswitchEnabled;

    public GetCurrentMarginWindowResponse() {}

    private GetCurrentMarginWindowResponse(Builder builder) {
        this.marginWindow = builder.marginWindow;
        this.isIntradayMarginKillswitchEnabled = builder.isIntradayMarginKillswitchEnabled;
        this.isIntradayMarginEnrollmentKillswitchEnabled = builder.isIntradayMarginEnrollmentKillswitchEnabled;
    }

    public MarginWindow getMarginWindow() {
        return marginWindow;
    }

    public void setMarginWindow(MarginWindow marginWindow) {
        this.marginWindow = marginWindow;
    }

    public boolean isIntradayMarginKillswitchEnabled() {
        return isIntradayMarginKillswitchEnabled;
    }

    public void setIntradayMarginKillswitchEnabled(boolean isIntradayMarginKillswitchEnabled) {
        this.isIntradayMarginKillswitchEnabled = isIntradayMarginKillswitchEnabled;
    }

    public boolean isIntradayMarginEnrollmentKillswitchEnabled() {
        return isIntradayMarginEnrollmentKillswitchEnabled;
    }

    public void setIntradayMarginEnrollmentKillswitchEnabled(boolean isIntradayMarginEnrollmentKillswitchEnabled) {
        this.isIntradayMarginEnrollmentKillswitchEnabled = isIntradayMarginEnrollmentKillswitchEnabled;
    }

    public static class MarginWindow {

        @JsonProperty("margin_window_type")
        private String marginWindowType;

        @JsonProperty("end_time")
        private String endTime;

        public MarginWindow() {}

        private MarginWindow(Builder builder) {
            this.marginWindowType = builder.marginWindowType;
            this.endTime = builder.endTime;
        }

        public String getMarginWindowType() {
            return marginWindowType;
        }

        public void setMarginWindowType(String marginWindowType) {
            this.marginWindowType = marginWindowType;
        }

        public String getEndTime() {
            return endTime;
        }

        public void setEndTime(String endTime) {
            this.endTime = endTime;
        }

        public static class Builder {
            private String marginWindowType;
            private String endTime;

            public Builder marginWindowType(String marginWindowType) {
                this.marginWindowType = marginWindowType;
                return this;
            }

            public Builder endTime(String endTime) {
                this.endTime = endTime;
                return this;
            }

            public MarginWindow build() {
                return new MarginWindow(this);
            }
        }
    }

    public static class Builder {
        private MarginWindow marginWindow;
        private boolean isIntradayMarginKillswitchEnabled;
        private boolean isIntradayMarginEnrollmentKillswitchEnabled;

        public Builder marginWindow(MarginWindow marginWindow) {
            this.marginWindow = marginWindow;
            return this;
        }

        public Builder isIntradayMarginKillswitchEnabled(boolean isIntradayMarginKillswitchEnabled) {
            this.isIntradayMarginKillswitchEnabled = isIntradayMarginKillswitchEnabled;
            return this;
        }

        public Builder isIntradayMarginEnrollmentKillswitchEnabled(boolean isIntradayMarginEnrollmentKillswitchEnabled) {
            this.isIntradayMarginEnrollmentKillswitchEnabled = isIntradayMarginEnrollmentKillswitchEnabled;
            return this;
        }

        public static Builder from(GetCurrentMarginWindowResponse resp) {
            return new Builder()
                    .marginWindow(resp.getMarginWindow())
                    .isIntradayMarginKillswitchEnabled(resp.isIntradayMarginKillswitchEnabled())
                    .isIntradayMarginEnrollmentKillswitchEnabled(resp.isIntradayMarginEnrollmentKillswitchEnabled());
        }

        public GetCurrentMarginWindowResponse build() {
            return new GetCurrentMarginWindowResponse(this);
        }
    }
}
