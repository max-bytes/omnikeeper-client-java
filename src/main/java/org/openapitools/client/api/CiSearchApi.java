/*
 * Landscape omnikeeper REST API
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * The version of the OpenAPI document: v1
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package org.openapitools.client.api;

import org.openapitools.client.ApiCallback;
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.ApiResponse;
import org.openapitools.client.Configuration;
import org.openapitools.client.Pair;
import org.openapitools.client.ProgressRequestBody;
import org.openapitools.client.ProgressResponseBody;

import com.google.gson.reflect.TypeToken;

import java.io.IOException;


import org.openapitools.client.model.CIDTO;
import java.time.OffsetDateTime;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.ws.rs.core.GenericType;

public class CiSearchApi {
    private ApiClient localVarApiClient;
    private int localHostIndex;
    private String localCustomBaseUrl;

    public CiSearchApi() {
        this(Configuration.getDefaultApiClient());
    }

    public CiSearchApi(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return localVarApiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    public int getHostIndex() {
        return localHostIndex;
    }

    public void setHostIndex(int hostIndex) {
        this.localHostIndex = hostIndex;
    }

    public String getCustomBaseUrl() {
        return localCustomBaseUrl;
    }

    public void setCustomBaseUrl(String customBaseUrl) {
        this.localCustomBaseUrl = customBaseUrl;
    }

    /**
     * Build call for searchCIsByTraits
     * @param layerIDs  (required)
     * @param withTraits  (required)
     * @param withoutTraits  (required)
     * @param version  (required)
     * @param atTime  (optional)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call searchCIsByTraitsCall(List<String> layerIDs, List<String> withTraits, List<String> withoutTraits, String version, OffsetDateTime atTime, final ApiCallback _callback) throws ApiException {
        String basePath = null;
        // Operation Servers
        String[] localBasePaths = new String[] {  };

        // Determine Base Path to Use
        if (localCustomBaseUrl != null){
            basePath = localCustomBaseUrl;
        } else if ( localBasePaths.length > 0 ) {
            basePath = localBasePaths[localHostIndex];
        } else {
            basePath = null;
        }

        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/api/v{version}/CISearch/searchCIsByTraits"
            .replaceAll("\\{" + "version" + "\\}", localVarApiClient.escapeString(version.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        if (layerIDs != null) {
            localVarCollectionQueryParams.addAll(localVarApiClient.parameterToPairs("multi", "layerIDs", layerIDs));
        }

        if (withTraits != null) {
            localVarCollectionQueryParams.addAll(localVarApiClient.parameterToPairs("multi", "withTraits", withTraits));
        }

        if (withoutTraits != null) {
            localVarCollectionQueryParams.addAll(localVarApiClient.parameterToPairs("multi", "withoutTraits", withoutTraits));
        }

        if (atTime != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("atTime", atTime));
        }

        final String[] localVarAccepts = {
            "application/json;odata.metadata=minimal;odata.streaming=true", "application/json;odata.metadata=minimal;odata.streaming=false", "application/json;odata.metadata=minimal", "application/json;odata.metadata=full;odata.streaming=true", "application/json;odata.metadata=full;odata.streaming=false", "application/json;odata.metadata=full", "application/json;odata.metadata=none;odata.streaming=true", "application/json;odata.metadata=none;odata.streaming=false", "application/json;odata.metadata=none", "application/json;odata.streaming=true", "application/json;odata.streaming=false", "application/json", "application/xml", "application/odata", "text/plain", "text/json"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
            
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        if (localVarContentType != null) {
            localVarHeaderParams.put("Content-Type", localVarContentType);
        }

        String[] localVarAuthNames = new String[] { "oauth2", "oauth2" };
        return localVarApiClient.buildCall(basePath, localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call searchCIsByTraitsValidateBeforeCall(List<String> layerIDs, List<String> withTraits, List<String> withoutTraits, String version, OffsetDateTime atTime, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'layerIDs' is set
        if (layerIDs == null) {
            throw new ApiException("Missing the required parameter 'layerIDs' when calling searchCIsByTraits(Async)");
        }
        
        // verify the required parameter 'withTraits' is set
        if (withTraits == null) {
            throw new ApiException("Missing the required parameter 'withTraits' when calling searchCIsByTraits(Async)");
        }
        
        // verify the required parameter 'withoutTraits' is set
        if (withoutTraits == null) {
            throw new ApiException("Missing the required parameter 'withoutTraits' when calling searchCIsByTraits(Async)");
        }
        
        // verify the required parameter 'version' is set
        if (version == null) {
            throw new ApiException("Missing the required parameter 'version' when calling searchCIsByTraits(Async)");
        }
        

        okhttp3.Call localVarCall = searchCIsByTraitsCall(layerIDs, withTraits, withoutTraits, version, atTime, _callback);
        return localVarCall;

    }

    /**
     * 
     * 
     * @param layerIDs  (required)
     * @param withTraits  (required)
     * @param withoutTraits  (required)
     * @param version  (required)
     * @param atTime  (optional)
     * @return List&lt;CIDTO&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
     </table>
     */
    public List<CIDTO> searchCIsByTraits(List<String> layerIDs, List<String> withTraits, List<String> withoutTraits, String version, OffsetDateTime atTime) throws ApiException {
        ApiResponse<List<CIDTO>> localVarResp = searchCIsByTraitsWithHttpInfo(layerIDs, withTraits, withoutTraits, version, atTime);
        return localVarResp.getData();
    }

    /**
     * 
     * 
     * @param layerIDs  (required)
     * @param withTraits  (required)
     * @param withoutTraits  (required)
     * @param version  (required)
     * @param atTime  (optional)
     * @return ApiResponse&lt;List&lt;CIDTO&gt;&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<List<CIDTO>> searchCIsByTraitsWithHttpInfo(List<String> layerIDs, List<String> withTraits, List<String> withoutTraits, String version, OffsetDateTime atTime) throws ApiException {
        okhttp3.Call localVarCall = searchCIsByTraitsValidateBeforeCall(layerIDs, withTraits, withoutTraits, version, atTime, null);
        Type localVarReturnType = new TypeToken<List<CIDTO>>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     *  (asynchronously)
     * 
     * @param layerIDs  (required)
     * @param withTraits  (required)
     * @param withoutTraits  (required)
     * @param version  (required)
     * @param atTime  (optional)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call searchCIsByTraitsAsync(List<String> layerIDs, List<String> withTraits, List<String> withoutTraits, String version, OffsetDateTime atTime, final ApiCallback<List<CIDTO>> _callback) throws ApiException {

        okhttp3.Call localVarCall = searchCIsByTraitsValidateBeforeCall(layerIDs, withTraits, withoutTraits, version, atTime, _callback);
        Type localVarReturnType = new TypeToken<List<CIDTO>>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
}
