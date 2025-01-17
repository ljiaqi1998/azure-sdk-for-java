// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservicesbackup.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.recoveryservicesbackup.models.AzureStorageJobTaskDetails;
import org.junit.jupiter.api.Assertions;

public final class AzureStorageJobTaskDetailsTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        AzureStorageJobTaskDetails model =
            BinaryData
                .fromString("{\"taskId\":\"jlyjtlvofq\",\"status\":\"vfcibyfmowux\"}")
                .toObject(AzureStorageJobTaskDetails.class);
        Assertions.assertEquals("jlyjtlvofq", model.taskId());
        Assertions.assertEquals("vfcibyfmowux", model.status());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        AzureStorageJobTaskDetails model =
            new AzureStorageJobTaskDetails().withTaskId("jlyjtlvofq").withStatus("vfcibyfmowux");
        model = BinaryData.fromObject(model).toObject(AzureStorageJobTaskDetails.class);
        Assertions.assertEquals("jlyjtlvofq", model.taskId());
        Assertions.assertEquals("vfcibyfmowux", model.status());
    }
}
