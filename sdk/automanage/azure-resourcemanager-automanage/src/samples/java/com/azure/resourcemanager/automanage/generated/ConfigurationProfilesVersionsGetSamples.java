// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.automanage.generated;

import com.azure.core.util.Context;

/** Samples for ConfigurationProfilesVersions Get. */
public final class ConfigurationProfilesVersionsGetSamples {
    /*
     * x-ms-original-file: specification/automanage/resource-manager/Microsoft.Automanage/preview/2021-04-30-preview/examples/getConfigurationProfileVersion.json
     */
    /**
     * Sample code: Get a configuration profile version.
     *
     * @param manager Entry point to AutomanageManager.
     */
    public static void getAConfigurationProfileVersion(com.azure.resourcemanager.automanage.AutomanageManager manager) {
        manager
            .configurationProfilesVersions()
            .getWithResponse("customConfigurationProfile", "version1", "myResourceGroupName", Context.NONE);
    }
}