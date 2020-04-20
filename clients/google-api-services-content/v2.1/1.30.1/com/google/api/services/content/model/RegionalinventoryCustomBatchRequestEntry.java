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
 * A batch entry encoding a single non-batch regional inventory request.
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
public final class RegionalinventoryCustomBatchRequestEntry extends com.google.api.client.json.GenericJson {

  /**
   * An entry ID, unique within the batch request.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Long batchId;

  /**
   * The ID of the managing account.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key @com.google.api.client.json.JsonString
  private java.math.BigInteger merchantId;

  /**
   * Method of the batch request entry.
   *
   * Acceptable values are:   - "`insert`"
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String method;

  /**
   * The ID of the product for which to update price and availability.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String productId;

  /**
   * Price and availability of the product.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private RegionalInventory regionalInventory;

  /**
   * An entry ID, unique within the batch request.
   * @return value or {@code null} for none
   */
  public java.lang.Long getBatchId() {
    return batchId;
  }

  /**
   * An entry ID, unique within the batch request.
   * @param batchId batchId or {@code null} for none
   */
  public RegionalinventoryCustomBatchRequestEntry setBatchId(java.lang.Long batchId) {
    this.batchId = batchId;
    return this;
  }

  /**
   * The ID of the managing account.
   * @return value or {@code null} for none
   */
  public java.math.BigInteger getMerchantId() {
    return merchantId;
  }

  /**
   * The ID of the managing account.
   * @param merchantId merchantId or {@code null} for none
   */
  public RegionalinventoryCustomBatchRequestEntry setMerchantId(java.math.BigInteger merchantId) {
    this.merchantId = merchantId;
    return this;
  }

  /**
   * Method of the batch request entry.
   *
   * Acceptable values are:   - "`insert`"
   * @return value or {@code null} for none
   */
  public java.lang.String getMethod() {
    return method;
  }

  /**
   * Method of the batch request entry.
   *
   * Acceptable values are:   - "`insert`"
   * @param method method or {@code null} for none
   */
  public RegionalinventoryCustomBatchRequestEntry setMethod(java.lang.String method) {
    this.method = method;
    return this;
  }

  /**
   * The ID of the product for which to update price and availability.
   * @return value or {@code null} for none
   */
  public java.lang.String getProductId() {
    return productId;
  }

  /**
   * The ID of the product for which to update price and availability.
   * @param productId productId or {@code null} for none
   */
  public RegionalinventoryCustomBatchRequestEntry setProductId(java.lang.String productId) {
    this.productId = productId;
    return this;
  }

  /**
   * Price and availability of the product.
   * @return value or {@code null} for none
   */
  public RegionalInventory getRegionalInventory() {
    return regionalInventory;
  }

  /**
   * Price and availability of the product.
   * @param regionalInventory regionalInventory or {@code null} for none
   */
  public RegionalinventoryCustomBatchRequestEntry setRegionalInventory(RegionalInventory regionalInventory) {
    this.regionalInventory = regionalInventory;
    return this;
  }

  @Override
  public RegionalinventoryCustomBatchRequestEntry set(String fieldName, Object value) {
    return (RegionalinventoryCustomBatchRequestEntry) super.set(fieldName, value);
  }

  @Override
  public RegionalinventoryCustomBatchRequestEntry clone() {
    return (RegionalinventoryCustomBatchRequestEntry) super.clone();
  }

}
