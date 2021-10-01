# CiApi

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getAllCIIDs**](CiApi.md#getAllCIIDs) | **GET** /api/v{version}/CI/getAllCIIDs | list of all CI-IDs
[**getCIByID**](CiApi.md#getCIByID) | **GET** /api/v{version}/CI/getCIByID | single CI by CI-ID
[**getCIsByID**](CiApi.md#getCIsByID) | **GET** /api/v{version}/CI/getCIsByID | multiple CIs by CI-ID  !Watch out for the query URL getting too long because of a lot of CIIDs!  TODO: consider using POST


<a name="getAllCIIDs"></a>
# **getAllCIIDs**
> List&lt;UUID&gt; getAllCIIDs(version)

list of all CI-IDs

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.CiApi;

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

    CiApi apiInstance = new CiApi(defaultClient);
    String version = "version_example"; // String | 
    try {
      List<UUID> result = apiInstance.getAllCIIDs(version);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CiApi#getAllCIIDs");
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

### Return type

[**List&lt;UUID&gt;**](UUID.md)

### Authorization

[oauth2](../README.md#oauth2), [oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json;odata.metadata=minimal;odata.streaming=true, application/json;odata.metadata=minimal;odata.streaming=false, application/json;odata.metadata=minimal, application/json;odata.metadata=full;odata.streaming=true, application/json;odata.metadata=full;odata.streaming=false, application/json;odata.metadata=full, application/json;odata.metadata=none;odata.streaming=true, application/json;odata.metadata=none;odata.streaming=false, application/json;odata.metadata=none, application/json;odata.streaming=true, application/json;odata.streaming=false, application/json, application/xml, application/odata, text/plain, text/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Success |  -  |

<a name="getCIByID"></a>
# **getCIByID**
> CIDTO getCIByID(layerIDs, CIID, version, atTime)

single CI by CI-ID

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.CiApi;

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

    CiApi apiInstance = new CiApi(defaultClient);
    List<String> layerIDs = Arrays.asList(); // List<String> | Specifies which layers contribute to the result, and in which order
    UUID CIID = UUID.randomUUID(); // UUID | 
    String version = "version_example"; // String | 
    OffsetDateTime atTime = OffsetDateTime.now(); // OffsetDateTime | Specify datetime, for which point in time to get the data; leave empty to use current time (https://www.newtonsoft.com/json/help/html/DatesInJSON.htm)
    try {
      CIDTO result = apiInstance.getCIByID(layerIDs, CIID, version, atTime);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CiApi#getCIByID");
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
 **layerIDs** | [**List&lt;String&gt;**](String.md)| Specifies which layers contribute to the result, and in which order |
 **CIID** | **UUID**|  |
 **version** | **String**|  |
 **atTime** | **OffsetDateTime**| Specify datetime, for which point in time to get the data; leave empty to use current time (https://www.newtonsoft.com/json/help/html/DatesInJSON.htm) | [optional]

### Return type

[**CIDTO**](CIDTO.md)

### Authorization

[oauth2](../README.md#oauth2), [oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json;odata.metadata=minimal;odata.streaming=true, application/json;odata.metadata=minimal;odata.streaming=false, application/json;odata.metadata=minimal, application/json;odata.metadata=full;odata.streaming=true, application/json;odata.metadata=full;odata.streaming=false, application/json;odata.metadata=full, application/json;odata.metadata=none;odata.streaming=true, application/json;odata.metadata=none;odata.streaming=false, application/json;odata.metadata=none, application/json;odata.streaming=true, application/json;odata.streaming=false, application/json, application/xml, application/odata, text/plain, text/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Success |  -  |

<a name="getCIsByID"></a>
# **getCIsByID**
> List&lt;CIDTO&gt; getCIsByID(layerIDs, ciIDs, version, atTime)

multiple CIs by CI-ID  !Watch out for the query URL getting too long because of a lot of CIIDs!  TODO: consider using POST

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.CiApi;

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

    CiApi apiInstance = new CiApi(defaultClient);
    List<String> layerIDs = Arrays.asList(); // List<String> | Specifies which layers contribute to the result, and in which order
    List<UUID> ciIDs = Arrays.asList(); // List<UUID> | 
    String version = "version_example"; // String | 
    OffsetDateTime atTime = OffsetDateTime.now(); // OffsetDateTime | Specify datetime, for which point in time to get the data; leave empty to use current time (https://www.newtonsoft.com/json/help/html/DatesInJSON.htm)
    try {
      List<CIDTO> result = apiInstance.getCIsByID(layerIDs, ciIDs, version, atTime);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CiApi#getCIsByID");
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
 **layerIDs** | [**List&lt;String&gt;**](String.md)| Specifies which layers contribute to the result, and in which order |
 **ciIDs** | [**List&lt;UUID&gt;**](UUID.md)|  |
 **version** | **String**|  |
 **atTime** | **OffsetDateTime**| Specify datetime, for which point in time to get the data; leave empty to use current time (https://www.newtonsoft.com/json/help/html/DatesInJSON.htm) | [optional]

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

