# OkPluginInsightDiscoveryIngestApi

All URIs are relative to *http://localhost*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**ingestFileIngest**](OkPluginInsightDiscoveryIngestApi.md#ingestFileIngest) | **POST** /api/v{version}/ingest/insight-discovery/file |  |


<a id="ingestFileIngest"></a>
# **ingestFileIngest**
> ingestFileIngest(context, version, contentType, contentDisposition, headers, length, name, fileName)



### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.OkPluginInsightDiscoveryIngestApi;

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

    OkPluginInsightDiscoveryIngestApi apiInstance = new OkPluginInsightDiscoveryIngestApi(defaultClient);
    String context = "context_example"; // String | 
    String version = "version_example"; // String | 
    String contentType = "contentType_example"; // String | 
    String contentDisposition = "contentDisposition_example"; // String | 
    Map<String, List<String>> headers = new HashMap(); // Map<String, List<String>> | 
    Long length = 56L; // Long | 
    String name = "name_example"; // String | 
    String fileName = "fileName_example"; // String | 
    try {
      apiInstance.ingestFileIngest(context, version, contentType, contentDisposition, headers, length, name, fileName);
    } catch (ApiException e) {
      System.err.println("Exception when calling OkPluginInsightDiscoveryIngestApi#ingestFileIngest");
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
| **context** | **String**|  | |
| **version** | **String**|  | |
| **contentType** | **String**|  | [optional] |
| **contentDisposition** | **String**|  | [optional] |
| **headers** | [**Map&lt;String, List&lt;String&gt;&gt;**](Map.md)|  | [optional] |
| **length** | **Long**|  | [optional] |
| **name** | **String**|  | [optional] |
| **fileName** | **String**|  | [optional] |

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

