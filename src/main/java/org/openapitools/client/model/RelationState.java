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
 * Gets or Sets RelationState
 */
@JsonAdapter(RelationState.Adapter.class)
public enum RelationState {
  
  NEW("New"),
  
  REMOVED("Removed"),
  
  RENEWED("Renewed");

  private String value;

  RelationState(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static RelationState fromValue(String value) {
    for (RelationState b : RelationState.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<RelationState> {
    @Override
    public void write(final JsonWriter jsonWriter, final RelationState enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public RelationState read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return RelationState.fromValue(value);
    }
  }
}

