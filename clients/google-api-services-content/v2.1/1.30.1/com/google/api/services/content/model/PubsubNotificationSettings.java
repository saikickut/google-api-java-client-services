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

package com.google.api.services.content.model;

/**
 * Settings for Pub/Sub notifications, all methods require that the caller is a direct user of the
 * merchant center account. (== resource_for v2.1.pubsubnotificationsettings ==)
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Content API for Shopping. For a detailed explanation
 * see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class PubsubNotificationSettings extends com.google.api.client.json.GenericJson {

  /**
   * Cloud pub/sub topic to which notifications are sent (read-only).
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String cloudTopicName;

  /**
   * Identifies what kind of resource this is. Value: the fixed string
   * "`content#pubsubNotificationSettings`"
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String kind;

  /**
   * List of event types.
   *
   * Acceptable values are:   - "`orderPendingShipment`"
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<java.lang.String> registeredEvents;

  /**
   * Cloud pub/sub topic to which notifications are sent (read-only).
   * @return value or {@code null} for none
   */
  public java.lang.String getCloudTopicName() {
    return cloudTopicName;
  }

  /**
   * Cloud pub/sub topic to which notifications are sent (read-only).
   * @param cloudTopicName cloudTopicName or {@code null} for none
   */
  public PubsubNotificationSettings setCloudTopicName(java.lang.String cloudTopicName) {
    this.cloudTopicName = cloudTopicName;
    return this;
  }

  /**
   * Identifies what kind of resource this is. Value: the fixed string
   * "`content#pubsubNotificationSettings`"
   * @return value or {@code null} for none
   */
  public java.lang.String getKind() {
    return kind;
  }

  /**
   * Identifies what kind of resource this is. Value: the fixed string
   * "`content#pubsubNotificationSettings`"
   * @param kind kind or {@code null} for none
   */
  public PubsubNotificationSettings setKind(java.lang.String kind) {
    this.kind = kind;
    return this;
  }

  /**
   * List of event types.
   *
   * Acceptable values are:   - "`orderPendingShipment`"
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.String> getRegisteredEvents() {
    return registeredEvents;
  }

  /**
   * List of event types.
   *
   * Acceptable values are:   - "`orderPendingShipment`"
   * @param registeredEvents registeredEvents or {@code null} for none
   */
  public PubsubNotificationSettings setRegisteredEvents(java.util.List<java.lang.String> registeredEvents) {
    this.registeredEvents = registeredEvents;
    return this;
  }

  @Override
  public PubsubNotificationSettings set(String fieldName, Object value) {
    return (PubsubNotificationSettings) super.set(fieldName, value);
  }

  @Override
  public PubsubNotificationSettings clone() {
    return (PubsubNotificationSettings) super.clone();
  }

}
