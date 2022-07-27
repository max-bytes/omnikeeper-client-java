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


import java.time.OffsetDateTime;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.ws.rs.core.GenericType;

public class GraphvizDotApi {
    private ApiClient localVarApiClient;
    private int localHostIndex;
    private String localCustomBaseUrl;

    public GraphvizDotApi() {
        this(Configuration.getDefaultApiClient());
    }

    public GraphvizDotApi(ApiClient apiClient) {
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
     * Build call for graphvizDotLayerCentric
     * @param layerIDs  (required)
     * @param from  (required)
     * @param to  (required)
     * @param version  (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call graphvizDotLayerCentricCall(List<String> layerIDs, OffsetDateTime from, OffsetDateTime to, String version, final ApiCallback _callback) throws ApiException {
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
        String localVarPath = "/api/v{version}/GraphvizDot/layerCentric"
            .replaceAll("\\{" + "version" + "\\}", localVarApiClient.escapeString(version.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        if (layerIDs != null) {
            localVarCollectionQueryParams.addAll(localVarApiClient.parameterToPairs("multi", "layerIDs", layerIDs));
        }

        if (from != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("from", from));
        }

        if (to != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("to", to));
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
        if (localVarContentType != null) {
            localVarHeaderParams.put("Content-Type", localVarContentType);
        }

        String[] localVarAuthNames = new String[] { "oauth2", "oauth2" };
        return localVarApiClient.buildCall(basePath, localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call graphvizDotLayerCentricValidateBeforeCall(List<String> layerIDs, OffsetDateTime from, OffsetDateTime to, String version, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'layerIDs' is set
        if (layerIDs == null) {
            throw new ApiException("Missing the required parameter 'layerIDs' when calling graphvizDotLayerCentric(Async)");
        }
        
        // verify the required parameter 'from' is set
        if (from == null) {
            throw new ApiException("Missing the required parameter 'from' when calling graphvizDotLayerCentric(Async)");
        }
        
        // verify the required parameter 'to' is set
        if (to == null) {
            throw new ApiException("Missing the required parameter 'to' when calling graphvizDotLayerCentric(Async)");
        }
        
        // verify the required parameter 'version' is set
        if (version == null) {
            throw new ApiException("Missing the required parameter 'version' when calling graphvizDotLayerCentric(Async)");
        }
        

        okhttp3.Call localVarCall = graphvizDotLayerCentricCall(layerIDs, from, to, version, _callback);
        return localVarCall;

    }

    /**
     * 
     * 
     * @param layerIDs  (required)
     * @param from  (required)
     * @param to  (required)
     * @param version  (required)
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
     </table>
     */
    public void graphvizDotLayerCentric(List<String> layerIDs, OffsetDateTime from, OffsetDateTime to, String version) throws ApiException {
        graphvizDotLayerCentricWithHttpInfo(layerIDs, from, to, version);
    }

    /**
     * 
     * 
     * @param layerIDs  (required)
     * @param from  (required)
     * @param to  (required)
     * @param version  (required)
     * @return ApiResponse&lt;Void&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<Void> graphvizDotLayerCentricWithHttpInfo(List<String> layerIDs, OffsetDateTime from, OffsetDateTime to, String version) throws ApiException {
        okhttp3.Call localVarCall = graphvizDotLayerCentricValidateBeforeCall(layerIDs, from, to, version, null);
        return localVarApiClient.execute(localVarCall);
    }

    /**
     *  (asynchronously)
     * 
     * @param layerIDs  (required)
     * @param from  (required)
     * @param to  (required)
     * @param version  (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call graphvizDotLayerCentricAsync(List<String> layerIDs, OffsetDateTime from, OffsetDateTime to, String version, final ApiCallback<Void> _callback) throws ApiException {

        okhttp3.Call localVarCall = graphvizDotLayerCentricValidateBeforeCall(layerIDs, from, to, version, _callback);
        localVarApiClient.executeAsync(localVarCall, _callback);
        return localVarCall;
    }
    /**
     * Build call for graphvizDotTraitCentric
     * @param layerIDs  (required)
     * @param version  (required)
     * @param traitIDs  (optional)
     * @param traitIDsRegex  (optional)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call graphvizDotTraitCentricCall(List<String> layerIDs, String version, List<String> traitIDs, String traitIDsRegex, final ApiCallback _callback) throws ApiException {
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
        String localVarPath = "/api/v{version}/GraphvizDot/traitCentric"
            .replaceAll("\\{" + "version" + "\\}", localVarApiClient.escapeString(version.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        if (layerIDs != null) {
            localVarCollectionQueryParams.addAll(localVarApiClient.parameterToPairs("multi", "layerIDs", layerIDs));
        }

        if (traitIDs != null) {
            localVarCollectionQueryParams.addAll(localVarApiClient.parameterToPairs("multi", "traitIDs", traitIDs));
        }

        if (traitIDsRegex != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("traitIDsRegex", traitIDsRegex));
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
        if (localVarContentType != null) {
            localVarHeaderParams.put("Content-Type", localVarContentType);
        }

        String[] localVarAuthNames = new String[] { "oauth2", "oauth2" };
        return localVarApiClient.buildCall(basePath, localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call graphvizDotTraitCentricValidateBeforeCall(List<String> layerIDs, String version, List<String> traitIDs, String traitIDsRegex, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'layerIDs' is set
        if (layerIDs == null) {
            throw new ApiException("Missing the required parameter 'layerIDs' when calling graphvizDotTraitCentric(Async)");
        }
        
        // verify the required parameter 'version' is set
        if (version == null) {
            throw new ApiException("Missing the required parameter 'version' when calling graphvizDotTraitCentric(Async)");
        }
        

        okhttp3.Call localVarCall = graphvizDotTraitCentricCall(layerIDs, version, traitIDs, traitIDsRegex, _callback);
        return localVarCall;

    }

    /**
     * 
     * 
     * @param layerIDs  (required)
     * @param version  (required)
     * @param traitIDs  (optional)
     * @param traitIDsRegex  (optional)
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
     </table>
     */
    public void graphvizDotTraitCentric(List<String> layerIDs, String version, List<String> traitIDs, String traitIDsRegex) throws ApiException {
        graphvizDotTraitCentricWithHttpInfo(layerIDs, version, traitIDs, traitIDsRegex);
    }

    /**
     * 
     * 
     * @param layerIDs  (required)
     * @param version  (required)
     * @param traitIDs  (optional)
     * @param traitIDsRegex  (optional)
     * @return ApiResponse&lt;Void&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<Void> graphvizDotTraitCentricWithHttpInfo(List<String> layerIDs, String version, List<String> traitIDs, String traitIDsRegex) throws ApiException {
        okhttp3.Call localVarCall = graphvizDotTraitCentricValidateBeforeCall(layerIDs, version, traitIDs, traitIDsRegex, null);
        return localVarApiClient.execute(localVarCall);
    }

    /**
     *  (asynchronously)
     * 
     * @param layerIDs  (required)
     * @param version  (required)
     * @param traitIDs  (optional)
     * @param traitIDsRegex  (optional)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call graphvizDotTraitCentricAsync(List<String> layerIDs, String version, List<String> traitIDs, String traitIDsRegex, final ApiCallback<Void> _callback) throws ApiException {

        okhttp3.Call localVarCall = graphvizDotTraitCentricValidateBeforeCall(layerIDs, version, traitIDs, traitIDsRegex, _callback);
        localVarApiClient.executeAsync(localVarCall, _callback);
        return localVarCall;
    }
}
