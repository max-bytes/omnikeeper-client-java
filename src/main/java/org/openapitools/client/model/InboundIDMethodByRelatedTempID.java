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
import org.openapitools.client.model.AbstractInboundIDMethod;
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
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import org.openapitools.client.JSON;

/**
 * InboundIDMethodByRelatedTempID
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-09-07T06:18:08.328444Z[Etc/UTC]")
public class InboundIDMethodByRelatedTempID extends AbstractInboundIDMethod {
  public static final String SERIALIZED_NAME_TEMP_I_D = "tempID";
  @SerializedName(SERIALIZED_NAME_TEMP_I_D)
  private String tempID;

  public static final String SERIALIZED_NAME_OUTGOING_RELATION = "outgoingRelation";
  @SerializedName(SERIALIZED_NAME_OUTGOING_RELATION)
  private Boolean outgoingRelation;

  public static final String SERIALIZED_NAME_PREDICATE_I_D = "predicateID";
  @SerializedName(SERIALIZED_NAME_PREDICATE_I_D)
  private String predicateID;

  public InboundIDMethodByRelatedTempID() {
    this.type = this.getClass().getSimpleName();
  }

  public InboundIDMethodByRelatedTempID tempID(String tempID) {
    
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


  public InboundIDMethodByRelatedTempID outgoingRelation(Boolean outgoingRelation) {
    
    this.outgoingRelation = outgoingRelation;
    return this;
  }

   /**
   * Get outgoingRelation
   * @return outgoingRelation
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getOutgoingRelation() {
    return outgoingRelation;
  }


  public void setOutgoingRelation(Boolean outgoingRelation) {
    this.outgoingRelation = outgoingRelation;
  }


  public InboundIDMethodByRelatedTempID predicateID(String predicateID) {
    
    this.predicateID = predicateID;
    return this;
  }

   /**
   * Get predicateID
   * @return predicateID
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getPredicateID() {
    return predicateID;
  }


  public void setPredicateID(String predicateID) {
    this.predicateID = predicateID;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InboundIDMethodByRelatedTempID inboundIDMethodByRelatedTempID = (InboundIDMethodByRelatedTempID) o;
    return Objects.equals(this.tempID, inboundIDMethodByRelatedTempID.tempID) &&
        Objects.equals(this.outgoingRelation, inboundIDMethodByRelatedTempID.outgoingRelation) &&
        Objects.equals(this.predicateID, inboundIDMethodByRelatedTempID.predicateID) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(tempID, outgoingRelation, predicateID, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InboundIDMethodByRelatedTempID {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    tempID: ").append(toIndentedString(tempID)).append("\n");
    sb.append("    outgoingRelation: ").append(toIndentedString(outgoingRelation)).append("\n");
    sb.append("    predicateID: ").append(toIndentedString(predicateID)).append("\n");
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
  * @throws IOException if the JSON Object is invalid with respect to InboundIDMethodByRelatedTempID
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (InboundIDMethodByRelatedTempID.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in InboundIDMethodByRelatedTempID is not found in the empty JSON string", InboundIDMethodByRelatedTempID.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!InboundIDMethodByRelatedTempID.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `InboundIDMethodByRelatedTempID` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : InboundIDMethodByRelatedTempID.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!InboundIDMethodByRelatedTempID.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'InboundIDMethodByRelatedTempID' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<InboundIDMethodByRelatedTempID> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(InboundIDMethodByRelatedTempID.class));

       return (TypeAdapter<T>) new TypeAdapter<InboundIDMethodByRelatedTempID>() {
           @Override
           public void write(JsonWriter out, InboundIDMethodByRelatedTempID value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public InboundIDMethodByRelatedTempID read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of InboundIDMethodByRelatedTempID given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of InboundIDMethodByRelatedTempID
  * @throws IOException if the JSON string is invalid with respect to InboundIDMethodByRelatedTempID
  */
  public static InboundIDMethodByRelatedTempID fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, InboundIDMethodByRelatedTempID.class);
  }

 /**
  * Convert an instance of InboundIDMethodByRelatedTempID to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

