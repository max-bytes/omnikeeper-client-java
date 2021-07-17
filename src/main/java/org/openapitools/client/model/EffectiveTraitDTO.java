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
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.openapitools.client.model.CIAttributeDTO;
import org.openapitools.client.model.RelatedCIDTO;

/**
 * EffectiveTraitDTO
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-07-17T07:50:36.765238Z[Etc/UTC]")
public class EffectiveTraitDTO {
  public static final String SERIALIZED_NAME_TRAIT_ATTRIBUTES = "traitAttributes";
  @SerializedName(SERIALIZED_NAME_TRAIT_ATTRIBUTES)
  private Map<String, CIAttributeDTO> traitAttributes = new HashMap<String, CIAttributeDTO>();

  public static final String SERIALIZED_NAME_TRAIT_RELATIONS = "traitRelations";
  @SerializedName(SERIALIZED_NAME_TRAIT_RELATIONS)
  private Map<String, List<RelatedCIDTO>> traitRelations = new HashMap<String, List<RelatedCIDTO>>();


  public EffectiveTraitDTO traitAttributes(Map<String, CIAttributeDTO> traitAttributes) {
    
    this.traitAttributes = traitAttributes;
    return this;
  }

  public EffectiveTraitDTO putTraitAttributesItem(String key, CIAttributeDTO traitAttributesItem) {
    this.traitAttributes.put(key, traitAttributesItem);
    return this;
  }

   /**
   * Get traitAttributes
   * @return traitAttributes
  **/
  @ApiModelProperty(required = true, value = "")

  public Map<String, CIAttributeDTO> getTraitAttributes() {
    return traitAttributes;
  }


  public void setTraitAttributes(Map<String, CIAttributeDTO> traitAttributes) {
    this.traitAttributes = traitAttributes;
  }


  public EffectiveTraitDTO traitRelations(Map<String, List<RelatedCIDTO>> traitRelations) {
    
    this.traitRelations = traitRelations;
    return this;
  }

  public EffectiveTraitDTO putTraitRelationsItem(String key, List<RelatedCIDTO> traitRelationsItem) {
    this.traitRelations.put(key, traitRelationsItem);
    return this;
  }

   /**
   * Get traitRelations
   * @return traitRelations
  **/
  @ApiModelProperty(required = true, value = "")

  public Map<String, List<RelatedCIDTO>> getTraitRelations() {
    return traitRelations;
  }


  public void setTraitRelations(Map<String, List<RelatedCIDTO>> traitRelations) {
    this.traitRelations = traitRelations;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EffectiveTraitDTO effectiveTraitDTO = (EffectiveTraitDTO) o;
    return Objects.equals(this.traitAttributes, effectiveTraitDTO.traitAttributes) &&
        Objects.equals(this.traitRelations, effectiveTraitDTO.traitRelations);
  }

  @Override
  public int hashCode() {
    return Objects.hash(traitAttributes, traitRelations);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EffectiveTraitDTO {\n");
    sb.append("    traitAttributes: ").append(toIndentedString(traitAttributes)).append("\n");
    sb.append("    traitRelations: ").append(toIndentedString(traitRelations)).append("\n");
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

