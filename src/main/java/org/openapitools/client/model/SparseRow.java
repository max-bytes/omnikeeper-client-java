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
import java.util.UUID;
import org.openapitools.client.model.ChangeDataCell;
import org.openapitools.jackson.nullable.JsonNullable;

/**
 * SparseRow
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-08-19T09:00:26.139003Z[Etc/UTC]")
public class SparseRow {
  public static final String SERIALIZED_NAME_CIID = "ciid";
  @SerializedName(SERIALIZED_NAME_CIID)
  private UUID ciid;

  public static final String SERIALIZED_NAME_CELLS = "cells";
  @SerializedName(SERIALIZED_NAME_CELLS)
  private List<ChangeDataCell> cells = null;


  public SparseRow ciid(UUID ciid) {
    
    this.ciid = ciid;
    return this;
  }

   /**
   * Get ciid
   * @return ciid
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public UUID getCiid() {
    return ciid;
  }


  public void setCiid(UUID ciid) {
    this.ciid = ciid;
  }


  public SparseRow cells(List<ChangeDataCell> cells) {
    
    this.cells = cells;
    return this;
  }

  public SparseRow addCellsItem(ChangeDataCell cellsItem) {
    if (this.cells == null) {
      this.cells = new ArrayList<ChangeDataCell>();
    }
    this.cells.add(cellsItem);
    return this;
  }

   /**
   * Get cells
   * @return cells
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<ChangeDataCell> getCells() {
    return cells;
  }


  public void setCells(List<ChangeDataCell> cells) {
    this.cells = cells;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SparseRow sparseRow = (SparseRow) o;
    return Objects.equals(this.ciid, sparseRow.ciid) &&
        Objects.equals(this.cells, sparseRow.cells);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && a.get().getClass().isArray() ? Arrays.equals((T[])a.get(), (T[])b.get()) : Objects.equals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(ciid, cells);
  }

  private static <T> int hashCodeNullable(JsonNullable<T> a) {
    if (a == null) {
      return 1;
    }
    return a.isPresent()
      ? (a.get().getClass().isArray() ? Arrays.hashCode((T[])a.get()) : Objects.hashCode(a.get()))
      : 31;
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SparseRow {\n");
    sb.append("    ciid: ").append(toIndentedString(ciid)).append("\n");
    sb.append("    cells: ").append(toIndentedString(cells)).append("\n");
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

