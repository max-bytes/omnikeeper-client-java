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
import org.openapitools.client.model.InboundIDMethodByAttribute;
import org.openapitools.client.model.InboundIDMethodByByUnion;
import org.openapitools.client.model.InboundIDMethodByData;
import org.openapitools.client.model.InboundIDMethodByIntersect;
import org.openapitools.client.model.InboundIDMethodByRelatedTempID;
import org.openapitools.client.model.InboundIDMethodByTemporaryCIID;

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
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import org.openapitools.client.JSON;

/**
 * AbstractInboundIDMethod
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-10-28T07:20:49.620546Z[Etc/UTC]")
public class AbstractInboundIDMethod {
  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  protected String type;

  public AbstractInboundIDMethod() {
    this.type = this.getClass().getSimpleName();
  }

  public AbstractInboundIDMethod type(String type) {
    
    this.type = type;
    return this;
  }

   /**
   * Get type
   * @return type
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public String getType() {
    return type;
  }


  public void setType(String type) {
    this.type = type;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AbstractInboundIDMethod abstractInboundIDMethod = (AbstractInboundIDMethod) o;
    return Objects.equals(this.type, abstractInboundIDMethod.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AbstractInboundIDMethod {\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("type");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to AbstractInboundIDMethod
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!AbstractInboundIDMethod.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in AbstractInboundIDMethod is not found in the empty JSON string", AbstractInboundIDMethod.openapiRequiredFields.toString()));
        }
      }

      String discriminatorValue = jsonObj.get("type").getAsString();
      switch (discriminatorValue) {
        case "InboundIDMethodByAttribute":
          InboundIDMethodByAttribute.validateJsonObject(jsonObj);
          break;
        case "InboundIDMethodByByUnion":
          InboundIDMethodByByUnion.validateJsonObject(jsonObj);
          break;
        case "InboundIDMethodByData":
          InboundIDMethodByData.validateJsonObject(jsonObj);
          break;
        case "InboundIDMethodByIntersect":
          InboundIDMethodByIntersect.validateJsonObject(jsonObj);
          break;
        case "InboundIDMethodByRelatedTempID":
          InboundIDMethodByRelatedTempID.validateJsonObject(jsonObj);
          break;
        case "InboundIDMethodByTemporaryCIID":
          InboundIDMethodByTemporaryCIID.validateJsonObject(jsonObj);
          break;
        case "OKPluginGenericJSONIngest.InboundIDMethodByAttribute, OKPluginGenericJSONIngest":
          InboundIDMethodByAttribute.validateJsonObject(jsonObj);
          break;
        case "OKPluginGenericJSONIngest.InboundIDMethodByByUnion, OKPluginGenericJSONIngest":
          InboundIDMethodByByUnion.validateJsonObject(jsonObj);
          break;
        case "OKPluginGenericJSONIngest.InboundIDMethodByData, OKPluginGenericJSONIngest":
          InboundIDMethodByData.validateJsonObject(jsonObj);
          break;
        case "OKPluginGenericJSONIngest.InboundIDMethodByIntersect, OKPluginGenericJSONIngest":
          InboundIDMethodByIntersect.validateJsonObject(jsonObj);
          break;
        case "OKPluginGenericJSONIngest.InboundIDMethodByRelatedTempID, OKPluginGenericJSONIngest":
          InboundIDMethodByRelatedTempID.validateJsonObject(jsonObj);
          break;
        case "OKPluginGenericJSONIngest.InboundIDMethodByTemporaryCIID, OKPluginGenericJSONIngest":
          InboundIDMethodByTemporaryCIID.validateJsonObject(jsonObj);
          break;
        default: 
          throw new IllegalArgumentException(String.format("The value of the `type` field `%s` does not match any key defined in the discriminator's mapping.", discriminatorValue));
      }
  }


 /**
  * Create an instance of AbstractInboundIDMethod given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of AbstractInboundIDMethod
  * @throws IOException if the JSON string is invalid with respect to AbstractInboundIDMethod
  */
  public static AbstractInboundIDMethod fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AbstractInboundIDMethod.class);
  }

 /**
  * Convert an instance of AbstractInboundIDMethod to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

