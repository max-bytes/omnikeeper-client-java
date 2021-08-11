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
import java.util.UUID;

/**
 * RelatedCIDTO
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-08-11T09:41:19.483688Z[Etc/UTC]")
public class RelatedCIDTO {
  public static final String SERIALIZED_NAME_FROM_C_I_I_D = "fromCIID";
  @SerializedName(SERIALIZED_NAME_FROM_C_I_I_D)
  private UUID fromCIID;

  public static final String SERIALIZED_NAME_TO_C_I_I_D = "toCIID";
  @SerializedName(SERIALIZED_NAME_TO_C_I_I_D)
  private UUID toCIID;

  public static final String SERIALIZED_NAME_PREDICATE_I_D = "predicateID";
  @SerializedName(SERIALIZED_NAME_PREDICATE_I_D)
  private String predicateID;


  public RelatedCIDTO fromCIID(UUID fromCIID) {
    
    this.fromCIID = fromCIID;
    return this;
  }

   /**
   * Get fromCIID
   * @return fromCIID
  **/
  @ApiModelProperty(required = true, value = "")

  public UUID getFromCIID() {
    return fromCIID;
  }


  public void setFromCIID(UUID fromCIID) {
    this.fromCIID = fromCIID;
  }


  public RelatedCIDTO toCIID(UUID toCIID) {
    
    this.toCIID = toCIID;
    return this;
  }

   /**
   * Get toCIID
   * @return toCIID
  **/
  @ApiModelProperty(required = true, value = "")

  public UUID getToCIID() {
    return toCIID;
  }


  public void setToCIID(UUID toCIID) {
    this.toCIID = toCIID;
  }


  public RelatedCIDTO predicateID(String predicateID) {
    
    this.predicateID = predicateID;
    return this;
  }

   /**
   * Get predicateID
   * @return predicateID
  **/
  @ApiModelProperty(required = true, value = "")

  public String getPredicateID() {
    return predicateID;
  }


  public void setPredicateID(String predicateID) {
    this.predicateID = predicateID;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RelatedCIDTO relatedCIDTO = (RelatedCIDTO) o;
    return Objects.equals(this.fromCIID, relatedCIDTO.fromCIID) &&
        Objects.equals(this.toCIID, relatedCIDTO.toCIID) &&
        Objects.equals(this.predicateID, relatedCIDTO.predicateID);
  }

  @Override
  public int hashCode() {
    return Objects.hash(fromCIID, toCIID, predicateID);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RelatedCIDTO {\n");
    sb.append("    fromCIID: ").append(toIndentedString(fromCIID)).append("\n");
    sb.append("    toCIID: ").append(toIndentedString(toCIID)).append("\n");
    sb.append("    predicateID: ").append(toIndentedString(predicateID)).append("\n");
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

