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
import org.openapitools.client.model.ODataEntitySetInfo;
import org.openapitools.client.model.ODataFunctionImportInfo;
import org.openapitools.client.model.ODataSingletonInfo;
import org.openapitools.client.model.ODataTypeAnnotation;
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
 * ODataServiceDocument
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-08-03T13:09:11.748387Z[Etc/UTC]")
public class ODataServiceDocument {
  public static final String SERIALIZED_NAME_TYPE_ANNOTATION = "typeAnnotation";
  @SerializedName(SERIALIZED_NAME_TYPE_ANNOTATION)
  private ODataTypeAnnotation typeAnnotation;

  public static final String SERIALIZED_NAME_ENTITY_SETS = "entitySets";
  @SerializedName(SERIALIZED_NAME_ENTITY_SETS)
  private List<ODataEntitySetInfo> entitySets = null;

  public static final String SERIALIZED_NAME_SINGLETONS = "singletons";
  @SerializedName(SERIALIZED_NAME_SINGLETONS)
  private List<ODataSingletonInfo> singletons = null;

  public static final String SERIALIZED_NAME_FUNCTION_IMPORTS = "functionImports";
  @SerializedName(SERIALIZED_NAME_FUNCTION_IMPORTS)
  private List<ODataFunctionImportInfo> functionImports = null;

  public ODataServiceDocument() {
  }

  public ODataServiceDocument typeAnnotation(ODataTypeAnnotation typeAnnotation) {
    
    this.typeAnnotation = typeAnnotation;
    return this;
  }

   /**
   * Get typeAnnotation
   * @return typeAnnotation
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public ODataTypeAnnotation getTypeAnnotation() {
    return typeAnnotation;
  }


  public void setTypeAnnotation(ODataTypeAnnotation typeAnnotation) {
    this.typeAnnotation = typeAnnotation;
  }


  public ODataServiceDocument entitySets(List<ODataEntitySetInfo> entitySets) {
    
    this.entitySets = entitySets;
    return this;
  }

  public ODataServiceDocument addEntitySetsItem(ODataEntitySetInfo entitySetsItem) {
    if (this.entitySets == null) {
      this.entitySets = new ArrayList<>();
    }
    this.entitySets.add(entitySetsItem);
    return this;
  }

   /**
   * Get entitySets
   * @return entitySets
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<ODataEntitySetInfo> getEntitySets() {
    return entitySets;
  }


  public void setEntitySets(List<ODataEntitySetInfo> entitySets) {
    this.entitySets = entitySets;
  }


  public ODataServiceDocument singletons(List<ODataSingletonInfo> singletons) {
    
    this.singletons = singletons;
    return this;
  }

  public ODataServiceDocument addSingletonsItem(ODataSingletonInfo singletonsItem) {
    if (this.singletons == null) {
      this.singletons = new ArrayList<>();
    }
    this.singletons.add(singletonsItem);
    return this;
  }

   /**
   * Get singletons
   * @return singletons
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<ODataSingletonInfo> getSingletons() {
    return singletons;
  }


  public void setSingletons(List<ODataSingletonInfo> singletons) {
    this.singletons = singletons;
  }


  public ODataServiceDocument functionImports(List<ODataFunctionImportInfo> functionImports) {
    
    this.functionImports = functionImports;
    return this;
  }

  public ODataServiceDocument addFunctionImportsItem(ODataFunctionImportInfo functionImportsItem) {
    if (this.functionImports == null) {
      this.functionImports = new ArrayList<>();
    }
    this.functionImports.add(functionImportsItem);
    return this;
  }

   /**
   * Get functionImports
   * @return functionImports
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<ODataFunctionImportInfo> getFunctionImports() {
    return functionImports;
  }


  public void setFunctionImports(List<ODataFunctionImportInfo> functionImports) {
    this.functionImports = functionImports;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ODataServiceDocument odataServiceDocument = (ODataServiceDocument) o;
    return Objects.equals(this.typeAnnotation, odataServiceDocument.typeAnnotation) &&
        Objects.equals(this.entitySets, odataServiceDocument.entitySets) &&
        Objects.equals(this.singletons, odataServiceDocument.singletons) &&
        Objects.equals(this.functionImports, odataServiceDocument.functionImports);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(typeAnnotation, entitySets, singletons, functionImports);
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
    sb.append("class ODataServiceDocument {\n");
    sb.append("    typeAnnotation: ").append(toIndentedString(typeAnnotation)).append("\n");
    sb.append("    entitySets: ").append(toIndentedString(entitySets)).append("\n");
    sb.append("    singletons: ").append(toIndentedString(singletons)).append("\n");
    sb.append("    functionImports: ").append(toIndentedString(functionImports)).append("\n");
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
    openapiFields.add("typeAnnotation");
    openapiFields.add("entitySets");
    openapiFields.add("singletons");
    openapiFields.add("functionImports");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to ODataServiceDocument
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (ODataServiceDocument.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in ODataServiceDocument is not found in the empty JSON string", ODataServiceDocument.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!ODataServiceDocument.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ODataServiceDocument` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      // validate the optional field `typeAnnotation`
      if (jsonObj.get("typeAnnotation") != null && !jsonObj.get("typeAnnotation").isJsonNull()) {
        ODataTypeAnnotation.validateJsonObject(jsonObj.getAsJsonObject("typeAnnotation"));
      }
      JsonArray jsonArrayentitySets = jsonObj.getAsJsonArray("entitySets");
      if (jsonArrayentitySets != null) {
        // ensure the json data is an array
        if (!jsonObj.get("entitySets").isJsonArray()) {
          throw new IllegalArgumentException(String.format("Expected the field `entitySets` to be an array in the JSON string but got `%s`", jsonObj.get("entitySets").toString()));
        }

        // validate the optional field `entitySets` (array)
        for (int i = 0; i < jsonArrayentitySets.size(); i++) {
          ODataEntitySetInfo.validateJsonObject(jsonArrayentitySets.get(i).getAsJsonObject());
        };
      }
      JsonArray jsonArraysingletons = jsonObj.getAsJsonArray("singletons");
      if (jsonArraysingletons != null) {
        // ensure the json data is an array
        if (!jsonObj.get("singletons").isJsonArray()) {
          throw new IllegalArgumentException(String.format("Expected the field `singletons` to be an array in the JSON string but got `%s`", jsonObj.get("singletons").toString()));
        }

        // validate the optional field `singletons` (array)
        for (int i = 0; i < jsonArraysingletons.size(); i++) {
          ODataSingletonInfo.validateJsonObject(jsonArraysingletons.get(i).getAsJsonObject());
        };
      }
      JsonArray jsonArrayfunctionImports = jsonObj.getAsJsonArray("functionImports");
      if (jsonArrayfunctionImports != null) {
        // ensure the json data is an array
        if (!jsonObj.get("functionImports").isJsonArray()) {
          throw new IllegalArgumentException(String.format("Expected the field `functionImports` to be an array in the JSON string but got `%s`", jsonObj.get("functionImports").toString()));
        }

        // validate the optional field `functionImports` (array)
        for (int i = 0; i < jsonArrayfunctionImports.size(); i++) {
          ODataFunctionImportInfo.validateJsonObject(jsonArrayfunctionImports.get(i).getAsJsonObject());
        };
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ODataServiceDocument.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ODataServiceDocument' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ODataServiceDocument> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ODataServiceDocument.class));

       return (TypeAdapter<T>) new TypeAdapter<ODataServiceDocument>() {
           @Override
           public void write(JsonWriter out, ODataServiceDocument value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ODataServiceDocument read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ODataServiceDocument given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ODataServiceDocument
  * @throws IOException if the JSON string is invalid with respect to ODataServiceDocument
  */
  public static ODataServiceDocument fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ODataServiceDocument.class);
  }

 /**
  * Convert an instance of ODataServiceDocument to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
