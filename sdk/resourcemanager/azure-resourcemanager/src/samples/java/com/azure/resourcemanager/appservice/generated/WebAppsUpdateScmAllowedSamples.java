// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appservice.generated;

import com.azure.core.util.Context;
import com.azure.resourcemanager.appservice.fluent.models.CsmPublishingCredentialsPoliciesEntityInner;

/** Samples for WebApps UpdateScmAllowed. */
public final class WebAppsUpdateScmAllowedSamples {
    /*
     * x-ms-original-file: specification/web/resource-manager/Microsoft.Web/stable/2021-03-01/examples/UpdatePublishingCredentialsPolicy.json
     */
    /**
     * Sample code: Update SCM Allowed.
     *
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void updateSCMAllowed(com.azure.resourcemanager.AzureResourceManager azure) {
        azure
            .webApps()
            .manager()
            .serviceClient()
            .getWebApps()
            .updateScmAllowedWithResponse(
                "rg", "testSite", new CsmPublishingCredentialsPoliciesEntityInner().withAllow(true), Context.NONE);
    }
}