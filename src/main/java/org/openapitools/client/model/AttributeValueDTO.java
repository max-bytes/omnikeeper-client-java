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
import org.openapitools.client.model.AttributeValueType;

/**
 * AttributeValueDTO
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-07-16T08:14:49.374766Z[Etc/UTC]")
public class AttributeValueDTO {
  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  private AttributeValueType type;

  public static final String SERIALIZED_NAME_IS_ARRAY = "isArray";
  @SerializedName(SERIALIZED_NAME_IS_ARRAY)
  private Boolean isArray;

  public static final String SERIALIZED_NAME_VALUES = "values";
  @SerializedName(SERIALIZED_NAME_VALUES)
  private List<String> values = new ArrayList<String>();


  public AttributeValueDTO type(AttributeValueType type) {
    
    this.type = type;
    return this;
  }

   /**
   * Get type
   * @return type
  **/
  @ApiModelProperty(required = true, value = "")

  public AttributeValueType getType() {
    return type;
  }


  public void setType(AttributeValueType type) {
    this.type = type;
  }


  public AttributeValueDTO isArray(Boolean isArray) {
    
    this.isArray = isArray;
    return this;
  }

   /**
   * Get isArray
   * @return isArray
  **/
  @ApiModelProperty(required = true, value = "")

  public Boolean getIsArray() {
    return isArray;
  }


  public void setIsArray(Boolean isArray) {
    this.isArray = isArray;
  }


  public AttributeValueDTO values(List<String> values) {
    
    this.values = values;
    return this;
  }

  public AttributeValueDTO addValuesItem(String valuesItem) {
    this.values.add(valuesItem);
    return this;
  }

   /**
   * Get values
   * @return values
  **/
  @ApiModelProperty(required = true, value = "")

  public List<String> getValues() {
    return values;
  }


  public void setValues(List<String> values) {
    this.values = values;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AttributeValueDTO attributeValueDTO = (AttributeValueDTO) o;
    return Objects.equals(this.type, attributeValueDTO.type) &&
        Objects.equals(this.isArray, attributeValueDTO.isArray) &&
        Objects.equals(this.values, attributeValueDTO.values);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, isArray, values);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AttributeValueDTO {\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    isArray: ").append(toIndentedString(isArray)).append("\n");
    sb.append("    values: ").append(toIndentedString(values)).append("\n");
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

