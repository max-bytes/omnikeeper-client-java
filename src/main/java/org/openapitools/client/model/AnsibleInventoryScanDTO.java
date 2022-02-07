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
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * AnsibleInventoryScanDTO
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-02-07T11:21:23.377131Z[Etc/UTC]")
public class AnsibleInventoryScanDTO {
  public static final String SERIALIZED_NAME_SETUP_FACTS = "setupFacts";
  @SerializedName(SERIALIZED_NAME_SETUP_FACTS)
  private Map<String, Object> setupFacts = new HashMap<String, Object>();

  public static final String SERIALIZED_NAME_YUM_INSTALLED = "yumInstalled";
  @SerializedName(SERIALIZED_NAME_YUM_INSTALLED)
  private Map<String, Object> yumInstalled = new HashMap<String, Object>();

  public static final String SERIALIZED_NAME_YUM_REPOS = "yumRepos";
  @SerializedName(SERIALIZED_NAME_YUM_REPOS)
  private Map<String, Object> yumRepos = new HashMap<String, Object>();

  public static final String SERIALIZED_NAME_YUM_UPDATES = "yumUpdates";
  @SerializedName(SERIALIZED_NAME_YUM_UPDATES)
  private Map<String, Object> yumUpdates = new HashMap<String, Object>();

  public AnsibleInventoryScanDTO() { 
  }

  public AnsibleInventoryScanDTO setupFacts(Map<String, Object> setupFacts) {
    
    this.setupFacts = setupFacts;
    return this;
  }

  public AnsibleInventoryScanDTO putSetupFactsItem(String key, Object setupFactsItem) {
    this.setupFacts.put(key, setupFactsItem);
    return this;
  }

   /**
   * Get setupFacts
   * @return setupFacts
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public Map<String, Object> getSetupFacts() {
    return setupFacts;
  }


  public void setSetupFacts(Map<String, Object> setupFacts) {
    this.setupFacts = setupFacts;
  }


  public AnsibleInventoryScanDTO yumInstalled(Map<String, Object> yumInstalled) {
    
    this.yumInstalled = yumInstalled;
    return this;
  }

  public AnsibleInventoryScanDTO putYumInstalledItem(String key, Object yumInstalledItem) {
    this.yumInstalled.put(key, yumInstalledItem);
    return this;
  }

   /**
   * Get yumInstalled
   * @return yumInstalled
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public Map<String, Object> getYumInstalled() {
    return yumInstalled;
  }


  public void setYumInstalled(Map<String, Object> yumInstalled) {
    this.yumInstalled = yumInstalled;
  }


  public AnsibleInventoryScanDTO yumRepos(Map<String, Object> yumRepos) {
    
    this.yumRepos = yumRepos;
    return this;
  }

  public AnsibleInventoryScanDTO putYumReposItem(String key, Object yumReposItem) {
    this.yumRepos.put(key, yumReposItem);
    return this;
  }

   /**
   * Get yumRepos
   * @return yumRepos
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public Map<String, Object> getYumRepos() {
    return yumRepos;
  }


  public void setYumRepos(Map<String, Object> yumRepos) {
    this.yumRepos = yumRepos;
  }


  public AnsibleInventoryScanDTO yumUpdates(Map<String, Object> yumUpdates) {
    
    this.yumUpdates = yumUpdates;
    return this;
  }

  public AnsibleInventoryScanDTO putYumUpdatesItem(String key, Object yumUpdatesItem) {
    this.yumUpdates.put(key, yumUpdatesItem);
    return this;
  }

   /**
   * Get yumUpdates
   * @return yumUpdates
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public Map<String, Object> getYumUpdates() {
    return yumUpdates;
  }


  public void setYumUpdates(Map<String, Object> yumUpdates) {
    this.yumUpdates = yumUpdates;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AnsibleInventoryScanDTO ansibleInventoryScanDTO = (AnsibleInventoryScanDTO) o;
    return Objects.equals(this.setupFacts, ansibleInventoryScanDTO.setupFacts) &&
        Objects.equals(this.yumInstalled, ansibleInventoryScanDTO.yumInstalled) &&
        Objects.equals(this.yumRepos, ansibleInventoryScanDTO.yumRepos) &&
        Objects.equals(this.yumUpdates, ansibleInventoryScanDTO.yumUpdates);
  }

  @Override
  public int hashCode() {
    return Objects.hash(setupFacts, yumInstalled, yumRepos, yumUpdates);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AnsibleInventoryScanDTO {\n");
    sb.append("    setupFacts: ").append(toIndentedString(setupFacts)).append("\n");
    sb.append("    yumInstalled: ").append(toIndentedString(yumInstalled)).append("\n");
    sb.append("    yumRepos: ").append(toIndentedString(yumRepos)).append("\n");
    sb.append("    yumUpdates: ").append(toIndentedString(yumUpdates)).append("\n");
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

