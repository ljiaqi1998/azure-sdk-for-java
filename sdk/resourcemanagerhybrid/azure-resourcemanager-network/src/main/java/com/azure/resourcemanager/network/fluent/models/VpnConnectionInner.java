// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.management.SubResource;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.network.models.IpsecPolicy;
import com.azure.resourcemanager.network.models.ProvisioningState;
import com.azure.resourcemanager.network.models.VirtualNetworkGatewayConnectionProtocol;
import com.azure.resourcemanager.network.models.VpnConnectionStatus;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** VpnConnection Resource. */
@Fluent
public final class VpnConnectionInner extends SubResource {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(VpnConnectionInner.class);

    /*
     * Parameters for VpnConnection
     */
    @JsonProperty(value = "properties")
    private VpnConnectionProperties innerProperties;

    /*
     * The name of the resource that is unique within a resource group. This
     * name can be used to access the resource.
     */
    @JsonProperty(value = "name")
    private String name;

    /*
     * Gets a unique read-only string that changes whenever the resource is
     * updated.
     */
    @JsonProperty(value = "etag", access = JsonProperty.Access.WRITE_ONLY)
    private String etag;

    /**
     * Get the innerProperties property: Parameters for VpnConnection.
     *
     * @return the innerProperties value.
     */
    private VpnConnectionProperties innerProperties() {
        return this.innerProperties;
    }

    /**
     * Get the name property: The name of the resource that is unique within a resource group. This name can be used to
     * access the resource.
     *
     * @return the name value.
     */
    public String name() {
        return this.name;
    }

    /**
     * Set the name property: The name of the resource that is unique within a resource group. This name can be used to
     * access the resource.
     *
     * @param name the name value to set.
     * @return the VpnConnectionInner object itself.
     */
    public VpnConnectionInner withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the etag property: Gets a unique read-only string that changes whenever the resource is updated.
     *
     * @return the etag value.
     */
    public String etag() {
        return this.etag;
    }

    /** {@inheritDoc} */
    @Override
    public VpnConnectionInner withId(String id) {
        super.withId(id);
        return this;
    }

    /**
     * Get the remoteVpnSite property: Id of the connected vpn site.
     *
     * @return the remoteVpnSite value.
     */
    public SubResource remoteVpnSite() {
        return this.innerProperties() == null ? null : this.innerProperties().remoteVpnSite();
    }

    /**
     * Set the remoteVpnSite property: Id of the connected vpn site.
     *
     * @param remoteVpnSite the remoteVpnSite value to set.
     * @return the VpnConnectionInner object itself.
     */
    public VpnConnectionInner withRemoteVpnSite(SubResource remoteVpnSite) {
        if (this.innerProperties() == null) {
            this.innerProperties = new VpnConnectionProperties();
        }
        this.innerProperties().withRemoteVpnSite(remoteVpnSite);
        return this;
    }

    /**
     * Get the routingWeight property: routing weight for vpn connection.
     *
     * @return the routingWeight value.
     */
    public Integer routingWeight() {
        return this.innerProperties() == null ? null : this.innerProperties().routingWeight();
    }

    /**
     * Set the routingWeight property: routing weight for vpn connection.
     *
     * @param routingWeight the routingWeight value to set.
     * @return the VpnConnectionInner object itself.
     */
    public VpnConnectionInner withRoutingWeight(Integer routingWeight) {
        if (this.innerProperties() == null) {
            this.innerProperties = new VpnConnectionProperties();
        }
        this.innerProperties().withRoutingWeight(routingWeight);
        return this;
    }

    /**
     * Get the connectionStatus property: The connection status.
     *
     * @return the connectionStatus value.
     */
    public VpnConnectionStatus connectionStatus() {
        return this.innerProperties() == null ? null : this.innerProperties().connectionStatus();
    }

    /**
     * Get the vpnConnectionProtocolType property: Connection protocol used for this connection.
     *
     * @return the vpnConnectionProtocolType value.
     */
    public VirtualNetworkGatewayConnectionProtocol vpnConnectionProtocolType() {
        return this.innerProperties() == null ? null : this.innerProperties().vpnConnectionProtocolType();
    }

    /**
     * Set the vpnConnectionProtocolType property: Connection protocol used for this connection.
     *
     * @param vpnConnectionProtocolType the vpnConnectionProtocolType value to set.
     * @return the VpnConnectionInner object itself.
     */
    public VpnConnectionInner withVpnConnectionProtocolType(
        VirtualNetworkGatewayConnectionProtocol vpnConnectionProtocolType) {
        if (this.innerProperties() == null) {
            this.innerProperties = new VpnConnectionProperties();
        }
        this.innerProperties().withVpnConnectionProtocolType(vpnConnectionProtocolType);
        return this;
    }

    /**
     * Get the ingressBytesTransferred property: Ingress bytes transferred.
     *
     * @return the ingressBytesTransferred value.
     */
    public Long ingressBytesTransferred() {
        return this.innerProperties() == null ? null : this.innerProperties().ingressBytesTransferred();
    }

    /**
     * Get the egressBytesTransferred property: Egress bytes transferred.
     *
     * @return the egressBytesTransferred value.
     */
    public Long egressBytesTransferred() {
        return this.innerProperties() == null ? null : this.innerProperties().egressBytesTransferred();
    }

    /**
     * Get the connectionBandwidth property: Expected bandwidth in MBPS.
     *
     * @return the connectionBandwidth value.
     */
    public Integer connectionBandwidth() {
        return this.innerProperties() == null ? null : this.innerProperties().connectionBandwidth();
    }

    /**
     * Set the connectionBandwidth property: Expected bandwidth in MBPS.
     *
     * @param connectionBandwidth the connectionBandwidth value to set.
     * @return the VpnConnectionInner object itself.
     */
    public VpnConnectionInner withConnectionBandwidth(Integer connectionBandwidth) {
        if (this.innerProperties() == null) {
            this.innerProperties = new VpnConnectionProperties();
        }
        this.innerProperties().withConnectionBandwidth(connectionBandwidth);
        return this;
    }

    /**
     * Get the sharedKey property: SharedKey for the vpn connection.
     *
     * @return the sharedKey value.
     */
    public String sharedKey() {
        return this.innerProperties() == null ? null : this.innerProperties().sharedKey();
    }

    /**
     * Set the sharedKey property: SharedKey for the vpn connection.
     *
     * @param sharedKey the sharedKey value to set.
     * @return the VpnConnectionInner object itself.
     */
    public VpnConnectionInner withSharedKey(String sharedKey) {
        if (this.innerProperties() == null) {
            this.innerProperties = new VpnConnectionProperties();
        }
        this.innerProperties().withSharedKey(sharedKey);
        return this;
    }

    /**
     * Get the enableBgp property: EnableBgp flag.
     *
     * @return the enableBgp value.
     */
    public Boolean enableBgp() {
        return this.innerProperties() == null ? null : this.innerProperties().enableBgp();
    }

    /**
     * Set the enableBgp property: EnableBgp flag.
     *
     * @param enableBgp the enableBgp value to set.
     * @return the VpnConnectionInner object itself.
     */
    public VpnConnectionInner withEnableBgp(Boolean enableBgp) {
        if (this.innerProperties() == null) {
            this.innerProperties = new VpnConnectionProperties();
        }
        this.innerProperties().withEnableBgp(enableBgp);
        return this;
    }

    /**
     * Get the ipsecPolicies property: The IPSec Policies to be considered by this connection.
     *
     * @return the ipsecPolicies value.
     */
    public List<IpsecPolicy> ipsecPolicies() {
        return this.innerProperties() == null ? null : this.innerProperties().ipsecPolicies();
    }

    /**
     * Set the ipsecPolicies property: The IPSec Policies to be considered by this connection.
     *
     * @param ipsecPolicies the ipsecPolicies value to set.
     * @return the VpnConnectionInner object itself.
     */
    public VpnConnectionInner withIpsecPolicies(List<IpsecPolicy> ipsecPolicies) {
        if (this.innerProperties() == null) {
            this.innerProperties = new VpnConnectionProperties();
        }
        this.innerProperties().withIpsecPolicies(ipsecPolicies);
        return this;
    }

    /**
     * Get the enableRateLimiting property: EnableBgp flag.
     *
     * @return the enableRateLimiting value.
     */
    public Boolean enableRateLimiting() {
        return this.innerProperties() == null ? null : this.innerProperties().enableRateLimiting();
    }

    /**
     * Set the enableRateLimiting property: EnableBgp flag.
     *
     * @param enableRateLimiting the enableRateLimiting value to set.
     * @return the VpnConnectionInner object itself.
     */
    public VpnConnectionInner withEnableRateLimiting(Boolean enableRateLimiting) {
        if (this.innerProperties() == null) {
            this.innerProperties = new VpnConnectionProperties();
        }
        this.innerProperties().withEnableRateLimiting(enableRateLimiting);
        return this;
    }

    /**
     * Get the enableInternetSecurity property: Enable internet security.
     *
     * @return the enableInternetSecurity value.
     */
    public Boolean enableInternetSecurity() {
        return this.innerProperties() == null ? null : this.innerProperties().enableInternetSecurity();
    }

    /**
     * Set the enableInternetSecurity property: Enable internet security.
     *
     * @param enableInternetSecurity the enableInternetSecurity value to set.
     * @return the VpnConnectionInner object itself.
     */
    public VpnConnectionInner withEnableInternetSecurity(Boolean enableInternetSecurity) {
        if (this.innerProperties() == null) {
            this.innerProperties = new VpnConnectionProperties();
        }
        this.innerProperties().withEnableInternetSecurity(enableInternetSecurity);
        return this;
    }

    /**
     * Get the provisioningState property: The provisioning state of the resource.
     *
     * @return the provisioningState value.
     */
    public ProvisioningState provisioningState() {
        return this.innerProperties() == null ? null : this.innerProperties().provisioningState();
    }

    /**
     * Set the provisioningState property: The provisioning state of the resource.
     *
     * @param provisioningState the provisioningState value to set.
     * @return the VpnConnectionInner object itself.
     */
    public VpnConnectionInner withProvisioningState(ProvisioningState provisioningState) {
        if (this.innerProperties() == null) {
            this.innerProperties = new VpnConnectionProperties();
        }
        this.innerProperties().withProvisioningState(provisioningState);
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (innerProperties() != null) {
            innerProperties().validate();
        }
    }
}