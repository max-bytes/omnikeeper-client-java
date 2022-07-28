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

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.reflect.TypeToken;

import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import org.openapitools.client.JSON;

/**
 * SparseRow
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-07-28T09:01:52.317842Z[Etc/UTC]")
public class SparseRow {
  public static final String SERIALIZED_NAME_CIID = "ciid";
  @SerializedName(SERIALIZED_NAME_CIID)
  private UUID ciid;

  public static final String SERIALIZED_NAME_CELLS = "cells";
  @SerializedName(SERIALIZED_NAME_CELLS)
  private List<ChangeDataCell> cells = null;

  public SparseRow() {
  }

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
      this.cells = new ArrayList<>();
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

  @Override
  public int hashCode() {
    return Objects.hash(ciid, cells);
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


  public static HashSet<String> openapiFields;
  public static HashSet<String> openapiRequiredFields;

  static {
    // a set of all properties/fields (JSON key names)
    openapiFields = new HashSet<String>();
    openapiFields.add("ciid");
    openapiFields.add("cells");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to SparseRow
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (SparseRow.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in SparseRow is not found in the empty JSON string", SparseRow.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!SparseRow.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `SparseRow` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if ((jsonObj.get("ciid") != null && !jsonObj.get("ciid").isJsonNull()) && !jsonObj.get("ciid").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `ciid` to be a primitive type in the JSON string but got `%s`", jsonObj.get("ciid").toString()));
      }
      JsonArray jsonArraycells = jsonObj.getAsJsonArray("cells");
      if (jsonArraycells != null) {
        // ensure the json data is an array
        if (!jsonObj.get("cells").isJsonArray()) {
          throw new IllegalArgumentException(String.format("Expected the field `cells` to be an array in the JSON string but got `%s`", jsonObj.get("cells").toString()));
        }

        // validate the optional field `cells` (array)
        for (int i = 0; i < jsonArraycells.size(); i++) {
          ChangeDataCell.validateJsonObject(jsonArraycells.get(i).getAsJsonObject());
        };
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!SparseRow.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'SparseRow' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<SparseRow> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(SparseRow.class));

       return (TypeAdapter<T>) new TypeAdapter<SparseRow>() {
           @Override
           public void write(JsonWriter out, SparseRow value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public SparseRow read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of SparseRow given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of SparseRow
  * @throws IOException if the JSON string is invalid with respect to SparseRow
  */
  public static SparseRow fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, SparseRow.class);
  }

 /**
  * Convert an instance of SparseRow to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

