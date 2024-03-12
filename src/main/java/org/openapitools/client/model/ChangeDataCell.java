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
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.util.Arrays;
import org.openapitools.client.model.AttributeValueDTO;

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
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;

import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.openapitools.client.JSON;

/**
 * ChangeDataCell
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-03-12T15:04:13.592531303Z[Etc/UTC]", comments = "Generator version: 7.5.0-SNAPSHOT")
public class ChangeDataCell {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_VALUE = "value";
  @SerializedName(SERIALIZED_NAME_VALUE)
  private AttributeValueDTO value;

  public static final String SERIALIZED_NAME_CHANGEABLE = "changeable";
  @SerializedName(SERIALIZED_NAME_CHANGEABLE)
  private Boolean changeable;

  public ChangeDataCell() {
  }

  public ChangeDataCell id(String id) {
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @javax.annotation.Nullable
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }


  public ChangeDataCell value(AttributeValueDTO value) {
    this.value = value;
    return this;
  }

   /**
   * Get value
   * @return value
  **/
  @javax.annotation.Nullable
  public AttributeValueDTO getValue() {
    return value;
  }

  public void setValue(AttributeValueDTO value) {
    this.value = value;
  }


  public ChangeDataCell changeable(Boolean changeable) {
    this.changeable = changeable;
    return this;
  }

   /**
   * Get changeable
   * @return changeable
  **/
  @javax.annotation.Nullable
  public Boolean getChangeable() {
    return changeable;
  }

  public void setChangeable(Boolean changeable) {
    this.changeable = changeable;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ChangeDataCell changeDataCell = (ChangeDataCell) o;
    return Objects.equals(this.id, changeDataCell.id) &&
        Objects.equals(this.value, changeDataCell.value) &&
        Objects.equals(this.changeable, changeDataCell.changeable);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, value, changeable);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ChangeDataCell {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
    sb.append("    changeable: ").append(toIndentedString(changeable)).append("\n");
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
    openapiFields.add("id");
    openapiFields.add("value");
    openapiFields.add("changeable");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to ChangeDataCell
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!ChangeDataCell.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ChangeDataCell is not found in the empty JSON string", ChangeDataCell.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!ChangeDataCell.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ChangeDataCell` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("id") != null && !jsonObj.get("id").isJsonNull()) && !jsonObj.get("id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("id").toString()));
      }
      // validate the optional field `value`
      if (jsonObj.get("value") != null && !jsonObj.get("value").isJsonNull()) {
        AttributeValueDTO.validateJsonElement(jsonObj.get("value"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ChangeDataCell.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ChangeDataCell' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ChangeDataCell> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ChangeDataCell.class));

       return (TypeAdapter<T>) new TypeAdapter<ChangeDataCell>() {
           @Override
           public void write(JsonWriter out, ChangeDataCell value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ChangeDataCell read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ChangeDataCell given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ChangeDataCell
  * @throws IOException if the JSON string is invalid with respect to ChangeDataCell
  */
  public static ChangeDataCell fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ChangeDataCell.class);
  }

 /**
  * Convert an instance of ChangeDataCell to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

