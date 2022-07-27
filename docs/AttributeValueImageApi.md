# AttributeValueImageApi

All URIs are relative to *https://localhost:44378*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**attributeValueImageGet**](AttributeValueImageApi.md#attributeValueImageGet) | **GET** /api/v{version}/AttributeValueImage |  |
| [**attributeValueImagePost**](AttributeValueImageApi.md#attributeValueImagePost) | **POST** /api/v{version}/AttributeValueImage |  |


<a name="attributeValueImageGet"></a>
# **attributeValueImageGet**
> attributeValueImageGet(ciid, attributeName, layerIDs, version, index, atTime)



### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.AttributeValueImageApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://localhost:44378");
    
    // Configure OAuth2 access token for authorization: oauth2
    OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
    oauth2.setAccessToken("YOUR ACCESS TOKEN");

    // Configure OAuth2 access token for authorization: oauth2
    OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
    oauth2.setAccessToken("YOUR ACCESS TOKEN");

    AttributeValueImageApi apiInstance = new AttributeValueImageApi(defaultClient);
    UUID ciid = UUID.randomUUID(); // UUID | 
    String attributeName = "attributeName_example"; // String | 
    List<String> layerIDs = Arrays.asList(); // List<String> | 
    String version = "version_example"; // String | 
    Integer index = 0; // Integer | 
    OffsetDateTime atTime = OffsetDateTime.now(); // OffsetDateTime | 
    try {
      apiInstance.attributeValueImageGet(ciid, attributeName, layerIDs, version, index, atTime);
    } catch (ApiException e) {
      System.err.println("Exception when calling AttributeValueImageApi#attributeValueImageGet");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **ciid** | **UUID**|  | |
| **attributeName** | **String**|  | |
| **layerIDs** | [**List&lt;String&gt;**](String.md)|  | |
| **version** | **String**|  | |
| **index** | **Integer**|  | [optional] [default to 0] |
| **atTime** | **OffsetDateTime**|  | [optional] |

### Return type

null (empty response body)

### Authorization

[oauth2](../README.md#oauth2), [oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

<a name="attributeValueImagePost"></a>
# **attributeValueImagePost**
> attributeValueImagePost(ciid, attributeName, layerID, version, files, forceArray)



### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.AttributeValueImageApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://localhost:44378");
    
    // Configure OAuth2 access token for authorization: oauth2
    OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
    oauth2.setAccessToken("YOUR ACCESS TOKEN");

    // Configure OAuth2 access token for authorization: oauth2
    OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
    oauth2.setAccessToken("YOUR ACCESS TOKEN");

    AttributeValueImageApi apiInstance = new AttributeValueImageApi(defaultClient);
    UUID ciid = UUID.randomUUID(); // UUID | 
    String attributeName = "attributeName_example"; // String | 
    String layerID = "layerID_example"; // String | 
    String version = "version_example"; // String | 
    List<File> files = Arrays.asList(); // List<File> | 
    Boolean forceArray = false; // Boolean | 
    try {
      apiInstance.attributeValueImagePost(ciid, attributeName, layerID, version, files, forceArray);
    } catch (ApiException e) {
      System.err.println("Exception when calling AttributeValueImageApi#attributeValueImagePost");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **ciid** | **UUID**|  | |
| **attributeName** | **String**|  | |
| **layerID** | **String**|  | |
| **version** | **String**|  | |
| **files** | **List&lt;File&gt;**|  | |
| **forceArray** | **Boolean**|  | [optional] [default to false] |

### Return type

null (empty response body)

### Authorization

[oauth2](../README.md#oauth2), [oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: Not defined

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

