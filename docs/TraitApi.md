# TraitApi

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getEffectiveTraitsForTraitName**](TraitApi.md#getEffectiveTraitsForTraitName) | **GET** /api/v{version}/Trait/getEffectiveTraitsForTraitName | 


<a name="getEffectiveTraitsForTraitName"></a>
# **getEffectiveTraitsForTraitName**
> Map&lt;String, EffectiveTraitDTO&gt; getEffectiveTraitsForTraitName(layerIDs, traitName, version, atTime)



### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.TraitApi;

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

    TraitApi apiInstance = new TraitApi(defaultClient);
    List<String> layerIDs = Arrays.asList(); // List<String> | 
    String traitName = "traitName_example"; // String | 
    String version = "version_example"; // String | 
    OffsetDateTime atTime = OffsetDateTime.now(); // OffsetDateTime | 
    try {
      Map<String, EffectiveTraitDTO> result = apiInstance.getEffectiveTraitsForTraitName(layerIDs, traitName, version, atTime);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TraitApi#getEffectiveTraitsForTraitName");
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
 **traitName** | **String**|  |
 **version** | **String**|  |
 **atTime** | **OffsetDateTime**|  | [optional]

### Return type

[**Map&lt;String, EffectiveTraitDTO&gt;**](EffectiveTraitDTO.md)

### Authorization

[oauth2](../README.md#oauth2), [oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json;odata.metadata=minimal;odata.streaming=true, application/json;odata.metadata=minimal;odata.streaming=false, application/json;odata.metadata=minimal, application/json;odata.metadata=full;odata.streaming=true, application/json;odata.metadata=full;odata.streaming=false, application/json;odata.metadata=full, application/json;odata.metadata=none;odata.streaming=true, application/json;odata.metadata=none;odata.streaming=false, application/json;odata.metadata=none, application/json;odata.streaming=true, application/json;odata.streaming=false, application/json, application/xml, application/odata, text/plain, text/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Success |  -  |

