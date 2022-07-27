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
import org.openapitools.client.model.GenericInboundAttribute;
import org.openapitools.client.model.InboundIDMethodByAttributeModifiers;
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
 * InboundIDMethodByAttribute
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-07-27T12:23:40.249491Z[Etc/UTC]")
public class InboundIDMethodByAttribute {
  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  private String type;

  public static final String SERIALIZED_NAME_ATTRIBUTE = "attribute";
  @SerializedName(SERIALIZED_NAME_ATTRIBUTE)
  private GenericInboundAttribute attribute;

  public static final String SERIALIZED_NAME_MODIFIERS = "modifiers";
  @SerializedName(SERIALIZED_NAME_MODIFIERS)
  private InboundIDMethodByAttributeModifiers modifiers;

  public InboundIDMethodByAttribute() {
  }

  
  public InboundIDMethodByAttribute(
     String type
  ) {
    this();
    this.type = type;
  }

   /**
   * Get type
   * @return type
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getType() {
    return type;
  }




  public InboundIDMethodByAttribute attribute(GenericInboundAttribute attribute) {
    
    this.attribute = attribute;
    return this;
  }

   /**
   * Get attribute
   * @return attribute
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public GenericInboundAttribute getAttribute() {
    return attribute;
  }


  public void setAttribute(GenericInboundAttribute attribute) {
    this.attribute = attribute;
  }


  public InboundIDMethodByAttribute modifiers(InboundIDMethodByAttributeModifiers modifiers) {
    
    this.modifiers = modifiers;
    return this;
  }

   /**
   * Get modifiers
   * @return modifiers
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public InboundIDMethodByAttributeModifiers getModifiers() {
    return modifiers;
  }


  public void setModifiers(InboundIDMethodByAttributeModifiers modifiers) {
    this.modifiers = modifiers;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InboundIDMethodByAttribute inboundIDMethodByAttribute = (InboundIDMethodByAttribute) o;
    return Objects.equals(this.type, inboundIDMethodByAttribute.type) &&
        Objects.equals(this.attribute, inboundIDMethodByAttribute.attribute) &&
        Objects.equals(this.modifiers, inboundIDMethodByAttribute.modifiers);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, attribute, modifiers);
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
    sb.append("class InboundIDMethodByAttribute {\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    attribute: ").append(toIndentedString(attribute)).append("\n");
    sb.append("    modifiers: ").append(toIndentedString(modifiers)).append("\n");
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
    openapiFields.add("attribute");
    openapiFields.add("modifiers");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to InboundIDMethodByAttribute
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (InboundIDMethodByAttribute.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in InboundIDMethodByAttribute is not found in the empty JSON string", InboundIDMethodByAttribute.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!InboundIDMethodByAttribute.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `InboundIDMethodByAttribute` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if ((jsonObj.get("type") != null && !jsonObj.get("type").isJsonNull()) && !jsonObj.get("type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("type").toString()));
      }
      // validate the optional field `attribute`
      if (jsonObj.get("attribute") != null && !jsonObj.get("attribute").isJsonNull()) {
        GenericInboundAttribute.validateJsonObject(jsonObj.getAsJsonObject("attribute"));
      }
      // validate the optional field `modifiers`
      if (jsonObj.get("modifiers") != null && !jsonObj.get("modifiers").isJsonNull()) {
        InboundIDMethodByAttributeModifiers.validateJsonObject(jsonObj.getAsJsonObject("modifiers"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!InboundIDMethodByAttribute.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'InboundIDMethodByAttribute' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<InboundIDMethodByAttribute> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(InboundIDMethodByAttribute.class));

       return (TypeAdapter<T>) new TypeAdapter<InboundIDMethodByAttribute>() {
           @Override
           public void write(JsonWriter out, InboundIDMethodByAttribute value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public InboundIDMethodByAttribute read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of InboundIDMethodByAttribute given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of InboundIDMethodByAttribute
  * @throws IOException if the JSON string is invalid with respect to InboundIDMethodByAttribute
  */
  public static InboundIDMethodByAttribute fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, InboundIDMethodByAttribute.class);
  }

 /**
  * Convert an instance of InboundIDMethodByAttribute to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

