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
import org.openapitools.client.model.IEdmExpression;
import org.openapitools.client.model.IEdmTerm;
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
import java.util.Map.Entry;
import java.util.Set;

import org.openapitools.client.JSON;

/**
 * IEdmVocabularyAnnotation
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-07-07T08:22:58.374923Z[Etc/UTC]")
public class IEdmVocabularyAnnotation {
  public static final String SERIALIZED_NAME_QUALIFIER = "qualifier";
  @SerializedName(SERIALIZED_NAME_QUALIFIER)
  private String qualifier;

  public static final String SERIALIZED_NAME_TERM = "term";
  @SerializedName(SERIALIZED_NAME_TERM)
  private IEdmTerm term;

  public static final String SERIALIZED_NAME_TARGET = "target";
  @SerializedName(SERIALIZED_NAME_TARGET)
  private Object target;

  public static final String SERIALIZED_NAME_VALUE = "value";
  @SerializedName(SERIALIZED_NAME_VALUE)
  private IEdmExpression value;

  public IEdmVocabularyAnnotation() {
  }

  
  public IEdmVocabularyAnnotation(
     String qualifier
  ) {
    this();
    this.qualifier = qualifier;
  }

   /**
   * Get qualifier
   * @return qualifier
  **/
  @javax.annotation.Nullable
  public String getQualifier() {
    return qualifier;
  }




  public IEdmVocabularyAnnotation term(IEdmTerm term) {
    
    this.term = term;
    return this;
  }

   /**
   * Get term
   * @return term
  **/
  @javax.annotation.Nullable
  public IEdmTerm getTerm() {
    return term;
  }


  public void setTerm(IEdmTerm term) {
    this.term = term;
  }


  public IEdmVocabularyAnnotation target(Object target) {
    
    this.target = target;
    return this;
  }

   /**
   * Get target
   * @return target
  **/
  @javax.annotation.Nullable
  public Object getTarget() {
    return target;
  }


  public void setTarget(Object target) {
    this.target = target;
  }


  public IEdmVocabularyAnnotation value(IEdmExpression value) {
    
    this.value = value;
    return this;
  }

   /**
   * Get value
   * @return value
  **/
  @javax.annotation.Nullable
  public IEdmExpression getValue() {
    return value;
  }


  public void setValue(IEdmExpression value) {
    this.value = value;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IEdmVocabularyAnnotation iedmVocabularyAnnotation = (IEdmVocabularyAnnotation) o;
    return Objects.equals(this.qualifier, iedmVocabularyAnnotation.qualifier) &&
        Objects.equals(this.term, iedmVocabularyAnnotation.term) &&
        Objects.equals(this.target, iedmVocabularyAnnotation.target) &&
        Objects.equals(this.value, iedmVocabularyAnnotation.value);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(qualifier, term, target, value);
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
    sb.append("class IEdmVocabularyAnnotation {\n");
    sb.append("    qualifier: ").append(toIndentedString(qualifier)).append("\n");
    sb.append("    term: ").append(toIndentedString(term)).append("\n");
    sb.append("    target: ").append(toIndentedString(target)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
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
    openapiFields.add("qualifier");
    openapiFields.add("term");
    openapiFields.add("target");
    openapiFields.add("value");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to IEdmVocabularyAnnotation
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!IEdmVocabularyAnnotation.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in IEdmVocabularyAnnotation is not found in the empty JSON string", IEdmVocabularyAnnotation.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!IEdmVocabularyAnnotation.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `IEdmVocabularyAnnotation` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("qualifier") != null && !jsonObj.get("qualifier").isJsonNull()) && !jsonObj.get("qualifier").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `qualifier` to be a primitive type in the JSON string but got `%s`", jsonObj.get("qualifier").toString()));
      }
      // validate the optional field `term`
      if (jsonObj.get("term") != null && !jsonObj.get("term").isJsonNull()) {
        IEdmTerm.validateJsonElement(jsonObj.get("term"));
      }
      // validate the optional field `value`
      if (jsonObj.get("value") != null && !jsonObj.get("value").isJsonNull()) {
        IEdmExpression.validateJsonElement(jsonObj.get("value"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!IEdmVocabularyAnnotation.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'IEdmVocabularyAnnotation' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<IEdmVocabularyAnnotation> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(IEdmVocabularyAnnotation.class));

       return (TypeAdapter<T>) new TypeAdapter<IEdmVocabularyAnnotation>() {
           @Override
           public void write(JsonWriter out, IEdmVocabularyAnnotation value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public IEdmVocabularyAnnotation read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of IEdmVocabularyAnnotation given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of IEdmVocabularyAnnotation
  * @throws IOException if the JSON string is invalid with respect to IEdmVocabularyAnnotation
  */
  public static IEdmVocabularyAnnotation fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, IEdmVocabularyAnnotation.class);
  }

 /**
  * Convert an instance of IEdmVocabularyAnnotation to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

