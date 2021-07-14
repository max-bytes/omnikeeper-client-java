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
import org.openapitools.client.model.GridViewConfiguration;

/**
 * AddContextRequest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-07-14T12:56:15.136376Z[Etc/UTC]")
public class AddContextRequest {
  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_SPEAKING_NAME = "speakingName";
  @SerializedName(SERIALIZED_NAME_SPEAKING_NAME)
  private String speakingName;

  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description;

  public static final String SERIALIZED_NAME_CONFIGURATION = "configuration";
  @SerializedName(SERIALIZED_NAME_CONFIGURATION)
  private GridViewConfiguration _configuration;


  public AddContextRequest name(String name) {
    
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


  public AddContextRequest speakingName(String speakingName) {
    
    this.speakingName = speakingName;
    return this;
  }

   /**
   * Get speakingName
   * @return speakingName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getSpeakingName() {
    return speakingName;
  }


  public void setSpeakingName(String speakingName) {
    this.speakingName = speakingName;
  }


  public AddContextRequest description(String description) {
    
    this.description = description;
    return this;
  }

   /**
   * Get description
   * @return description
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getDescription() {
    return description;
  }


  public void setDescription(String description) {
    this.description = description;
  }


  public AddContextRequest _configuration(GridViewConfiguration _configuration) {
    
    this._configuration = _configuration;
    return this;
  }

   /**
   * Get _configuration
   * @return _configuration
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public GridViewConfiguration getConfiguration() {
    return _configuration;
  }


  public void setConfiguration(GridViewConfiguration _configuration) {
    this._configuration = _configuration;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AddContextRequest addContextRequest = (AddContextRequest) o;
    return Objects.equals(this.name, addContextRequest.name) &&
        Objects.equals(this.speakingName, addContextRequest.speakingName) &&
        Objects.equals(this.description, addContextRequest.description) &&
        Objects.equals(this._configuration, addContextRequest._configuration);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, speakingName, description, _configuration);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AddContextRequest {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    speakingName: ").append(toIndentedString(speakingName)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    _configuration: ").append(toIndentedString(_configuration)).append("\n");
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

