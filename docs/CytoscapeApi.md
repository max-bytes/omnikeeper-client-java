# CytoscapeApi

All URIs are relative to *http://localhost*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**cytoscapeTraitCentric**](CytoscapeApi.md#cytoscapeTraitCentric) | **GET** /api/v{version}/Cytoscape/traitCentric |  |


<a id="cytoscapeTraitCentric"></a>
# **cytoscapeTraitCentric**
> cytoscapeTraitCentric(layerIDs, version, traitIDs, traitIDsRegex)



### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.CytoscapeApi;

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

    CytoscapeApi apiInstance = new CytoscapeApi(defaultClient);
    List<String> layerIDs = Arrays.asList(); // List<String> | 
    String version = "version_example"; // String | 
    List<String> traitIDs = Arrays.asList(); // List<String> | 
    String traitIDsRegex = "traitIDsRegex_example"; // String | 
    try {
      apiInstance.cytoscapeTraitCentric(layerIDs, version, traitIDs, traitIDsRegex);
    } catch (ApiException e) {
      System.err.println("Exception when calling CytoscapeApi#cytoscapeTraitCentric");
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
| **layerIDs** | [**List&lt;String&gt;**](String.md)|  | |
| **version** | **String**|  | |
| **traitIDs** | [**List&lt;String&gt;**](String.md)|  | [optional] |
| **traitIDsRegex** | **String**|  | [optional] |

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

