// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.edgeorder.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Defines values for OrderItemType. */
public final class OrderItemType extends ExpandableStringEnum<OrderItemType> {
    /** Static value Purchase for OrderItemType. */
    public static final OrderItemType PURCHASE = fromString("Purchase");

    /** Static value Rental for OrderItemType. */
    public static final OrderItemType RENTAL = fromString("Rental");

    /**
     * Creates or finds a OrderItemType from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding OrderItemType.
     */
    @JsonCreator
    public static OrderItemType fromString(String name) {
        return fromString(name, OrderItemType.class);
    }

    /** @return known OrderItemType values. */
    public static Collection<OrderItemType> values() {
        return values(OrderItemType.class);
    }
}