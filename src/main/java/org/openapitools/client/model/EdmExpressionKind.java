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
import com.google.gson.annotations.SerializedName;

import java.io.IOException;
import com.google.gson.TypeAdapter;
import com.google.gson.JsonElement;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;

/**
 * Gets or Sets EdmExpressionKind
 */
@JsonAdapter(EdmExpressionKind.Adapter.class)
public enum EdmExpressionKind {
  
  NONE("None"),
  
  BINARY_CONSTANT("BinaryConstant"),
  
  BOOLEAN_CONSTANT("BooleanConstant"),
  
  DATE_TIME_OFFSET_CONSTANT("DateTimeOffsetConstant"),
  
  DECIMAL_CONSTANT("DecimalConstant"),
  
  FLOATING_CONSTANT("FloatingConstant"),
  
  GUID_CONSTANT("GuidConstant"),
  
  INTEGER_CONSTANT("IntegerConstant"),
  
  STRING_CONSTANT("StringConstant"),
  
  DURATION_CONSTANT("DurationConstant"),
  
  NULL("Null"),
  
  RECORD("Record"),
  
  COLLECTION("Collection"),
  
  PATH("Path"),
  
  IF("If"),
  
  CAST("Cast"),
  
  IS_TYPE("IsType"),
  
  FUNCTION_APPLICATION("FunctionApplication"),
  
  LABELED_EXPRESSION_REFERENCE("LabeledExpressionReference"),
  
  LABELED("Labeled"),
  
  PROPERTY_PATH("PropertyPath"),
  
  NAVIGATION_PROPERTY_PATH("NavigationPropertyPath"),
  
  DATE_CONSTANT("DateConstant"),
  
  TIME_OF_DAY_CONSTANT("TimeOfDayConstant"),
  
  ENUM_MEMBER("EnumMember"),
  
  ANNOTATION_PATH("AnnotationPath");

  private String value;

  EdmExpressionKind(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static EdmExpressionKind fromValue(String value) {
    for (EdmExpressionKind b : EdmExpressionKind.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<EdmExpressionKind> {
    @Override
    public void write(final JsonWriter jsonWriter, final EdmExpressionKind enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public EdmExpressionKind read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return EdmExpressionKind.fromValue(value);
    }
  }

  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
    String value = jsonElement.getAsString();
    EdmExpressionKind.fromValue(value);
  }
}

