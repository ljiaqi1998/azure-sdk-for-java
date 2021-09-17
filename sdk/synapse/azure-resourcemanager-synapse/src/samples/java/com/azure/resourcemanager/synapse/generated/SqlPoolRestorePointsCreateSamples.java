// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.synapse.generated;

import com.azure.core.util.Context;
import com.azure.resourcemanager.synapse.models.CreateSqlPoolRestorePointDefinition;

/** Samples for SqlPoolRestorePoints Create. */
public final class SqlPoolRestorePointsCreateSamples {
    /*
     * x-ms-original-file: specification/synapse/resource-manager/Microsoft.Synapse/stable/2021-06-01/examples/CreateSqlPoolRestorePoints.json
     */
    /**
     * Sample code: Creates Sql pool restore point.
     *
     * @param manager Entry point to SynapseManager.
     */
    public static void createsSqlPoolRestorePoint(com.azure.resourcemanager.synapse.SynapseManager manager) {
        manager
            .sqlPoolRestorePoints()
            .create(
                "Default-SQL-SouthEastAsia",
                "testserver",
                "testDatabase",
                new CreateSqlPoolRestorePointDefinition().withRestorePointLabel("mylabel"),
                Context.NONE);
    }
}