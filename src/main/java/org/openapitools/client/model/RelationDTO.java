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
import org.openapitools.client.model.RelationState;

/**
 * RelationDTO
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-02-01T08:45:07.486776Z[Etc/UTC]")
public class RelationDTO {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private UUID id;

  public static final String SERIALIZED_NAME_FROM_C_I_I_D = "fromCIID";
  @SerializedName(SERIALIZED_NAME_FROM_C_I_I_D)
  private UUID fromCIID;

  public static final String SERIALIZED_NAME_TO_C_I_I_D = "toCIID";
  @SerializedName(SERIALIZED_NAME_TO_C_I_I_D)
  private UUID toCIID;

  public static final String SERIALIZED_NAME_PREDICATE_I_D = "predicateID";
  @SerializedName(SERIALIZED_NAME_PREDICATE_I_D)
  private String predicateID;

  public static final String SERIALIZED_NAME_STATE = "state";
  @SerializedName(SERIALIZED_NAME_STATE)
  private RelationState state;

  public RelationDTO() { 
  }

  public RelationDTO id(UUID id) {
    
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public UUID getId() {
    return id;
  }


  public void setId(UUID id) {
    this.id = id;
  }


  public RelationDTO fromCIID(UUID fromCIID) {
    
    this.fromCIID = fromCIID;
    return this;
  }

   /**
   * Get fromCIID
   * @return fromCIID
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public UUID getFromCIID() {
    return fromCIID;
  }


  public void setFromCIID(UUID fromCIID) {
    this.fromCIID = fromCIID;
  }


  public RelationDTO toCIID(UUID toCIID) {
    
    this.toCIID = toCIID;
    return this;
  }

   /**
   * Get toCIID
   * @return toCIID
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public UUID getToCIID() {
    return toCIID;
  }


  public void setToCIID(UUID toCIID) {
    this.toCIID = toCIID;
  }


  public RelationDTO predicateID(String predicateID) {
    
    this.predicateID = predicateID;
    return this;
  }

   /**
   * Get predicateID
   * @return predicateID
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public String getPredicateID() {
    return predicateID;
  }


  public void setPredicateID(String predicateID) {
    this.predicateID = predicateID;
  }


  public RelationDTO state(RelationState state) {
    
    this.state = state;
    return this;
  }

   /**
   * Get state
   * @return state
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public RelationState getState() {
    return state;
  }


  public void setState(RelationState state) {
    this.state = state;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RelationDTO relationDTO = (RelationDTO) o;
    return Objects.equals(this.id, relationDTO.id) &&
        Objects.equals(this.fromCIID, relationDTO.fromCIID) &&
        Objects.equals(this.toCIID, relationDTO.toCIID) &&
        Objects.equals(this.predicateID, relationDTO.predicateID) &&
        Objects.equals(this.state, relationDTO.state);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, fromCIID, toCIID, predicateID, state);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RelationDTO {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    fromCIID: ").append(toIndentedString(fromCIID)).append("\n");
    sb.append("    toCIID: ").append(toIndentedString(toCIID)).append("\n");
    sb.append("    predicateID: ").append(toIndentedString(predicateID)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
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

