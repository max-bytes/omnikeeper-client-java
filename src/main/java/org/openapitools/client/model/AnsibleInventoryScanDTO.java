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
import java.util.Map;

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
 * AnsibleInventoryScanDTO
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-09-13T12:49:03.878749Z[Etc/UTC]")
public class AnsibleInventoryScanDTO {
  public static final String SERIALIZED_NAME_SETUP_FACTS = "setupFacts";
  @SerializedName(SERIALIZED_NAME_SETUP_FACTS)
  private Map<String, String> setupFacts = new HashMap<>();

  public static final String SERIALIZED_NAME_YUM_INSTALLED = "yumInstalled";
  @SerializedName(SERIALIZED_NAME_YUM_INSTALLED)
  private Map<String, String> yumInstalled = new HashMap<>();

  public static final String SERIALIZED_NAME_YUM_REPOS = "yumRepos";
  @SerializedName(SERIALIZED_NAME_YUM_REPOS)
  private Map<String, String> yumRepos = new HashMap<>();

  public static final String SERIALIZED_NAME_YUM_UPDATES = "yumUpdates";
  @SerializedName(SERIALIZED_NAME_YUM_UPDATES)
  private Map<String, String> yumUpdates = new HashMap<>();

  public AnsibleInventoryScanDTO() {
  }

  public AnsibleInventoryScanDTO setupFacts(Map<String, String> setupFacts) {
    
    this.setupFacts = setupFacts;
    return this;
  }

  public AnsibleInventoryScanDTO putSetupFactsItem(String key, String setupFactsItem) {
    this.setupFacts.put(key, setupFactsItem);
    return this;
  }

   /**
   * Get setupFacts
   * @return setupFacts
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public Map<String, String> getSetupFacts() {
    return setupFacts;
  }


  public void setSetupFacts(Map<String, String> setupFacts) {
    this.setupFacts = setupFacts;
  }


  public AnsibleInventoryScanDTO yumInstalled(Map<String, String> yumInstalled) {
    
    this.yumInstalled = yumInstalled;
    return this;
  }

  public AnsibleInventoryScanDTO putYumInstalledItem(String key, String yumInstalledItem) {
    this.yumInstalled.put(key, yumInstalledItem);
    return this;
  }

   /**
   * Get yumInstalled
   * @return yumInstalled
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public Map<String, String> getYumInstalled() {
    return yumInstalled;
  }


  public void setYumInstalled(Map<String, String> yumInstalled) {
    this.yumInstalled = yumInstalled;
  }


  public AnsibleInventoryScanDTO yumRepos(Map<String, String> yumRepos) {
    
    this.yumRepos = yumRepos;
    return this;
  }

  public AnsibleInventoryScanDTO putYumReposItem(String key, String yumReposItem) {
    this.yumRepos.put(key, yumReposItem);
    return this;
  }

   /**
   * Get yumRepos
   * @return yumRepos
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public Map<String, String> getYumRepos() {
    return yumRepos;
  }


  public void setYumRepos(Map<String, String> yumRepos) {
    this.yumRepos = yumRepos;
  }


  public AnsibleInventoryScanDTO yumUpdates(Map<String, String> yumUpdates) {
    
    this.yumUpdates = yumUpdates;
    return this;
  }

  public AnsibleInventoryScanDTO putYumUpdatesItem(String key, String yumUpdatesItem) {
    this.yumUpdates.put(key, yumUpdatesItem);
    return this;
  }

   /**
   * Get yumUpdates
   * @return yumUpdates
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public Map<String, String> getYumUpdates() {
    return yumUpdates;
  }


  public void setYumUpdates(Map<String, String> yumUpdates) {
    this.yumUpdates = yumUpdates;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AnsibleInventoryScanDTO ansibleInventoryScanDTO = (AnsibleInventoryScanDTO) o;
    return Objects.equals(this.setupFacts, ansibleInventoryScanDTO.setupFacts) &&
        Objects.equals(this.yumInstalled, ansibleInventoryScanDTO.yumInstalled) &&
        Objects.equals(this.yumRepos, ansibleInventoryScanDTO.yumRepos) &&
        Objects.equals(this.yumUpdates, ansibleInventoryScanDTO.yumUpdates);
  }

  @Override
  public int hashCode() {
    return Objects.hash(setupFacts, yumInstalled, yumRepos, yumUpdates);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AnsibleInventoryScanDTO {\n");
    sb.append("    setupFacts: ").append(toIndentedString(setupFacts)).append("\n");
    sb.append("    yumInstalled: ").append(toIndentedString(yumInstalled)).append("\n");
    sb.append("    yumRepos: ").append(toIndentedString(yumRepos)).append("\n");
    sb.append("    yumUpdates: ").append(toIndentedString(yumUpdates)).append("\n");
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
    openapiFields.add("setupFacts");
    openapiFields.add("yumInstalled");
    openapiFields.add("yumRepos");
    openapiFields.add("yumUpdates");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("setupFacts");
    openapiRequiredFields.add("yumInstalled");
    openapiRequiredFields.add("yumRepos");
    openapiRequiredFields.add("yumUpdates");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to AnsibleInventoryScanDTO
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (AnsibleInventoryScanDTO.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in AnsibleInventoryScanDTO is not found in the empty JSON string", AnsibleInventoryScanDTO.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!AnsibleInventoryScanDTO.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `AnsibleInventoryScanDTO` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : AnsibleInventoryScanDTO.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AnsibleInventoryScanDTO.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AnsibleInventoryScanDTO' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AnsibleInventoryScanDTO> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AnsibleInventoryScanDTO.class));

       return (TypeAdapter<T>) new TypeAdapter<AnsibleInventoryScanDTO>() {
           @Override
           public void write(JsonWriter out, AnsibleInventoryScanDTO value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public AnsibleInventoryScanDTO read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of AnsibleInventoryScanDTO given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of AnsibleInventoryScanDTO
  * @throws IOException if the JSON string is invalid with respect to AnsibleInventoryScanDTO
  */
  public static AnsibleInventoryScanDTO fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AnsibleInventoryScanDTO.class);
  }

 /**
  * Convert an instance of AnsibleInventoryScanDTO to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

