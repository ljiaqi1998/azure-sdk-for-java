// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.logz.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** VM Resource Ids. */
@Fluent
public final class VMResourcesInner {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(VMResourcesInner.class);

    /*
     * Request of a list vm host update operation.
     */
    @JsonProperty(value = "id")
    private String id;

    /*
     * Version of the Logz agent installed on the VM.
     */
    @JsonProperty(value = "agentVersion")
    private String agentVersion;

    /**
     * Get the id property: Request of a list vm host update operation.
     *
     * @return the id value.
     */
    public String id() {
        return this.id;
    }

    /**
     * Set the id property: Request of a list vm host update operation.
     *
     * @param id the id value to set.
     * @return the VMResourcesInner object itself.
     */
    public VMResourcesInner withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * Get the agentVersion property: Version of the Logz agent installed on the VM.
     *
     * @return the agentVersion value.
     */
    public String agentVersion() {
        return this.agentVersion;
    }

    /**
     * Set the agentVersion property: Version of the Logz agent installed on the VM.
     *
     * @param agentVersion the agentVersion value to set.
     * @return the VMResourcesInner object itself.
     */
    public VMResourcesInner withAgentVersion(String agentVersion) {
        this.agentVersion = agentVersion;
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