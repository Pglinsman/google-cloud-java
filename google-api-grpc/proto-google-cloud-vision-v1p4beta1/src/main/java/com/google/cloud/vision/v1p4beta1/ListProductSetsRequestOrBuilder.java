// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/vision/v1p4beta1/product_search_service.proto

package com.google.cloud.vision.v1p4beta1;

public interface ListProductSetsRequestOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.vision.v1p4beta1.ListProductSetsRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * The project from which ProductSets should be listed.
   * Format is `projects/PROJECT_ID/locations/LOC_ID`.
   * </pre>
   *
   * <code>string parent = 1;</code>
   */
  java.lang.String getParent();
  /**
   *
   *
   * <pre>
   * The project from which ProductSets should be listed.
   * Format is `projects/PROJECT_ID/locations/LOC_ID`.
   * </pre>
   *
   * <code>string parent = 1;</code>
   */
  com.google.protobuf.ByteString getParentBytes();

  /**
   *
   *
   * <pre>
   * The maximum number of items to return. Default 10, maximum 100.
   * </pre>
   *
   * <code>int32 page_size = 2;</code>
   */
  int getPageSize();

  /**
   *
   *
   * <pre>
   * The next_page_token returned from a previous List request, if any.
   * </pre>
   *
   * <code>string page_token = 3;</code>
   */
  java.lang.String getPageToken();
  /**
   *
   *
   * <pre>
   * The next_page_token returned from a previous List request, if any.
   * </pre>
   *
   * <code>string page_token = 3;</code>
   */
  com.google.protobuf.ByteString getPageTokenBytes();
}
