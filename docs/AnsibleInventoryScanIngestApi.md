# AnsibleInventoryScanIngestApi

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**ingestAnsibleInventoryScan**](AnsibleInventoryScanIngestApi.md#ingestAnsibleInventoryScan) | **POST** /api/v{version}/Ingest/AnsibleInventoryScan | 


<a name="ingestAnsibleInventoryScan"></a>
# **ingestAnsibleInventoryScan**
> ingestAnsibleInventoryScan(writeLayerID, searchLayerIDs, version, ansibleInventoryScanDTO)



### Example
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
      apiInstance.ingestAnsibleInventoryScan(writeLayerID, searchLayerIDs, version, ansibleInventoryScanDTO);
    } catch (ApiException e) {
      System.err.println("Exception when calling AnsibleInventoryScanIngestApi#ingestAnsibleInventoryScan");
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
 **writeLayerID** | **String**|  |
 **searchLayerIDs** | [**List&lt;String&gt;**](String.md)|  |
 **version** | **String**|  |
 **ansibleInventoryScanDTO** | [**AnsibleInventoryScanDTO**](AnsibleInventoryScanDTO.md)|  |

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

