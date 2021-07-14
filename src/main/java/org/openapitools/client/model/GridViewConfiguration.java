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
import org.openapitools.client.model.GridViewColumn;

/**
 * GridViewConfiguration
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-07-14T12:52:54.095879Z[Etc/UTC]")
public class GridViewConfiguration {
  public static final String SERIALIZED_NAME_SHOW_C_I_I_D_COLUMN = "showCIIDColumn";
  @SerializedName(SERIALIZED_NAME_SHOW_C_I_I_D_COLUMN)
  private Boolean showCIIDColumn;

  public static final String SERIALIZED_NAME_WRITE_LAYER = "writeLayer";
  @SerializedName(SERIALIZED_NAME_WRITE_LAYER)
  private Long writeLayer;

  public static final String SERIALIZED_NAME_READ_LAYERSET = "readLayerset";
  @SerializedName(SERIALIZED_NAME_READ_LAYERSET)
  private List<Long> readLayerset = null;

  public static final String SERIALIZED_NAME_COLUMNS = "columns";
  @SerializedName(SERIALIZED_NAME_COLUMNS)
  private List<GridViewColumn> columns = null;

  public static final String SERIALIZED_NAME_TRAIT = "trait";
  @SerializedName(SERIALIZED_NAME_TRAIT)
  private String trait;


  public GridViewConfiguration showCIIDColumn(Boolean showCIIDColumn) {
    
    this.showCIIDColumn = showCIIDColumn;
    return this;
  }

   /**
   * Get showCIIDColumn
   * @return showCIIDColumn
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getShowCIIDColumn() {
    return showCIIDColumn;
  }


  public void setShowCIIDColumn(Boolean showCIIDColumn) {
    this.showCIIDColumn = showCIIDColumn;
  }


  public GridViewConfiguration writeLayer(Long writeLayer) {
    
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


  public GridViewConfiguration readLayerset(List<Long> readLayerset) {
    
    this.readLayerset = readLayerset;
    return this;
  }

  public GridViewConfiguration addReadLayersetItem(Long readLayersetItem) {
    if (this.readLayerset == null) {
      this.readLayerset = new ArrayList<Long>();
    }
    this.readLayerset.add(readLayersetItem);
    return this;
  }

   /**
   * Get readLayerset
   * @return readLayerset
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<Long> getReadLayerset() {
    return readLayerset;
  }


  public void setReadLayerset(List<Long> readLayerset) {
    this.readLayerset = readLayerset;
  }


  public GridViewConfiguration columns(List<GridViewColumn> columns) {
    
    this.columns = columns;
    return this;
  }

  public GridViewConfiguration addColumnsItem(GridViewColumn columnsItem) {
    if (this.columns == null) {
      this.columns = new ArrayList<GridViewColumn>();
    }
    this.columns.add(columnsItem);
    return this;
  }

   /**
   * Get columns
   * @return columns
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<GridViewColumn> getColumns() {
    return columns;
  }


  public void setColumns(List<GridViewColumn> columns) {
    this.columns = columns;
  }


  public GridViewConfiguration trait(String trait) {
    
    this.trait = trait;
    return this;
  }

   /**
   * Get trait
   * @return trait
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getTrait() {
    return trait;
  }


  public void setTrait(String trait) {
    this.trait = trait;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GridViewConfiguration gridViewConfiguration = (GridViewConfiguration) o;
    return Objects.equals(this.showCIIDColumn, gridViewConfiguration.showCIIDColumn) &&
        Objects.equals(this.writeLayer, gridViewConfiguration.writeLayer) &&
        Objects.equals(this.readLayerset, gridViewConfiguration.readLayerset) &&
        Objects.equals(this.columns, gridViewConfiguration.columns) &&
        Objects.equals(this.trait, gridViewConfiguration.trait);
  }

  @Override
  public int hashCode() {
    return Objects.hash(showCIIDColumn, writeLayer, readLayerset, columns, trait);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GridViewConfiguration {\n");
    sb.append("    showCIIDColumn: ").append(toIndentedString(showCIIDColumn)).append("\n");
    sb.append("    writeLayer: ").append(toIndentedString(writeLayer)).append("\n");
    sb.append("    readLayerset: ").append(toIndentedString(readLayerset)).append("\n");
    sb.append("    columns: ").append(toIndentedString(columns)).append("\n");
    sb.append("    trait: ").append(toIndentedString(trait)).append("\n");
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

