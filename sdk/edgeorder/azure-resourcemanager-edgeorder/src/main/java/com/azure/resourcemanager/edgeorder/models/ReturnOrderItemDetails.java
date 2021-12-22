// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.edgeorder.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.edgeorder.fluent.models.AddressProperties;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Return order item request body. */
@Fluent
public final class ReturnOrderItemDetails {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(ReturnOrderItemDetails.class);

    /*
     * customer return address.
     */
    @JsonProperty(value = "returnAddress")
    private AddressProperties returnAddress;

    /*
     * Return Reason.
     */
    @JsonProperty(value = "returnReason", required = true)
    private String returnReason;

    /*
     * Service tag (located on the bottom-right corner of the device)
     */
    @JsonProperty(value = "serviceTag")
    private String serviceTag;

    /*
     * Shipping Box required
     */
    @JsonProperty(value = "shippingBoxRequired")
    private Boolean shippingBoxRequired;

    /**
     * Get the returnAddress property: customer return address.
     *
     * @return the returnAddress value.
     */
    public AddressProperties returnAddress() {
        return this.returnAddress;
    }

    /**
     * Set the returnAddress property: customer return address.
     *
     * @param returnAddress the returnAddress value to set.
     * @return the ReturnOrderItemDetails object itself.
     */
    public ReturnOrderItemDetails withReturnAddress(AddressProperties returnAddress) {
        this.returnAddress = returnAddress;
        return this;
    }

    /**
     * Get the returnReason property: Return Reason.
     *
     * @return the returnReason value.
     */
    public String returnReason() {
        return this.returnReason;
    }

    /**
     * Set the returnReason property: Return Reason.
     *
     * @param returnReason the returnReason value to set.
     * @return the ReturnOrderItemDetails object itself.
     */
    public ReturnOrderItemDetails withReturnReason(String returnReason) {
        this.returnReason = returnReason;
        return this;
    }

    /**
     * Get the serviceTag property: Service tag (located on the bottom-right corner of the device).
     *
     * @return the serviceTag value.
     */
    public String serviceTag() {
        return this.serviceTag;
    }

    /**
     * Set the serviceTag property: Service tag (located on the bottom-right corner of the device).
     *
     * @param serviceTag the serviceTag value to set.
     * @return the ReturnOrderItemDetails object itself.
     */
    public ReturnOrderItemDetails withServiceTag(String serviceTag) {
        this.serviceTag = serviceTag;
        return this;
    }

    /**
     * Get the shippingBoxRequired property: Shipping Box required.
     *
     * @return the shippingBoxRequired value.
     */
    public Boolean shippingBoxRequired() {
        return this.shippingBoxRequired;
    }

    /**
     * Set the shippingBoxRequired property: Shipping Box required.
     *
     * @param shippingBoxRequired the shippingBoxRequired value to set.
     * @return the ReturnOrderItemDetails object itself.
     */
    public ReturnOrderItemDetails withShippingBoxRequired(Boolean shippingBoxRequired) {
        this.shippingBoxRequired = shippingBoxRequired;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (returnAddress() != null) {
            returnAddress().validate();
        }
        if (returnReason() == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property returnReason in model ReturnOrderItemDetails"));
        }
    }
}