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
import org.openapitools.client.model.FragmentDTO;

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
 * BulkCIAttributeLayerScopeDTO
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-05-20T10:46:20.765444Z[Etc/UTC]")
public class BulkCIAttributeLayerScopeDTO {
  public static final String SERIALIZED_NAME_NAME_PREFIX = "namePrefix";
  @SerializedName(SERIALIZED_NAME_NAME_PREFIX)
  private String namePrefix;

  public static final String SERIALIZED_NAME_LAYER_I_D = "layerID";
  @SerializedName(SERIALIZED_NAME_LAYER_I_D)
  private String layerID;

  public static final String SERIALIZED_NAME_FRAGMENTS = "fragments";
  @SerializedName(SERIALIZED_NAME_FRAGMENTS)
  private List<FragmentDTO> fragments = new ArrayList<>();

  public BulkCIAttributeLayerScopeDTO() { 
  }

  public BulkCIAttributeLayerScopeDTO namePrefix(String namePrefix) {
    
    this.namePrefix = namePrefix;
    return this;
  }

   /**
   * Get namePrefix
   * @return namePrefix
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public String getNamePrefix() {
    return namePrefix;
  }


  public void setNamePrefix(String namePrefix) {
    this.namePrefix = namePrefix;
  }


  public BulkCIAttributeLayerScopeDTO layerID(String layerID) {
    
    this.layerID = layerID;
    return this;
  }

   /**
   * Get layerID
   * @return layerID
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public String getLayerID() {
    return layerID;
  }


  public void setLayerID(String layerID) {
    this.layerID = layerID;
  }


  public BulkCIAttributeLayerScopeDTO fragments(List<FragmentDTO> fragments) {
    
    this.fragments = fragments;
    return this;
  }

  public BulkCIAttributeLayerScopeDTO addFragmentsItem(FragmentDTO fragmentsItem) {
    this.fragments.add(fragmentsItem);
    return this;
  }

   /**
   * Get fragments
   * @return fragments
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public List<FragmentDTO> getFragments() {
    return fragments;
  }


  public void setFragments(List<FragmentDTO> fragments) {
    this.fragments = fragments;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BulkCIAttributeLayerScopeDTO bulkCIAttributeLayerScopeDTO = (BulkCIAttributeLayerScopeDTO) o;
    return Objects.equals(this.namePrefix, bulkCIAttributeLayerScopeDTO.namePrefix) &&
        Objects.equals(this.layerID, bulkCIAttributeLayerScopeDTO.layerID) &&
        Objects.equals(this.fragments, bulkCIAttributeLayerScopeDTO.fragments);
  }

  @Override
  public int hashCode() {
    return Objects.hash(namePrefix, layerID, fragments);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BulkCIAttributeLayerScopeDTO {\n");
    sb.append("    namePrefix: ").append(toIndentedString(namePrefix)).append("\n");
    sb.append("    layerID: ").append(toIndentedString(layerID)).append("\n");
    sb.append("    fragments: ").append(toIndentedString(fragments)).append("\n");
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
    openapiFields.add("namePrefix");
    openapiFields.add("layerID");
    openapiFields.add("fragments");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("namePrefix");
    openapiRequiredFields.add("layerID");
    openapiRequiredFields.add("fragments");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to BulkCIAttributeLayerScopeDTO
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (BulkCIAttributeLayerScopeDTO.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in BulkCIAttributeLayerScopeDTO is not found in the empty JSON string", BulkCIAttributeLayerScopeDTO.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!BulkCIAttributeLayerScopeDTO.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `BulkCIAttributeLayerScopeDTO` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : BulkCIAttributeLayerScopeDTO.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if (jsonObj.get("namePrefix") != null && !jsonObj.get("namePrefix").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `namePrefix` to be a primitive type in the JSON string but got `%s`", jsonObj.get("namePrefix").toString()));
      }
      if (jsonObj.get("layerID") != null && !jsonObj.get("layerID").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `layerID` to be a primitive type in the JSON string but got `%s`", jsonObj.get("layerID").toString()));
      }
      JsonArray jsonArrayfragments = jsonObj.getAsJsonArray("fragments");
      if (jsonArrayfragments != null) {
        // ensure the json data is an array
        if (!jsonObj.get("fragments").isJsonArray()) {
          throw new IllegalArgumentException(String.format("Expected the field `fragments` to be an array in the JSON string but got `%s`", jsonObj.get("fragments").toString()));
        }

        // validate the optional field `fragments` (array)
        for (int i = 0; i < jsonArrayfragments.size(); i++) {
          FragmentDTO.validateJsonObject(jsonArrayfragments.get(i).getAsJsonObject());
        };
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!BulkCIAttributeLayerScopeDTO.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'BulkCIAttributeLayerScopeDTO' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<BulkCIAttributeLayerScopeDTO> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(BulkCIAttributeLayerScopeDTO.class));

       return (TypeAdapter<T>) new TypeAdapter<BulkCIAttributeLayerScopeDTO>() {
           @Override
           public void write(JsonWriter out, BulkCIAttributeLayerScopeDTO value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public BulkCIAttributeLayerScopeDTO read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of BulkCIAttributeLayerScopeDTO given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of BulkCIAttributeLayerScopeDTO
  * @throws IOException if the JSON string is invalid with respect to BulkCIAttributeLayerScopeDTO
  */
  public static BulkCIAttributeLayerScopeDTO fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, BulkCIAttributeLayerScopeDTO.class);
  }

 /**
  * Convert an instance of BulkCIAttributeLayerScopeDTO to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

