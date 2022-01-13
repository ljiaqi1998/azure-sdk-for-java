// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appservice.generated;

import com.azure.core.util.Context;

/** Samples for Diagnostics ListSiteDetectors. */
public final class DiagnosticsListSiteDetectorsSamples {
    /*
     * x-ms-original-file: specification/web/resource-manager/Microsoft.Web/stable/2021-03-01/examples/Diagnostics_ListSiteDetectors.json
     */
    /**
     * Sample code: List App Detectors.
     *
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void listAppDetectors(com.azure.resourcemanager.AzureResourceManager azure) {
        azure
            .webApps()
            .manager()
            .serviceClient()
            .getDiagnostics()
            .listSiteDetectors("Sample-WestUSResourceGroup", "SampleApp", "availability", Context.NONE);
    }

    /*
     * x-ms-original-file: specification/web/resource-manager/Microsoft.Web/stable/2021-03-01/examples/Diagnostics_ListSiteDetectorsSlot.json
     */
    /**
     * Sample code: List App Slot Detectors.
     *
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void listAppSlotDetectors(com.azure.resourcemanager.AzureResourceManager azure) {
        azure
            .webApps()
            .manager()
            .serviceClient()
            .getDiagnostics()
            .listSiteDetectors("Sample-WestUSResourceGroup", "SampleApp", "availability", Context.NONE);
    }
}