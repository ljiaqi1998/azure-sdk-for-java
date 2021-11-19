// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.notificationhubs.generated;

import com.azure.core.util.Context;

/** Samples for NotificationHubs ListAuthorizationRules. */
public final class NotificationHubsListAuthorizationRulesSamples {
    /*
     * x-ms-original-file: specification/notificationhubs/resource-manager/Microsoft.NotificationHubs/stable/2017-04-01/examples/NotificationHubs/NotificationHubAuthorizationRuleListAll.json
     */
    /**
     * Sample code: NotificationHubAuthorizationRuleListAll.
     *
     * @param manager Entry point to NotificationHubsManager.
     */
    public static void notificationHubAuthorizationRuleListAll(
        com.azure.resourcemanager.notificationhubs.NotificationHubsManager manager) {
        manager.notificationHubs().listAuthorizationRules("5ktrial", "nh-sdk-ns", "nh-sdk-hub", Context.NONE);
    }
}