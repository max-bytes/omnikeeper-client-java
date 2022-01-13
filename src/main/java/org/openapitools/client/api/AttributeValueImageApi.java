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


import java.io.File;
import org.threeten.bp.OffsetDateTime;
import java.util.UUID;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class AttributeValueImageApi {
    private ApiClient localVarApiClient;
    private int localHostIndex;
    private String localCustomBaseUrl;

    public AttributeValueImageApi() {
        this(Configuration.getDefaultApiClient());
    }

    public AttributeValueImageApi(ApiClient apiClient) {
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
     * Build call for get
     * @param ciid  (required)
     * @param attributeName  (required)
     * @param layerIDs  (required)
     * @param version  (required)
     * @param index  (optional, default to 0)
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
    public okhttp3.Call getCall(UUID ciid, String attributeName, List<String> layerIDs, String version, Integer index, OffsetDateTime atTime, final ApiCallback _callback) throws ApiException {
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
        String localVarPath = "/api/v{version}/AttributeValueImage"
            .replaceAll("\\{" + "version" + "\\}", localVarApiClient.escapeString(version.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        if (ciid != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("ciid", ciid));
        }

        if (attributeName != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("attributeName", attributeName));
        }

        if (layerIDs != null) {
            localVarCollectionQueryParams.addAll(localVarApiClient.parameterToPairs("multi", "layerIDs", layerIDs));
        }

        if (index != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("index", index));
        }

        if (atTime != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("atTime", atTime));
        }

        final String[] localVarAccepts = {
            
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
            
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        if (localVarHeaderParams != null && localVarContentTypes != null) {
            localVarHeaderParams.put("Content-Type", localVarContentType);
        }

        String[] localVarAuthNames = new String[] { "oauth2", "oauth2" };
        return localVarApiClient.buildCall(basePath, localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call getValidateBeforeCall(UUID ciid, String attributeName, List<String> layerIDs, String version, Integer index, OffsetDateTime atTime, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'ciid' is set
        if (ciid == null) {
            throw new ApiException("Missing the required parameter 'ciid' when calling get(Async)");
        }
        
        // verify the required parameter 'attributeName' is set
        if (attributeName == null) {
            throw new ApiException("Missing the required parameter 'attributeName' when calling get(Async)");
        }
        
        // verify the required parameter 'layerIDs' is set
        if (layerIDs == null) {
            throw new ApiException("Missing the required parameter 'layerIDs' when calling get(Async)");
        }
        
        // verify the required parameter 'version' is set
        if (version == null) {
            throw new ApiException("Missing the required parameter 'version' when calling get(Async)");
        }
        

        okhttp3.Call localVarCall = getCall(ciid, attributeName, layerIDs, version, index, atTime, _callback);
        return localVarCall;

    }

    /**
     * 
     * 
     * @param ciid  (required)
     * @param attributeName  (required)
     * @param layerIDs  (required)
     * @param version  (required)
     * @param index  (optional, default to 0)
     * @param atTime  (optional)
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
     </table>
     */
    public void get(UUID ciid, String attributeName, List<String> layerIDs, String version, Integer index, OffsetDateTime atTime) throws ApiException {
        getWithHttpInfo(ciid, attributeName, layerIDs, version, index, atTime);
    }

    /**
     * 
     * 
     * @param ciid  (required)
     * @param attributeName  (required)
     * @param layerIDs  (required)
     * @param version  (required)
     * @param index  (optional, default to 0)
     * @param atTime  (optional)
     * @return ApiResponse&lt;Void&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<Void> getWithHttpInfo(UUID ciid, String attributeName, List<String> layerIDs, String version, Integer index, OffsetDateTime atTime) throws ApiException {
        okhttp3.Call localVarCall = getValidateBeforeCall(ciid, attributeName, layerIDs, version, index, atTime, null);
        return localVarApiClient.execute(localVarCall);
    }

    /**
     *  (asynchronously)
     * 
     * @param ciid  (required)
     * @param attributeName  (required)
     * @param layerIDs  (required)
     * @param version  (required)
     * @param index  (optional, default to 0)
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
    public okhttp3.Call getAsync(UUID ciid, String attributeName, List<String> layerIDs, String version, Integer index, OffsetDateTime atTime, final ApiCallback<Void> _callback) throws ApiException {

        okhttp3.Call localVarCall = getValidateBeforeCall(ciid, attributeName, layerIDs, version, index, atTime, _callback);
        localVarApiClient.executeAsync(localVarCall, _callback);
        return localVarCall;
    }
    /**
     * Build call for post
     * @param ciid  (required)
     * @param attributeName  (required)
     * @param layerID  (required)
     * @param version  (required)
     * @param files  (required)
     * @param forceArray  (optional, default to false)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call postCall(UUID ciid, String attributeName, String layerID, String version, List<File> files, Boolean forceArray, final ApiCallback _callback) throws ApiException {
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
        String localVarPath = "/api/v{version}/AttributeValueImage"
            .replaceAll("\\{" + "version" + "\\}", localVarApiClient.escapeString(version.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        if (files != null) {
            localVarFormParams.put("files", files);
        }

        if (ciid != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("ciid", ciid));
        }

        if (attributeName != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("attributeName", attributeName));
        }

        if (layerID != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("layerID", layerID));
        }

        if (forceArray != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("forceArray", forceArray));
        }

        final String[] localVarAccepts = {
            
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
            "multipart/form-data"
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        if (localVarHeaderParams != null && localVarContentTypes != null) {
            localVarHeaderParams.put("Content-Type", localVarContentType);
        }

        String[] localVarAuthNames = new String[] { "oauth2", "oauth2" };
        return localVarApiClient.buildCall(basePath, localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call postValidateBeforeCall(UUID ciid, String attributeName, String layerID, String version, List<File> files, Boolean forceArray, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'ciid' is set
        if (ciid == null) {
            throw new ApiException("Missing the required parameter 'ciid' when calling post(Async)");
        }
        
        // verify the required parameter 'attributeName' is set
        if (attributeName == null) {
            throw new ApiException("Missing the required parameter 'attributeName' when calling post(Async)");
        }
        
        // verify the required parameter 'layerID' is set
        if (layerID == null) {
            throw new ApiException("Missing the required parameter 'layerID' when calling post(Async)");
        }
        
        // verify the required parameter 'version' is set
        if (version == null) {
            throw new ApiException("Missing the required parameter 'version' when calling post(Async)");
        }
        
        // verify the required parameter 'files' is set
        if (files == null) {
            throw new ApiException("Missing the required parameter 'files' when calling post(Async)");
        }
        

        okhttp3.Call localVarCall = postCall(ciid, attributeName, layerID, version, files, forceArray, _callback);
        return localVarCall;

    }

    /**
     * 
     * 
     * @param ciid  (required)
     * @param attributeName  (required)
     * @param layerID  (required)
     * @param version  (required)
     * @param files  (required)
     * @param forceArray  (optional, default to false)
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
     </table>
     */
    public void post(UUID ciid, String attributeName, String layerID, String version, List<File> files, Boolean forceArray) throws ApiException {
        postWithHttpInfo(ciid, attributeName, layerID, version, files, forceArray);
    }

    /**
     * 
     * 
     * @param ciid  (required)
     * @param attributeName  (required)
     * @param layerID  (required)
     * @param version  (required)
     * @param files  (required)
     * @param forceArray  (optional, default to false)
     * @return ApiResponse&lt;Void&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<Void> postWithHttpInfo(UUID ciid, String attributeName, String layerID, String version, List<File> files, Boolean forceArray) throws ApiException {
        okhttp3.Call localVarCall = postValidateBeforeCall(ciid, attributeName, layerID, version, files, forceArray, null);
        return localVarApiClient.execute(localVarCall);
    }

    /**
     *  (asynchronously)
     * 
     * @param ciid  (required)
     * @param attributeName  (required)
     * @param layerID  (required)
     * @param version  (required)
     * @param files  (required)
     * @param forceArray  (optional, default to false)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call postAsync(UUID ciid, String attributeName, String layerID, String version, List<File> files, Boolean forceArray, final ApiCallback<Void> _callback) throws ApiException {

        okhttp3.Call localVarCall = postValidateBeforeCall(ciid, attributeName, layerID, version, files, forceArray, _callback);
        localVarApiClient.executeAsync(localVarCall, _callback);
        return localVarCall;
    }
}
