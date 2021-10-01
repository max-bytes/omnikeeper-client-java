# AttributeApi

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**bulkReplaceAttributesInLayer**](AttributeApi.md#bulkReplaceAttributesInLayer) | **POST** /api/v{version}/Attribute/bulkReplaceAttributesInLayer | bulk replace all attributes in specified layer
[**findMergedAttributesByName**](AttributeApi.md#findMergedAttributesByName) | **GET** /api/v{version}/Attribute/findMergedAttributesByName | 
[**getMergedAttribute**](AttributeApi.md#getMergedAttribute) | **GET** /api/v{version}/Attribute/getMergedAttribute | 
[**getMergedAttributes**](AttributeApi.md#getMergedAttributes) | **GET** /api/v{version}/Attribute/getMergedAttributes | 
[**getMergedAttributesWithName**](AttributeApi.md#getMergedAttributesWithName) | **GET** /api/v{version}/Attribute/getMergedAttributesWithName | 


<a name="bulkReplaceAttributesInLayer"></a>
# **bulkReplaceAttributesInLayer**
> bulkReplaceAttributesInLayer(version, bulkCIAttributeLayerScopeDTO)

bulk replace all attributes in specified layer

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.AttributeApi;

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

    AttributeApi apiInstance = new AttributeApi(defaultClient);
    String version = "version_example"; // String | 
    BulkCIAttributeLayerScopeDTO bulkCIAttributeLayerScopeDTO = new BulkCIAttributeLayerScopeDTO(); // BulkCIAttributeLayerScopeDTO | 
    try {
      apiInstance.bulkReplaceAttributesInLayer(version, bulkCIAttributeLayerScopeDTO);
    } catch (ApiException e) {
      System.err.println("Exception when calling AttributeApi#bulkReplaceAttributesInLayer");
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
 **version** | **String**|  |
 **bulkCIAttributeLayerScopeDTO** | [**BulkCIAttributeLayerScopeDTO**](BulkCIAttributeLayerScopeDTO.md)|  |

### Return type

null (empty response body)

### Authorization

[oauth2](../README.md#oauth2), [oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json;odata.metadata=minimal;odata.streaming=true, application/json;odata.metadata=minimal;odata.streaming=false, application/json;odata.metadata=minimal, application/json;odata.metadata=full;odata.streaming=true, application/json;odata.metadata=full;odata.streaming=false, application/json;odata.metadata=full, application/json;odata.metadata=none;odata.streaming=true, application/json;odata.metadata=none;odata.streaming=false, application/json;odata.metadata=none, application/json;odata.streaming=true, application/json;odata.streaming=false, application/json, application/xml, application/odata, application/json-patch+json, text/json, application/_*+json
 - **Accept**: Not defined

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Success |  -  |

<a name="findMergedAttributesByName"></a>
# **findMergedAttributesByName**
> List&lt;CIAttributeDTO&gt; findMergedAttributesByName(regex, layerIDs, version, ciids, atTime)



### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.AttributeApi;

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

    AttributeApi apiInstance = new AttributeApi(defaultClient);
    String regex = "regex_example"; // String | 
    List<String> layerIDs = Arrays.asList(); // List<String> | 
    String version = "version_example"; // String | 
    List<UUID> ciids = Arrays.asList(); // List<UUID> | 
    OffsetDateTime atTime = OffsetDateTime.now(); // OffsetDateTime | 
    try {
      List<CIAttributeDTO> result = apiInstance.findMergedAttributesByName(regex, layerIDs, version, ciids, atTime);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AttributeApi#findMergedAttributesByName");
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
 **regex** | **String**|  |
 **layerIDs** | [**List&lt;String&gt;**](String.md)|  |
 **version** | **String**|  |
 **ciids** | [**List&lt;UUID&gt;**](UUID.md)|  | [optional]
 **atTime** | **OffsetDateTime**|  | [optional]

### Return type

[**List&lt;CIAttributeDTO&gt;**](CIAttributeDTO.md)

### Authorization

[oauth2](../README.md#oauth2), [oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json;odata.metadata=minimal;odata.streaming=true, application/json;odata.metadata=minimal;odata.streaming=false, application/json;odata.metadata=minimal, application/json;odata.metadata=full;odata.streaming=true, application/json;odata.metadata=full;odata.streaming=false, application/json;odata.metadata=full, application/json;odata.metadata=none;odata.streaming=true, application/json;odata.metadata=none;odata.streaming=false, application/json;odata.metadata=none, application/json;odata.streaming=true, application/json;odata.streaming=false, application/json, application/xml, application/odata, text/plain, text/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Success |  -  |

<a name="getMergedAttribute"></a>
# **getMergedAttribute**
> CIAttributeDTO getMergedAttribute(ciid, name, layerIDs, version, atTime)



### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.AttributeApi;

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

    AttributeApi apiInstance = new AttributeApi(defaultClient);
    UUID ciid = UUID.randomUUID(); // UUID | 
    String name = "name_example"; // String | 
    List<String> layerIDs = Arrays.asList(); // List<String> | 
    String version = "version_example"; // String | 
    OffsetDateTime atTime = OffsetDateTime.now(); // OffsetDateTime | 
    try {
      CIAttributeDTO result = apiInstance.getMergedAttribute(ciid, name, layerIDs, version, atTime);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AttributeApi#getMergedAttribute");
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
 **ciid** | **UUID**|  |
 **name** | **String**|  |
 **layerIDs** | [**List&lt;String&gt;**](String.md)|  |
 **version** | **String**|  |
 **atTime** | **OffsetDateTime**|  | [optional]

### Return type

[**CIAttributeDTO**](CIAttributeDTO.md)

### Authorization

[oauth2](../README.md#oauth2), [oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json;odata.metadata=minimal;odata.streaming=true, application/json;odata.metadata=minimal;odata.streaming=false, application/json;odata.metadata=minimal, application/json;odata.metadata=full;odata.streaming=true, application/json;odata.metadata=full;odata.streaming=false, application/json;odata.metadata=full, application/json;odata.metadata=none;odata.streaming=true, application/json;odata.metadata=none;odata.streaming=false, application/json;odata.metadata=none, application/json;odata.streaming=true, application/json;odata.streaming=false, application/json, application/xml, application/odata, text/plain, text/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Success |  -  |

<a name="getMergedAttributes"></a>
# **getMergedAttributes**
> List&lt;CIAttributeDTO&gt; getMergedAttributes(ciids, layerIDs, version, atTime)



### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.AttributeApi;

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

    AttributeApi apiInstance = new AttributeApi(defaultClient);
    List<UUID> ciids = Arrays.asList(); // List<UUID> | 
    List<String> layerIDs = Arrays.asList(); // List<String> | 
    String version = "version_example"; // String | 
    OffsetDateTime atTime = OffsetDateTime.now(); // OffsetDateTime | 
    try {
      List<CIAttributeDTO> result = apiInstance.getMergedAttributes(ciids, layerIDs, version, atTime);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AttributeApi#getMergedAttributes");
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
 **ciids** | [**List&lt;UUID&gt;**](UUID.md)|  |
 **layerIDs** | [**List&lt;String&gt;**](String.md)|  |
 **version** | **String**|  |
 **atTime** | **OffsetDateTime**|  | [optional]

### Return type

[**List&lt;CIAttributeDTO&gt;**](CIAttributeDTO.md)

### Authorization

[oauth2](../README.md#oauth2), [oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json;odata.metadata=minimal;odata.streaming=true, application/json;odata.metadata=minimal;odata.streaming=false, application/json;odata.metadata=minimal, application/json;odata.metadata=full;odata.streaming=true, application/json;odata.metadata=full;odata.streaming=false, application/json;odata.metadata=full, application/json;odata.metadata=none;odata.streaming=true, application/json;odata.metadata=none;odata.streaming=false, application/json;odata.metadata=none, application/json;odata.streaming=true, application/json;odata.streaming=false, application/json, application/xml, application/odata, text/plain, text/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Success |  -  |

<a name="getMergedAttributesWithName"></a>
# **getMergedAttributesWithName**
> List&lt;CIAttributeDTO&gt; getMergedAttributesWithName(name, layerIDs, version, atTime)



### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.AttributeApi;

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

    AttributeApi apiInstance = new AttributeApi(defaultClient);
    String name = "name_example"; // String | 
    List<String> layerIDs = Arrays.asList(); // List<String> | 
    String version = "version_example"; // String | 
    OffsetDateTime atTime = OffsetDateTime.now(); // OffsetDateTime | 
    try {
      List<CIAttributeDTO> result = apiInstance.getMergedAttributesWithName(name, layerIDs, version, atTime);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AttributeApi#getMergedAttributesWithName");
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
 **name** | **String**|  |
 **layerIDs** | [**List&lt;String&gt;**](String.md)|  |
 **version** | **String**|  |
 **atTime** | **OffsetDateTime**|  | [optional]

### Return type

[**List&lt;CIAttributeDTO&gt;**](CIAttributeDTO.md)

### Authorization

[oauth2](../README.md#oauth2), [oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json;odata.metadata=minimal;odata.streaming=true, application/json;odata.metadata=minimal;odata.streaming=false, application/json;odata.metadata=minimal, application/json;odata.metadata=full;odata.streaming=true, application/json;odata.metadata=full;odata.streaming=false, application/json;odata.metadata=full, application/json;odata.metadata=none;odata.streaming=true, application/json;odata.metadata=none;odata.streaming=false, application/json;odata.metadata=none, application/json;odata.streaming=true, application/json;odata.streaming=false, application/json, application/xml, application/odata, text/plain, text/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Success |  -  |

