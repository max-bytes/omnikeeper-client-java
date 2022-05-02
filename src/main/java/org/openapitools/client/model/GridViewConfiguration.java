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
import org.openapitools.jackson.nullable.JsonNullable;

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
 * GridViewConfiguration
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-05-02T09:44:34.610337Z[Etc/UTC]")
public class GridViewConfiguration {
  public static final String SERIALIZED_NAME_SHOW_C_I_I_D_COLUMN = "showCIIDColumn";
  @SerializedName(SERIALIZED_NAME_SHOW_C_I_I_D_COLUMN)
  private Boolean showCIIDColumn;

  public static final String SERIALIZED_NAME_WRITE_LAYER = "writeLayer";
  @SerializedName(SERIALIZED_NAME_WRITE_LAYER)
  private String writeLayer;

  public static final String SERIALIZED_NAME_READ_LAYERSET = "readLayerset";
  @SerializedName(SERIALIZED_NAME_READ_LAYERSET)
  private List<String> readLayerset = null;

  public static final String SERIALIZED_NAME_COLUMNS = "columns";
  @SerializedName(SERIALIZED_NAME_COLUMNS)
  private List<GridViewColumn> columns = null;

  public static final String SERIALIZED_NAME_TRAIT = "trait";
  @SerializedName(SERIALIZED_NAME_TRAIT)
  private String trait;

  public GridViewConfiguration() { 
  }

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


  public GridViewConfiguration writeLayer(String writeLayer) {
    
    this.writeLayer = writeLayer;
    return this;
  }

   /**
   * Get writeLayer
   * @return writeLayer
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getWriteLayer() {
    return writeLayer;
  }


  public void setWriteLayer(String writeLayer) {
    this.writeLayer = writeLayer;
  }


  public GridViewConfiguration readLayerset(List<String> readLayerset) {
    
    this.readLayerset = readLayerset;
    return this;
  }

  public GridViewConfiguration addReadLayersetItem(String readLayersetItem) {
    if (this.readLayerset == null) {
      this.readLayerset = new ArrayList<>();
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

  public List<String> getReadLayerset() {
    return readLayerset;
  }


  public void setReadLayerset(List<String> readLayerset) {
    this.readLayerset = readLayerset;
  }


  public GridViewConfiguration columns(List<GridViewColumn> columns) {
    
    this.columns = columns;
    return this;
  }

  public GridViewConfiguration addColumnsItem(GridViewColumn columnsItem) {
    if (this.columns == null) {
      this.columns = new ArrayList<>();
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

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(showCIIDColumn, writeLayer, readLayerset, columns, trait);
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


  public static HashSet<String> openapiFields;
  public static HashSet<String> openapiRequiredFields;

  static {
    // a set of all properties/fields (JSON key names)
    openapiFields = new HashSet<String>();
    openapiFields.add("showCIIDColumn");
    openapiFields.add("writeLayer");
    openapiFields.add("readLayerset");
    openapiFields.add("columns");
    openapiFields.add("trait");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to GridViewConfiguration
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (GridViewConfiguration.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in GridViewConfiguration is not found in the empty JSON string", GridViewConfiguration.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!GridViewConfiguration.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `GridViewConfiguration` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if (jsonObj.get("writeLayer") != null && !jsonObj.get("writeLayer").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `writeLayer` to be a primitive type in the JSON string but got `%s`", jsonObj.get("writeLayer").toString()));
      }
      // ensure the json data is an array
      if (jsonObj.get("readLayerset") != null && !jsonObj.get("readLayerset").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `readLayerset` to be an array in the JSON string but got `%s`", jsonObj.get("readLayerset").toString()));
      }
      JsonArray jsonArraycolumns = jsonObj.getAsJsonArray("columns");
      if (jsonArraycolumns != null) {
        // ensure the json data is an array
        if (!jsonObj.get("columns").isJsonArray()) {
          throw new IllegalArgumentException(String.format("Expected the field `columns` to be an array in the JSON string but got `%s`", jsonObj.get("columns").toString()));
        }

        // validate the optional field `columns` (array)
        for (int i = 0; i < jsonArraycolumns.size(); i++) {
          GridViewColumn.validateJsonObject(jsonArraycolumns.get(i).getAsJsonObject());
        };
      }
      if (jsonObj.get("trait") != null && !jsonObj.get("trait").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `trait` to be a primitive type in the JSON string but got `%s`", jsonObj.get("trait").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!GridViewConfiguration.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'GridViewConfiguration' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<GridViewConfiguration> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(GridViewConfiguration.class));

       return (TypeAdapter<T>) new TypeAdapter<GridViewConfiguration>() {
           @Override
           public void write(JsonWriter out, GridViewConfiguration value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public GridViewConfiguration read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of GridViewConfiguration given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of GridViewConfiguration
  * @throws IOException if the JSON string is invalid with respect to GridViewConfiguration
  */
  public static GridViewConfiguration fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, GridViewConfiguration.class);
  }

 /**
  * Convert an instance of GridViewConfiguration to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

