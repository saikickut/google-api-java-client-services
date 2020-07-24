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

package com.google.api.services.firebaseml.v1beta2.model;

/**
 * Information that is specific to TfLite models.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Firebase ML API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class TfLiteModel extends com.google.api.client.json.GenericJson {

  /**
   * The TfLite file containing the model. (Stored in Google Cloud). The gcs_tflite_uri should have
   * form: gs://some-bucket/some-model.tflite Note: If you update the file in the original location,
   * it is necessary to call UpdateModel for ML to pick up and validate the updated file.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String gcsTfliteUri;

  /**
   * Output only. A boolean indicating that this model was uploaded from the console. Read only
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean managedUpload;

  /**
   * Output only. The size of the TFLite model
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String sizeBytes;

  /**
   * The TfLite file containing the model. (Stored in Google Cloud). The gcs_tflite_uri should have
   * form: gs://some-bucket/some-model.tflite Note: If you update the file in the original location,
   * it is necessary to call UpdateModel for ML to pick up and validate the updated file.
   * @return value or {@code null} for none
   */
  public java.lang.String getGcsTfliteUri() {
    return gcsTfliteUri;
  }

  /**
   * The TfLite file containing the model. (Stored in Google Cloud). The gcs_tflite_uri should have
   * form: gs://some-bucket/some-model.tflite Note: If you update the file in the original location,
   * it is necessary to call UpdateModel for ML to pick up and validate the updated file.
   * @param gcsTfliteUri gcsTfliteUri or {@code null} for none
   */
  public TfLiteModel setGcsTfliteUri(java.lang.String gcsTfliteUri) {
    this.gcsTfliteUri = gcsTfliteUri;
    return this;
  }

  /**
   * Output only. A boolean indicating that this model was uploaded from the console. Read only
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getManagedUpload() {
    return managedUpload;
  }

  /**
   * Output only. A boolean indicating that this model was uploaded from the console. Read only
   * @param managedUpload managedUpload or {@code null} for none
   */
  public TfLiteModel setManagedUpload(java.lang.Boolean managedUpload) {
    this.managedUpload = managedUpload;
    return this;
  }

  /**
   * Output only. The size of the TFLite model
   * @return value or {@code null} for none
   */
  public java.lang.String getSizeBytes() {
    return sizeBytes;
  }

  /**
   * Output only. The size of the TFLite model
   * @param sizeBytes sizeBytes or {@code null} for none
   */
  public TfLiteModel setSizeBytes(java.lang.String sizeBytes) {
    this.sizeBytes = sizeBytes;
    return this;
  }

  @Override
  public TfLiteModel set(String fieldName, Object value) {
    return (TfLiteModel) super.set(fieldName, value);
  }

  @Override
  public TfLiteModel clone() {
    return (TfLiteModel) super.clone();
  }

}
