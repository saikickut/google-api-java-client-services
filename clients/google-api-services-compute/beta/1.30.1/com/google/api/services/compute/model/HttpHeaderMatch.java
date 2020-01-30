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
 * matchRule criteria for request header matches.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Compute Engine API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class HttpHeaderMatch extends com.google.api.client.json.GenericJson {

  /**
   * The value should exactly match contents of exactMatch. Only one of exactMatch, prefixMatch,
   * suffixMatch, regexMatch, presentMatch or rangeMatch must be set.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String exactMatch;

  /**
   * The name of the HTTP header to match. For matching against the HTTP request's authority, use a
   * headerMatch with the header name ":authority". For matching a request's method, use the
   * headerName ":method".
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String headerName;

  /**
   * If set to false, the headerMatch is considered a match if the match criteria above are met. If
   * set to true, the headerMatch is considered a match if the match criteria above are NOT met. The
   * default setting is false.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean invertMatch;

  /**
   * The value of the header must start with the contents of prefixMatch. Only one of exactMatch,
   * prefixMatch, suffixMatch, regexMatch, presentMatch or rangeMatch must be set.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String prefixMatch;

  /**
   * A header with the contents of headerName must exist. The match takes place whether or not the
   * request's header has a value. Only one of exactMatch, prefixMatch, suffixMatch, regexMatch,
   * presentMatch or rangeMatch must be set.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean presentMatch;

  /**
   * The header value must be an integer and its value must be in the range specified in rangeMatch.
   * If the header does not contain an integer, number or is empty, the match fails. For example for
   * a range [-5, 0]   - -3 will match.  - 0 will not match.  - 0.25 will not match.  - -3someString
   * will not match.   Only one of exactMatch, prefixMatch, suffixMatch, regexMatch, presentMatch or
   * rangeMatch must be set.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private Int64RangeMatch rangeMatch;

  /**
   * The value of the header must match the regualar expression specified in regexMatch. For regular
   * expression grammar, please see:  en.cppreference.com/w/cpp/regex/ecmascript For matching
   * against a port specified in the HTTP request, use a headerMatch with headerName set to PORT and
   * a regular expression that satisfies the RFC2616 Host header's port specifier. Only one of
   * exactMatch, prefixMatch, suffixMatch, regexMatch, presentMatch or rangeMatch must be set.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String regexMatch;

  /**
   * The value of the header must end with the contents of suffixMatch. Only one of exactMatch,
   * prefixMatch, suffixMatch, regexMatch, presentMatch or rangeMatch must be set.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String suffixMatch;

  /**
   * The value should exactly match contents of exactMatch. Only one of exactMatch, prefixMatch,
   * suffixMatch, regexMatch, presentMatch or rangeMatch must be set.
   * @return value or {@code null} for none
   */
  public java.lang.String getExactMatch() {
    return exactMatch;
  }

  /**
   * The value should exactly match contents of exactMatch. Only one of exactMatch, prefixMatch,
   * suffixMatch, regexMatch, presentMatch or rangeMatch must be set.
   * @param exactMatch exactMatch or {@code null} for none
   */
  public HttpHeaderMatch setExactMatch(java.lang.String exactMatch) {
    this.exactMatch = exactMatch;
    return this;
  }

  /**
   * The name of the HTTP header to match. For matching against the HTTP request's authority, use a
   * headerMatch with the header name ":authority". For matching a request's method, use the
   * headerName ":method".
   * @return value or {@code null} for none
   */
  public java.lang.String getHeaderName() {
    return headerName;
  }

  /**
   * The name of the HTTP header to match. For matching against the HTTP request's authority, use a
   * headerMatch with the header name ":authority". For matching a request's method, use the
   * headerName ":method".
   * @param headerName headerName or {@code null} for none
   */
  public HttpHeaderMatch setHeaderName(java.lang.String headerName) {
    this.headerName = headerName;
    return this;
  }

  /**
   * If set to false, the headerMatch is considered a match if the match criteria above are met. If
   * set to true, the headerMatch is considered a match if the match criteria above are NOT met. The
   * default setting is false.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getInvertMatch() {
    return invertMatch;
  }

  /**
   * If set to false, the headerMatch is considered a match if the match criteria above are met. If
   * set to true, the headerMatch is considered a match if the match criteria above are NOT met. The
   * default setting is false.
   * @param invertMatch invertMatch or {@code null} for none
   */
  public HttpHeaderMatch setInvertMatch(java.lang.Boolean invertMatch) {
    this.invertMatch = invertMatch;
    return this;
  }

  /**
   * The value of the header must start with the contents of prefixMatch. Only one of exactMatch,
   * prefixMatch, suffixMatch, regexMatch, presentMatch or rangeMatch must be set.
   * @return value or {@code null} for none
   */
  public java.lang.String getPrefixMatch() {
    return prefixMatch;
  }

  /**
   * The value of the header must start with the contents of prefixMatch. Only one of exactMatch,
   * prefixMatch, suffixMatch, regexMatch, presentMatch or rangeMatch must be set.
   * @param prefixMatch prefixMatch or {@code null} for none
   */
  public HttpHeaderMatch setPrefixMatch(java.lang.String prefixMatch) {
    this.prefixMatch = prefixMatch;
    return this;
  }

  /**
   * A header with the contents of headerName must exist. The match takes place whether or not the
   * request's header has a value. Only one of exactMatch, prefixMatch, suffixMatch, regexMatch,
   * presentMatch or rangeMatch must be set.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getPresentMatch() {
    return presentMatch;
  }

  /**
   * A header with the contents of headerName must exist. The match takes place whether or not the
   * request's header has a value. Only one of exactMatch, prefixMatch, suffixMatch, regexMatch,
   * presentMatch or rangeMatch must be set.
   * @param presentMatch presentMatch or {@code null} for none
   */
  public HttpHeaderMatch setPresentMatch(java.lang.Boolean presentMatch) {
    this.presentMatch = presentMatch;
    return this;
  }

  /**
   * The header value must be an integer and its value must be in the range specified in rangeMatch.
   * If the header does not contain an integer, number or is empty, the match fails. For example for
   * a range [-5, 0]   - -3 will match.  - 0 will not match.  - 0.25 will not match.  - -3someString
   * will not match.   Only one of exactMatch, prefixMatch, suffixMatch, regexMatch, presentMatch or
   * rangeMatch must be set.
   * @return value or {@code null} for none
   */
  public Int64RangeMatch getRangeMatch() {
    return rangeMatch;
  }

  /**
   * The header value must be an integer and its value must be in the range specified in rangeMatch.
   * If the header does not contain an integer, number or is empty, the match fails. For example for
   * a range [-5, 0]   - -3 will match.  - 0 will not match.  - 0.25 will not match.  - -3someString
   * will not match.   Only one of exactMatch, prefixMatch, suffixMatch, regexMatch, presentMatch or
   * rangeMatch must be set.
   * @param rangeMatch rangeMatch or {@code null} for none
   */
  public HttpHeaderMatch setRangeMatch(Int64RangeMatch rangeMatch) {
    this.rangeMatch = rangeMatch;
    return this;
  }

  /**
   * The value of the header must match the regualar expression specified in regexMatch. For regular
   * expression grammar, please see:  en.cppreference.com/w/cpp/regex/ecmascript For matching
   * against a port specified in the HTTP request, use a headerMatch with headerName set to PORT and
   * a regular expression that satisfies the RFC2616 Host header's port specifier. Only one of
   * exactMatch, prefixMatch, suffixMatch, regexMatch, presentMatch or rangeMatch must be set.
   * @return value or {@code null} for none
   */
  public java.lang.String getRegexMatch() {
    return regexMatch;
  }

  /**
   * The value of the header must match the regualar expression specified in regexMatch. For regular
   * expression grammar, please see:  en.cppreference.com/w/cpp/regex/ecmascript For matching
   * against a port specified in the HTTP request, use a headerMatch with headerName set to PORT and
   * a regular expression that satisfies the RFC2616 Host header's port specifier. Only one of
   * exactMatch, prefixMatch, suffixMatch, regexMatch, presentMatch or rangeMatch must be set.
   * @param regexMatch regexMatch or {@code null} for none
   */
  public HttpHeaderMatch setRegexMatch(java.lang.String regexMatch) {
    this.regexMatch = regexMatch;
    return this;
  }

  /**
   * The value of the header must end with the contents of suffixMatch. Only one of exactMatch,
   * prefixMatch, suffixMatch, regexMatch, presentMatch or rangeMatch must be set.
   * @return value or {@code null} for none
   */
  public java.lang.String getSuffixMatch() {
    return suffixMatch;
  }

  /**
   * The value of the header must end with the contents of suffixMatch. Only one of exactMatch,
   * prefixMatch, suffixMatch, regexMatch, presentMatch or rangeMatch must be set.
   * @param suffixMatch suffixMatch or {@code null} for none
   */
  public HttpHeaderMatch setSuffixMatch(java.lang.String suffixMatch) {
    this.suffixMatch = suffixMatch;
    return this;
  }

  @Override
  public HttpHeaderMatch set(String fieldName, Object value) {
    return (HttpHeaderMatch) super.set(fieldName, value);
  }

  @Override
  public HttpHeaderMatch clone() {
    return (HttpHeaderMatch) super.clone();
  }

}
