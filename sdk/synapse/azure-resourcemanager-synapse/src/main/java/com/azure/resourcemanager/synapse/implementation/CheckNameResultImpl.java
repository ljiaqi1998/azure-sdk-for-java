// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.synapse.implementation;

import com.azure.resourcemanager.synapse.fluent.models.CheckNameResultInner;
import com.azure.resourcemanager.synapse.models.CheckNameResult;
import com.azure.resourcemanager.synapse.models.Reason;

public final class CheckNameResultImpl implements CheckNameResult {
    private CheckNameResultInner innerObject;

    private final com.azure.resourcemanager.synapse.SynapseManager serviceManager;

    CheckNameResultImpl(
        CheckNameResultInner innerObject, com.azure.resourcemanager.synapse.SynapseManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
    }

    public Boolean nameAvailable() {
        return this.innerModel().nameAvailable();
    }

    public String name() {
        return this.innerModel().name();
    }

    public String message() {
        return this.innerModel().message();
    }

    public Reason reason() {
        return this.innerModel().reason();
    }

    public CheckNameResultInner innerModel() {
        return this.innerObject;
    }

    private com.azure.resourcemanager.synapse.SynapseManager manager() {
        return this.serviceManager;
    }
}