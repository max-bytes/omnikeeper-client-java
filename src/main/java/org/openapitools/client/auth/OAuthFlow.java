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


package org.openapitools.client.auth;

/**
 * OAuth flows that are supported by this client
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-03-12T17:55:20.583339702Z[Etc/UTC]", comments = "Generator version: 7.5.0-SNAPSHOT")
public enum OAuthFlow {
    ACCESS_CODE, //called authorizationCode  in OpenAPI 3.0
    IMPLICIT,
    PASSWORD,
    APPLICATION //called clientCredentials in OpenAPI 3.0
}
