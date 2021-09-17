// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.quota.models;

import com.azure.resourcemanager.quota.fluent.models.QuotaRequestDetailsInner;
import java.time.OffsetDateTime;
import java.util.List;

/** An immutable client-side representation of QuotaRequestDetails. */
public interface QuotaRequestDetails {
    /**
     * Gets the id property: Quota request ID.
     *
     * @return the id value.
     */
    String id();

    /**
     * Gets the name property: Quota request name.
     *
     * @return the name value.
     */
    String name();

    /**
     * Gets the type property: Resource type. "Microsoft.Quota/quotas".
     *
     * @return the type value.
     */
    String type();

    /**
     * Gets the provisioningState property: The quota request status.
     *
     * @return the provisioningState value.
     */
    QuotaRequestState provisioningState();

    /**
     * Gets the message property: User-friendly status message.
     *
     * @return the message value.
     */
    String message();

    /**
     * Gets the error property: Error details of the quota request.
     *
     * @return the error value.
     */
    ServiceErrorDetail error();

    /**
     * Gets the requestSubmitTime property: The quota request submission time. The date conforms to the following format
     * specified by the ISO 8601 standard: yyyy-MM-ddTHH:mm:ssZ.
     *
     * @return the requestSubmitTime value.
     */
    OffsetDateTime requestSubmitTime();

    /**
     * Gets the value property: Quota request details.
     *
     * @return the value value.
     */
    List<SubRequest> value();

    /**
     * Gets the inner com.azure.resourcemanager.quota.fluent.models.QuotaRequestDetailsInner object.
     *
     * @return the inner object.
     */
    QuotaRequestDetailsInner innerModel();
}