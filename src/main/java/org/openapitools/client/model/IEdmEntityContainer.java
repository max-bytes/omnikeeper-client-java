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
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.client.model.EdmSchemaElementKind;
import org.openapitools.client.model.IEdmEntityContainerElement;
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
 * IEdmEntityContainer
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-05-07T14:29:09.050375405Z[Etc/UTC]", comments = "Generator version: 7.6.0-SNAPSHOT")
public class IEdmEntityContainer {
  public static final String SERIALIZED_NAME_ELEMENTS = "elements";
  @SerializedName(SERIALIZED_NAME_ELEMENTS)
  private List<IEdmEntityContainerElement> elements;

  public static final String SERIALIZED_NAME_SCHEMA_ELEMENT_KIND = "schemaElementKind";
  @SerializedName(SERIALIZED_NAME_SCHEMA_ELEMENT_KIND)
  private EdmSchemaElementKind schemaElementKind;

  public static final String SERIALIZED_NAME_NAMESPACE = "namespace";
  @SerializedName(SERIALIZED_NAME_NAMESPACE)
  private String namespace;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public IEdmEntityContainer() {
  }

  public IEdmEntityContainer(
     List<IEdmEntityContainerElement> elements, 
     String namespace, 
     String name
  ) {
    this();
    this.elements = elements;
    this.namespace = namespace;
    this.name = name;
  }

   /**
   * Get elements
   * @return elements
  **/
  @javax.annotation.Nullable
  public List<IEdmEntityContainerElement> getElements() {
    return elements;
  }



  public IEdmEntityContainer schemaElementKind(EdmSchemaElementKind schemaElementKind) {
    this.schemaElementKind = schemaElementKind;
    return this;
  }

   /**
   * Get schemaElementKind
   * @return schemaElementKind
  **/
  @javax.annotation.Nullable
  public EdmSchemaElementKind getSchemaElementKind() {
    return schemaElementKind;
  }

  public void setSchemaElementKind(EdmSchemaElementKind schemaElementKind) {
    this.schemaElementKind = schemaElementKind;
  }


   /**
   * Get namespace
   * @return namespace
  **/
  @javax.annotation.Nullable
  public String getNamespace() {
    return namespace;
  }



   /**
   * Get name
   * @return name
  **/
  @javax.annotation.Nullable
  public String getName() {
    return name;
  }




  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IEdmEntityContainer iedmEntityContainer = (IEdmEntityContainer) o;
    return Objects.equals(this.elements, iedmEntityContainer.elements) &&
        Objects.equals(this.schemaElementKind, iedmEntityContainer.schemaElementKind) &&
        Objects.equals(this.namespace, iedmEntityContainer.namespace) &&
        Objects.equals(this.name, iedmEntityContainer.name);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(elements, schemaElementKind, namespace, name);
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
    sb.append("class IEdmEntityContainer {\n");
    sb.append("    elements: ").append(toIndentedString(elements)).append("\n");
    sb.append("    schemaElementKind: ").append(toIndentedString(schemaElementKind)).append("\n");
    sb.append("    namespace: ").append(toIndentedString(namespace)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
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
    openapiFields.add("elements");
    openapiFields.add("schemaElementKind");
    openapiFields.add("namespace");
    openapiFields.add("name");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to IEdmEntityContainer
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!IEdmEntityContainer.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in IEdmEntityContainer is not found in the empty JSON string", IEdmEntityContainer.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!IEdmEntityContainer.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `IEdmEntityContainer` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (jsonObj.get("elements") != null && !jsonObj.get("elements").isJsonNull()) {
        JsonArray jsonArrayelements = jsonObj.getAsJsonArray("elements");
        if (jsonArrayelements != null) {
          // ensure the json data is an array
          if (!jsonObj.get("elements").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `elements` to be an array in the JSON string but got `%s`", jsonObj.get("elements").toString()));
          }

          // validate the optional field `elements` (array)
          for (int i = 0; i < jsonArrayelements.size(); i++) {
            IEdmEntityContainerElement.validateJsonElement(jsonArrayelements.get(i));
          };
        }
      }
      // validate the optional field `schemaElementKind`
      if (jsonObj.get("schemaElementKind") != null && !jsonObj.get("schemaElementKind").isJsonNull()) {
        EdmSchemaElementKind.validateJsonElement(jsonObj.get("schemaElementKind"));
      }
      if ((jsonObj.get("namespace") != null && !jsonObj.get("namespace").isJsonNull()) && !jsonObj.get("namespace").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `namespace` to be a primitive type in the JSON string but got `%s`", jsonObj.get("namespace").toString()));
      }
      if ((jsonObj.get("name") != null && !jsonObj.get("name").isJsonNull()) && !jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!IEdmEntityContainer.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'IEdmEntityContainer' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<IEdmEntityContainer> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(IEdmEntityContainer.class));

       return (TypeAdapter<T>) new TypeAdapter<IEdmEntityContainer>() {
           @Override
           public void write(JsonWriter out, IEdmEntityContainer value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public IEdmEntityContainer read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of IEdmEntityContainer given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of IEdmEntityContainer
  * @throws IOException if the JSON string is invalid with respect to IEdmEntityContainer
  */
  public static IEdmEntityContainer fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, IEdmEntityContainer.class);
  }

 /**
  * Convert an instance of IEdmEntityContainer to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

