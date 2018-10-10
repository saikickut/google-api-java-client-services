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

package com.google.accesscontextmanager.v1beta.model;

/**
 * `BasicLevel` is an `AccessLevel` using a set of recommended features.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Access Context Manager API. For a detailed
 * explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class BasicLevel extends com.google.api.client.json.GenericJson {

  /**
   * How the `conditions` list should be combined to determine if a request is granted this
   * `AccessLevel`. If AND is used, each `Condition` in `conditions` must be satisfied for the
   * `AccessLevel` to be applied. If OR is used, at least one `Condition` in `conditions` must be
   * satisfied for the `AccessLevel` to be applied. Default behavior is AND.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String combiningFunction;

  /**
   * Required. A list of requirements for the `AccessLevel` to be granted.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<Condition> conditions;

  static {
    // hack to force ProGuard to consider Condition used, since otherwise it would be stripped out
    // see https://github.com/google/google-api-java-client/issues/543
    com.google.api.client.util.Data.nullOf(Condition.class);
  }

  /**
   * How the `conditions` list should be combined to determine if a request is granted this
   * `AccessLevel`. If AND is used, each `Condition` in `conditions` must be satisfied for the
   * `AccessLevel` to be applied. If OR is used, at least one `Condition` in `conditions` must be
   * satisfied for the `AccessLevel` to be applied. Default behavior is AND.
   * @return value or {@code null} for none
   */
  public java.lang.String getCombiningFunction() {
    return combiningFunction;
  }

  /**
   * How the `conditions` list should be combined to determine if a request is granted this
   * `AccessLevel`. If AND is used, each `Condition` in `conditions` must be satisfied for the
   * `AccessLevel` to be applied. If OR is used, at least one `Condition` in `conditions` must be
   * satisfied for the `AccessLevel` to be applied. Default behavior is AND.
   * @param combiningFunction combiningFunction or {@code null} for none
   */
  public BasicLevel setCombiningFunction(java.lang.String combiningFunction) {
    this.combiningFunction = combiningFunction;
    return this;
  }

  /**
   * Required. A list of requirements for the `AccessLevel` to be granted.
   * @return value or {@code null} for none
   */
  public java.util.List<Condition> getConditions() {
    return conditions;
  }

  /**
   * Required. A list of requirements for the `AccessLevel` to be granted.
   * @param conditions conditions or {@code null} for none
   */
  public BasicLevel setConditions(java.util.List<Condition> conditions) {
    this.conditions = conditions;
    return this;
  }

  @Override
  public BasicLevel set(String fieldName, Object value) {
    return (BasicLevel) super.set(fieldName, value);
  }

  @Override
  public BasicLevel clone() {
    return (BasicLevel) super.clone();
  }

}
