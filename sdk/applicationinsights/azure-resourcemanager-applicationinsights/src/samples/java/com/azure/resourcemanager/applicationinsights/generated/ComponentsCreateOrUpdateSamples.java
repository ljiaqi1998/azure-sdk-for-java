// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.applicationinsights.generated;

import com.azure.resourcemanager.applicationinsights.models.ApplicationType;
import com.azure.resourcemanager.applicationinsights.models.FlowType;
import com.azure.resourcemanager.applicationinsights.models.RequestSource;
import java.util.HashMap;
import java.util.Map;

/** Samples for Components CreateOrUpdate. */
public final class ComponentsCreateOrUpdateSamples {
    /*
     * x-ms-original-file: specification/applicationinsights/resource-manager/Microsoft.Insights/preview/2018-05-01-preview/examples/ComponentsCreate.json
     */
    /**
     * Sample code: ComponentCreate.
     *
     * @param manager Entry point to ApplicationInsightsManager.
     */
    public static void componentCreate(
        com.azure.resourcemanager.applicationinsights.ApplicationInsightsManager manager) {
        manager
            .components()
            .define("my-component")
            .withRegion("South Central US")
            .withExistingResourceGroup("my-resource-group")
            .withKind("web")
            .withApplicationType(ApplicationType.WEB)
            .withFlowType(FlowType.BLUEFIELD)
            .withRequestSource(RequestSource.REST)
            .create();
    }

    /*
     * x-ms-original-file: specification/applicationinsights/resource-manager/Microsoft.Insights/preview/2018-05-01-preview/examples/ComponentsUpdate.json
     */
    /**
     * Sample code: ComponentUpdate.
     *
     * @param manager Entry point to ApplicationInsightsManager.
     */
    public static void componentUpdate(
        com.azure.resourcemanager.applicationinsights.ApplicationInsightsManager manager) {
        manager
            .components()
            .define("my-component")
            .withRegion("South Central US")
            .withExistingResourceGroup("my-resource-group")
            .withKind("web")
            .withTags(mapOf("ApplicationGatewayType", "Internal-Only", "BillingEntity", "Self"))
            .create();
    }

    @SuppressWarnings("unchecked")
    private static <T> Map<String, T> mapOf(Object... inputs) {
        Map<String, T> map = new HashMap<>();
        for (int i = 0; i < inputs.length; i += 2) {
            String key = (String) inputs[i];
            T value = (T) inputs[i + 1];
            map.put(key, value);
        }
        return map;
    }
}