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
 * IAttributeValue
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-07-27T12:23:40.249491Z[Etc/UTC]")
public class IAttributeValue {
  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  private AttributeValueType type;

  public static final String SERIALIZED_NAME_IS_ARRAY = "isArray";
  @SerializedName(SERIALIZED_NAME_IS_ARRAY)
  private Boolean isArray;

  public IAttributeValue() {
  }

  
  public IAttributeValue(
     Boolean isArray
  ) {
    this();
    this.isArray = isArray;
  }

  public IAttributeValue type(AttributeValueType type) {
    
    this.type = type;
    return this;
  }

   /**
   * Get type
   * @return type
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public AttributeValueType getType() {
    return type;
  }


  public void setType(AttributeValueType type) {
    this.type = type;
  }


   /**
   * Get isArray
   * @return isArray
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getIsArray() {
    return isArray;
  }





  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IAttributeValue iattributeValue = (IAttributeValue) o;
    return Objects.equals(this.type, iattributeValue.type) &&
        Objects.equals(this.isArray, iattributeValue.isArray);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, isArray);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IAttributeValue {\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    isArray: ").append(toIndentedString(isArray)).append("\n");
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
    openapiFields.add("type");
    openapiFields.add("isArray");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to IAttributeValue
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (IAttributeValue.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in IAttributeValue is not found in the empty JSON string", IAttributeValue.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!IAttributeValue.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `IAttributeValue` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!IAttributeValue.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'IAttributeValue' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<IAttributeValue> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(IAttributeValue.class));

       return (TypeAdapter<T>) new TypeAdapter<IAttributeValue>() {
           @Override
           public void write(JsonWriter out, IAttributeValue value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public IAttributeValue read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of IAttributeValue given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of IAttributeValue
  * @throws IOException if the JSON string is invalid with respect to IAttributeValue
  */
  public static IAttributeValue fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, IAttributeValue.class);
  }

 /**
  * Convert an instance of IAttributeValue to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
