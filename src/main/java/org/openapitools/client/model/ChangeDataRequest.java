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
import org.openapitools.client.model.SparseRow;
import org.openapitools.jackson.nullable.JsonNullable;

/**
 * ChangeDataRequest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-10-05T09:16:53.377197Z[Etc/UTC]")
public class ChangeDataRequest {
  public static final String SERIALIZED_NAME_SPARSE_ROWS = "sparseRows";
  @SerializedName(SERIALIZED_NAME_SPARSE_ROWS)
  private List<SparseRow> sparseRows = null;


  public ChangeDataRequest sparseRows(List<SparseRow> sparseRows) {
    
    this.sparseRows = sparseRows;
    return this;
  }

  public ChangeDataRequest addSparseRowsItem(SparseRow sparseRowsItem) {
    if (this.sparseRows == null) {
      this.sparseRows = new ArrayList<SparseRow>();
    }
    this.sparseRows.add(sparseRowsItem);
    return this;
  }

   /**
   * Get sparseRows
   * @return sparseRows
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<SparseRow> getSparseRows() {
    return sparseRows;
  }


  public void setSparseRows(List<SparseRow> sparseRows) {
    this.sparseRows = sparseRows;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ChangeDataRequest changeDataRequest = (ChangeDataRequest) o;
    return Objects.equals(this.sparseRows, changeDataRequest.sparseRows);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(sparseRows);
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
    sb.append("class ChangeDataRequest {\n");
    sb.append("    sparseRows: ").append(toIndentedString(sparseRows)).append("\n");
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

