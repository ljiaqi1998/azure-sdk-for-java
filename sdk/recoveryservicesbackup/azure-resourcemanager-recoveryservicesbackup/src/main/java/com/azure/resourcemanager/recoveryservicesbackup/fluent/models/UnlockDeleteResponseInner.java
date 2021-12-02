// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservicesbackup.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Response of Unlock Delete API. */
@Fluent
public final class UnlockDeleteResponseInner {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(UnlockDeleteResponseInner.class);

    /*
     * This is the time when unlock delete privileges will get expired.
     */
    @JsonProperty(value = "unlockDeleteExpiryTime")
    private String unlockDeleteExpiryTime;

    /**
     * Get the unlockDeleteExpiryTime property: This is the time when unlock delete privileges will get expired.
     *
     * @return the unlockDeleteExpiryTime value.
     */
    public String unlockDeleteExpiryTime() {
        return this.unlockDeleteExpiryTime;
    }

    /**
     * Set the unlockDeleteExpiryTime property: This is the time when unlock delete privileges will get expired.
     *
     * @param unlockDeleteExpiryTime the unlockDeleteExpiryTime value to set.
     * @return the UnlockDeleteResponseInner object itself.
     */
    public UnlockDeleteResponseInner withUnlockDeleteExpiryTime(String unlockDeleteExpiryTime) {
        this.unlockDeleteExpiryTime = unlockDeleteExpiryTime;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}