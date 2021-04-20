# AttributeValueImageApi

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**get**](AttributeValueImageApi.md#get) | **GET** /api/v{version}/AttributeValueImage | 
[**post**](AttributeValueImageApi.md#post) | **POST** /api/v{version}/AttributeValueImage | 


<a name="get"></a>
# **get**
> get(ciid, attributeName, layerIDs, version, index, atTime)



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
    defaultClient.setBasePath("http://localhost");
    
    // Configure OAuth2 access token for authorization: oauth2
    OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
    oauth2.setAccessToken("YOUR ACCESS TOKEN");

    // Configure OAuth2 access token for authorization: oauth2
    OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
    oauth2.setAccessToken("YOUR ACCESS TOKEN");

    AttributeValueImageApi apiInstance = new AttributeValueImageApi(defaultClient);
    UUID ciid = new UUID(); // UUID | 
    String attributeName = "attributeName_example"; // String | 
    List<Long> layerIDs = Arrays.asList(); // List<Long> | 
    String version = "version_example"; // String | 
    Integer index = 0; // Integer | 
    OffsetDateTime atTime = OffsetDateTime.now(); // OffsetDateTime | 
    try {
      apiInstance.get(ciid, attributeName, layerIDs, version, index, atTime);
    } catch (ApiException e) {
      System.err.println("Exception when calling AttributeValueImageApi#get");
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
 **attributeName** | **String**|  |
 **layerIDs** | [**List&lt;Long&gt;**](Long.md)|  |
 **version** | **String**|  |
 **index** | **Integer**|  | [optional] [default to 0]
 **atTime** | **OffsetDateTime**|  | [optional]

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
**200** | Success |  -  |

<a name="post"></a>
# **post**
> post(ciid, attributeName, layerID, version, files, forceArray)



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
    defaultClient.setBasePath("http://localhost");
    
    // Configure OAuth2 access token for authorization: oauth2
    OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
    oauth2.setAccessToken("YOUR ACCESS TOKEN");

    // Configure OAuth2 access token for authorization: oauth2
    OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
    oauth2.setAccessToken("YOUR ACCESS TOKEN");

    AttributeValueImageApi apiInstance = new AttributeValueImageApi(defaultClient);
    UUID ciid = new UUID(); // UUID | 
    String attributeName = "attributeName_example"; // String | 
    Long layerID = 56L; // Long | 
    String version = "version_example"; // String | 
    List<File> files = new File("/path/to/file"); // List<File> | 
    Boolean forceArray = false; // Boolean | 
    try {
      apiInstance.post(ciid, attributeName, layerID, version, files, forceArray);
    } catch (ApiException e) {
      System.err.println("Exception when calling AttributeValueImageApi#post");
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
 **attributeName** | **String**|  |
 **layerID** | **Long**|  |
 **version** | **String**|  |
 **files** | **List&lt;File&gt;**|  |
 **forceArray** | **Boolean**|  | [optional] [default to false]

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
**200** | Success |  -  |

