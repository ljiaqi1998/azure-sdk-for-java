// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appservice.generated;

import com.azure.core.util.Context;

/** Samples for DeletedWebApps GetDeletedWebAppByLocation. */
public final class DeletedWebAppsGetDeletedWebAppByLocationSamples {
    /*
     * x-ms-original-file: specification/web/resource-manager/Microsoft.Web/stable/2021-03-01/examples/GetDeletedWebAppByLocation.json
     */
    /**
     * Sample code: Get Deleted Web App by Location.
     *
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void getDeletedWebAppByLocation(com.azure.resourcemanager.AzureResourceManager azure) {
        azure
            .webApps()
            .manager()
            .serviceClient()
            .getDeletedWebApps()
            .getDeletedWebAppByLocationWithResponse("West US 2", "9", Context.NONE);
    }
}