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
import org.openapitools.client.model.RelationState;

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
 * RelationDTO
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-04-08T12:31:58.108596Z[Etc/UTC]")
public class RelationDTO {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private UUID id;

  public static final String SERIALIZED_NAME_FROM_C_I_I_D = "fromCIID";
  @SerializedName(SERIALIZED_NAME_FROM_C_I_I_D)
  private UUID fromCIID;

  public static final String SERIALIZED_NAME_TO_C_I_I_D = "toCIID";
  @SerializedName(SERIALIZED_NAME_TO_C_I_I_D)
  private UUID toCIID;

  public static final String SERIALIZED_NAME_PREDICATE_I_D = "predicateID";
  @SerializedName(SERIALIZED_NAME_PREDICATE_I_D)
  private String predicateID;

  public static final String SERIALIZED_NAME_STATE = "state";
  @SerializedName(SERIALIZED_NAME_STATE)
  private RelationState state;

  public RelationDTO() { 
  }

  public RelationDTO id(UUID id) {
    
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public UUID getId() {
    return id;
  }


  public void setId(UUID id) {
    this.id = id;
  }


  public RelationDTO fromCIID(UUID fromCIID) {
    
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


  public RelationDTO toCIID(UUID toCIID) {
    
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


  public RelationDTO predicateID(String predicateID) {
    
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


  public RelationDTO state(RelationState state) {
    
    this.state = state;
    return this;
  }

   /**
   * Get state
   * @return state
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public RelationState getState() {
    return state;
  }


  public void setState(RelationState state) {
    this.state = state;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RelationDTO relationDTO = (RelationDTO) o;
    return Objects.equals(this.id, relationDTO.id) &&
        Objects.equals(this.fromCIID, relationDTO.fromCIID) &&
        Objects.equals(this.toCIID, relationDTO.toCIID) &&
        Objects.equals(this.predicateID, relationDTO.predicateID) &&
        Objects.equals(this.state, relationDTO.state);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, fromCIID, toCIID, predicateID, state);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RelationDTO {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    fromCIID: ").append(toIndentedString(fromCIID)).append("\n");
    sb.append("    toCIID: ").append(toIndentedString(toCIID)).append("\n");
    sb.append("    predicateID: ").append(toIndentedString(predicateID)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
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
    openapiFields.add("id");
    openapiFields.add("fromCIID");
    openapiFields.add("toCIID");
    openapiFields.add("predicateID");
    openapiFields.add("state");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("id");
    openapiRequiredFields.add("fromCIID");
    openapiRequiredFields.add("toCIID");
    openapiRequiredFields.add("predicateID");
    openapiRequiredFields.add("state");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to RelationDTO
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (RelationDTO.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in RelationDTO is not found in the empty JSON string", RelationDTO.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!RelationDTO.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `RelationDTO` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : RelationDTO.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if (jsonObj.get("id") != null && !jsonObj.get("id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("id").toString()));
      }
      if (jsonObj.get("fromCIID") != null && !jsonObj.get("fromCIID").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `fromCIID` to be a primitive type in the JSON string but got `%s`", jsonObj.get("fromCIID").toString()));
      }
      if (jsonObj.get("toCIID") != null && !jsonObj.get("toCIID").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `toCIID` to be a primitive type in the JSON string but got `%s`", jsonObj.get("toCIID").toString()));
      }
      if (jsonObj.get("predicateID") != null && !jsonObj.get("predicateID").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `predicateID` to be a primitive type in the JSON string but got `%s`", jsonObj.get("predicateID").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!RelationDTO.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'RelationDTO' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<RelationDTO> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(RelationDTO.class));

       return (TypeAdapter<T>) new TypeAdapter<RelationDTO>() {
           @Override
           public void write(JsonWriter out, RelationDTO value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public RelationDTO read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of RelationDTO given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of RelationDTO
  * @throws IOException if the JSON string is invalid with respect to RelationDTO
  */
  public static RelationDTO fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, RelationDTO.class);
  }

 /**
  * Convert an instance of RelationDTO to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

