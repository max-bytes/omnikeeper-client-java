# ActiveDirectoryXmlIngestApi

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**ingestXML**](ActiveDirectoryXmlIngestApi.md#ingestXML) | **POST** /api/v{version}/Ingest/AD-XML | 


<a name="ingestXML"></a>
# **ingestXML**
> ingestXML(version, writeLayerID, searchLayerIDs, files)



### Example
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
    Long writeLayerID = 56L; // Long | 
    List<Long> searchLayerIDs = 56L; // List<Long> | 
    List<File> files = new File("/path/to/file"); // List<File> | 
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

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **version** | **String**|  |
 **writeLayerID** | **Long**|  |
 **searchLayerIDs** | [**List&lt;Long&gt;**](Long.md)|  |
 **files** | **List&lt;File&gt;**|  |

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

