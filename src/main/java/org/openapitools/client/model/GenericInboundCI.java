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
import java.util.ArrayList;
import java.util.List;
import org.openapitools.client.model.GenericInboundAttribute;
import org.openapitools.client.model.GenericInboundCIIdMethod;
import org.openapitools.client.model.NoFoundTargetCIHandling;
import org.openapitools.client.model.SameTargetCIHandling;
import org.openapitools.client.model.SameTempIDHandling;

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
 * GenericInboundCI
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-09-06T17:45:54.297310Z[Etc/UTC]")
public class GenericInboundCI {
  public static final String SERIALIZED_NAME_TEMP_I_D = "tempID";
  @SerializedName(SERIALIZED_NAME_TEMP_I_D)
  private String tempID;

  public static final String SERIALIZED_NAME_ID_METHOD = "idMethod";
  @SerializedName(SERIALIZED_NAME_ID_METHOD)
  private GenericInboundCIIdMethod idMethod;

  public static final String SERIALIZED_NAME_SAME_TEMP_I_D_HANDLING = "sameTempIDHandling";
  @SerializedName(SERIALIZED_NAME_SAME_TEMP_I_D_HANDLING)
  private SameTempIDHandling sameTempIDHandling;

  public static final String SERIALIZED_NAME_SAME_TARGET_C_I_HANDLING = "sameTargetCIHandling";
  @SerializedName(SERIALIZED_NAME_SAME_TARGET_C_I_HANDLING)
  private SameTargetCIHandling sameTargetCIHandling;

  public static final String SERIALIZED_NAME_NO_FOUND_TARGET_C_I_HANDLING = "noFoundTargetCIHandling";
  @SerializedName(SERIALIZED_NAME_NO_FOUND_TARGET_C_I_HANDLING)
  private NoFoundTargetCIHandling noFoundTargetCIHandling;

  public static final String SERIALIZED_NAME_ATTRIBUTES = "attributes";
  @SerializedName(SERIALIZED_NAME_ATTRIBUTES)
  private List<GenericInboundAttribute> attributes = null;

  public GenericInboundCI() {
  }

  public GenericInboundCI tempID(String tempID) {
    
    this.tempID = tempID;
    return this;
  }

   /**
   * Get tempID
   * @return tempID
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getTempID() {
    return tempID;
  }


  public void setTempID(String tempID) {
    this.tempID = tempID;
  }


  public GenericInboundCI idMethod(GenericInboundCIIdMethod idMethod) {
    
    this.idMethod = idMethod;
    return this;
  }

   /**
   * Get idMethod
   * @return idMethod
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public GenericInboundCIIdMethod getIdMethod() {
    return idMethod;
  }


  public void setIdMethod(GenericInboundCIIdMethod idMethod) {
    this.idMethod = idMethod;
  }


  public GenericInboundCI sameTempIDHandling(SameTempIDHandling sameTempIDHandling) {
    
    this.sameTempIDHandling = sameTempIDHandling;
    return this;
  }

   /**
   * Get sameTempIDHandling
   * @return sameTempIDHandling
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public SameTempIDHandling getSameTempIDHandling() {
    return sameTempIDHandling;
  }


  public void setSameTempIDHandling(SameTempIDHandling sameTempIDHandling) {
    this.sameTempIDHandling = sameTempIDHandling;
  }


  public GenericInboundCI sameTargetCIHandling(SameTargetCIHandling sameTargetCIHandling) {
    
    this.sameTargetCIHandling = sameTargetCIHandling;
    return this;
  }

   /**
   * Get sameTargetCIHandling
   * @return sameTargetCIHandling
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public SameTargetCIHandling getSameTargetCIHandling() {
    return sameTargetCIHandling;
  }


  public void setSameTargetCIHandling(SameTargetCIHandling sameTargetCIHandling) {
    this.sameTargetCIHandling = sameTargetCIHandling;
  }


  public GenericInboundCI noFoundTargetCIHandling(NoFoundTargetCIHandling noFoundTargetCIHandling) {
    
    this.noFoundTargetCIHandling = noFoundTargetCIHandling;
    return this;
  }

   /**
   * Get noFoundTargetCIHandling
   * @return noFoundTargetCIHandling
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public NoFoundTargetCIHandling getNoFoundTargetCIHandling() {
    return noFoundTargetCIHandling;
  }


  public void setNoFoundTargetCIHandling(NoFoundTargetCIHandling noFoundTargetCIHandling) {
    this.noFoundTargetCIHandling = noFoundTargetCIHandling;
  }


  public GenericInboundCI attributes(List<GenericInboundAttribute> attributes) {
    
    this.attributes = attributes;
    return this;
  }

  public GenericInboundCI addAttributesItem(GenericInboundAttribute attributesItem) {
    if (this.attributes == null) {
      this.attributes = new ArrayList<>();
    }
    this.attributes.add(attributesItem);
    return this;
  }

   /**
   * Get attributes
   * @return attributes
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<GenericInboundAttribute> getAttributes() {
    return attributes;
  }


  public void setAttributes(List<GenericInboundAttribute> attributes) {
    this.attributes = attributes;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GenericInboundCI genericInboundCI = (GenericInboundCI) o;
    return Objects.equals(this.tempID, genericInboundCI.tempID) &&
        Objects.equals(this.idMethod, genericInboundCI.idMethod) &&
        Objects.equals(this.sameTempIDHandling, genericInboundCI.sameTempIDHandling) &&
        Objects.equals(this.sameTargetCIHandling, genericInboundCI.sameTargetCIHandling) &&
        Objects.equals(this.noFoundTargetCIHandling, genericInboundCI.noFoundTargetCIHandling) &&
        Objects.equals(this.attributes, genericInboundCI.attributes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(tempID, idMethod, sameTempIDHandling, sameTargetCIHandling, noFoundTargetCIHandling, attributes);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GenericInboundCI {\n");
    sb.append("    tempID: ").append(toIndentedString(tempID)).append("\n");
    sb.append("    idMethod: ").append(toIndentedString(idMethod)).append("\n");
    sb.append("    sameTempIDHandling: ").append(toIndentedString(sameTempIDHandling)).append("\n");
    sb.append("    sameTargetCIHandling: ").append(toIndentedString(sameTargetCIHandling)).append("\n");
    sb.append("    noFoundTargetCIHandling: ").append(toIndentedString(noFoundTargetCIHandling)).append("\n");
    sb.append("    attributes: ").append(toIndentedString(attributes)).append("\n");
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
    openapiFields.add("tempID");
    openapiFields.add("idMethod");
    openapiFields.add("sameTempIDHandling");
    openapiFields.add("sameTargetCIHandling");
    openapiFields.add("noFoundTargetCIHandling");
    openapiFields.add("attributes");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to GenericInboundCI
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (GenericInboundCI.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in GenericInboundCI is not found in the empty JSON string", GenericInboundCI.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!GenericInboundCI.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `GenericInboundCI` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if ((jsonObj.get("tempID") != null && !jsonObj.get("tempID").isJsonNull()) && !jsonObj.get("tempID").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `tempID` to be a primitive type in the JSON string but got `%s`", jsonObj.get("tempID").toString()));
      }
      // validate the optional field `idMethod`
      if (jsonObj.get("idMethod") != null && !jsonObj.get("idMethod").isJsonNull()) {
        GenericInboundCIIdMethod.validateJsonObject(jsonObj.getAsJsonObject("idMethod"));
      }
      JsonArray jsonArrayattributes = jsonObj.getAsJsonArray("attributes");
      if (jsonArrayattributes != null) {
        // ensure the json data is an array
        if (!jsonObj.get("attributes").isJsonArray()) {
          throw new IllegalArgumentException(String.format("Expected the field `attributes` to be an array in the JSON string but got `%s`", jsonObj.get("attributes").toString()));
        }

        // validate the optional field `attributes` (array)
        for (int i = 0; i < jsonArrayattributes.size(); i++) {
          GenericInboundAttribute.validateJsonObject(jsonArrayattributes.get(i).getAsJsonObject());
        };
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!GenericInboundCI.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'GenericInboundCI' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<GenericInboundCI> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(GenericInboundCI.class));

       return (TypeAdapter<T>) new TypeAdapter<GenericInboundCI>() {
           @Override
           public void write(JsonWriter out, GenericInboundCI value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public GenericInboundCI read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of GenericInboundCI given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of GenericInboundCI
  * @throws IOException if the JSON string is invalid with respect to GenericInboundCI
  */
  public static GenericInboundCI fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, GenericInboundCI.class);
  }

 /**
  * Convert an instance of GenericInboundCI to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

