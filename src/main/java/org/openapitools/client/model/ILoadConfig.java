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
import org.openapitools.jackson.nullable.JsonNullable;

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
 * ILoadConfig
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-04-08T12:28:34.279768Z[Etc/UTC]")
public class ILoadConfig {
  public static final String SERIALIZED_NAME_SEARCH_LAYER_I_DS = "searchLayerIDs";
  @SerializedName(SERIALIZED_NAME_SEARCH_LAYER_I_DS)
  private List<String> searchLayerIDs = null;

  public static final String SERIALIZED_NAME_WRITE_LAYER_I_D = "writeLayerID";
  @SerializedName(SERIALIZED_NAME_WRITE_LAYER_I_D)
  private String writeLayerID;

  public ILoadConfig() { 
  }

  
  public ILoadConfig(
     List<String> searchLayerIDs, 
     String writeLayerID
  ) {
    this();
    this.searchLayerIDs = searchLayerIDs;
    this.writeLayerID = writeLayerID;
  }

   /**
   * Get searchLayerIDs
   * @return searchLayerIDs
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<String> getSearchLayerIDs() {
    return searchLayerIDs;
  }




   /**
   * Get writeLayerID
   * @return writeLayerID
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getWriteLayerID() {
    return writeLayerID;
  }





  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ILoadConfig iloadConfig = (ILoadConfig) o;
    return Objects.equals(this.searchLayerIDs, iloadConfig.searchLayerIDs) &&
        Objects.equals(this.writeLayerID, iloadConfig.writeLayerID);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(searchLayerIDs, writeLayerID);
  }

  private static <T> int hashCodeNullable(JsonNullable<T> a) {
    if (a == null) {
      return 1;
    }
    return a.isPresent() ? Arrays.deepHashCode(new Object[]{a.get()}) : 31;
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ILoadConfig {\n");
    sb.append("    searchLayerIDs: ").append(toIndentedString(searchLayerIDs)).append("\n");
    sb.append("    writeLayerID: ").append(toIndentedString(writeLayerID)).append("\n");
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
    openapiFields.add("searchLayerIDs");
    openapiFields.add("writeLayerID");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to ILoadConfig
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (ILoadConfig.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in ILoadConfig is not found in the empty JSON string", ILoadConfig.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!ILoadConfig.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ILoadConfig` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      // ensure the json data is an array
      if (jsonObj.get("searchLayerIDs") != null && !jsonObj.get("searchLayerIDs").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `searchLayerIDs` to be an array in the JSON string but got `%s`", jsonObj.get("searchLayerIDs").toString()));
      }
      if (jsonObj.get("writeLayerID") != null && !jsonObj.get("writeLayerID").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `writeLayerID` to be a primitive type in the JSON string but got `%s`", jsonObj.get("writeLayerID").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ILoadConfig.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ILoadConfig' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ILoadConfig> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ILoadConfig.class));

       return (TypeAdapter<T>) new TypeAdapter<ILoadConfig>() {
           @Override
           public void write(JsonWriter out, ILoadConfig value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ILoadConfig read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ILoadConfig given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ILoadConfig
  * @throws IOException if the JSON string is invalid with respect to ILoadConfig
  */
  public static ILoadConfig fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ILoadConfig.class);
  }

 /**
  * Convert an instance of ILoadConfig to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

