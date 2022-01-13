// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appservice.generated;

import com.azure.core.util.Context;

/** Samples for StaticSites ListStaticSiteAppSettings. */
public final class StaticSitesListStaticSiteAppSettingsSamples {
    /*
     * x-ms-original-file: specification/web/resource-manager/Microsoft.Web/stable/2021-03-01/examples/ListStaticSiteAppSettings.json
     */
    /**
     * Sample code: Get app settings of a static site.
     *
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void getAppSettingsOfAStaticSite(com.azure.resourcemanager.AzureResourceManager azure) {
        azure
            .webApps()
            .manager()
            .serviceClient()
            .getStaticSites()
            .listStaticSiteAppSettingsWithResponse("rg", "testStaticSite0", Context.NONE);
    }
}