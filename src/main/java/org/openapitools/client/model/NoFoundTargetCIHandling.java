/*
 * Landscape omnikeeper REST API
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * The version of the OpenAPI document: v1
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package org.openapitools.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.annotations.SerializedName;

import java.io.IOException;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;

/**
 * Gets or Sets NoFoundTargetCIHandling
 */
@JsonAdapter(NoFoundTargetCIHandling.Adapter.class)
public enum NoFoundTargetCIHandling {
  
  CREATENEW("CreateNew"),
  
  CREATENEWANDWARN("CreateNewAndWarn"),
  
  DROP("Drop");

  private String value;

  NoFoundTargetCIHandling(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static NoFoundTargetCIHandling fromValue(String value) {
    for (NoFoundTargetCIHandling b : NoFoundTargetCIHandling.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<NoFoundTargetCIHandling> {
    @Override
    public void write(final JsonWriter jsonWriter, final NoFoundTargetCIHandling enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public NoFoundTargetCIHandling read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return NoFoundTargetCIHandling.fromValue(value);
    }
  }
}
