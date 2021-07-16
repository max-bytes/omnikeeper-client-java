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

/**
 * PredicateDTO
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-07-16T21:08:35.658933Z[Etc/UTC]")
public class PredicateDTO {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_WORDING_FROM = "wordingFrom";
  @SerializedName(SERIALIZED_NAME_WORDING_FROM)
  private String wordingFrom;

  public static final String SERIALIZED_NAME_WORDING_TO = "wordingTo";
  @SerializedName(SERIALIZED_NAME_WORDING_TO)
  private String wordingTo;


  public PredicateDTO id(String id) {
    
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getId() {
    return id;
  }


  public void setId(String id) {
    this.id = id;
  }


  public PredicateDTO wordingFrom(String wordingFrom) {
    
    this.wordingFrom = wordingFrom;
    return this;
  }

   /**
   * Get wordingFrom
   * @return wordingFrom
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getWordingFrom() {
    return wordingFrom;
  }


  public void setWordingFrom(String wordingFrom) {
    this.wordingFrom = wordingFrom;
  }


  public PredicateDTO wordingTo(String wordingTo) {
    
    this.wordingTo = wordingTo;
    return this;
  }

   /**
   * Get wordingTo
   * @return wordingTo
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getWordingTo() {
    return wordingTo;
  }


  public void setWordingTo(String wordingTo) {
    this.wordingTo = wordingTo;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PredicateDTO predicateDTO = (PredicateDTO) o;
    return Objects.equals(this.id, predicateDTO.id) &&
        Objects.equals(this.wordingFrom, predicateDTO.wordingFrom) &&
        Objects.equals(this.wordingTo, predicateDTO.wordingTo);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, wordingFrom, wordingTo);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PredicateDTO {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    wordingFrom: ").append(toIndentedString(wordingFrom)).append("\n");
    sb.append("    wordingTo: ").append(toIndentedString(wordingTo)).append("\n");
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

