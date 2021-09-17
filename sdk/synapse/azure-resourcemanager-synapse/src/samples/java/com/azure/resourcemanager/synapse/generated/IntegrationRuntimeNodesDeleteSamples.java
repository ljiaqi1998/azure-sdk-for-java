// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.synapse.generated;

import com.azure.core.util.Context;

/** Samples for IntegrationRuntimeNodes Delete. */
public final class IntegrationRuntimeNodesDeleteSamples {
    /*
     * x-ms-original-file: specification/synapse/resource-manager/Microsoft.Synapse/preview/2021-06-01-preview/examples/IntegrationRuntimeNodes_Delete.json
     */
    /**
     * Sample code: Delete integration runtime node.
     *
     * @param manager Entry point to SynapseManager.
     */
    public static void deleteIntegrationRuntimeNode(com.azure.resourcemanager.synapse.SynapseManager manager) {
        manager
            .integrationRuntimeNodes()
            .deleteWithResponse(
                "exampleResourceGroup", "exampleWorkspace", "exampleIntegrationRuntime", "Node_1", Context.NONE);
    }
}