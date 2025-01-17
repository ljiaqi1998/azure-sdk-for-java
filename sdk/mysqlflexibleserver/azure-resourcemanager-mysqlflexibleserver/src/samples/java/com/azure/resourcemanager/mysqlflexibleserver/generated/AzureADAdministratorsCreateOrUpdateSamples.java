// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.mysqlflexibleserver.generated;

import com.azure.resourcemanager.mysqlflexibleserver.models.AdministratorName;
import com.azure.resourcemanager.mysqlflexibleserver.models.AdministratorType;

/** Samples for AzureADAdministrators CreateOrUpdate. */
public final class AzureADAdministratorsCreateOrUpdateSamples {
    /*
     * x-ms-original-file: specification/mysql/resource-manager/Microsoft.DBforMySQL/preview/2021-12-01-preview/examples/AzureADAdministratorCreate.json
     */
    /**
     * Sample code: Create an azure ad administrator.
     *
     * @param manager Entry point to MySqlManager.
     */
    public static void createAnAzureAdAdministrator(
        com.azure.resourcemanager.mysqlflexibleserver.MySqlManager manager) {
        manager
            .azureADAdministrators()
            .define(AdministratorName.ACTIVE_DIRECTORY)
            .withExistingFlexibleServer("testrg", "mysqltestsvc4")
            .withAdministratorType(AdministratorType.ACTIVE_DIRECTORY)
            .withLogin("bob@contoso.com")
            .withSid("c6b82b90-a647-49cb-8a62-0d2d3cb7ac7c")
            .withTenantId("c12b7025-bfe2-46c1-b463-993b5e4cd467")
            .withIdentityResourceId(
                "/subscriptions/ffffffff-ffff-ffff-ffff-ffffffffffff/resourceGroups/test-group/providers/Microsoft.ManagedIdentity/userAssignedIdentities/test-umi")
            .create();
    }
}
