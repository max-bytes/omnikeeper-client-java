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
import org.openapitools.client.model.GenericInboundCI;
import org.openapitools.client.model.GenericInboundRelation;

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
 * GenericInboundData
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-09-16T12:19:48.409013Z[Etc/UTC]")
public class GenericInboundData {
  public static final String SERIALIZED_NAME_CIS = "cis";
  @SerializedName(SERIALIZED_NAME_CIS)
  private List<GenericInboundCI> cis = null;

  public static final String SERIALIZED_NAME_RELATIONS = "relations";
  @SerializedName(SERIALIZED_NAME_RELATIONS)
  private List<GenericInboundRelation> relations = null;

  public GenericInboundData() {
  }

  public GenericInboundData cis(List<GenericInboundCI> cis) {
    
    this.cis = cis;
    return this;
  }

  public GenericInboundData addCisItem(GenericInboundCI cisItem) {
    if (this.cis == null) {
      this.cis = new ArrayList<>();
    }
    this.cis.add(cisItem);
    return this;
  }

   /**
   * Get cis
   * @return cis
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<GenericInboundCI> getCis() {
    return cis;
  }


  public void setCis(List<GenericInboundCI> cis) {
    this.cis = cis;
  }


  public GenericInboundData relations(List<GenericInboundRelation> relations) {
    
    this.relations = relations;
    return this;
  }

  public GenericInboundData addRelationsItem(GenericInboundRelation relationsItem) {
    if (this.relations == null) {
      this.relations = new ArrayList<>();
    }
    this.relations.add(relationsItem);
    return this;
  }

   /**
   * Get relations
   * @return relations
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<GenericInboundRelation> getRelations() {
    return relations;
  }


  public void setRelations(List<GenericInboundRelation> relations) {
    this.relations = relations;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GenericInboundData genericInboundData = (GenericInboundData) o;
    return Objects.equals(this.cis, genericInboundData.cis) &&
        Objects.equals(this.relations, genericInboundData.relations);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cis, relations);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GenericInboundData {\n");
    sb.append("    cis: ").append(toIndentedString(cis)).append("\n");
    sb.append("    relations: ").append(toIndentedString(relations)).append("\n");
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
    openapiFields.add("cis");
    openapiFields.add("relations");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to GenericInboundData
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (GenericInboundData.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in GenericInboundData is not found in the empty JSON string", GenericInboundData.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!GenericInboundData.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `GenericInboundData` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      JsonArray jsonArraycis = jsonObj.getAsJsonArray("cis");
      if (jsonArraycis != null) {
        // ensure the json data is an array
        if (!jsonObj.get("cis").isJsonArray()) {
          throw new IllegalArgumentException(String.format("Expected the field `cis` to be an array in the JSON string but got `%s`", jsonObj.get("cis").toString()));
        }

        // validate the optional field `cis` (array)
        for (int i = 0; i < jsonArraycis.size(); i++) {
          GenericInboundCI.validateJsonObject(jsonArraycis.get(i).getAsJsonObject());
        };
      }
      JsonArray jsonArrayrelations = jsonObj.getAsJsonArray("relations");
      if (jsonArrayrelations != null) {
        // ensure the json data is an array
        if (!jsonObj.get("relations").isJsonArray()) {
          throw new IllegalArgumentException(String.format("Expected the field `relations` to be an array in the JSON string but got `%s`", jsonObj.get("relations").toString()));
        }

        // validate the optional field `relations` (array)
        for (int i = 0; i < jsonArrayrelations.size(); i++) {
          GenericInboundRelation.validateJsonObject(jsonArrayrelations.get(i).getAsJsonObject());
        };
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!GenericInboundData.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'GenericInboundData' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<GenericInboundData> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(GenericInboundData.class));

       return (TypeAdapter<T>) new TypeAdapter<GenericInboundData>() {
           @Override
           public void write(JsonWriter out, GenericInboundData value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public GenericInboundData read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of GenericInboundData given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of GenericInboundData
  * @throws IOException if the JSON string is invalid with respect to GenericInboundData
  */
  public static GenericInboundData fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, GenericInboundData.class);
  }

 /**
  * Convert an instance of GenericInboundData to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

