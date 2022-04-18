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
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import org.openapitools.client.model.AttributeValueType;
import org.openapitools.jackson.nullable.JsonNullable;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.reflect.TypeToken;

import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import org.openapitools.client.JSON;

/**
 * GridViewColumn
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-04-18T10:48:45.661788Z[Etc/UTC]")
public class GridViewColumn {
  public static final String SERIALIZED_NAME_SOURCE_ATTRIBUTE_NAME = "sourceAttributeName";
  @SerializedName(SERIALIZED_NAME_SOURCE_ATTRIBUTE_NAME)
  private String sourceAttributeName;

  public static final String SERIALIZED_NAME_COLUMN_DESCRIPTION = "columnDescription";
  @SerializedName(SERIALIZED_NAME_COLUMN_DESCRIPTION)
  private String columnDescription;

  public static final String SERIALIZED_NAME_VALUE_TYPE = "valueType";
  @SerializedName(SERIALIZED_NAME_VALUE_TYPE)
  private AttributeValueType valueType;

  public static final String SERIALIZED_NAME_WRITE_LAYER = "writeLayer";
  @SerializedName(SERIALIZED_NAME_WRITE_LAYER)
  private String writeLayer;

  public GridViewColumn() { 
  }

  public GridViewColumn sourceAttributeName(String sourceAttributeName) {
    
    this.sourceAttributeName = sourceAttributeName;
    return this;
  }

   /**
   * Get sourceAttributeName
   * @return sourceAttributeName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getSourceAttributeName() {
    return sourceAttributeName;
  }


  public void setSourceAttributeName(String sourceAttributeName) {
    this.sourceAttributeName = sourceAttributeName;
  }


  public GridViewColumn columnDescription(String columnDescription) {
    
    this.columnDescription = columnDescription;
    return this;
  }

   /**
   * Get columnDescription
   * @return columnDescription
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getColumnDescription() {
    return columnDescription;
  }


  public void setColumnDescription(String columnDescription) {
    this.columnDescription = columnDescription;
  }


  public GridViewColumn valueType(AttributeValueType valueType) {
    
    this.valueType = valueType;
    return this;
  }

   /**
   * Get valueType
   * @return valueType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public AttributeValueType getValueType() {
    return valueType;
  }


  public void setValueType(AttributeValueType valueType) {
    this.valueType = valueType;
  }


  public GridViewColumn writeLayer(String writeLayer) {
    
    this.writeLayer = writeLayer;
    return this;
  }

   /**
   * Get writeLayer
   * @return writeLayer
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getWriteLayer() {
    return writeLayer;
  }


  public void setWriteLayer(String writeLayer) {
    this.writeLayer = writeLayer;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GridViewColumn gridViewColumn = (GridViewColumn) o;
    return Objects.equals(this.sourceAttributeName, gridViewColumn.sourceAttributeName) &&
        Objects.equals(this.columnDescription, gridViewColumn.columnDescription) &&
        Objects.equals(this.valueType, gridViewColumn.valueType) &&
        Objects.equals(this.writeLayer, gridViewColumn.writeLayer);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(sourceAttributeName, columnDescription, valueType, writeLayer);
  }

  private static <T> int hashCodeNullable(JsonNullable<T> a) {
    if (a == null) {
      return 1;
    }
    return a.isPresent() ? Arrays.deepHashCode(new Object[]{a.get()}) : 31;
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GridViewColumn {\n");
    sb.append("    sourceAttributeName: ").append(toIndentedString(sourceAttributeName)).append("\n");
    sb.append("    columnDescription: ").append(toIndentedString(columnDescription)).append("\n");
    sb.append("    valueType: ").append(toIndentedString(valueType)).append("\n");
    sb.append("    writeLayer: ").append(toIndentedString(writeLayer)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }


  public static HashSet<String> openapiFields;
  public static HashSet<String> openapiRequiredFields;

  static {
    // a set of all properties/fields (JSON key names)
    openapiFields = new HashSet<String>();
    openapiFields.add("sourceAttributeName");
    openapiFields.add("columnDescription");
    openapiFields.add("valueType");
    openapiFields.add("writeLayer");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to GridViewColumn
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (GridViewColumn.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in GridViewColumn is not found in the empty JSON string", GridViewColumn.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!GridViewColumn.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `GridViewColumn` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if (jsonObj.get("sourceAttributeName") != null && !jsonObj.get("sourceAttributeName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `sourceAttributeName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("sourceAttributeName").toString()));
      }
      if (jsonObj.get("columnDescription") != null && !jsonObj.get("columnDescription").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `columnDescription` to be a primitive type in the JSON string but got `%s`", jsonObj.get("columnDescription").toString()));
      }
      if (jsonObj.get("writeLayer") != null && !jsonObj.get("writeLayer").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `writeLayer` to be a primitive type in the JSON string but got `%s`", jsonObj.get("writeLayer").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!GridViewColumn.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'GridViewColumn' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<GridViewColumn> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(GridViewColumn.class));

       return (TypeAdapter<T>) new TypeAdapter<GridViewColumn>() {
           @Override
           public void write(JsonWriter out, GridViewColumn value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public GridViewColumn read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of GridViewColumn given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of GridViewColumn
  * @throws IOException if the JSON string is invalid with respect to GridViewColumn
  */
  public static GridViewColumn fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, GridViewColumn.class);
  }

 /**
  * Convert an instance of GridViewColumn to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

