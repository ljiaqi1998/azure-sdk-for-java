// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.analytics.purview.sharing.generated;

import com.azure.analytics.purview.sharing.ReceivedSharesClient;
import com.azure.analytics.purview.sharing.ReceivedSharesClientBuilder;
import com.azure.analytics.purview.sharing.SentSharesClient;
import com.azure.analytics.purview.sharing.SentSharesClientBuilder;
import com.azure.core.credential.AccessToken;
import com.azure.core.http.HttpClient;
import com.azure.core.http.policy.HttpLogDetailLevel;
import com.azure.core.http.policy.HttpLogOptions;
import com.azure.core.test.TestBase;
import com.azure.core.test.TestMode;
import com.azure.core.util.Configuration;
import com.azure.identity.DefaultAzureCredentialBuilder;
import java.time.OffsetDateTime;
import reactor.core.publisher.Mono;

class PurviewShareClientTestBase extends TestBase {
    protected ReceivedSharesClient receivedSharesClient;

    protected SentSharesClient sentSharesClient;

    @Override
    protected void beforeTest() {
        ReceivedSharesClientBuilder receivedSharesClientbuilder =
                new ReceivedSharesClientBuilder()
                        .endpoint(Configuration.getGlobalConfiguration().get("ENDPOINT", "endpoint"))
                        .httpClient(HttpClient.createDefault())
                        .httpLogOptions(new HttpLogOptions().setLogLevel(HttpLogDetailLevel.BASIC));
        if (getTestMode() == TestMode.PLAYBACK) {
            receivedSharesClientbuilder
                    .httpClient(interceptorManager.getPlaybackClient())
                    .credential(request -> Mono.just(new AccessToken("this_is_a_token", OffsetDateTime.MAX)));
        } else if (getTestMode() == TestMode.RECORD) {
            receivedSharesClientbuilder
                    .addPolicy(interceptorManager.getRecordPolicy())
                    .credential(new DefaultAzureCredentialBuilder().build());
        } else if (getTestMode() == TestMode.LIVE) {
            receivedSharesClientbuilder.credential(new DefaultAzureCredentialBuilder().build());
        }
        receivedSharesClient = receivedSharesClientbuilder.buildClient();

        SentSharesClientBuilder sentSharesClientbuilder =
                new SentSharesClientBuilder()
                        .endpoint(Configuration.getGlobalConfiguration().get("ENDPOINT", "endpoint"))
                        .httpClient(HttpClient.createDefault())
                        .httpLogOptions(new HttpLogOptions().setLogLevel(HttpLogDetailLevel.BASIC));
        if (getTestMode() == TestMode.PLAYBACK) {
            sentSharesClientbuilder
                    .httpClient(interceptorManager.getPlaybackClient())
                    .credential(request -> Mono.just(new AccessToken("this_is_a_token", OffsetDateTime.MAX)));
        } else if (getTestMode() == TestMode.RECORD) {
            sentSharesClientbuilder
                    .addPolicy(interceptorManager.getRecordPolicy())
                    .credential(new DefaultAzureCredentialBuilder().build());
        } else if (getTestMode() == TestMode.LIVE) {
            sentSharesClientbuilder.credential(new DefaultAzureCredentialBuilder().build());
        }
        sentSharesClient = sentSharesClientbuilder.buildClient();
    }
}
