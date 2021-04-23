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
import org.openapitools.client.model.ILoadConfig;

/**
 * Context
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-04-23T12:01:35.443038Z[Etc/UTC]")
public class Context {
  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_EXTRACT_CONFIG = "extractConfig";
  @SerializedName(SERIALIZED_NAME_EXTRACT_CONFIG)
  private Object extractConfig;

  public static final String SERIALIZED_NAME_TRANSFORM_CONFIG = "transformConfig";
  @SerializedName(SERIALIZED_NAME_TRANSFORM_CONFIG)
  private Object transformConfig;

  public static final String SERIALIZED_NAME_LOAD_CONFIG = "loadConfig";
  @SerializedName(SERIALIZED_NAME_LOAD_CONFIG)
  private ILoadConfig loadConfig;


  public Context name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public Context extractConfig(Object extractConfig) {
    
    this.extractConfig = extractConfig;
    return this;
  }

   /**
   * Get extractConfig
   * @return extractConfig
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Object getExtractConfig() {
    return extractConfig;
  }


  public void setExtractConfig(Object extractConfig) {
    this.extractConfig = extractConfig;
  }


  public Context transformConfig(Object transformConfig) {
    
    this.transformConfig = transformConfig;
    return this;
  }

   /**
   * Get transformConfig
   * @return transformConfig
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Object getTransformConfig() {
    return transformConfig;
  }


  public void setTransformConfig(Object transformConfig) {
    this.transformConfig = transformConfig;
  }


  public Context loadConfig(ILoadConfig loadConfig) {
    
    this.loadConfig = loadConfig;
    return this;
  }

   /**
   * Get loadConfig
   * @return loadConfig
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public ILoadConfig getLoadConfig() {
    return loadConfig;
  }


  public void setLoadConfig(ILoadConfig loadConfig) {
    this.loadConfig = loadConfig;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Context context = (Context) o;
    return Objects.equals(this.name, context.name) &&
        Objects.equals(this.extractConfig, context.extractConfig) &&
        Objects.equals(this.transformConfig, context.transformConfig) &&
        Objects.equals(this.loadConfig, context.loadConfig);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, extractConfig, transformConfig, loadConfig);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Context {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    extractConfig: ").append(toIndentedString(extractConfig)).append("\n");
    sb.append("    transformConfig: ").append(toIndentedString(transformConfig)).append("\n");
    sb.append("    loadConfig: ").append(toIndentedString(loadConfig)).append("\n");
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

