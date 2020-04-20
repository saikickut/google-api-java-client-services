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
 * Model definition for LiaInventorySettings.
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
public final class LiaInventorySettings extends com.google.api.client.json.GenericJson {

  /**
   * The email of the contact for the inventory verification process.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String inventoryVerificationContactEmail;

  /**
   * The name of the contact for the inventory verification process.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String inventoryVerificationContactName;

  /**
   * The status of the verification contact.
   *
   * Acceptable values are:   - "`active`"  - "`inactive`"  - "`pending`"
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String inventoryVerificationContactStatus;

  /**
   * The status of the inventory verification process.
   *
   * Acceptable values are:   - "`active`"  - "`inactive`"  - "`pending`"
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String status;

  /**
   * The email of the contact for the inventory verification process.
   * @return value or {@code null} for none
   */
  public java.lang.String getInventoryVerificationContactEmail() {
    return inventoryVerificationContactEmail;
  }

  /**
   * The email of the contact for the inventory verification process.
   * @param inventoryVerificationContactEmail inventoryVerificationContactEmail or {@code null} for none
   */
  public LiaInventorySettings setInventoryVerificationContactEmail(java.lang.String inventoryVerificationContactEmail) {
    this.inventoryVerificationContactEmail = inventoryVerificationContactEmail;
    return this;
  }

  /**
   * The name of the contact for the inventory verification process.
   * @return value or {@code null} for none
   */
  public java.lang.String getInventoryVerificationContactName() {
    return inventoryVerificationContactName;
  }

  /**
   * The name of the contact for the inventory verification process.
   * @param inventoryVerificationContactName inventoryVerificationContactName or {@code null} for none
   */
  public LiaInventorySettings setInventoryVerificationContactName(java.lang.String inventoryVerificationContactName) {
    this.inventoryVerificationContactName = inventoryVerificationContactName;
    return this;
  }

  /**
   * The status of the verification contact.
   *
   * Acceptable values are:   - "`active`"  - "`inactive`"  - "`pending`"
   * @return value or {@code null} for none
   */
  public java.lang.String getInventoryVerificationContactStatus() {
    return inventoryVerificationContactStatus;
  }

  /**
   * The status of the verification contact.
   *
   * Acceptable values are:   - "`active`"  - "`inactive`"  - "`pending`"
   * @param inventoryVerificationContactStatus inventoryVerificationContactStatus or {@code null} for none
   */
  public LiaInventorySettings setInventoryVerificationContactStatus(java.lang.String inventoryVerificationContactStatus) {
    this.inventoryVerificationContactStatus = inventoryVerificationContactStatus;
    return this;
  }

  /**
   * The status of the inventory verification process.
   *
   * Acceptable values are:   - "`active`"  - "`inactive`"  - "`pending`"
   * @return value or {@code null} for none
   */
  public java.lang.String getStatus() {
    return status;
  }

  /**
   * The status of the inventory verification process.
   *
   * Acceptable values are:   - "`active`"  - "`inactive`"  - "`pending`"
   * @param status status or {@code null} for none
   */
  public LiaInventorySettings setStatus(java.lang.String status) {
    this.status = status;
    return this;
  }

  @Override
  public LiaInventorySettings set(String fieldName, Object value) {
    return (LiaInventorySettings) super.set(fieldName, value);
  }

  @Override
  public LiaInventorySettings clone() {
    return (LiaInventorySettings) super.clone();
  }

}
