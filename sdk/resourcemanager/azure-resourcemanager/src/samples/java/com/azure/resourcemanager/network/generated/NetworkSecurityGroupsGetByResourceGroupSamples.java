// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated;

import com.azure.core.util.Context;

/** Samples for NetworkSecurityGroups GetByResourceGroup. */
public final class NetworkSecurityGroupsGetByResourceGroupSamples {
    /*
     * x-ms-original-file: specification/network/resource-manager/Microsoft.Network/stable/2021-05-01/examples/NetworkSecurityGroupGet.json
     */
    /**
     * Sample code: Get network security group.
     *
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void getNetworkSecurityGroup(com.azure.resourcemanager.AzureResourceManager azure) {
        azure
            .networks()
            .manager()
            .serviceClient()
            .getNetworkSecurityGroups()
            .getByResourceGroupWithResponse("rg1", "testnsg", null, Context.NONE);
    }
}