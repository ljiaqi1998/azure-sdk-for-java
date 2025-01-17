// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.core.http.netty;

import com.azure.core.http.HttpClient;
import com.azure.core.test.HttpClientTestsWireMockServer;
import com.azure.core.test.http.HttpClientTests;
import com.github.tomakehurst.wiremock.WireMockServer;
import io.netty.handler.ssl.SslContext;
import io.netty.handler.ssl.SslContextBuilder;
import io.netty.handler.ssl.util.InsecureTrustManagerFactory;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;

import javax.net.ssl.SSLException;

/**
 * Reactor Netty {@link HttpClientTests} with https.
 * Some request logic branches out if it's https like file uploads.
 */
public class NettyAsyncHttpClientHttpClientWithHttpsTests extends HttpClientTests {
    private static WireMockServer server;

    private static final HttpClient HTTP_CLIENT_INSTANCE;

    static {
        try {
            SslContext sslContext = SslContextBuilder.forClient()
                .trustManager(InsecureTrustManagerFactory.INSTANCE)
                .build();

            reactor.netty.http.client.HttpClient nettyHttpClient =
                reactor.netty.http.client.HttpClient.create()
                    .secure(sslContextSpec -> sslContextSpec.sslContext(sslContext));

            HTTP_CLIENT_INSTANCE = new NettyAsyncHttpClientBuilder(nettyHttpClient).build();
        } catch (SSLException e) {
            throw new RuntimeException(e);
        }
    }

    @BeforeAll
    public static void getWireMockServer() {
        server = HttpClientTestsWireMockServer.getHttpClientTestsServer();
        server.start();
    }

    @AfterAll
    public static void shutdownWireMockServer() {
        if (server != null) {
            server.shutdown();
        }
    }

    @Override
    protected int getWireMockPort() {
        return server.httpsPort();
    }

    @Override
    protected boolean isSecure() {
        return true;
    }

    @Override
    protected HttpClient createHttpClient() {
        return HTTP_CLIENT_INSTANCE;
    }
}
