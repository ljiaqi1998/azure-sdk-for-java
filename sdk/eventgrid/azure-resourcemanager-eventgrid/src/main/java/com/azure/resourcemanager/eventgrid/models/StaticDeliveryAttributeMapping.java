// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.eventgrid.models;

import com.azure.core.annotation.Fluent;
import com.azure.resourcemanager.eventgrid.fluent.models.StaticDeliveryAttributeMappingProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

/** Static delivery attribute mapping details. */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type")
@JsonTypeName("Static")
@Fluent
public final class StaticDeliveryAttributeMapping extends DeliveryAttributeMapping {
    /*
     * Properties of static delivery attribute mapping.
     */
    @JsonProperty(value = "properties")
    private StaticDeliveryAttributeMappingProperties innerProperties;

    /**
     * Get the innerProperties property: Properties of static delivery attribute mapping.
     *
     * @return the innerProperties value.
     */
    private StaticDeliveryAttributeMappingProperties innerProperties() {
        return this.innerProperties;
    }

    /** {@inheritDoc} */
    @Override
    public StaticDeliveryAttributeMapping withName(String name) {
        super.withName(name);
        return this;
    }

    /**
     * Get the value property: Value of the delivery attribute.
     *
     * @return the value value.
     */
    public String value() {
        return this.innerProperties() == null ? null : this.innerProperties().value();
    }

    /**
     * Set the value property: Value of the delivery attribute.
     *
     * @param value the value value to set.
     * @return the StaticDeliveryAttributeMapping object itself.
     */
    public StaticDeliveryAttributeMapping withValue(String value) {
        if (this.innerProperties() == null) {
            this.innerProperties = new StaticDeliveryAttributeMappingProperties();
        }
        this.innerProperties().withValue(value);
        return this;
    }

    /**
     * Get the isSecret property: Boolean flag to tell if the attribute contains sensitive information .
     *
     * @return the isSecret value.
     */
    public Boolean isSecret() {
        return this.innerProperties() == null ? null : this.innerProperties().isSecret();
    }

    /**
     * Set the isSecret property: Boolean flag to tell if the attribute contains sensitive information .
     *
     * @param isSecret the isSecret value to set.
     * @return the StaticDeliveryAttributeMapping object itself.
     */
    public StaticDeliveryAttributeMapping withIsSecret(Boolean isSecret) {
        if (this.innerProperties() == null) {
            this.innerProperties = new StaticDeliveryAttributeMappingProperties();
        }
        this.innerProperties().withIsSecret(isSecret);
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    @Override
    public void validate() {
        super.validate();
        if (innerProperties() != null) {
            innerProperties().validate();
        }
    }
}
