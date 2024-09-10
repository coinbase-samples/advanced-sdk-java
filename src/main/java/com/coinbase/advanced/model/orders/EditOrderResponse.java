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

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

public class EditOrderResponse {

    @JsonProperty("success")
    private boolean success;

    @JsonProperty("errors")
    private List<EditError> editErrors;

    public EditOrderResponse() {}

    private EditOrderResponse(Builder builder) {
        this.success = builder.success;
        this.editErrors = builder.editErrors;
    }

    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    public List<EditError> getEditErrors() {
        return editErrors;
    }

    public void setEditErrors(List<EditError> editErrors) {
        this.editErrors = editErrors;
    }

    public static class Builder {
        private boolean success;
        private List<EditError> editErrors;

        public Builder success(boolean success) {
            this.success = success;
            return this;
        }

        public Builder editErrors(List<EditError> editErrors) {
            this.editErrors = editErrors;
            return this;
        }

        public EditOrderResponse build() {
            return new EditOrderResponse(this);
        }
    }
}
