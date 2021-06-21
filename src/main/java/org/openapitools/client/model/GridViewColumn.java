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
import org.openapitools.client.model.AttributeValueType;

/**
 * GridViewColumn
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-06-21T14:20:16.083657Z[Etc/UTC]")
public class GridViewColumn {
  public static final String SERIALIZED_NAME_SOURCE_ATTRIBUTE_NAME = "sourceAttributeName";
  @SerializedName(SERIALIZED_NAME_SOURCE_ATTRIBUTE_NAME)
  private String sourceAttributeName;

  public static final String SERIALIZED_NAME_COLUMN_DESCRIPTION = "columnDescription";
  @SerializedName(SERIALIZED_NAME_COLUMN_DESCRIPTION)
  private String columnDescription;

  public static final String SERIALIZED_NAME_VALUE_TYPE = "valueType";
  @SerializedName(SERIALIZED_NAME_VALUE_TYPE)
  private AttributeValueType valueType;

  public static final String SERIALIZED_NAME_WRITE_LAYER = "writeLayer";
  @SerializedName(SERIALIZED_NAME_WRITE_LAYER)
  private Long writeLayer;


  public GridViewColumn sourceAttributeName(String sourceAttributeName) {
    
    this.sourceAttributeName = sourceAttributeName;
    return this;
  }

   /**
   * Get sourceAttributeName
   * @return sourceAttributeName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getSourceAttributeName() {
    return sourceAttributeName;
  }


  public void setSourceAttributeName(String sourceAttributeName) {
    this.sourceAttributeName = sourceAttributeName;
  }


  public GridViewColumn columnDescription(String columnDescription) {
    
    this.columnDescription = columnDescription;
    return this;
  }

   /**
   * Get columnDescription
   * @return columnDescription
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getColumnDescription() {
    return columnDescription;
  }


  public void setColumnDescription(String columnDescription) {
    this.columnDescription = columnDescription;
  }


  public GridViewColumn valueType(AttributeValueType valueType) {
    
    this.valueType = valueType;
    return this;
  }

   /**
   * Get valueType
   * @return valueType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public AttributeValueType getValueType() {
    return valueType;
  }


  public void setValueType(AttributeValueType valueType) {
    this.valueType = valueType;
  }


  public GridViewColumn writeLayer(Long writeLayer) {
    
    this.writeLayer = writeLayer;
    return this;
  }

   /**
   * Get writeLayer
   * @return writeLayer
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Long getWriteLayer() {
    return writeLayer;
  }


  public void setWriteLayer(Long writeLayer) {
    this.writeLayer = writeLayer;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GridViewColumn gridViewColumn = (GridViewColumn) o;
    return Objects.equals(this.sourceAttributeName, gridViewColumn.sourceAttributeName) &&
        Objects.equals(this.columnDescription, gridViewColumn.columnDescription) &&
        Objects.equals(this.valueType, gridViewColumn.valueType) &&
        Objects.equals(this.writeLayer, gridViewColumn.writeLayer);
  }

  @Override
  public int hashCode() {
    return Objects.hash(sourceAttributeName, columnDescription, valueType, writeLayer);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GridViewColumn {\n");
    sb.append("    sourceAttributeName: ").append(toIndentedString(sourceAttributeName)).append("\n");
    sb.append("    columnDescription: ").append(toIndentedString(columnDescription)).append("\n");
    sb.append("    valueType: ").append(toIndentedString(valueType)).append("\n");
    sb.append("    writeLayer: ").append(toIndentedString(writeLayer)).append("\n");
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

