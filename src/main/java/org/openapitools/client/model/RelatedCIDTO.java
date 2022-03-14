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
import java.util.UUID;

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
 * RelatedCIDTO
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-03-14T12:28:12.430259Z[Etc/UTC]")
public class RelatedCIDTO {
  public static final String SERIALIZED_NAME_FROM_C_I_I_D = "fromCIID";
  @SerializedName(SERIALIZED_NAME_FROM_C_I_I_D)
  private UUID fromCIID;

  public static final String SERIALIZED_NAME_TO_C_I_I_D = "toCIID";
  @SerializedName(SERIALIZED_NAME_TO_C_I_I_D)
  private UUID toCIID;

  public static final String SERIALIZED_NAME_PREDICATE_I_D = "predicateID";
  @SerializedName(SERIALIZED_NAME_PREDICATE_I_D)
  private String predicateID;

  public RelatedCIDTO() { 
  }

  public RelatedCIDTO fromCIID(UUID fromCIID) {
    
    this.fromCIID = fromCIID;
    return this;
  }

   /**
   * Get fromCIID
   * @return fromCIID
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public UUID getFromCIID() {
    return fromCIID;
  }


  public void setFromCIID(UUID fromCIID) {
    this.fromCIID = fromCIID;
  }


  public RelatedCIDTO toCIID(UUID toCIID) {
    
    this.toCIID = toCIID;
    return this;
  }

   /**
   * Get toCIID
   * @return toCIID
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public UUID getToCIID() {
    return toCIID;
  }


  public void setToCIID(UUID toCIID) {
    this.toCIID = toCIID;
  }


  public RelatedCIDTO predicateID(String predicateID) {
    
    this.predicateID = predicateID;
    return this;
  }

   /**
   * Get predicateID
   * @return predicateID
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

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
    RelatedCIDTO relatedCIDTO = (RelatedCIDTO) o;
    return Objects.equals(this.fromCIID, relatedCIDTO.fromCIID) &&
        Objects.equals(this.toCIID, relatedCIDTO.toCIID) &&
        Objects.equals(this.predicateID, relatedCIDTO.predicateID);
  }

  @Override
  public int hashCode() {
    return Objects.hash(fromCIID, toCIID, predicateID);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RelatedCIDTO {\n");
    sb.append("    fromCIID: ").append(toIndentedString(fromCIID)).append("\n");
    sb.append("    toCIID: ").append(toIndentedString(toCIID)).append("\n");
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
    openapiFields.add("fromCIID");
    openapiFields.add("toCIID");
    openapiFields.add("predicateID");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("fromCIID");
    openapiRequiredFields.add("toCIID");
    openapiRequiredFields.add("predicateID");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to RelatedCIDTO
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (RelatedCIDTO.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in RelatedCIDTO is not found in the empty JSON string", RelatedCIDTO.openapiRequiredFields.toString()));
        }
      }
      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!RelatedCIDTO.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `RelatedCIDTO` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : RelatedCIDTO.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!RelatedCIDTO.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'RelatedCIDTO' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<RelatedCIDTO> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(RelatedCIDTO.class));

       return (TypeAdapter<T>) new TypeAdapter<RelatedCIDTO>() {
           @Override
           public void write(JsonWriter out, RelatedCIDTO value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public RelatedCIDTO read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of RelatedCIDTO given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of RelatedCIDTO
  * @throws IOException if the JSON string is invalid with respect to RelatedCIDTO
  */
  public static RelatedCIDTO fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, RelatedCIDTO.class);
  }

 /**
  * Convert an instance of RelatedCIDTO to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

