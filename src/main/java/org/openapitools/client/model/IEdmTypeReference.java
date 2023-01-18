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
import java.io.IOException;
import org.openapitools.client.model.IEdmType;

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
 * IEdmTypeReference
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-01-18T12:44:42.679237Z[Etc/UTC]")
public class IEdmTypeReference {
  public static final String SERIALIZED_NAME_IS_NULLABLE = "isNullable";
  @SerializedName(SERIALIZED_NAME_IS_NULLABLE)
  private Boolean isNullable;

  public static final String SERIALIZED_NAME_DEFINITION = "definition";
  @SerializedName(SERIALIZED_NAME_DEFINITION)
  private IEdmType definition;

  public IEdmTypeReference() {
  }

  
  public IEdmTypeReference(
     Boolean isNullable
  ) {
    this();
    this.isNullable = isNullable;
  }

   /**
   * Get isNullable
   * @return isNullable
  **/
  @javax.annotation.Nullable

  public Boolean getIsNullable() {
    return isNullable;
  }




  public IEdmTypeReference definition(IEdmType definition) {
    
    this.definition = definition;
    return this;
  }

   /**
   * Get definition
   * @return definition
  **/
  @javax.annotation.Nullable

  public IEdmType getDefinition() {
    return definition;
  }


  public void setDefinition(IEdmType definition) {
    this.definition = definition;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IEdmTypeReference iedmTypeReference = (IEdmTypeReference) o;
    return Objects.equals(this.isNullable, iedmTypeReference.isNullable) &&
        Objects.equals(this.definition, iedmTypeReference.definition);
  }

  @Override
  public int hashCode() {
    return Objects.hash(isNullable, definition);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IEdmTypeReference {\n");
    sb.append("    isNullable: ").append(toIndentedString(isNullable)).append("\n");
    sb.append("    definition: ").append(toIndentedString(definition)).append("\n");
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
    openapiFields.add("isNullable");
    openapiFields.add("definition");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to IEdmTypeReference
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!IEdmTypeReference.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in IEdmTypeReference is not found in the empty JSON string", IEdmTypeReference.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!IEdmTypeReference.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `IEdmTypeReference` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      // validate the optional field `definition`
      if (jsonObj.get("definition") != null && !jsonObj.get("definition").isJsonNull()) {
        IEdmType.validateJsonObject(jsonObj.getAsJsonObject("definition"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!IEdmTypeReference.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'IEdmTypeReference' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<IEdmTypeReference> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(IEdmTypeReference.class));

       return (TypeAdapter<T>) new TypeAdapter<IEdmTypeReference>() {
           @Override
           public void write(JsonWriter out, IEdmTypeReference value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public IEdmTypeReference read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of IEdmTypeReference given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of IEdmTypeReference
  * @throws IOException if the JSON string is invalid with respect to IEdmTypeReference
  */
  public static IEdmTypeReference fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, IEdmTypeReference.class);
  }

 /**
  * Convert an instance of IEdmTypeReference to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

