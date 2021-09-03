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
import org.openapitools.client.model.FragmentDTO;

/**
 * BulkCIAttributeLayerScopeDTO
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-09-03T08:11:15.709747Z[Etc/UTC]")
public class BulkCIAttributeLayerScopeDTO {
  public static final String SERIALIZED_NAME_NAME_PREFIX = "namePrefix";
  @SerializedName(SERIALIZED_NAME_NAME_PREFIX)
  private String namePrefix;

  public static final String SERIALIZED_NAME_LAYER_I_D = "layerID";
  @SerializedName(SERIALIZED_NAME_LAYER_I_D)
  private String layerID;

  public static final String SERIALIZED_NAME_FRAGMENTS = "fragments";
  @SerializedName(SERIALIZED_NAME_FRAGMENTS)
  private List<FragmentDTO> fragments = new ArrayList<FragmentDTO>();


  public BulkCIAttributeLayerScopeDTO namePrefix(String namePrefix) {
    
    this.namePrefix = namePrefix;
    return this;
  }

   /**
   * Get namePrefix
   * @return namePrefix
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public String getNamePrefix() {
    return namePrefix;
  }


  public void setNamePrefix(String namePrefix) {
    this.namePrefix = namePrefix;
  }


  public BulkCIAttributeLayerScopeDTO layerID(String layerID) {
    
    this.layerID = layerID;
    return this;
  }

   /**
   * Get layerID
   * @return layerID
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public String getLayerID() {
    return layerID;
  }


  public void setLayerID(String layerID) {
    this.layerID = layerID;
  }


  public BulkCIAttributeLayerScopeDTO fragments(List<FragmentDTO> fragments) {
    
    this.fragments = fragments;
    return this;
  }

  public BulkCIAttributeLayerScopeDTO addFragmentsItem(FragmentDTO fragmentsItem) {
    this.fragments.add(fragmentsItem);
    return this;
  }

   /**
   * Get fragments
   * @return fragments
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public List<FragmentDTO> getFragments() {
    return fragments;
  }


  public void setFragments(List<FragmentDTO> fragments) {
    this.fragments = fragments;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BulkCIAttributeLayerScopeDTO bulkCIAttributeLayerScopeDTO = (BulkCIAttributeLayerScopeDTO) o;
    return Objects.equals(this.namePrefix, bulkCIAttributeLayerScopeDTO.namePrefix) &&
        Objects.equals(this.layerID, bulkCIAttributeLayerScopeDTO.layerID) &&
        Objects.equals(this.fragments, bulkCIAttributeLayerScopeDTO.fragments);
  }

  @Override
  public int hashCode() {
    return Objects.hash(namePrefix, layerID, fragments);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BulkCIAttributeLayerScopeDTO {\n");
    sb.append("    namePrefix: ").append(toIndentedString(namePrefix)).append("\n");
    sb.append("    layerID: ").append(toIndentedString(layerID)).append("\n");
    sb.append("    fragments: ").append(toIndentedString(fragments)).append("\n");
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

