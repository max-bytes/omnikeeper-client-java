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
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.openapitools.client.model.CIAttributeDTO;
import org.openapitools.client.model.RelatedCIDTO;

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
import java.util.HashSet;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import org.openapitools.client.JSON;

/**
 * EffectiveTraitDTO
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-03-09T14:17:35.189207Z[Etc/UTC]")
public class EffectiveTraitDTO {
  public static final String SERIALIZED_NAME_TRAIT_ATTRIBUTES = "traitAttributes";
  @SerializedName(SERIALIZED_NAME_TRAIT_ATTRIBUTES)
  private Map<String, CIAttributeDTO> traitAttributes = new HashMap<>();

  public static final String SERIALIZED_NAME_TRAIT_RELATIONS = "traitRelations";
  @SerializedName(SERIALIZED_NAME_TRAIT_RELATIONS)
  private Map<String, List<RelatedCIDTO>> traitRelations = new HashMap<>();

  public EffectiveTraitDTO() { 
  }

  public EffectiveTraitDTO traitAttributes(Map<String, CIAttributeDTO> traitAttributes) {
    
    this.traitAttributes = traitAttributes;
    return this;
  }

  public EffectiveTraitDTO putTraitAttributesItem(String key, CIAttributeDTO traitAttributesItem) {
    this.traitAttributes.put(key, traitAttributesItem);
    return this;
  }

   /**
   * Get traitAttributes
   * @return traitAttributes
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public Map<String, CIAttributeDTO> getTraitAttributes() {
    return traitAttributes;
  }


  public void setTraitAttributes(Map<String, CIAttributeDTO> traitAttributes) {
    this.traitAttributes = traitAttributes;
  }


  public EffectiveTraitDTO traitRelations(Map<String, List<RelatedCIDTO>> traitRelations) {
    
    this.traitRelations = traitRelations;
    return this;
  }

  public EffectiveTraitDTO putTraitRelationsItem(String key, List<RelatedCIDTO> traitRelationsItem) {
    this.traitRelations.put(key, traitRelationsItem);
    return this;
  }

   /**
   * Get traitRelations
   * @return traitRelations
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public Map<String, List<RelatedCIDTO>> getTraitRelations() {
    return traitRelations;
  }


  public void setTraitRelations(Map<String, List<RelatedCIDTO>> traitRelations) {
    this.traitRelations = traitRelations;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EffectiveTraitDTO effectiveTraitDTO = (EffectiveTraitDTO) o;
    return Objects.equals(this.traitAttributes, effectiveTraitDTO.traitAttributes) &&
        Objects.equals(this.traitRelations, effectiveTraitDTO.traitRelations);
  }

  @Override
  public int hashCode() {
    return Objects.hash(traitAttributes, traitRelations);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EffectiveTraitDTO {\n");
    sb.append("    traitAttributes: ").append(toIndentedString(traitAttributes)).append("\n");
    sb.append("    traitRelations: ").append(toIndentedString(traitRelations)).append("\n");
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
    openapiFields.add("traitAttributes");
    openapiFields.add("traitRelations");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("traitAttributes");
    openapiRequiredFields.add("traitRelations");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to EffectiveTraitDTO
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (EffectiveTraitDTO.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in EffectiveTraitDTO is not found in the empty JSON string", EffectiveTraitDTO.openapiRequiredFields.toString()));
        }
      }
      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!EffectiveTraitDTO.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `EffectiveTraitDTO` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : EffectiveTraitDTO.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!EffectiveTraitDTO.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'EffectiveTraitDTO' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<EffectiveTraitDTO> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(EffectiveTraitDTO.class));

       return (TypeAdapter<T>) new TypeAdapter<EffectiveTraitDTO>() {
           @Override
           public void write(JsonWriter out, EffectiveTraitDTO value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public EffectiveTraitDTO read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of EffectiveTraitDTO given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of EffectiveTraitDTO
  * @throws IOException if the JSON string is invalid with respect to EffectiveTraitDTO
  */
  public static EffectiveTraitDTO fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, EffectiveTraitDTO.class);
  }

 /**
  * Convert an instance of EffectiveTraitDTO to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

