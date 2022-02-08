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


import org.openapitools.client.model.AnsibleInventoryScanDTO;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.ws.rs.core.GenericType;

public class AnsibleInventoryScanIngestApi {
    private ApiClient localVarApiClient;
    private int localHostIndex;
    private String localCustomBaseUrl;

    public AnsibleInventoryScanIngestApi() {
        this(Configuration.getDefaultApiClient());
    }

    public AnsibleInventoryScanIngestApi(ApiClient apiClient) {
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
     * Build call for ingestAnsibleInventoryScan
     * @param writeLayerID  (required)
     * @param searchLayerIDs  (required)
     * @param version  (required)
     * @param ansibleInventoryScanDTO  (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call ingestAnsibleInventoryScanCall(String writeLayerID, List<String> searchLayerIDs, String version, AnsibleInventoryScanDTO ansibleInventoryScanDTO, final ApiCallback _callback) throws ApiException {
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

        Object localVarPostBody = ansibleInventoryScanDTO;

        // create path and map variables
        String localVarPath = "/api/v{version}/Ingest/AnsibleInventoryScan"
            .replaceAll("\\{" + "version" + "\\}", localVarApiClient.escapeString(version.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        if (writeLayerID != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("writeLayerID", writeLayerID));
        }

        if (searchLayerIDs != null) {
            localVarCollectionQueryParams.addAll(localVarApiClient.parameterToPairs("multi", "searchLayerIDs", searchLayerIDs));
        }

        final String[] localVarAccepts = {
            
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
            "application/json;odata.metadata=minimal;odata.streaming=true", "application/json;odata.metadata=minimal;odata.streaming=false", "application/json;odata.metadata=minimal", "application/json;odata.metadata=full;odata.streaming=true", "application/json;odata.metadata=full;odata.streaming=false", "application/json;odata.metadata=full", "application/json;odata.metadata=none;odata.streaming=true", "application/json;odata.metadata=none;odata.streaming=false", "application/json;odata.metadata=none", "application/json;odata.streaming=true", "application/json;odata.streaming=false", "application/json", "application/xml", "application/odata", "application/json-patch+json", "text/json", "application/_*+json"
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        if (localVarContentType != null) {
            localVarHeaderParams.put("Content-Type", localVarContentType);
        }

        String[] localVarAuthNames = new String[] { "oauth2", "oauth2" };
        return localVarApiClient.buildCall(basePath, localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call ingestAnsibleInventoryScanValidateBeforeCall(String writeLayerID, List<String> searchLayerIDs, String version, AnsibleInventoryScanDTO ansibleInventoryScanDTO, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'writeLayerID' is set
        if (writeLayerID == null) {
            throw new ApiException("Missing the required parameter 'writeLayerID' when calling ingestAnsibleInventoryScan(Async)");
        }
        
        // verify the required parameter 'searchLayerIDs' is set
        if (searchLayerIDs == null) {
            throw new ApiException("Missing the required parameter 'searchLayerIDs' when calling ingestAnsibleInventoryScan(Async)");
        }
        
        // verify the required parameter 'version' is set
        if (version == null) {
            throw new ApiException("Missing the required parameter 'version' when calling ingestAnsibleInventoryScan(Async)");
        }
        
        // verify the required parameter 'ansibleInventoryScanDTO' is set
        if (ansibleInventoryScanDTO == null) {
            throw new ApiException("Missing the required parameter 'ansibleInventoryScanDTO' when calling ingestAnsibleInventoryScan(Async)");
        }
        

        okhttp3.Call localVarCall = ingestAnsibleInventoryScanCall(writeLayerID, searchLayerIDs, version, ansibleInventoryScanDTO, _callback);
        return localVarCall;

    }

    /**
     * 
     * 
     * @param writeLayerID  (required)
     * @param searchLayerIDs  (required)
     * @param version  (required)
     * @param ansibleInventoryScanDTO  (required)
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
     </table>
     */
    public void ingestAnsibleInventoryScan(String writeLayerID, List<String> searchLayerIDs, String version, AnsibleInventoryScanDTO ansibleInventoryScanDTO) throws ApiException {
        ingestAnsibleInventoryScanWithHttpInfo(writeLayerID, searchLayerIDs, version, ansibleInventoryScanDTO);
    }

    /**
     * 
     * 
     * @param writeLayerID  (required)
     * @param searchLayerIDs  (required)
     * @param version  (required)
     * @param ansibleInventoryScanDTO  (required)
     * @return ApiResponse&lt;Void&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<Void> ingestAnsibleInventoryScanWithHttpInfo(String writeLayerID, List<String> searchLayerIDs, String version, AnsibleInventoryScanDTO ansibleInventoryScanDTO) throws ApiException {
        okhttp3.Call localVarCall = ingestAnsibleInventoryScanValidateBeforeCall(writeLayerID, searchLayerIDs, version, ansibleInventoryScanDTO, null);
        return localVarApiClient.execute(localVarCall);
    }

    /**
     *  (asynchronously)
     * 
     * @param writeLayerID  (required)
     * @param searchLayerIDs  (required)
     * @param version  (required)
     * @param ansibleInventoryScanDTO  (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call ingestAnsibleInventoryScanAsync(String writeLayerID, List<String> searchLayerIDs, String version, AnsibleInventoryScanDTO ansibleInventoryScanDTO, final ApiCallback<Void> _callback) throws ApiException {

        okhttp3.Call localVarCall = ingestAnsibleInventoryScanValidateBeforeCall(writeLayerID, searchLayerIDs, version, ansibleInventoryScanDTO, _callback);
        localVarApiClient.executeAsync(localVarCall, _callback);
        return localVarCall;
    }
}
