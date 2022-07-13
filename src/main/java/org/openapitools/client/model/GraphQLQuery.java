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
 * GraphQLQuery
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-07-13T10:34:28.643686Z[Etc/UTC]")
public class GraphQLQuery {
  public static final String SERIALIZED_NAME_OPERATION_NAME = "operationName";
  @SerializedName(SERIALIZED_NAME_OPERATION_NAME)
  private String operationName;

  public static final String SERIALIZED_NAME_NAMED_QUERY = "namedQuery";
  @SerializedName(SERIALIZED_NAME_NAMED_QUERY)
  private String namedQuery;

  public static final String SERIALIZED_NAME_QUERY = "query";
  @SerializedName(SERIALIZED_NAME_QUERY)
  private String query;

  public static final String SERIALIZED_NAME_VARIABLES = "variables";
  @SerializedName(SERIALIZED_NAME_VARIABLES)
  private Object variables = null;

  public GraphQLQuery() { 
  }

  public GraphQLQuery operationName(String operationName) {
    
    this.operationName = operationName;
    return this;
  }

   /**
   * Get operationName
   * @return operationName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getOperationName() {
    return operationName;
  }


  public void setOperationName(String operationName) {
    this.operationName = operationName;
  }


  public GraphQLQuery namedQuery(String namedQuery) {
    
    this.namedQuery = namedQuery;
    return this;
  }

   /**
   * Get namedQuery
   * @return namedQuery
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getNamedQuery() {
    return namedQuery;
  }


  public void setNamedQuery(String namedQuery) {
    this.namedQuery = namedQuery;
  }


  public GraphQLQuery query(String query) {
    
    this.query = query;
    return this;
  }

   /**
   * Get query
   * @return query
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getQuery() {
    return query;
  }


  public void setQuery(String query) {
    this.query = query;
  }


  public GraphQLQuery variables(Object variables) {
    
    this.variables = variables;
    return this;
  }

   /**
   * Get variables
   * @return variables
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Object getVariables() {
    return variables;
  }


  public void setVariables(Object variables) {
    this.variables = variables;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GraphQLQuery graphQLQuery = (GraphQLQuery) o;
    return Objects.equals(this.operationName, graphQLQuery.operationName) &&
        Objects.equals(this.namedQuery, graphQLQuery.namedQuery) &&
        Objects.equals(this.query, graphQLQuery.query) &&
        Objects.equals(this.variables, graphQLQuery.variables);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(operationName, namedQuery, query, variables);
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
    sb.append("class GraphQLQuery {\n");
    sb.append("    operationName: ").append(toIndentedString(operationName)).append("\n");
    sb.append("    namedQuery: ").append(toIndentedString(namedQuery)).append("\n");
    sb.append("    query: ").append(toIndentedString(query)).append("\n");
    sb.append("    variables: ").append(toIndentedString(variables)).append("\n");
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
    openapiFields.add("operationName");
    openapiFields.add("namedQuery");
    openapiFields.add("query");
    openapiFields.add("variables");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to GraphQLQuery
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (GraphQLQuery.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in GraphQLQuery is not found in the empty JSON string", GraphQLQuery.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!GraphQLQuery.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `GraphQLQuery` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if (jsonObj.get("operationName") != null && !jsonObj.get("operationName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `operationName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("operationName").toString()));
      }
      if (jsonObj.get("namedQuery") != null && !jsonObj.get("namedQuery").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `namedQuery` to be a primitive type in the JSON string but got `%s`", jsonObj.get("namedQuery").toString()));
      }
      if (jsonObj.get("query") != null && !jsonObj.get("query").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `query` to be a primitive type in the JSON string but got `%s`", jsonObj.get("query").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!GraphQLQuery.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'GraphQLQuery' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<GraphQLQuery> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(GraphQLQuery.class));

       return (TypeAdapter<T>) new TypeAdapter<GraphQLQuery>() {
           @Override
           public void write(JsonWriter out, GraphQLQuery value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public GraphQLQuery read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of GraphQLQuery given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of GraphQLQuery
  * @throws IOException if the JSON string is invalid with respect to GraphQLQuery
  */
  public static GraphQLQuery fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, GraphQLQuery.class);
  }

 /**
  * Convert an instance of GraphQLQuery to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

