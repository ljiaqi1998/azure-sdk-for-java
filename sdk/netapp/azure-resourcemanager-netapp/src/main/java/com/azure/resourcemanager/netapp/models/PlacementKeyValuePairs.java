// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.netapp.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Application specific parameters for the placement of volumes in the volume group. */
@Fluent
public final class PlacementKeyValuePairs {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(PlacementKeyValuePairs.class);

    /*
     * Key for an application specific parameter for the placement of volumes
     * in the volume group
     */
    @JsonProperty(value = "key", required = true)
    private String key;

    /*
     * Value for an application specific parameter for the placement of volumes
     * in the volume group
     */
    @JsonProperty(value = "value", required = true)
    private String value;

    /**
     * Get the key property: Key for an application specific parameter for the placement of volumes in the volume group.
     *
     * @return the key value.
     */
    public String key() {
        return this.key;
    }

    /**
     * Set the key property: Key for an application specific parameter for the placement of volumes in the volume group.
     *
     * @param key the key value to set.
     * @return the PlacementKeyValuePairs object itself.
     */
    public PlacementKeyValuePairs withKey(String key) {
        this.key = key;
        return this;
    }

    /**
     * Get the value property: Value for an application specific parameter for the placement of volumes in the volume
     * group.
     *
     * @return the value value.
     */
    public String value() {
        return this.value;
    }

    /**
     * Set the value property: Value for an application specific parameter for the placement of volumes in the volume
     * group.
     *
     * @param value the value value to set.
     * @return the PlacementKeyValuePairs object itself.
     */
    public PlacementKeyValuePairs withValue(String value) {
        this.value = value;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (key() == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException("Missing required property key in model PlacementKeyValuePairs"));
        }
        if (value() == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException("Missing required property value in model PlacementKeyValuePairs"));
        }
    }
}