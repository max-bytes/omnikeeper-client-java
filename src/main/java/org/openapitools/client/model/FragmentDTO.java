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
import java.util.UUID;
import org.openapitools.client.model.AttributeValueDTO;

/**
 * FragmentDTO
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-08-11T13:29:51.559031Z[Etc/UTC]")
public class FragmentDTO {
  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_VALUE = "value";
  @SerializedName(SERIALIZED_NAME_VALUE)
  private AttributeValueDTO value;

  public static final String SERIALIZED_NAME_CIID = "ciid";
  @SerializedName(SERIALIZED_NAME_CIID)
  private UUID ciid;


  public FragmentDTO name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @ApiModelProperty(required = true, value = "")

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public FragmentDTO value(AttributeValueDTO value) {
    
    this.value = value;
    return this;
  }

   /**
   * Get value
   * @return value
  **/
  @ApiModelProperty(required = true, value = "")

  public AttributeValueDTO getValue() {
    return value;
  }


  public void setValue(AttributeValueDTO value) {
    this.value = value;
  }


  public FragmentDTO ciid(UUID ciid) {
    
    this.ciid = ciid;
    return this;
  }

   /**
   * Get ciid
   * @return ciid
  **/
  @ApiModelProperty(required = true, value = "")

  public UUID getCiid() {
    return ciid;
  }


  public void setCiid(UUID ciid) {
    this.ciid = ciid;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FragmentDTO fragmentDTO = (FragmentDTO) o;
    return Objects.equals(this.name, fragmentDTO.name) &&
        Objects.equals(this.value, fragmentDTO.value) &&
        Objects.equals(this.ciid, fragmentDTO.ciid);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, value, ciid);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FragmentDTO {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
    sb.append("    ciid: ").append(toIndentedString(ciid)).append("\n");
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

