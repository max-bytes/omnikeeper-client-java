# ImportExportLayerApi

All URIs are relative to *http://localhost*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**importExportLayerExportLayer**](ImportExportLayerApi.md#importExportLayerExportLayer) | **GET** /api/v{version}/ImportExportLayer/exportLayer |  |
| [**importExportLayerImportLayer**](ImportExportLayerApi.md#importExportLayerImportLayer) | **POST** /api/v{version}/ImportExportLayer/importLayer |  |


<a name="importExportLayerExportLayer"></a>
# **importExportLayerExportLayer**
> importExportLayerExportLayer(layerID, version, ciids)



### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ImportExportLayerApi;

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

    ImportExportLayerApi apiInstance = new ImportExportLayerApi(defaultClient);
    String layerID = "layerID_example"; // String | 
    String version = "version_example"; // String | 
    List<UUID> ciids = Arrays.asList(); // List<UUID> | 
    try {
      apiInstance.importExportLayerExportLayer(layerID, version, ciids);
    } catch (ApiException e) {
      System.err.println("Exception when calling ImportExportLayerApi#importExportLayerExportLayer");
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
| **layerID** | **String**|  | |
| **version** | **String**|  | |
| **ciids** | [**List&lt;UUID&gt;**](UUID.md)|  | [optional] |

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

<a name="importExportLayerImportLayer"></a>
# **importExportLayerImportLayer**
> importExportLayerImportLayer(version, files, overwriteLayerID)



### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ImportExportLayerApi;

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

    ImportExportLayerApi apiInstance = new ImportExportLayerApi(defaultClient);
    String version = "version_example"; // String | 
    List<File> files = Arrays.asList(); // List<File> | 
    String overwriteLayerID = "overwriteLayerID_example"; // String | 
    try {
      apiInstance.importExportLayerImportLayer(version, files, overwriteLayerID);
    } catch (ApiException e) {
      System.err.println("Exception when calling ImportExportLayerApi#importExportLayerImportLayer");
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
| **version** | **String**|  | |
| **files** | **List&lt;File&gt;**|  | |
| **overwriteLayerID** | **String**|  | [optional] |

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

