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
 * AnsibleInventoryScanDTO
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-05-10T21:51:56.217664042Z[Etc/UTC]", comments = "Generator version: 7.6.0-SNAPSHOT")
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
    if (this.setupFacts == null) {
      this.setupFacts = new HashMap<>();
    }
    this.setupFacts.put(key, setupFactsItem);
    return this;
  }

   /**
   * Get setupFacts
   * @return setupFacts
  **/
  @javax.annotation.Nonnull
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
    if (this.yumInstalled == null) {
      this.yumInstalled = new HashMap<>();
    }
    this.yumInstalled.put(key, yumInstalledItem);
    return this;
  }

   /**
   * Get yumInstalled
   * @return yumInstalled
  **/
  @javax.annotation.Nonnull
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
    if (this.yumRepos == null) {
      this.yumRepos = new HashMap<>();
    }
    this.yumRepos.put(key, yumReposItem);
    return this;
  }

   /**
   * Get yumRepos
   * @return yumRepos
  **/
  @javax.annotation.Nonnull
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
    if (this.yumUpdates == null) {
      this.yumUpdates = new HashMap<>();
    }
    this.yumUpdates.put(key, yumUpdatesItem);
    return this;
  }

   /**
   * Get yumUpdates
   * @return yumUpdates
  **/
  @javax.annotation.Nonnull
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
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to AnsibleInventoryScanDTO
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!AnsibleInventoryScanDTO.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in AnsibleInventoryScanDTO is not found in the empty JSON string", AnsibleInventoryScanDTO.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!AnsibleInventoryScanDTO.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `AnsibleInventoryScanDTO` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : AnsibleInventoryScanDTO.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
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
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
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

