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
import org.openapitools.client.model.IEdmEntityContainer;
import org.openapitools.client.model.IEdmSchemaElement;
import org.openapitools.client.model.IEdmVocabularyAnnotation;
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
 * IEdmModel
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-08-30T16:25:22.650210Z[Etc/UTC]")
public class IEdmModel {
  public static final String SERIALIZED_NAME_SCHEMA_ELEMENTS = "schemaElements";
  @SerializedName(SERIALIZED_NAME_SCHEMA_ELEMENTS)
  private List<IEdmSchemaElement> schemaElements = null;

  public static final String SERIALIZED_NAME_VOCABULARY_ANNOTATIONS = "vocabularyAnnotations";
  @SerializedName(SERIALIZED_NAME_VOCABULARY_ANNOTATIONS)
  private List<IEdmVocabularyAnnotation> vocabularyAnnotations = null;

  public static final String SERIALIZED_NAME_REFERENCED_MODELS = "referencedModels";
  @SerializedName(SERIALIZED_NAME_REFERENCED_MODELS)
  private List<IEdmModel> referencedModels = null;

  public static final String SERIALIZED_NAME_DECLARED_NAMESPACES = "declaredNamespaces";
  @SerializedName(SERIALIZED_NAME_DECLARED_NAMESPACES)
  private List<String> declaredNamespaces = null;

  public static final String SERIALIZED_NAME_DIRECT_VALUE_ANNOTATIONS_MANAGER = "directValueAnnotationsManager";
  @SerializedName(SERIALIZED_NAME_DIRECT_VALUE_ANNOTATIONS_MANAGER)
  private Object directValueAnnotationsManager;

  public static final String SERIALIZED_NAME_ENTITY_CONTAINER = "entityContainer";
  @SerializedName(SERIALIZED_NAME_ENTITY_CONTAINER)
  private IEdmEntityContainer entityContainer;

  public IEdmModel() {
  }

  
  public IEdmModel(
     List<IEdmSchemaElement> schemaElements, 
     List<IEdmVocabularyAnnotation> vocabularyAnnotations, 
     List<IEdmModel> referencedModels, 
     List<String> declaredNamespaces
  ) {
    this();
    this.schemaElements = schemaElements;
    this.vocabularyAnnotations = vocabularyAnnotations;
    this.referencedModels = referencedModels;
    this.declaredNamespaces = declaredNamespaces;
  }

   /**
   * Get schemaElements
   * @return schemaElements
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<IEdmSchemaElement> getSchemaElements() {
    return schemaElements;
  }




   /**
   * Get vocabularyAnnotations
   * @return vocabularyAnnotations
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<IEdmVocabularyAnnotation> getVocabularyAnnotations() {
    return vocabularyAnnotations;
  }




   /**
   * Get referencedModels
   * @return referencedModels
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<IEdmModel> getReferencedModels() {
    return referencedModels;
  }




   /**
   * Get declaredNamespaces
   * @return declaredNamespaces
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<String> getDeclaredNamespaces() {
    return declaredNamespaces;
  }




  public IEdmModel directValueAnnotationsManager(Object directValueAnnotationsManager) {
    
    this.directValueAnnotationsManager = directValueAnnotationsManager;
    return this;
  }

   /**
   * Get directValueAnnotationsManager
   * @return directValueAnnotationsManager
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Object getDirectValueAnnotationsManager() {
    return directValueAnnotationsManager;
  }


  public void setDirectValueAnnotationsManager(Object directValueAnnotationsManager) {
    this.directValueAnnotationsManager = directValueAnnotationsManager;
  }


  public IEdmModel entityContainer(IEdmEntityContainer entityContainer) {
    
    this.entityContainer = entityContainer;
    return this;
  }

   /**
   * Get entityContainer
   * @return entityContainer
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public IEdmEntityContainer getEntityContainer() {
    return entityContainer;
  }


  public void setEntityContainer(IEdmEntityContainer entityContainer) {
    this.entityContainer = entityContainer;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IEdmModel iedmModel = (IEdmModel) o;
    return Objects.equals(this.schemaElements, iedmModel.schemaElements) &&
        Objects.equals(this.vocabularyAnnotations, iedmModel.vocabularyAnnotations) &&
        Objects.equals(this.referencedModels, iedmModel.referencedModels) &&
        Objects.equals(this.declaredNamespaces, iedmModel.declaredNamespaces) &&
        Objects.equals(this.directValueAnnotationsManager, iedmModel.directValueAnnotationsManager) &&
        Objects.equals(this.entityContainer, iedmModel.entityContainer);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(schemaElements, vocabularyAnnotations, referencedModels, declaredNamespaces, directValueAnnotationsManager, entityContainer);
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
    sb.append("class IEdmModel {\n");
    sb.append("    schemaElements: ").append(toIndentedString(schemaElements)).append("\n");
    sb.append("    vocabularyAnnotations: ").append(toIndentedString(vocabularyAnnotations)).append("\n");
    sb.append("    referencedModels: ").append(toIndentedString(referencedModels)).append("\n");
    sb.append("    declaredNamespaces: ").append(toIndentedString(declaredNamespaces)).append("\n");
    sb.append("    directValueAnnotationsManager: ").append(toIndentedString(directValueAnnotationsManager)).append("\n");
    sb.append("    entityContainer: ").append(toIndentedString(entityContainer)).append("\n");
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
    openapiFields.add("schemaElements");
    openapiFields.add("vocabularyAnnotations");
    openapiFields.add("referencedModels");
    openapiFields.add("declaredNamespaces");
    openapiFields.add("directValueAnnotationsManager");
    openapiFields.add("entityContainer");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to IEdmModel
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (IEdmModel.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in IEdmModel is not found in the empty JSON string", IEdmModel.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!IEdmModel.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `IEdmModel` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      JsonArray jsonArrayschemaElements = jsonObj.getAsJsonArray("schemaElements");
      if (jsonArrayschemaElements != null) {
        // ensure the json data is an array
        if (!jsonObj.get("schemaElements").isJsonArray()) {
          throw new IllegalArgumentException(String.format("Expected the field `schemaElements` to be an array in the JSON string but got `%s`", jsonObj.get("schemaElements").toString()));
        }

        // validate the optional field `schemaElements` (array)
        for (int i = 0; i < jsonArrayschemaElements.size(); i++) {
          IEdmSchemaElement.validateJsonObject(jsonArrayschemaElements.get(i).getAsJsonObject());
        };
      }
      JsonArray jsonArrayvocabularyAnnotations = jsonObj.getAsJsonArray("vocabularyAnnotations");
      if (jsonArrayvocabularyAnnotations != null) {
        // ensure the json data is an array
        if (!jsonObj.get("vocabularyAnnotations").isJsonArray()) {
          throw new IllegalArgumentException(String.format("Expected the field `vocabularyAnnotations` to be an array in the JSON string but got `%s`", jsonObj.get("vocabularyAnnotations").toString()));
        }

        // validate the optional field `vocabularyAnnotations` (array)
        for (int i = 0; i < jsonArrayvocabularyAnnotations.size(); i++) {
          IEdmVocabularyAnnotation.validateJsonObject(jsonArrayvocabularyAnnotations.get(i).getAsJsonObject());
        };
      }
      JsonArray jsonArrayreferencedModels = jsonObj.getAsJsonArray("referencedModels");
      if (jsonArrayreferencedModels != null) {
        // ensure the json data is an array
        if (!jsonObj.get("referencedModels").isJsonArray()) {
          throw new IllegalArgumentException(String.format("Expected the field `referencedModels` to be an array in the JSON string but got `%s`", jsonObj.get("referencedModels").toString()));
        }

        // validate the optional field `referencedModels` (array)
        for (int i = 0; i < jsonArrayreferencedModels.size(); i++) {
          IEdmModel.validateJsonObject(jsonArrayreferencedModels.get(i).getAsJsonObject());
        };
      }
      // ensure the json data is an array
      if ((jsonObj.get("declaredNamespaces") != null && !jsonObj.get("declaredNamespaces").isJsonNull()) && !jsonObj.get("declaredNamespaces").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `declaredNamespaces` to be an array in the JSON string but got `%s`", jsonObj.get("declaredNamespaces").toString()));
      }
      // validate the optional field `entityContainer`
      if (jsonObj.get("entityContainer") != null && !jsonObj.get("entityContainer").isJsonNull()) {
        IEdmEntityContainer.validateJsonObject(jsonObj.getAsJsonObject("entityContainer"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!IEdmModel.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'IEdmModel' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<IEdmModel> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(IEdmModel.class));

       return (TypeAdapter<T>) new TypeAdapter<IEdmModel>() {
           @Override
           public void write(JsonWriter out, IEdmModel value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public IEdmModel read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of IEdmModel given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of IEdmModel
  * @throws IOException if the JSON string is invalid with respect to IEdmModel
  */
  public static IEdmModel fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, IEdmModel.class);
  }

 /**
  * Convert an instance of IEdmModel to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

