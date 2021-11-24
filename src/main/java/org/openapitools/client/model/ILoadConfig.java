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
import org.openapitools.jackson.nullable.JsonNullable;

/**
 * ILoadConfig
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-11-24T12:27:09.296777Z[Etc/UTC]")
public class ILoadConfig {
  public static final String SERIALIZED_NAME_SEARCH_LAYER_I_DS = "searchLayerIDs";
  @SerializedName(SERIALIZED_NAME_SEARCH_LAYER_I_DS)
  private List<String> searchLayerIDs = null;

  public static final String SERIALIZED_NAME_WRITE_LAYER_I_D = "writeLayerID";
  @SerializedName(SERIALIZED_NAME_WRITE_LAYER_I_D)
  private String writeLayerID;

  public ILoadConfig() { 
  }

  
  public ILoadConfig(
     List<String> searchLayerIDs, 
     String writeLayerID
  ) {
    this();
    this.searchLayerIDs = searchLayerIDs;
    this.writeLayerID = writeLayerID;
  }

   /**
   * Get searchLayerIDs
   * @return searchLayerIDs
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<String> getSearchLayerIDs() {
    return searchLayerIDs;
  }




   /**
   * Get writeLayerID
   * @return writeLayerID
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getWriteLayerID() {
    return writeLayerID;
  }




  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ILoadConfig iloadConfig = (ILoadConfig) o;
    return Objects.equals(this.searchLayerIDs, iloadConfig.searchLayerIDs) &&
        Objects.equals(this.writeLayerID, iloadConfig.writeLayerID);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(searchLayerIDs, writeLayerID);
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
    sb.append("class ILoadConfig {\n");
    sb.append("    searchLayerIDs: ").append(toIndentedString(searchLayerIDs)).append("\n");
    sb.append("    writeLayerID: ").append(toIndentedString(writeLayerID)).append("\n");
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

