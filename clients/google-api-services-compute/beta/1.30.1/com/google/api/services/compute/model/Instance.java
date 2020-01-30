/*
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License
 * is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express
 * or implied. See the License for the specific language governing permissions and limitations under
 * the License.
 */
/*
 * This code was generated by https://github.com/googleapis/google-api-java-client-services/
 * Modify at your own risk.
 */

package com.google.api.services.compute.model;

/**
 * Represents an Instance resource.
 *
 * An instance is a virtual machine that is hosted on Google Cloud Platform. For more information,
 * read Virtual Machine Instances. (== resource_for {$api_version}.instances ==)
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Compute Engine API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class Instance extends com.google.api.client.json.GenericJson {

  /**
   * Allows this instance to send and receive packets with non-matching destination or source IPs.
   * This is required if you plan to use this instance to forward routes. For more information, see
   * Enabling IP Forwarding.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean canIpForward;

  /**
   * [Output Only] The CPU platform used by this instance.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String cpuPlatform;

  /**
   * [Output Only] Creation timestamp in RFC3339 text format.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String creationTimestamp;

  /**
   * Whether the resource should be protected against deletion.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean deletionProtection;

  /**
   * An optional description of this resource. Provide this property when you create the resource.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String description;

  /**
   * Array of disks associated with this instance. Persistent disks must be created before you can
   * assign them.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<AttachedDisk> disks;

  static {
    // hack to force ProGuard to consider AttachedDisk used, since otherwise it would be stripped out
    // see https://github.com/google/google-api-java-client/issues/543
    com.google.api.client.util.Data.nullOf(AttachedDisk.class);
  }

  /**
   * Enables display device for the instance.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private DisplayDevice displayDevice;

  /**
   * Specifies whether the disks restored from source snapshots or source machine image should erase
   * Windows specific VSS signature.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean eraseWindowsVssSignature;

  /**
   * A list of the type and count of accelerator cards attached to the instance.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<AcceleratorConfig> guestAccelerators;

  static {
    // hack to force ProGuard to consider AcceleratorConfig used, since otherwise it would be stripped out
    // see https://github.com/google/google-api-java-client/issues/543
    com.google.api.client.util.Data.nullOf(AcceleratorConfig.class);
  }

  /**
   * Specifies the hostname of the instance. The specified hostname must be RFC1035 compliant. If
   * hostname is not specified, the default hostname is [INSTANCE_NAME].c.[PROJECT_ID].internal when
   * using the global DNS, and [INSTANCE_NAME].[ZONE].c.[PROJECT_ID].internal when using zonal DNS.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String hostname;

  /**
   * [Output Only] The unique identifier for the resource. This identifier is defined by the server.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key @com.google.api.client.json.JsonString
  private java.math.BigInteger id;

  /**
   * [Output Only] Type of the resource. Always compute#instance for instances.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String kind;

  /**
   * A fingerprint for this request, which is essentially a hash of the label's contents and used
   * for optimistic locking. The fingerprint is initially generated by Compute Engine and changes
   * after every request to modify or update labels. You must always provide an up-to-date
   * fingerprint hash in order to update or change labels.
   *
   * To see the latest fingerprint, make get() request to the instance.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String labelFingerprint;

  /**
   * Labels to apply to this instance. These can be later modified by the setLabels method.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.Map<String, java.lang.String> labels;

  /**
   * Full or partial URL of the machine type resource to use for this instance, in the format:
   * zones/zone/machineTypes/machine-type. This is provided by the client when the instance is
   * created. For example, the following is a valid partial url to a predefined machine type: zones
   * /us-central1-f/machineTypes/n1-standard-1
   *
   * To create a custom machine type, provide a URL to a machine type in the following format, where
   * CPUS is 1 or an even number up to 32 (2, 4, 6, ... 24, etc), and MEMORY is the total memory for
   * this instance. Memory must be a multiple of 256 MB and must be supplied in MB (e.g. 5 GB of
   * memory is 5120 MB): zones/zone/machineTypes/custom-CPUS-MEMORY
   *
   * For example: zones/us-central1-f/machineTypes/custom-4-5120
   *
   * For a full list of restrictions, read the Specifications for custom machine types.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String machineType;

  /**
   * The metadata key/value pairs assigned to this instance. This includes custom metadata and
   * predefined keys.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private Metadata metadata;

  /**
   * Specifies a minimum CPU platform for the VM instance. Applicable values are the friendly names
   * of CPU platforms, such as minCpuPlatform: "Intel Haswell" or minCpuPlatform: "Intel Sandy
   * Bridge".
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String minCpuPlatform;

  /**
   * The name of the resource, provided by the client when initially creating the resource. The
   * resource name must be 1-63 characters long, and comply with RFC1035. Specifically, the name
   * must be 1-63 characters long and match the regular expression `[a-z]([-a-z0-9]*[a-z0-9])?`
   * which means the first character must be a lowercase letter, and all following characters must
   * be a dash, lowercase letter, or digit, except the last character, which cannot be a dash.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String name;

  /**
   * An array of network configurations for this instance. These specify how interfaces are
   * configured to interact with other network services, such as connecting to the internet.
   * Multiple interfaces are supported per instance.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<NetworkInterface> networkInterfaces;

  /**
   * Specifies the reservations that this instance can consume from.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private ReservationAffinity reservationAffinity;

  /**
   * Resource policies applied to this instance.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<java.lang.String> resourcePolicies;

  /**
   * Sets the scheduling options for this instance.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private Scheduling scheduling;

  /**
   * [Output Only] Server-defined URL for this resource.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String selfLink;

  /**
   * A list of service accounts, with their specified scopes, authorized for this instance. Only one
   * service account per VM instance is supported.
   *
   * Service accounts generate access tokens that can be accessed through the metadata server and
   * used to authenticate applications on the instance. See Service Accounts for more information.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<ServiceAccount> serviceAccounts;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private ShieldedInstanceConfig shieldedInstanceConfig;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private ShieldedInstanceIntegrityPolicy shieldedInstanceIntegrityPolicy;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private ShieldedVmConfig shieldedVmConfig;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private ShieldedVmIntegrityPolicy shieldedVmIntegrityPolicy;

  /**
   * Source machine image
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String sourceMachineImage;

  /**
   * Source GMI encryption key when creating an instance from GMI.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private CustomerEncryptionKey sourceMachineImageEncryptionKey;

  /**
   * [Output Only] Whether a VM has been restricted for start because Compute Engine has detected
   * suspicious activity.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean startRestricted;

  /**
   * [Output Only] The status of the instance. One of the following values: PROVISIONING, STAGING,
   * RUNNING, STOPPING, STOPPED, SUSPENDING, SUSPENDED, and TERMINATED.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String status;

  /**
   * [Output Only] An optional, human-readable explanation of the status.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String statusMessage;

  /**
   * Tags to apply to this instance. Tags are used to identify valid sources or targets for network
   * firewalls and are specified by the client during instance creation. The tags can be later
   * modified by the setTags method. Each tag within the list must comply with RFC1035. Multiple
   * tags can be specified via the 'tags.items' field.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private Tags tags;

  /**
   * [Output Only] URL of the zone where the instance resides. You must specify this field as part
   * of the HTTP request URL. It is not settable as a field in the request body.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String zone;

  /**
   * Allows this instance to send and receive packets with non-matching destination or source IPs.
   * This is required if you plan to use this instance to forward routes. For more information, see
   * Enabling IP Forwarding.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getCanIpForward() {
    return canIpForward;
  }

  /**
   * Allows this instance to send and receive packets with non-matching destination or source IPs.
   * This is required if you plan to use this instance to forward routes. For more information, see
   * Enabling IP Forwarding.
   * @param canIpForward canIpForward or {@code null} for none
   */
  public Instance setCanIpForward(java.lang.Boolean canIpForward) {
    this.canIpForward = canIpForward;
    return this;
  }

  /**
   * [Output Only] The CPU platform used by this instance.
   * @return value or {@code null} for none
   */
  public java.lang.String getCpuPlatform() {
    return cpuPlatform;
  }

  /**
   * [Output Only] The CPU platform used by this instance.
   * @param cpuPlatform cpuPlatform or {@code null} for none
   */
  public Instance setCpuPlatform(java.lang.String cpuPlatform) {
    this.cpuPlatform = cpuPlatform;
    return this;
  }

  /**
   * [Output Only] Creation timestamp in RFC3339 text format.
   * @return value or {@code null} for none
   */
  public java.lang.String getCreationTimestamp() {
    return creationTimestamp;
  }

  /**
   * [Output Only] Creation timestamp in RFC3339 text format.
   * @param creationTimestamp creationTimestamp or {@code null} for none
   */
  public Instance setCreationTimestamp(java.lang.String creationTimestamp) {
    this.creationTimestamp = creationTimestamp;
    return this;
  }

  /**
   * Whether the resource should be protected against deletion.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getDeletionProtection() {
    return deletionProtection;
  }

  /**
   * Whether the resource should be protected against deletion.
   * @param deletionProtection deletionProtection or {@code null} for none
   */
  public Instance setDeletionProtection(java.lang.Boolean deletionProtection) {
    this.deletionProtection = deletionProtection;
    return this;
  }

  /**
   * An optional description of this resource. Provide this property when you create the resource.
   * @return value or {@code null} for none
   */
  public java.lang.String getDescription() {
    return description;
  }

  /**
   * An optional description of this resource. Provide this property when you create the resource.
   * @param description description or {@code null} for none
   */
  public Instance setDescription(java.lang.String description) {
    this.description = description;
    return this;
  }

  /**
   * Array of disks associated with this instance. Persistent disks must be created before you can
   * assign them.
   * @return value or {@code null} for none
   */
  public java.util.List<AttachedDisk> getDisks() {
    return disks;
  }

  /**
   * Array of disks associated with this instance. Persistent disks must be created before you can
   * assign them.
   * @param disks disks or {@code null} for none
   */
  public Instance setDisks(java.util.List<AttachedDisk> disks) {
    this.disks = disks;
    return this;
  }

  /**
   * Enables display device for the instance.
   * @return value or {@code null} for none
   */
  public DisplayDevice getDisplayDevice() {
    return displayDevice;
  }

  /**
   * Enables display device for the instance.
   * @param displayDevice displayDevice or {@code null} for none
   */
  public Instance setDisplayDevice(DisplayDevice displayDevice) {
    this.displayDevice = displayDevice;
    return this;
  }

  /**
   * Specifies whether the disks restored from source snapshots or source machine image should erase
   * Windows specific VSS signature.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getEraseWindowsVssSignature() {
    return eraseWindowsVssSignature;
  }

  /**
   * Specifies whether the disks restored from source snapshots or source machine image should erase
   * Windows specific VSS signature.
   * @param eraseWindowsVssSignature eraseWindowsVssSignature or {@code null} for none
   */
  public Instance setEraseWindowsVssSignature(java.lang.Boolean eraseWindowsVssSignature) {
    this.eraseWindowsVssSignature = eraseWindowsVssSignature;
    return this;
  }

  /**
   * A list of the type and count of accelerator cards attached to the instance.
   * @return value or {@code null} for none
   */
  public java.util.List<AcceleratorConfig> getGuestAccelerators() {
    return guestAccelerators;
  }

  /**
   * A list of the type and count of accelerator cards attached to the instance.
   * @param guestAccelerators guestAccelerators or {@code null} for none
   */
  public Instance setGuestAccelerators(java.util.List<AcceleratorConfig> guestAccelerators) {
    this.guestAccelerators = guestAccelerators;
    return this;
  }

  /**
   * Specifies the hostname of the instance. The specified hostname must be RFC1035 compliant. If
   * hostname is not specified, the default hostname is [INSTANCE_NAME].c.[PROJECT_ID].internal when
   * using the global DNS, and [INSTANCE_NAME].[ZONE].c.[PROJECT_ID].internal when using zonal DNS.
   * @return value or {@code null} for none
   */
  public java.lang.String getHostname() {
    return hostname;
  }

  /**
   * Specifies the hostname of the instance. The specified hostname must be RFC1035 compliant. If
   * hostname is not specified, the default hostname is [INSTANCE_NAME].c.[PROJECT_ID].internal when
   * using the global DNS, and [INSTANCE_NAME].[ZONE].c.[PROJECT_ID].internal when using zonal DNS.
   * @param hostname hostname or {@code null} for none
   */
  public Instance setHostname(java.lang.String hostname) {
    this.hostname = hostname;
    return this;
  }

  /**
   * [Output Only] The unique identifier for the resource. This identifier is defined by the server.
   * @return value or {@code null} for none
   */
  public java.math.BigInteger getId() {
    return id;
  }

  /**
   * [Output Only] The unique identifier for the resource. This identifier is defined by the server.
   * @param id id or {@code null} for none
   */
  public Instance setId(java.math.BigInteger id) {
    this.id = id;
    return this;
  }

  /**
   * [Output Only] Type of the resource. Always compute#instance for instances.
   * @return value or {@code null} for none
   */
  public java.lang.String getKind() {
    return kind;
  }

  /**
   * [Output Only] Type of the resource. Always compute#instance for instances.
   * @param kind kind or {@code null} for none
   */
  public Instance setKind(java.lang.String kind) {
    this.kind = kind;
    return this;
  }

  /**
   * A fingerprint for this request, which is essentially a hash of the label's contents and used
   * for optimistic locking. The fingerprint is initially generated by Compute Engine and changes
   * after every request to modify or update labels. You must always provide an up-to-date
   * fingerprint hash in order to update or change labels.
   *
   * To see the latest fingerprint, make get() request to the instance.
   * @see #decodeLabelFingerprint()
   * @return value or {@code null} for none
   */
  public java.lang.String getLabelFingerprint() {
    return labelFingerprint;
  }

  /**
   * A fingerprint for this request, which is essentially a hash of the label's contents and used
   * for optimistic locking. The fingerprint is initially generated by Compute Engine and changes
   * after every request to modify or update labels. You must always provide an up-to-date
   * fingerprint hash in order to update or change labels.
   *
   * To see the latest fingerprint, make get() request to the instance.
   * @see #getLabelFingerprint()
   * @return Base64 decoded value or {@code null} for none
   *
   * @since 1.14
   */
  public byte[] decodeLabelFingerprint() {
    return com.google.api.client.util.Base64.decodeBase64(labelFingerprint);
  }

  /**
   * A fingerprint for this request, which is essentially a hash of the label's contents and used
   * for optimistic locking. The fingerprint is initially generated by Compute Engine and changes
   * after every request to modify or update labels. You must always provide an up-to-date
   * fingerprint hash in order to update or change labels.
   *
   * To see the latest fingerprint, make get() request to the instance.
   * @see #encodeLabelFingerprint()
   * @param labelFingerprint labelFingerprint or {@code null} for none
   */
  public Instance setLabelFingerprint(java.lang.String labelFingerprint) {
    this.labelFingerprint = labelFingerprint;
    return this;
  }

  /**
   * A fingerprint for this request, which is essentially a hash of the label's contents and used
   * for optimistic locking. The fingerprint is initially generated by Compute Engine and changes
   * after every request to modify or update labels. You must always provide an up-to-date
   * fingerprint hash in order to update or change labels.
   *
   * To see the latest fingerprint, make get() request to the instance.
   * @see #setLabelFingerprint()
   *
   * <p>
   * The value is encoded Base64 or {@code null} for none.
   * </p>
   *
   * @since 1.14
   */
  public Instance encodeLabelFingerprint(byte[] labelFingerprint) {
    this.labelFingerprint = com.google.api.client.util.Base64.encodeBase64URLSafeString(labelFingerprint);
    return this;
  }

  /**
   * Labels to apply to this instance. These can be later modified by the setLabels method.
   * @return value or {@code null} for none
   */
  public java.util.Map<String, java.lang.String> getLabels() {
    return labels;
  }

  /**
   * Labels to apply to this instance. These can be later modified by the setLabels method.
   * @param labels labels or {@code null} for none
   */
  public Instance setLabels(java.util.Map<String, java.lang.String> labels) {
    this.labels = labels;
    return this;
  }

  /**
   * Full or partial URL of the machine type resource to use for this instance, in the format:
   * zones/zone/machineTypes/machine-type. This is provided by the client when the instance is
   * created. For example, the following is a valid partial url to a predefined machine type: zones
   * /us-central1-f/machineTypes/n1-standard-1
   *
   * To create a custom machine type, provide a URL to a machine type in the following format, where
   * CPUS is 1 or an even number up to 32 (2, 4, 6, ... 24, etc), and MEMORY is the total memory for
   * this instance. Memory must be a multiple of 256 MB and must be supplied in MB (e.g. 5 GB of
   * memory is 5120 MB): zones/zone/machineTypes/custom-CPUS-MEMORY
   *
   * For example: zones/us-central1-f/machineTypes/custom-4-5120
   *
   * For a full list of restrictions, read the Specifications for custom machine types.
   * @return value or {@code null} for none
   */
  public java.lang.String getMachineType() {
    return machineType;
  }

  /**
   * Full or partial URL of the machine type resource to use for this instance, in the format:
   * zones/zone/machineTypes/machine-type. This is provided by the client when the instance is
   * created. For example, the following is a valid partial url to a predefined machine type: zones
   * /us-central1-f/machineTypes/n1-standard-1
   *
   * To create a custom machine type, provide a URL to a machine type in the following format, where
   * CPUS is 1 or an even number up to 32 (2, 4, 6, ... 24, etc), and MEMORY is the total memory for
   * this instance. Memory must be a multiple of 256 MB and must be supplied in MB (e.g. 5 GB of
   * memory is 5120 MB): zones/zone/machineTypes/custom-CPUS-MEMORY
   *
   * For example: zones/us-central1-f/machineTypes/custom-4-5120
   *
   * For a full list of restrictions, read the Specifications for custom machine types.
   * @param machineType machineType or {@code null} for none
   */
  public Instance setMachineType(java.lang.String machineType) {
    this.machineType = machineType;
    return this;
  }

  /**
   * The metadata key/value pairs assigned to this instance. This includes custom metadata and
   * predefined keys.
   * @return value or {@code null} for none
   */
  public Metadata getMetadata() {
    return metadata;
  }

  /**
   * The metadata key/value pairs assigned to this instance. This includes custom metadata and
   * predefined keys.
   * @param metadata metadata or {@code null} for none
   */
  public Instance setMetadata(Metadata metadata) {
    this.metadata = metadata;
    return this;
  }

  /**
   * Specifies a minimum CPU platform for the VM instance. Applicable values are the friendly names
   * of CPU platforms, such as minCpuPlatform: "Intel Haswell" or minCpuPlatform: "Intel Sandy
   * Bridge".
   * @return value or {@code null} for none
   */
  public java.lang.String getMinCpuPlatform() {
    return minCpuPlatform;
  }

  /**
   * Specifies a minimum CPU platform for the VM instance. Applicable values are the friendly names
   * of CPU platforms, such as minCpuPlatform: "Intel Haswell" or minCpuPlatform: "Intel Sandy
   * Bridge".
   * @param minCpuPlatform minCpuPlatform or {@code null} for none
   */
  public Instance setMinCpuPlatform(java.lang.String minCpuPlatform) {
    this.minCpuPlatform = minCpuPlatform;
    return this;
  }

  /**
   * The name of the resource, provided by the client when initially creating the resource. The
   * resource name must be 1-63 characters long, and comply with RFC1035. Specifically, the name
   * must be 1-63 characters long and match the regular expression `[a-z]([-a-z0-9]*[a-z0-9])?`
   * which means the first character must be a lowercase letter, and all following characters must
   * be a dash, lowercase letter, or digit, except the last character, which cannot be a dash.
   * @return value or {@code null} for none
   */
  public java.lang.String getName() {
    return name;
  }

  /**
   * The name of the resource, provided by the client when initially creating the resource. The
   * resource name must be 1-63 characters long, and comply with RFC1035. Specifically, the name
   * must be 1-63 characters long and match the regular expression `[a-z]([-a-z0-9]*[a-z0-9])?`
   * which means the first character must be a lowercase letter, and all following characters must
   * be a dash, lowercase letter, or digit, except the last character, which cannot be a dash.
   * @param name name or {@code null} for none
   */
  public Instance setName(java.lang.String name) {
    this.name = name;
    return this;
  }

  /**
   * An array of network configurations for this instance. These specify how interfaces are
   * configured to interact with other network services, such as connecting to the internet.
   * Multiple interfaces are supported per instance.
   * @return value or {@code null} for none
   */
  public java.util.List<NetworkInterface> getNetworkInterfaces() {
    return networkInterfaces;
  }

  /**
   * An array of network configurations for this instance. These specify how interfaces are
   * configured to interact with other network services, such as connecting to the internet.
   * Multiple interfaces are supported per instance.
   * @param networkInterfaces networkInterfaces or {@code null} for none
   */
  public Instance setNetworkInterfaces(java.util.List<NetworkInterface> networkInterfaces) {
    this.networkInterfaces = networkInterfaces;
    return this;
  }

  /**
   * Specifies the reservations that this instance can consume from.
   * @return value or {@code null} for none
   */
  public ReservationAffinity getReservationAffinity() {
    return reservationAffinity;
  }

  /**
   * Specifies the reservations that this instance can consume from.
   * @param reservationAffinity reservationAffinity or {@code null} for none
   */
  public Instance setReservationAffinity(ReservationAffinity reservationAffinity) {
    this.reservationAffinity = reservationAffinity;
    return this;
  }

  /**
   * Resource policies applied to this instance.
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.String> getResourcePolicies() {
    return resourcePolicies;
  }

  /**
   * Resource policies applied to this instance.
   * @param resourcePolicies resourcePolicies or {@code null} for none
   */
  public Instance setResourcePolicies(java.util.List<java.lang.String> resourcePolicies) {
    this.resourcePolicies = resourcePolicies;
    return this;
  }

  /**
   * Sets the scheduling options for this instance.
   * @return value or {@code null} for none
   */
  public Scheduling getScheduling() {
    return scheduling;
  }

  /**
   * Sets the scheduling options for this instance.
   * @param scheduling scheduling or {@code null} for none
   */
  public Instance setScheduling(Scheduling scheduling) {
    this.scheduling = scheduling;
    return this;
  }

  /**
   * [Output Only] Server-defined URL for this resource.
   * @return value or {@code null} for none
   */
  public java.lang.String getSelfLink() {
    return selfLink;
  }

  /**
   * [Output Only] Server-defined URL for this resource.
   * @param selfLink selfLink or {@code null} for none
   */
  public Instance setSelfLink(java.lang.String selfLink) {
    this.selfLink = selfLink;
    return this;
  }

  /**
   * A list of service accounts, with their specified scopes, authorized for this instance. Only one
   * service account per VM instance is supported.
   *
   * Service accounts generate access tokens that can be accessed through the metadata server and
   * used to authenticate applications on the instance. See Service Accounts for more information.
   * @return value or {@code null} for none
   */
  public java.util.List<ServiceAccount> getServiceAccounts() {
    return serviceAccounts;
  }

  /**
   * A list of service accounts, with their specified scopes, authorized for this instance. Only one
   * service account per VM instance is supported.
   *
   * Service accounts generate access tokens that can be accessed through the metadata server and
   * used to authenticate applications on the instance. See Service Accounts for more information.
   * @param serviceAccounts serviceAccounts or {@code null} for none
   */
  public Instance setServiceAccounts(java.util.List<ServiceAccount> serviceAccounts) {
    this.serviceAccounts = serviceAccounts;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public ShieldedInstanceConfig getShieldedInstanceConfig() {
    return shieldedInstanceConfig;
  }

  /**
   * @param shieldedInstanceConfig shieldedInstanceConfig or {@code null} for none
   */
  public Instance setShieldedInstanceConfig(ShieldedInstanceConfig shieldedInstanceConfig) {
    this.shieldedInstanceConfig = shieldedInstanceConfig;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public ShieldedInstanceIntegrityPolicy getShieldedInstanceIntegrityPolicy() {
    return shieldedInstanceIntegrityPolicy;
  }

  /**
   * @param shieldedInstanceIntegrityPolicy shieldedInstanceIntegrityPolicy or {@code null} for none
   */
  public Instance setShieldedInstanceIntegrityPolicy(ShieldedInstanceIntegrityPolicy shieldedInstanceIntegrityPolicy) {
    this.shieldedInstanceIntegrityPolicy = shieldedInstanceIntegrityPolicy;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public ShieldedVmConfig getShieldedVmConfig() {
    return shieldedVmConfig;
  }

  /**
   * @param shieldedVmConfig shieldedVmConfig or {@code null} for none
   */
  public Instance setShieldedVmConfig(ShieldedVmConfig shieldedVmConfig) {
    this.shieldedVmConfig = shieldedVmConfig;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public ShieldedVmIntegrityPolicy getShieldedVmIntegrityPolicy() {
    return shieldedVmIntegrityPolicy;
  }

  /**
   * @param shieldedVmIntegrityPolicy shieldedVmIntegrityPolicy or {@code null} for none
   */
  public Instance setShieldedVmIntegrityPolicy(ShieldedVmIntegrityPolicy shieldedVmIntegrityPolicy) {
    this.shieldedVmIntegrityPolicy = shieldedVmIntegrityPolicy;
    return this;
  }

  /**
   * Source machine image
   * @return value or {@code null} for none
   */
  public java.lang.String getSourceMachineImage() {
    return sourceMachineImage;
  }

  /**
   * Source machine image
   * @param sourceMachineImage sourceMachineImage or {@code null} for none
   */
  public Instance setSourceMachineImage(java.lang.String sourceMachineImage) {
    this.sourceMachineImage = sourceMachineImage;
    return this;
  }

  /**
   * Source GMI encryption key when creating an instance from GMI.
   * @return value or {@code null} for none
   */
  public CustomerEncryptionKey getSourceMachineImageEncryptionKey() {
    return sourceMachineImageEncryptionKey;
  }

  /**
   * Source GMI encryption key when creating an instance from GMI.
   * @param sourceMachineImageEncryptionKey sourceMachineImageEncryptionKey or {@code null} for none
   */
  public Instance setSourceMachineImageEncryptionKey(CustomerEncryptionKey sourceMachineImageEncryptionKey) {
    this.sourceMachineImageEncryptionKey = sourceMachineImageEncryptionKey;
    return this;
  }

  /**
   * [Output Only] Whether a VM has been restricted for start because Compute Engine has detected
   * suspicious activity.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getStartRestricted() {
    return startRestricted;
  }

  /**
   * [Output Only] Whether a VM has been restricted for start because Compute Engine has detected
   * suspicious activity.
   * @param startRestricted startRestricted or {@code null} for none
   */
  public Instance setStartRestricted(java.lang.Boolean startRestricted) {
    this.startRestricted = startRestricted;
    return this;
  }

  /**
   * [Output Only] The status of the instance. One of the following values: PROVISIONING, STAGING,
   * RUNNING, STOPPING, STOPPED, SUSPENDING, SUSPENDED, and TERMINATED.
   * @return value or {@code null} for none
   */
  public java.lang.String getStatus() {
    return status;
  }

  /**
   * [Output Only] The status of the instance. One of the following values: PROVISIONING, STAGING,
   * RUNNING, STOPPING, STOPPED, SUSPENDING, SUSPENDED, and TERMINATED.
   * @param status status or {@code null} for none
   */
  public Instance setStatus(java.lang.String status) {
    this.status = status;
    return this;
  }

  /**
   * [Output Only] An optional, human-readable explanation of the status.
   * @return value or {@code null} for none
   */
  public java.lang.String getStatusMessage() {
    return statusMessage;
  }

  /**
   * [Output Only] An optional, human-readable explanation of the status.
   * @param statusMessage statusMessage or {@code null} for none
   */
  public Instance setStatusMessage(java.lang.String statusMessage) {
    this.statusMessage = statusMessage;
    return this;
  }

  /**
   * Tags to apply to this instance. Tags are used to identify valid sources or targets for network
   * firewalls and are specified by the client during instance creation. The tags can be later
   * modified by the setTags method. Each tag within the list must comply with RFC1035. Multiple
   * tags can be specified via the 'tags.items' field.
   * @return value or {@code null} for none
   */
  public Tags getTags() {
    return tags;
  }

  /**
   * Tags to apply to this instance. Tags are used to identify valid sources or targets for network
   * firewalls and are specified by the client during instance creation. The tags can be later
   * modified by the setTags method. Each tag within the list must comply with RFC1035. Multiple
   * tags can be specified via the 'tags.items' field.
   * @param tags tags or {@code null} for none
   */
  public Instance setTags(Tags tags) {
    this.tags = tags;
    return this;
  }

  /**
   * [Output Only] URL of the zone where the instance resides. You must specify this field as part
   * of the HTTP request URL. It is not settable as a field in the request body.
   * @return value or {@code null} for none
   */
  public java.lang.String getZone() {
    return zone;
  }

  /**
   * [Output Only] URL of the zone where the instance resides. You must specify this field as part
   * of the HTTP request URL. It is not settable as a field in the request body.
   * @param zone zone or {@code null} for none
   */
  public Instance setZone(java.lang.String zone) {
    this.zone = zone;
    return this;
  }

  @Override
  public Instance set(String fieldName, Object value) {
    return (Instance) super.set(fieldName, value);
  }

  @Override
  public Instance clone() {
    return (Instance) super.clone();
  }

}
