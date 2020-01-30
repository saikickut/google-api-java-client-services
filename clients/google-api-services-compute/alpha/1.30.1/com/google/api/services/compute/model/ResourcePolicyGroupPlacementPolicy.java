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
 * A GroupPlacementPolicy specifies resource placement configuration. It specifies the failure
 * bucket separation as well as network locality
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Compute Engine API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class ResourcePolicyGroupPlacementPolicy extends com.google.api.client.json.GenericJson {

  /**
   * The number of availability domains instances will be spread across. If two instances are in
   * different availability domain, they will not be put in the same low latency network
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Integer availabilityDomainCount;

  /**
   * Specifies network collocation
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String collocation;

  /**
   * Specifies network locality
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String locality;

  /**
   * Specifies instances to hosts placement relationship
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String style;

  /**
   * Number of vms in this placement group
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Integer vmCount;

  /**
   * The number of availability domains instances will be spread across. If two instances are in
   * different availability domain, they will not be put in the same low latency network
   * @return value or {@code null} for none
   */
  public java.lang.Integer getAvailabilityDomainCount() {
    return availabilityDomainCount;
  }

  /**
   * The number of availability domains instances will be spread across. If two instances are in
   * different availability domain, they will not be put in the same low latency network
   * @param availabilityDomainCount availabilityDomainCount or {@code null} for none
   */
  public ResourcePolicyGroupPlacementPolicy setAvailabilityDomainCount(java.lang.Integer availabilityDomainCount) {
    this.availabilityDomainCount = availabilityDomainCount;
    return this;
  }

  /**
   * Specifies network collocation
   * @return value or {@code null} for none
   */
  public java.lang.String getCollocation() {
    return collocation;
  }

  /**
   * Specifies network collocation
   * @param collocation collocation or {@code null} for none
   */
  public ResourcePolicyGroupPlacementPolicy setCollocation(java.lang.String collocation) {
    this.collocation = collocation;
    return this;
  }

  /**
   * Specifies network locality
   * @return value or {@code null} for none
   */
  public java.lang.String getLocality() {
    return locality;
  }

  /**
   * Specifies network locality
   * @param locality locality or {@code null} for none
   */
  public ResourcePolicyGroupPlacementPolicy setLocality(java.lang.String locality) {
    this.locality = locality;
    return this;
  }

  /**
   * Specifies instances to hosts placement relationship
   * @return value or {@code null} for none
   */
  public java.lang.String getStyle() {
    return style;
  }

  /**
   * Specifies instances to hosts placement relationship
   * @param style style or {@code null} for none
   */
  public ResourcePolicyGroupPlacementPolicy setStyle(java.lang.String style) {
    this.style = style;
    return this;
  }

  /**
   * Number of vms in this placement group
   * @return value or {@code null} for none
   */
  public java.lang.Integer getVmCount() {
    return vmCount;
  }

  /**
   * Number of vms in this placement group
   * @param vmCount vmCount or {@code null} for none
   */
  public ResourcePolicyGroupPlacementPolicy setVmCount(java.lang.Integer vmCount) {
    this.vmCount = vmCount;
    return this;
  }

  @Override
  public ResourcePolicyGroupPlacementPolicy set(String fieldName, Object value) {
    return (ResourcePolicyGroupPlacementPolicy) super.set(fieldName, value);
  }

  @Override
  public ResourcePolicyGroupPlacementPolicy clone() {
    return (ResourcePolicyGroupPlacementPolicy) super.clone();
  }

}
