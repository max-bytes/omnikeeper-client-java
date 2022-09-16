# openapi-java-client

Landscape omnikeeper REST API
- API version: v1
  - Build date: 2022-09-16T09:49:59.654201Z[Etc/UTC]

No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)


*Automatically generated by the [OpenAPI Generator](https://openapi-generator.tech)*


## Requirements

Building the API client library requires:
1. Java 1.8+
2. Maven (3.8.3+)/Gradle (7.2+)

## Installation

To install the API client library to your local Maven repository, simply execute:

```shell
mvn clean install
```

To deploy it to a remote Maven repository instead, configure the settings of the repository and execute:

```shell
mvn clean deploy
```

Refer to the [OSSRH Guide](http://central.sonatype.org/pages/ossrh-guide.html) for more information.

### Maven users

Add this dependency to your project's POM:

```xml
<dependency>
  <groupId>org.openapitools</groupId>
  <artifactId>openapi-java-client</artifactId>
  <version>v1</version>
  <scope>compile</scope>
</dependency>
```

### Gradle users

Add this dependency to your project's build file:

```groovy
  repositories {
    mavenCentral()     // Needed if the 'openapi-java-client' jar has been published to maven central.
    mavenLocal()       // Needed if the 'openapi-java-client' jar has been published to the local maven repo.
  }

  dependencies {
     implementation "org.openapitools:openapi-java-client:v1"
  }
```

### Others

At first generate the JAR by executing:

```shell
mvn clean package
```

Then manually install the following JARs:

* `target/openapi-java-client-v1.jar`
* `target/lib/*.jar`

## Getting Started

Please follow the [installation](#installation) instruction and execute the following Java code:

```java

// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.AnsibleInventoryScanIngestApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure OAuth2 access token for authorization: oauth2
    OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
    oauth2.setAccessToken("YOUR ACCESS TOKEN");

    // Configure OAuth2 access token for authorization: oauth2
    OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
    oauth2.setAccessToken("YOUR ACCESS TOKEN");

    AnsibleInventoryScanIngestApi apiInstance = new AnsibleInventoryScanIngestApi(defaultClient);
    String writeLayerID = "writeLayerID_example"; // String | 
    List<String> searchLayerIDs = Arrays.asList(); // List<String> | 
    String version = "version_example"; // String | 
    AnsibleInventoryScanDTO ansibleInventoryScanDTO = new AnsibleInventoryScanDTO(); // AnsibleInventoryScanDTO | 
    try {
      apiInstance.ansibleInventoryScanIngestIngestAnsibleInventoryScan(writeLayerID, searchLayerIDs, version, ansibleInventoryScanDTO);
    } catch (ApiException e) {
      System.err.println("Exception when calling AnsibleInventoryScanIngestApi#ansibleInventoryScanIngestIngestAnsibleInventoryScan");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

## Documentation for API Endpoints

All URIs are relative to *http://localhost*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*AnsibleInventoryScanIngestApi* | [**ansibleInventoryScanIngestIngestAnsibleInventoryScan**](docs/AnsibleInventoryScanIngestApi.md#ansibleInventoryScanIngestIngestAnsibleInventoryScan) | **POST** /api/v{version}/Ingest/AnsibleInventoryScan | 
*AttributeValueImageApi* | [**attributeValueImageGet**](docs/AttributeValueImageApi.md#attributeValueImageGet) | **GET** /api/v{version}/AttributeValueImage | 
*AttributeValueImageApi* | [**attributeValueImagePost**](docs/AttributeValueImageApi.md#attributeValueImagePost) | **POST** /api/v{version}/AttributeValueImage | 
*AuthRedirectApi* | [**authRedirectIndex**](docs/AuthRedirectApi.md#authRedirectIndex) | **GET** /.well-known/openid-configuration | 
*CytoscapeApi* | [**cytoscapeTraitCentric**](docs/CytoscapeApi.md#cytoscapeTraitCentric) | **GET** /api/v{version}/Cytoscape/traitCentric | 
*GraphQlApi* | [**graphQLDebug**](docs/GraphQlApi.md#graphQLDebug) | **POST** /graphql-debug | 
*GraphQlApi* | [**graphQLGet**](docs/GraphQlApi.md#graphQLGet) | **GET** /graphql | 
*GraphQlApi* | [**graphQLIndex**](docs/GraphQlApi.md#graphQLIndex) | **POST** /graphql | 
*GraphvizDotApi* | [**graphvizDotLayerCentric**](docs/GraphvizDotApi.md#graphvizDotLayerCentric) | **GET** /api/v{version}/GraphvizDot/layerCentric | 
*GraphvizDotApi* | [**graphvizDotTraitCentric**](docs/GraphvizDotApi.md#graphvizDotTraitCentric) | **GET** /api/v{version}/GraphvizDot/traitCentric | 
*GridViewApi* | [**gridViewAddContext**](docs/GridViewApi.md#gridViewAddContext) | **POST** /api/v{version}/GridView/context | Adds new context
*GridViewApi* | [**gridViewChangeData**](docs/GridViewApi.md#gridViewChangeData) | **POST** /api/v{version}/GridView/contexts/{context}/change | Saves grid view row changes and returns change results
*GridViewApi* | [**gridViewDeleteContext**](docs/GridViewApi.md#gridViewDeleteContext) | **DELETE** /api/v{version}/GridView/context/{name} | Deletes specific context
*GridViewApi* | [**gridViewEditContext**](docs/GridViewApi.md#gridViewEditContext) | **PUT** /api/v{version}/GridView/context/{name} | Edits specific context
*GridViewApi* | [**gridViewGetData**](docs/GridViewApi.md#gridViewGetData) | **GET** /api/v{version}/GridView/contexts/{context}/data | Returns grid view data for specific context
*GridViewApi* | [**gridViewGetGridViewContext**](docs/GridViewApi.md#gridViewGetGridViewContext) | **GET** /api/v{version}/GridView/context/{name} | Returns a single context in full
*GridViewApi* | [**gridViewGetGridViewContexts**](docs/GridViewApi.md#gridViewGetGridViewContexts) | **GET** /api/v{version}/GridView/contexts | Returns a list of contexts for grid view.
*GridViewApi* | [**gridViewGetSchema**](docs/GridViewApi.md#gridViewGetSchema) | **GET** /api/v{version}/GridView/contexts/{context}/schema | Returns grid view schema for specific context
*ImportExportLayerApi* | [**importExportLayerExportLayer**](docs/ImportExportLayerApi.md#importExportLayerExportLayer) | **GET** /api/v{version}/ImportExportLayer/exportLayer | 
*ImportExportLayerApi* | [**importExportLayerImportLayer**](docs/ImportExportLayerApi.md#importExportLayerImportLayer) | **POST** /api/v{version}/ImportExportLayer/importLayer | 
*MetadataApi* | [**metadataGetMetadata**](docs/MetadataApi.md#metadataGetMetadata) | **GET** /api/odata/{context}/$metadata | 
*MetadataApi* | [**metadataGetServiceDocument**](docs/MetadataApi.md#metadataGetServiceDocument) | **GET** /api/odata/{context} | 
*OkPluginGenericJsonIngestApi* | [**manageContextGetAllContexts**](docs/OkPluginGenericJsonIngestApi.md#manageContextGetAllContexts) | **GET** /api/v{version}/ingest/genericJSON/manage/context | 
*OkPluginGenericJsonIngestApi* | [**manageContextGetContext**](docs/OkPluginGenericJsonIngestApi.md#manageContextGetContext) | **GET** /api/v{version}/ingest/genericJSON/manage/context/{id} | 
*OkPluginGenericJsonIngestApi* | [**manageContextRemoveContext**](docs/OkPluginGenericJsonIngestApi.md#manageContextRemoveContext) | **DELETE** /api/v{version}/ingest/genericJSON/manage/context/{id} | 
*OkPluginGenericJsonIngestApi* | [**manageContextUpsertContext**](docs/OkPluginGenericJsonIngestApi.md#manageContextUpsertContext) | **POST** /api/v{version}/ingest/genericJSON/manage/context | 
*OkPluginGenericJsonIngestApi* | [**passiveDataIngest**](docs/OkPluginGenericJsonIngestApi.md#passiveDataIngest) | **POST** /api/v{version}/ingest/genericJSON/data | 
*OkPluginGenericJsonIngestApi* | [**passiveFilesIngest**](docs/OkPluginGenericJsonIngestApi.md#passiveFilesIngest) | **POST** /api/v{version}/ingest/genericJSON/files | 
*OkPluginInsightDiscoveryIngestApi* | [**ingestFileIngest**](docs/OkPluginInsightDiscoveryIngestApi.md#ingestFileIngest) | **POST** /api/v{version}/ingest/insight-discovery/file | 
*RestartApplicationApi* | [**restartApplicationRestart**](docs/RestartApplicationApi.md#restartApplicationRestart) | **GET** /api/v{version}/RestartApplication/restart | 
*UsageStatsApi* | [**usageStatsFetch**](docs/UsageStatsApi.md#usageStatsFetch) | **GET** /api/v{version}/UsageStats/fetch | 


## Documentation for Models

 - [AbstractInboundIDMethod](docs/AbstractInboundIDMethod.md)
 - [AddContextRequest](docs/AddContextRequest.md)
 - [AnsibleInventoryScanDTO](docs/AnsibleInventoryScanDTO.md)
 - [AttributeValueDTO](docs/AttributeValueDTO.md)
 - [AttributeValueType](docs/AttributeValueType.md)
 - [ChangeDataCell](docs/ChangeDataCell.md)
 - [ChangeDataRequest](docs/ChangeDataRequest.md)
 - [EditContextRequest](docs/EditContextRequest.md)
 - [EdmContainerElementKind](docs/EdmContainerElementKind.md)
 - [EdmExpressionKind](docs/EdmExpressionKind.md)
 - [EdmSchemaElementKind](docs/EdmSchemaElementKind.md)
 - [EdmTypeKind](docs/EdmTypeKind.md)
 - [GenericInboundAttribute](docs/GenericInboundAttribute.md)
 - [GenericInboundCI](docs/GenericInboundCI.md)
 - [GenericInboundCIIdMethod](docs/GenericInboundCIIdMethod.md)
 - [GenericInboundData](docs/GenericInboundData.md)
 - [GenericInboundRelation](docs/GenericInboundRelation.md)
 - [GraphQLQuery](docs/GraphQLQuery.md)
 - [GridViewColumn](docs/GridViewColumn.md)
 - [GridViewConfiguration](docs/GridViewConfiguration.md)
 - [IEdmEntityContainer](docs/IEdmEntityContainer.md)
 - [IEdmEntityContainerElement](docs/IEdmEntityContainerElement.md)
 - [IEdmExpression](docs/IEdmExpression.md)
 - [IEdmModel](docs/IEdmModel.md)
 - [IEdmSchemaElement](docs/IEdmSchemaElement.md)
 - [IEdmTerm](docs/IEdmTerm.md)
 - [IEdmType](docs/IEdmType.md)
 - [IEdmTypeReference](docs/IEdmTypeReference.md)
 - [IEdmVocabularyAnnotation](docs/IEdmVocabularyAnnotation.md)
 - [InboundIDMethodByAttribute](docs/InboundIDMethodByAttribute.md)
 - [InboundIDMethodByAttributeModifiers](docs/InboundIDMethodByAttributeModifiers.md)
 - [InboundIDMethodByByUnion](docs/InboundIDMethodByByUnion.md)
 - [InboundIDMethodByData](docs/InboundIDMethodByData.md)
 - [InboundIDMethodByIntersect](docs/InboundIDMethodByIntersect.md)
 - [InboundIDMethodByRelatedTempID](docs/InboundIDMethodByRelatedTempID.md)
 - [InboundIDMethodByTemporaryCIID](docs/InboundIDMethodByTemporaryCIID.md)
 - [NoFoundTargetCIHandling](docs/NoFoundTargetCIHandling.md)
 - [ODataEntitySetInfo](docs/ODataEntitySetInfo.md)
 - [ODataFunctionImportInfo](docs/ODataFunctionImportInfo.md)
 - [ODataServiceDocument](docs/ODataServiceDocument.md)
 - [ODataSingletonInfo](docs/ODataSingletonInfo.md)
 - [ODataTypeAnnotation](docs/ODataTypeAnnotation.md)
 - [ProblemDetails](docs/ProblemDetails.md)
 - [SameTargetCIHandling](docs/SameTargetCIHandling.md)
 - [SameTempIDHandling](docs/SameTempIDHandling.md)
 - [SparseRow](docs/SparseRow.md)


## Documentation for Authorization

Authentication schemes defined for the API:
### oauth2

- **Type**: OAuth
- **Flow**: application
- **Authorization URL**: 
- **Scopes**: N/A

### oauth2

- **Type**: OAuth
- **Flow**: accessCode
- **Authorization URL**: https://auth-dev.mhx.at/auth/realms/acme/protocol/openid-connect/auth
- **Scopes**: N/A


## Recommendation

It's recommended to create an instance of `ApiClient` per thread in a multithreaded environment to avoid any potential issues.

## Author



