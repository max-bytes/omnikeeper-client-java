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
import org.openapitools.client.model.EdmContainerElementKind;
import org.openapitools.client.model.IEdmEntityContainer;
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
 * IEdmEntityContainerElement
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-09-14T15:18:11.141090Z[Etc/UTC]")
public class IEdmEntityContainerElement {
  public static final String SERIALIZED_NAME_CONTAINER_ELEMENT_KIND = "containerElementKind";
  @SerializedName(SERIALIZED_NAME_CONTAINER_ELEMENT_KIND)
  private EdmContainerElementKind containerElementKind;

  public static final String SERIALIZED_NAME_CONTAINER = "container";
  @SerializedName(SERIALIZED_NAME_CONTAINER)
  private IEdmEntityContainer container;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public IEdmEntityContainerElement() {
  }

  
  public IEdmEntityContainerElement(
     String name
  ) {
    this();
    this.name = name;
  }

  public IEdmEntityContainerElement containerElementKind(EdmContainerElementKind containerElementKind) {
    
    this.containerElementKind = containerElementKind;
    return this;
  }

   /**
   * Get containerElementKind
   * @return containerElementKind
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public EdmContainerElementKind getContainerElementKind() {
    return containerElementKind;
  }


  public void setContainerElementKind(EdmContainerElementKind containerElementKind) {
    this.containerElementKind = containerElementKind;
  }


  public IEdmEntityContainerElement container(IEdmEntityContainer container) {
    
    this.container = container;
    return this;
  }

   /**
   * Get container
   * @return container
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public IEdmEntityContainer getContainer() {
    return container;
  }


  public void setContainer(IEdmEntityContainer container) {
    this.container = container;
  }


   /**
   * Get name
   * @return name
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

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
    IEdmEntityContainerElement iedmEntityContainerElement = (IEdmEntityContainerElement) o;
    return Objects.equals(this.containerElementKind, iedmEntityContainerElement.containerElementKind) &&
        Objects.equals(this.container, iedmEntityContainerElement.container) &&
        Objects.equals(this.name, iedmEntityContainerElement.name);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(containerElementKind, container, name);
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
    sb.append("class IEdmEntityContainerElement {\n");
    sb.append("    containerElementKind: ").append(toIndentedString(containerElementKind)).append("\n");
    sb.append("    container: ").append(toIndentedString(container)).append("\n");
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
    openapiFields.add("containerElementKind");
    openapiFields.add("container");
    openapiFields.add("name");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to IEdmEntityContainerElement
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (IEdmEntityContainerElement.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in IEdmEntityContainerElement is not found in the empty JSON string", IEdmEntityContainerElement.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!IEdmEntityContainerElement.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `IEdmEntityContainerElement` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      // validate the optional field `container`
      if (jsonObj.get("container") != null && !jsonObj.get("container").isJsonNull()) {
        IEdmEntityContainer.validateJsonObject(jsonObj.getAsJsonObject("container"));
      }
      if ((jsonObj.get("name") != null && !jsonObj.get("name").isJsonNull()) && !jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!IEdmEntityContainerElement.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'IEdmEntityContainerElement' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<IEdmEntityContainerElement> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(IEdmEntityContainerElement.class));

       return (TypeAdapter<T>) new TypeAdapter<IEdmEntityContainerElement>() {
           @Override
           public void write(JsonWriter out, IEdmEntityContainerElement value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public IEdmEntityContainerElement read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of IEdmEntityContainerElement given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of IEdmEntityContainerElement
  * @throws IOException if the JSON string is invalid with respect to IEdmEntityContainerElement
  */
  public static IEdmEntityContainerElement fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, IEdmEntityContainerElement.class);
  }

 /**
  * Convert an instance of IEdmEntityContainerElement to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

