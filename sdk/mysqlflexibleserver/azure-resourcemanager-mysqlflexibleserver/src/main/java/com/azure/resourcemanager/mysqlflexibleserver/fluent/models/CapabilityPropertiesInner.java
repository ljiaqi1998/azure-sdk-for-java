// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.mysqlflexibleserver.fluent.models;

import com.azure.core.annotation.Immutable;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.mysqlflexibleserver.models.ServerEditionCapability;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** Location capabilities. */
@Immutable
public final class CapabilityPropertiesInner {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(CapabilityPropertiesInner.class);

    /*
     * zone name
     */
    @JsonProperty(value = "zone", access = JsonProperty.Access.WRITE_ONLY)
    private String zone;

    /*
     * Supported high availability mode
     */
    @JsonProperty(value = "supportedHAMode", access = JsonProperty.Access.WRITE_ONLY)
    private List<String> supportedHAMode;

    /*
     * supported geo backup regions
     */
    @JsonProperty(value = "supportedGeoBackupRegions", access = JsonProperty.Access.WRITE_ONLY)
    private List<String> supportedGeoBackupRegions;

    /*
     * A list of supported flexible server editions.
     */
    @JsonProperty(value = "supportedFlexibleServerEditions", access = JsonProperty.Access.WRITE_ONLY)
    private List<ServerEditionCapability> supportedFlexibleServerEditions;

    /**
     * Get the zone property: zone name.
     *
     * @return the zone value.
     */
    public String zone() {
        return this.zone;
    }

    /**
     * Get the supportedHAMode property: Supported high availability mode.
     *
     * @return the supportedHAMode value.
     */
    public List<String> supportedHAMode() {
        return this.supportedHAMode;
    }

    /**
     * Get the supportedGeoBackupRegions property: supported geo backup regions.
     *
     * @return the supportedGeoBackupRegions value.
     */
    public List<String> supportedGeoBackupRegions() {
        return this.supportedGeoBackupRegions;
    }

    /**
     * Get the supportedFlexibleServerEditions property: A list of supported flexible server editions.
     *
     * @return the supportedFlexibleServerEditions value.
     */
    public List<ServerEditionCapability> supportedFlexibleServerEditions() {
        return this.supportedFlexibleServerEditions;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (supportedFlexibleServerEditions() != null) {
            supportedFlexibleServerEditions().forEach(e -> e.validate());
        }
    }
}