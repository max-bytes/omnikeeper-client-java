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
import org.openapitools.client.model.AbstractInboundIDMethod;

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
 * InboundIDMethodByTemporaryCIID
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-05-23T10:57:32.968333211Z[Etc/UTC]", comments = "Generator version: 7.7.0-SNAPSHOT")
public class InboundIDMethodByTemporaryCIID extends AbstractInboundIDMethod {
  public static final String SERIALIZED_NAME_TEMP_I_D = "tempID";
  @SerializedName(SERIALIZED_NAME_TEMP_I_D)
  private String tempID;

  public InboundIDMethodByTemporaryCIID() {
    this.type = this.getClass().getSimpleName();
  }

  public InboundIDMethodByTemporaryCIID tempID(String tempID) {
    this.tempID = tempID;
    return this;
  }

   /**
   * Get tempID
   * @return tempID
  **/
  @javax.annotation.Nullable
  public String getTempID() {
    return tempID;
  }

  public void setTempID(String tempID) {
    this.tempID = tempID;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InboundIDMethodByTemporaryCIID inboundIDMethodByTemporaryCIID = (InboundIDMethodByTemporaryCIID) o;
    return Objects.equals(this.tempID, inboundIDMethodByTemporaryCIID.tempID) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(tempID, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InboundIDMethodByTemporaryCIID {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    tempID: ").append(toIndentedString(tempID)).append("\n");
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
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to InboundIDMethodByTemporaryCIID
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!InboundIDMethodByTemporaryCIID.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in InboundIDMethodByTemporaryCIID is not found in the empty JSON string", InboundIDMethodByTemporaryCIID.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!InboundIDMethodByTemporaryCIID.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `InboundIDMethodByTemporaryCIID` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : InboundIDMethodByTemporaryCIID.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!InboundIDMethodByTemporaryCIID.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'InboundIDMethodByTemporaryCIID' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<InboundIDMethodByTemporaryCIID> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(InboundIDMethodByTemporaryCIID.class));

       return (TypeAdapter<T>) new TypeAdapter<InboundIDMethodByTemporaryCIID>() {
           @Override
           public void write(JsonWriter out, InboundIDMethodByTemporaryCIID value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public InboundIDMethodByTemporaryCIID read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of InboundIDMethodByTemporaryCIID given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of InboundIDMethodByTemporaryCIID
  * @throws IOException if the JSON string is invalid with respect to InboundIDMethodByTemporaryCIID
  */
  public static InboundIDMethodByTemporaryCIID fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, InboundIDMethodByTemporaryCIID.class);
  }

 /**
  * Convert an instance of InboundIDMethodByTemporaryCIID to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

