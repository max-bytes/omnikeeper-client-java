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

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-09-07T11:44:24.822545Z[Etc/UTC]")
public enum OAuthFlow {
    accessCode, //called authorizationCode  in OpenAPI 3.0
    implicit,
    password,
    application //called clientCredentials in OpenAPI 3.0
}
