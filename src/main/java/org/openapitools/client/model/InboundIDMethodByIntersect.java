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
import org.openapitools.client.model.AbstractInboundIDMethod;
import org.openapitools.client.model.InboundIDMethodByAttribute;
import org.openapitools.client.model.InboundIDMethodByByUnion;
import org.openapitools.client.model.InboundIDMethodByData;
import org.openapitools.client.model.InboundIDMethodByIntersect;
import org.openapitools.client.model.InboundIDMethodByRelatedTempID;
import org.openapitools.client.model.InboundIDMethodByTemporaryCIID;
import org.openapitools.client.model.OneOfInboundIDMethodByDataInboundIDMethodByAttributeModifiersInboundIDMethodByAttributeInboundIDMethodByRelatedTempIDInboundIDMethodByTemporaryCIIDInboundIDMethodByByUnionInboundIDMethodByIntersect;

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
 * InboundIDMethodByIntersect
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-09-06T18:06:20.181754Z[Etc/UTC]")
public class InboundIDMethodByIntersect extends AbstractInboundIDMethod {
  public static final String SERIALIZED_NAME_INNER = "inner";
  @SerializedName(SERIALIZED_NAME_INNER)
  private List<OneOfInboundIDMethodByDataInboundIDMethodByAttributeModifiersInboundIDMethodByAttributeInboundIDMethodByRelatedTempIDInboundIDMethodByTemporaryCIIDInboundIDMethodByByUnionInboundIDMethodByIntersect> inner = null;

  public InboundIDMethodByIntersect() {
    this.type = this.getClass().getSimpleName();
  }

  public InboundIDMethodByIntersect inner(List<OneOfInboundIDMethodByDataInboundIDMethodByAttributeModifiersInboundIDMethodByAttributeInboundIDMethodByRelatedTempIDInboundIDMethodByTemporaryCIIDInboundIDMethodByByUnionInboundIDMethodByIntersect> inner) {
    
    this.inner = inner;
    return this;
  }

  public InboundIDMethodByIntersect addInnerItem(OneOfInboundIDMethodByDataInboundIDMethodByAttributeModifiersInboundIDMethodByAttributeInboundIDMethodByRelatedTempIDInboundIDMethodByTemporaryCIIDInboundIDMethodByByUnionInboundIDMethodByIntersect innerItem) {
    if (this.inner == null) {
      this.inner = new ArrayList<>();
    }
    this.inner.add(innerItem);
    return this;
  }

   /**
   * Get inner
   * @return inner
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<OneOfInboundIDMethodByDataInboundIDMethodByAttributeModifiersInboundIDMethodByAttributeInboundIDMethodByRelatedTempIDInboundIDMethodByTemporaryCIIDInboundIDMethodByByUnionInboundIDMethodByIntersect> getInner() {
    return inner;
  }


  public void setInner(List<OneOfInboundIDMethodByDataInboundIDMethodByAttributeModifiersInboundIDMethodByAttributeInboundIDMethodByRelatedTempIDInboundIDMethodByTemporaryCIIDInboundIDMethodByByUnionInboundIDMethodByIntersect> inner) {
    this.inner = inner;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InboundIDMethodByIntersect inboundIDMethodByIntersect = (InboundIDMethodByIntersect) o;
    return Objects.equals(this.inner, inboundIDMethodByIntersect.inner) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(inner, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InboundIDMethodByIntersect {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    inner: ").append(toIndentedString(inner)).append("\n");
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
  * @throws IOException if the JSON Object is invalid with respect to InboundIDMethodByIntersect
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (InboundIDMethodByIntersect.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in InboundIDMethodByIntersect is not found in the empty JSON string", InboundIDMethodByIntersect.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!InboundIDMethodByIntersect.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `InboundIDMethodByIntersect` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : InboundIDMethodByIntersect.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!InboundIDMethodByIntersect.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'InboundIDMethodByIntersect' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<InboundIDMethodByIntersect> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(InboundIDMethodByIntersect.class));

       return (TypeAdapter<T>) new TypeAdapter<InboundIDMethodByIntersect>() {
           @Override
           public void write(JsonWriter out, InboundIDMethodByIntersect value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public InboundIDMethodByIntersect read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of InboundIDMethodByIntersect given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of InboundIDMethodByIntersect
  * @throws IOException if the JSON string is invalid with respect to InboundIDMethodByIntersect
  */
  public static InboundIDMethodByIntersect fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, InboundIDMethodByIntersect.class);
  }

 /**
  * Convert an instance of InboundIDMethodByIntersect to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

