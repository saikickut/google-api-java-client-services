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

package com.google.api.services.doubleclickbidmanager.model;

/**
 * Report status.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the DoubleClick Bid Manager API. For a detailed
 * explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class ReportStatus extends com.google.api.client.json.GenericJson {

  /**
   * If the report failed, this records the cause.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private ReportFailure failure;

  /**
   * The time when this report either completed successfully or failed.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key @com.google.api.client.json.JsonString
  private java.lang.Long finishTimeMs;

  /**
   * The file type of the report.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String format;

  /**
   * The state of the report.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String state;

  /**
   * If the report failed, this records the cause.
   * @return value or {@code null} for none
   */
  public ReportFailure getFailure() {
    return failure;
  }

  /**
   * If the report failed, this records the cause.
   * @param failure failure or {@code null} for none
   */
  public ReportStatus setFailure(ReportFailure failure) {
    this.failure = failure;
    return this;
  }

  /**
   * The time when this report either completed successfully or failed.
   * @return value or {@code null} for none
   */
  public java.lang.Long getFinishTimeMs() {
    return finishTimeMs;
  }

  /**
   * The time when this report either completed successfully or failed.
   * @param finishTimeMs finishTimeMs or {@code null} for none
   */
  public ReportStatus setFinishTimeMs(java.lang.Long finishTimeMs) {
    this.finishTimeMs = finishTimeMs;
    return this;
  }

  /**
   * The file type of the report.
   * @return value or {@code null} for none
   */
  public java.lang.String getFormat() {
    return format;
  }

  /**
   * The file type of the report.
   * @param format format or {@code null} for none
   */
  public ReportStatus setFormat(java.lang.String format) {
    this.format = format;
    return this;
  }

  /**
   * The state of the report.
   * @return value or {@code null} for none
   */
  public java.lang.String getState() {
    return state;
  }

  /**
   * The state of the report.
   * @param state state or {@code null} for none
   */
  public ReportStatus setState(java.lang.String state) {
    this.state = state;
    return this;
  }

  @Override
  public ReportStatus set(String fieldName, Object value) {
    return (ReportStatus) super.set(fieldName, value);
  }

  @Override
  public ReportStatus clone() {
    return (ReportStatus) super.clone();
  }

}
