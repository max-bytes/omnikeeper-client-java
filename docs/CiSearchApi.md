# CiSearchApi

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**searchCIsByTraits**](CiSearchApi.md#searchCIsByTraits) | **GET** /api/v{version}/CISearch/searchCIsByTraits | 


<a name="searchCIsByTraits"></a>
# **searchCIsByTraits**
> List&lt;CIDTO&gt; searchCIsByTraits(layerIDs, withTraits, withoutTraits, version, atTime)



### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.CiSearchApi;

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

    CiSearchApi apiInstance = new CiSearchApi(defaultClient);
    List<String> layerIDs = Arrays.asList(); // List<String> | 
    List<String> withTraits = Arrays.asList(); // List<String> | 
    List<String> withoutTraits = Arrays.asList(); // List<String> | 
    String version = "version_example"; // String | 
    OffsetDateTime atTime = OffsetDateTime.now(); // OffsetDateTime | 
    try {
      List<CIDTO> result = apiInstance.searchCIsByTraits(layerIDs, withTraits, withoutTraits, version, atTime);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CiSearchApi#searchCIsByTraits");
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
 **withTraits** | [**List&lt;String&gt;**](String.md)|  |
 **withoutTraits** | [**List&lt;String&gt;**](String.md)|  |
 **version** | **String**|  |
 **atTime** | **OffsetDateTime**|  | [optional]

### Return type

[**List&lt;CIDTO&gt;**](CIDTO.md)

### Authorization

[oauth2](../README.md#oauth2), [oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json;odata.metadata=minimal;odata.streaming=true, application/json;odata.metadata=minimal;odata.streaming=false, application/json;odata.metadata=minimal, application/json;odata.metadata=full;odata.streaming=true, application/json;odata.metadata=full;odata.streaming=false, application/json;odata.metadata=full, application/json;odata.metadata=none;odata.streaming=true, application/json;odata.metadata=none;odata.streaming=false, application/json;odata.metadata=none, application/json;odata.streaming=true, application/json;odata.streaming=false, application/json, application/xml, application/odata, text/plain, text/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Success |  -  |

