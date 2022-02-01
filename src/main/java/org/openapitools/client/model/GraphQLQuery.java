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

/**
 * GraphQLQuery
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-02-01T08:45:07.486776Z[Etc/UTC]")
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

}

