# RelationApi

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getAllMergedRelations**](RelationApi.md#getAllMergedRelations) | **GET** /api/v{version}/Relation/getAllMergedRelations | 
[**getMergedRelation**](RelationApi.md#getMergedRelation) | **GET** /api/v{version}/Relation/getMergedRelation | 
[**getMergedRelationsFromOrToCI**](RelationApi.md#getMergedRelationsFromOrToCI) | **GET** /api/v{version}/Relation/getMergedRelationsFromOrToCI | 
[**getMergedRelationsOutgoingFromCI**](RelationApi.md#getMergedRelationsOutgoingFromCI) | **GET** /api/v{version}/Relation/getMergedRelationsOutgoingFromCI | 
[**getMergedRelationsWithPredicate**](RelationApi.md#getMergedRelationsWithPredicate) | **GET** /api/v{version}/Relation/getMergedRelationsWithPredicate | 


<a name="getAllMergedRelations"></a>
# **getAllMergedRelations**
> List&lt;RelationDTO&gt; getAllMergedRelations(layerIDs, version, atTime)



### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.RelationApi;

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

    RelationApi apiInstance = new RelationApi(defaultClient);
    List<String> layerIDs = Arrays.asList(); // List<String> | 
    String version = "version_example"; // String | 
    OffsetDateTime atTime = OffsetDateTime.now(); // OffsetDateTime | 
    try {
      List<RelationDTO> result = apiInstance.getAllMergedRelations(layerIDs, version, atTime);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling RelationApi#getAllMergedRelations");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **layerIDs** | [**List&lt;String&gt;**](String.md)|  |
 **version** | **String**|  |
 **atTime** | **OffsetDateTime**|  | [optional]

### Return type

[**List&lt;RelationDTO&gt;**](RelationDTO.md)

### Authorization

[oauth2](../README.md#oauth2), [oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json;odata.metadata=minimal;odata.streaming=true, application/json;odata.metadata=minimal;odata.streaming=false, application/json;odata.metadata=minimal, application/json;odata.metadata=full;odata.streaming=true, application/json;odata.metadata=full;odata.streaming=false, application/json;odata.metadata=full, application/json;odata.metadata=none;odata.streaming=true, application/json;odata.metadata=none;odata.streaming=false, application/json;odata.metadata=none, application/json;odata.streaming=true, application/json;odata.streaming=false, application/json, application/xml, application/odata, text/plain, text/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Success |  -  |

<a name="getMergedRelation"></a>
# **getMergedRelation**
> RelationDTO getMergedRelation(fromCIID, toCIID, predicateID, layerIDs, version, atTime)



### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.RelationApi;

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

    RelationApi apiInstance = new RelationApi(defaultClient);
    UUID fromCIID = new UUID(); // UUID | 
    UUID toCIID = new UUID(); // UUID | 
    String predicateID = "predicateID_example"; // String | 
    List<String> layerIDs = Arrays.asList(); // List<String> | 
    String version = "version_example"; // String | 
    OffsetDateTime atTime = OffsetDateTime.now(); // OffsetDateTime | 
    try {
      RelationDTO result = apiInstance.getMergedRelation(fromCIID, toCIID, predicateID, layerIDs, version, atTime);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling RelationApi#getMergedRelation");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **fromCIID** | [**UUID**](.md)|  |
 **toCIID** | [**UUID**](.md)|  |
 **predicateID** | **String**|  |
 **layerIDs** | [**List&lt;String&gt;**](String.md)|  |
 **version** | **String**|  |
 **atTime** | **OffsetDateTime**|  | [optional]

### Return type

[**RelationDTO**](RelationDTO.md)

### Authorization

[oauth2](../README.md#oauth2), [oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json;odata.metadata=minimal;odata.streaming=true, application/json;odata.metadata=minimal;odata.streaming=false, application/json;odata.metadata=minimal, application/json;odata.metadata=full;odata.streaming=true, application/json;odata.metadata=full;odata.streaming=false, application/json;odata.metadata=full, application/json;odata.metadata=none;odata.streaming=true, application/json;odata.metadata=none;odata.streaming=false, application/json;odata.metadata=none, application/json;odata.streaming=true, application/json;odata.streaming=false, application/json, application/xml, application/odata, text/plain, text/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Success |  -  |

<a name="getMergedRelationsFromOrToCI"></a>
# **getMergedRelationsFromOrToCI**
> List&lt;RelationDTO&gt; getMergedRelationsFromOrToCI(ciid, layerIDs, version, atTime)



### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.RelationApi;

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

    RelationApi apiInstance = new RelationApi(defaultClient);
    UUID ciid = new UUID(); // UUID | 
    List<String> layerIDs = Arrays.asList(); // List<String> | 
    String version = "version_example"; // String | 
    OffsetDateTime atTime = OffsetDateTime.now(); // OffsetDateTime | 
    try {
      List<RelationDTO> result = apiInstance.getMergedRelationsFromOrToCI(ciid, layerIDs, version, atTime);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling RelationApi#getMergedRelationsFromOrToCI");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ciid** | [**UUID**](.md)|  |
 **layerIDs** | [**List&lt;String&gt;**](String.md)|  |
 **version** | **String**|  |
 **atTime** | **OffsetDateTime**|  | [optional]

### Return type

[**List&lt;RelationDTO&gt;**](RelationDTO.md)

### Authorization

[oauth2](../README.md#oauth2), [oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json;odata.metadata=minimal;odata.streaming=true, application/json;odata.metadata=minimal;odata.streaming=false, application/json;odata.metadata=minimal, application/json;odata.metadata=full;odata.streaming=true, application/json;odata.metadata=full;odata.streaming=false, application/json;odata.metadata=full, application/json;odata.metadata=none;odata.streaming=true, application/json;odata.metadata=none;odata.streaming=false, application/json;odata.metadata=none, application/json;odata.streaming=true, application/json;odata.streaming=false, application/json, application/xml, application/odata, text/plain, text/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Success |  -  |

<a name="getMergedRelationsOutgoingFromCI"></a>
# **getMergedRelationsOutgoingFromCI**
> List&lt;RelationDTO&gt; getMergedRelationsOutgoingFromCI(fromCIID, layerIDs, version, atTime)



### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.RelationApi;

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

    RelationApi apiInstance = new RelationApi(defaultClient);
    UUID fromCIID = new UUID(); // UUID | 
    List<String> layerIDs = Arrays.asList(); // List<String> | 
    String version = "version_example"; // String | 
    OffsetDateTime atTime = OffsetDateTime.now(); // OffsetDateTime | 
    try {
      List<RelationDTO> result = apiInstance.getMergedRelationsOutgoingFromCI(fromCIID, layerIDs, version, atTime);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling RelationApi#getMergedRelationsOutgoingFromCI");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **fromCIID** | [**UUID**](.md)|  |
 **layerIDs** | [**List&lt;String&gt;**](String.md)|  |
 **version** | **String**|  |
 **atTime** | **OffsetDateTime**|  | [optional]

### Return type

[**List&lt;RelationDTO&gt;**](RelationDTO.md)

### Authorization

[oauth2](../README.md#oauth2), [oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json;odata.metadata=minimal;odata.streaming=true, application/json;odata.metadata=minimal;odata.streaming=false, application/json;odata.metadata=minimal, application/json;odata.metadata=full;odata.streaming=true, application/json;odata.metadata=full;odata.streaming=false, application/json;odata.metadata=full, application/json;odata.metadata=none;odata.streaming=true, application/json;odata.metadata=none;odata.streaming=false, application/json;odata.metadata=none, application/json;odata.streaming=true, application/json;odata.streaming=false, application/json, application/xml, application/odata, text/plain, text/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Success |  -  |

<a name="getMergedRelationsWithPredicate"></a>
# **getMergedRelationsWithPredicate**
> List&lt;RelationDTO&gt; getMergedRelationsWithPredicate(predicateID, layerIDs, version, atTime)



### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.RelationApi;

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

    RelationApi apiInstance = new RelationApi(defaultClient);
    String predicateID = "predicateID_example"; // String | 
    List<String> layerIDs = Arrays.asList(); // List<String> | 
    String version = "version_example"; // String | 
    OffsetDateTime atTime = OffsetDateTime.now(); // OffsetDateTime | 
    try {
      List<RelationDTO> result = apiInstance.getMergedRelationsWithPredicate(predicateID, layerIDs, version, atTime);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling RelationApi#getMergedRelationsWithPredicate");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **predicateID** | **String**|  |
 **layerIDs** | [**List&lt;String&gt;**](String.md)|  |
 **version** | **String**|  |
 **atTime** | **OffsetDateTime**|  | [optional]

### Return type

[**List&lt;RelationDTO&gt;**](RelationDTO.md)

### Authorization

[oauth2](../README.md#oauth2), [oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json;odata.metadata=minimal;odata.streaming=true, application/json;odata.metadata=minimal;odata.streaming=false, application/json;odata.metadata=minimal, application/json;odata.metadata=full;odata.streaming=true, application/json;odata.metadata=full;odata.streaming=false, application/json;odata.metadata=full, application/json;odata.metadata=none;odata.streaming=true, application/json;odata.metadata=none;odata.streaming=false, application/json;odata.metadata=none, application/json;odata.streaming=true, application/json;odata.streaming=false, application/json, application/xml, application/odata, text/plain, text/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Success |  -  |

