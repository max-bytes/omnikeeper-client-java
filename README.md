# openapi-java-client

Landscape omnikeeper REST API
- API version: v1
  - Build date: 2022-07-21T11:24:27.761008Z[Etc/UTC]

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
import org.openapitools.client.api.ActiveDirectoryXmlIngestApi;

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

    ActiveDirectoryXmlIngestApi apiInstance = new ActiveDirectoryXmlIngestApi(defaultClient);
    String version = "version_example"; // String | 
    String writeLayerID = "writeLayerID_example"; // String | 
    List<String> searchLayerIDs = Arrays.asList(); // List<String> | 
    List<File> files = Arrays.asList(); // List<File> | 
    try {
      apiInstance.ingestXML(version, writeLayerID, searchLayerIDs, files);
    } catch (ApiException e) {
      System.err.println("Exception when calling ActiveDirectoryXmlIngestApi#ingestXML");
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
*ActiveDirectoryXmlIngestApi* | [**ingestXML**](docs/ActiveDirectoryXmlIngestApi.md#ingestXML) | **POST** /api/v{version}/Ingest/AD-XML | 
*AnsibleInventoryScanIngestApi* | [**ingestAnsibleInventoryScan**](docs/AnsibleInventoryScanIngestApi.md#ingestAnsibleInventoryScan) | **POST** /api/v{version}/Ingest/AnsibleInventoryScan | 
*AttributeApi* | [**bulkReplaceAttributesInLayer**](docs/AttributeApi.md#bulkReplaceAttributesInLayer) | **POST** /api/v{version}/Attribute/bulkReplaceAttributesInLayer | bulk replace all attributes in specified layer
*AttributeApi* | [**findMergedAttributesByName**](docs/AttributeApi.md#findMergedAttributesByName) | **GET** /api/v{version}/Attribute/findMergedAttributesByName | 
*AttributeApi* | [**getMergedAttribute**](docs/AttributeApi.md#getMergedAttribute) | **GET** /api/v{version}/Attribute/getMergedAttribute | 
*AttributeApi* | [**getMergedAttributes**](docs/AttributeApi.md#getMergedAttributes) | **GET** /api/v{version}/Attribute/getMergedAttributes | 
*AttributeApi* | [**getMergedAttributesWithName**](docs/AttributeApi.md#getMergedAttributesWithName) | **GET** /api/v{version}/Attribute/getMergedAttributesWithName | 
*AttributeValueImageApi* | [**get**](docs/AttributeValueImageApi.md#get) | **GET** /api/v{version}/AttributeValueImage | 
*AttributeValueImageApi* | [**post**](docs/AttributeValueImageApi.md#post) | **POST** /api/v{version}/AttributeValueImage | 
*CiApi* | [**getAllCIIDs**](docs/CiApi.md#getAllCIIDs) | **GET** /api/v{version}/CI/getAllCIIDs | list of all CI-IDs
*CiApi* | [**getCIByID**](docs/CiApi.md#getCIByID) | **GET** /api/v{version}/CI/getCIByID | single CI by CI-ID
*CiApi* | [**getCIsByID**](docs/CiApi.md#getCIsByID) | **GET** /api/v{version}/CI/getCIsByID | multiple CIs by CI-ID  !Watch out for the query URL getting too long because of a lot of CIIDs!  TODO: consider using POST
*CiSearchApi* | [**searchCIsByTraits**](docs/CiSearchApi.md#searchCIsByTraits) | **GET** /api/v{version}/CISearch/searchCIsByTraits | 
*GraphQlApi* | [**debug**](docs/GraphQlApi.md#debug) | **POST** /graphql-debug | 
*GraphQlApi* | [**index**](docs/GraphQlApi.md#index) | **POST** /graphql | 
*GridViewApi* | [**addContext**](docs/GridViewApi.md#addContext) | **POST** /api/v{version}/GridView/context | Adds new context
*GridViewApi* | [**changeData**](docs/GridViewApi.md#changeData) | **POST** /api/v{version}/GridView/contexts/{context}/change | Saves grid view row changes and returns change results
*GridViewApi* | [**deleteContext**](docs/GridViewApi.md#deleteContext) | **DELETE** /api/v{version}/GridView/context/{name} | Deletes specific context
*GridViewApi* | [**editContext**](docs/GridViewApi.md#editContext) | **PUT** /api/v{version}/GridView/context/{name} | Edits specific context
*GridViewApi* | [**getData**](docs/GridViewApi.md#getData) | **GET** /api/v{version}/GridView/contexts/{context}/data | Returns grid view data for specific context
*GridViewApi* | [**getGridViewContext**](docs/GridViewApi.md#getGridViewContext) | **GET** /api/v{version}/GridView/context/{name} | Returns a single context in full
*GridViewApi* | [**getGridViewContexts**](docs/GridViewApi.md#getGridViewContexts) | **GET** /api/v{version}/GridView/contexts | Returns a list of contexts for grid view.
*GridViewApi* | [**getSchema**](docs/GridViewApi.md#getSchema) | **GET** /api/v{version}/GridView/contexts/{context}/schema | Returns grid view schema for specific context
*LayerApi* | [**getAllLayers**](docs/LayerApi.md#getAllLayers) | **GET** /api/v{version}/Layer/getAllLayers | list of all layers
*LayerApi* | [**getLayerByName**](docs/LayerApi.md#getLayerByName) | **GET** /api/v{version}/Layer/getLayerByName | get a layer by name
*LayerApi* | [**getLayersByName**](docs/LayerApi.md#getLayersByName) | **GET** /api/v{version}/Layer/getLayersByName | get layers by name
*OkPluginGenericJsonIngestApi* | [**getAllContexts**](docs/OkPluginGenericJsonIngestApi.md#getAllContexts) | **GET** /api/v{version}/ingest/genericJSON/manage/context | 
*OkPluginGenericJsonIngestApi* | [**getContext**](docs/OkPluginGenericJsonIngestApi.md#getContext) | **GET** /api/v{version}/ingest/genericJSON/manage/context/{id} | 
*OkPluginGenericJsonIngestApi* | [**ingest**](docs/OkPluginGenericJsonIngestApi.md#ingest) | **POST** /api/v{version}/ingest/genericJSON/files | 
*OkPluginGenericJsonIngestApi* | [**removeContext**](docs/OkPluginGenericJsonIngestApi.md#removeContext) | **DELETE** /api/v{version}/ingest/genericJSON/manage/context/{id} | 
*OkPluginGenericJsonIngestApi* | [**upsertContext**](docs/OkPluginGenericJsonIngestApi.md#upsertContext) | **POST** /api/v{version}/ingest/genericJSON/manage/context | 
*RelationApi* | [**getAllMergedRelations**](docs/RelationApi.md#getAllMergedRelations) | **GET** /api/v{version}/Relation/getAllMergedRelations | 
*RelationApi* | [**getMergedRelation**](docs/RelationApi.md#getMergedRelation) | **GET** /api/v{version}/Relation/getMergedRelation | 
*RelationApi* | [**getMergedRelationsFromOrToCI**](docs/RelationApi.md#getMergedRelationsFromOrToCI) | **GET** /api/v{version}/Relation/getMergedRelationsFromOrToCI | 
*RelationApi* | [**getMergedRelationsOutgoingFromCI**](docs/RelationApi.md#getMergedRelationsOutgoingFromCI) | **GET** /api/v{version}/Relation/getMergedRelationsOutgoingFromCI | 
*RelationApi* | [**getMergedRelationsWithPredicate**](docs/RelationApi.md#getMergedRelationsWithPredicate) | **GET** /api/v{version}/Relation/getMergedRelationsWithPredicate | 
*TraitApi* | [**getEffectiveTraitsForTraitName**](docs/TraitApi.md#getEffectiveTraitsForTraitName) | **GET** /api/v{version}/Trait/getEffectiveTraitsForTraitName | 


## Documentation for Models

 - [AddContextRequest](docs/AddContextRequest.md)
 - [AnsibleInventoryScanDTO](docs/AnsibleInventoryScanDTO.md)
 - [AttributeState](docs/AttributeState.md)
 - [AttributeValueDTO](docs/AttributeValueDTO.md)
 - [AttributeValueType](docs/AttributeValueType.md)
 - [BulkCIAttributeLayerScopeDTO](docs/BulkCIAttributeLayerScopeDTO.md)
 - [CIAttributeDTO](docs/CIAttributeDTO.md)
 - [CIDTO](docs/CIDTO.md)
 - [ChangeDataCell](docs/ChangeDataCell.md)
 - [ChangeDataRequest](docs/ChangeDataRequest.md)
 - [Context](docs/Context.md)
 - [EditContextRequest](docs/EditContextRequest.md)
 - [EffectiveTraitDTO](docs/EffectiveTraitDTO.md)
 - [FragmentDTO](docs/FragmentDTO.md)
 - [GraphQLQuery](docs/GraphQLQuery.md)
 - [GridViewColumn](docs/GridViewColumn.md)
 - [GridViewConfiguration](docs/GridViewConfiguration.md)
 - [ILoadConfig](docs/ILoadConfig.md)
 - [LayerDTO](docs/LayerDTO.md)
 - [ProblemDetails](docs/ProblemDetails.md)
 - [RelatedCIDTO](docs/RelatedCIDTO.md)
 - [RelationDTO](docs/RelationDTO.md)
 - [RelationState](docs/RelationState.md)
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



