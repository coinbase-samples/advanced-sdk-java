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

public class EditError {

    @JsonProperty("edit_failure_reason")
    private String editFailureReason;

    @JsonProperty("preview_failure_reason")
    private String previewFailureReason;

    public String getEditFailureReason() {
        return editFailureReason;
    }

    public void setEditFailureReason(String editFailureReason) {
        this.editFailureReason = editFailureReason;
    }

    public String getPreviewFailureReason() {
        return previewFailureReason;
    }

    public void setPreviewFailureReason(String previewFailureReason) {
        this.previewFailureReason = previewFailureReason;
    }
}
