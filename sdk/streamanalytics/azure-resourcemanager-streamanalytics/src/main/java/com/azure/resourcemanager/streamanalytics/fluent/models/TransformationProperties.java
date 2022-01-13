// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.streamanalytics.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** The properties that are associated with a transformation. */
@Fluent
public final class TransformationProperties {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(TransformationProperties.class);

    /*
     * Specifies the number of streaming units that the streaming job uses.
     */
    @JsonProperty(value = "streamingUnits")
    private Integer streamingUnits;

    /*
     * Specifies the valid streaming units a streaming job can scale to.
     */
    @JsonProperty(value = "validStreamingUnits")
    private List<Integer> validStreamingUnits;

    /*
     * Specifies the query that will be run in the streaming job. You can learn
     * more about the Stream Analytics Query Language (SAQL) here:
     * https://msdn.microsoft.com/library/azure/dn834998 . Required on PUT
     * (CreateOrReplace) requests.
     */
    @JsonProperty(value = "query")
    private String query;

    /*
     * The current entity tag for the transformation. This is an opaque string.
     * You can use it to detect whether the resource has changed between
     * requests. You can also use it in the If-Match or If-None-Match headers
     * for write operations for optimistic concurrency.
     */
    @JsonProperty(value = "etag", access = JsonProperty.Access.WRITE_ONLY)
    private String etag;

    /**
     * Get the streamingUnits property: Specifies the number of streaming units that the streaming job uses.
     *
     * @return the streamingUnits value.
     */
    public Integer streamingUnits() {
        return this.streamingUnits;
    }

    /**
     * Set the streamingUnits property: Specifies the number of streaming units that the streaming job uses.
     *
     * @param streamingUnits the streamingUnits value to set.
     * @return the TransformationProperties object itself.
     */
    public TransformationProperties withStreamingUnits(Integer streamingUnits) {
        this.streamingUnits = streamingUnits;
        return this;
    }

    /**
     * Get the validStreamingUnits property: Specifies the valid streaming units a streaming job can scale to.
     *
     * @return the validStreamingUnits value.
     */
    public List<Integer> validStreamingUnits() {
        return this.validStreamingUnits;
    }

    /**
     * Set the validStreamingUnits property: Specifies the valid streaming units a streaming job can scale to.
     *
     * @param validStreamingUnits the validStreamingUnits value to set.
     * @return the TransformationProperties object itself.
     */
    public TransformationProperties withValidStreamingUnits(List<Integer> validStreamingUnits) {
        this.validStreamingUnits = validStreamingUnits;
        return this;
    }

    /**
     * Get the query property: Specifies the query that will be run in the streaming job. You can learn more about the
     * Stream Analytics Query Language (SAQL) here: https://msdn.microsoft.com/library/azure/dn834998 . Required on PUT
     * (CreateOrReplace) requests.
     *
     * @return the query value.
     */
    public String query() {
        return this.query;
    }

    /**
     * Set the query property: Specifies the query that will be run in the streaming job. You can learn more about the
     * Stream Analytics Query Language (SAQL) here: https://msdn.microsoft.com/library/azure/dn834998 . Required on PUT
     * (CreateOrReplace) requests.
     *
     * @param query the query value to set.
     * @return the TransformationProperties object itself.
     */
    public TransformationProperties withQuery(String query) {
        this.query = query;
        return this;
    }

    /**
     * Get the etag property: The current entity tag for the transformation. This is an opaque string. You can use it to
     * detect whether the resource has changed between requests. You can also use it in the If-Match or If-None-Match
     * headers for write operations for optimistic concurrency.
     *
     * @return the etag value.
     */
    public String etag() {
        return this.etag;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}