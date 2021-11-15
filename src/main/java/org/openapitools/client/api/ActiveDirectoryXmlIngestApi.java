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

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ActiveDirectoryXmlIngestApi {
    private ApiClient localVarApiClient;

    public ActiveDirectoryXmlIngestApi() {
        this(Configuration.getDefaultApiClient());
    }

    public ActiveDirectoryXmlIngestApi(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return localVarApiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    /**
     * Build call for ingestXML
     * @param version  (required)
     * @param writeLayerID  (required)
     * @param searchLayerIDs  (required)
     * @param files  (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call ingestXMLCall(String version, String writeLayerID, List<String> searchLayerIDs, List<File> files, final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/api/v{version}/Ingest/AD-XML"
            .replaceAll("\\{" + "version" + "\\}", localVarApiClient.escapeString(version.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        if (writeLayerID != null) {
            localVarFormParams.put("writeLayerID", writeLayerID);
        }

        if (searchLayerIDs != null) {
            localVarFormParams.put("searchLayerIDs", searchLayerIDs);
        }

        if (files != null) {
            localVarFormParams.put("files", files);
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
        if (localVarHeaderParams != null) {
            localVarHeaderParams.put("Content-Type", localVarContentType);
        }

        String[] localVarAuthNames = new String[] { "oauth2", "oauth2" };
        return localVarApiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call ingestXMLValidateBeforeCall(String version, String writeLayerID, List<String> searchLayerIDs, List<File> files, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'version' is set
        if (version == null) {
            throw new ApiException("Missing the required parameter 'version' when calling ingestXML(Async)");
        }
        
        // verify the required parameter 'writeLayerID' is set
        if (writeLayerID == null) {
            throw new ApiException("Missing the required parameter 'writeLayerID' when calling ingestXML(Async)");
        }
        
        // verify the required parameter 'searchLayerIDs' is set
        if (searchLayerIDs == null) {
            throw new ApiException("Missing the required parameter 'searchLayerIDs' when calling ingestXML(Async)");
        }
        
        // verify the required parameter 'files' is set
        if (files == null) {
            throw new ApiException("Missing the required parameter 'files' when calling ingestXML(Async)");
        }
        

        okhttp3.Call localVarCall = ingestXMLCall(version, writeLayerID, searchLayerIDs, files, _callback);
        return localVarCall;

    }

    /**
     * 
     * 
     * @param version  (required)
     * @param writeLayerID  (required)
     * @param searchLayerIDs  (required)
     * @param files  (required)
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
     </table>
     */
    public void ingestXML(String version, String writeLayerID, List<String> searchLayerIDs, List<File> files) throws ApiException {
        ingestXMLWithHttpInfo(version, writeLayerID, searchLayerIDs, files);
    }

    /**
     * 
     * 
     * @param version  (required)
     * @param writeLayerID  (required)
     * @param searchLayerIDs  (required)
     * @param files  (required)
     * @return ApiResponse&lt;Void&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<Void> ingestXMLWithHttpInfo(String version, String writeLayerID, List<String> searchLayerIDs, List<File> files) throws ApiException {
        okhttp3.Call localVarCall = ingestXMLValidateBeforeCall(version, writeLayerID, searchLayerIDs, files, null);
        return localVarApiClient.execute(localVarCall);
    }

    /**
     *  (asynchronously)
     * 
     * @param version  (required)
     * @param writeLayerID  (required)
     * @param searchLayerIDs  (required)
     * @param files  (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call ingestXMLAsync(String version, String writeLayerID, List<String> searchLayerIDs, List<File> files, final ApiCallback<Void> _callback) throws ApiException {

        okhttp3.Call localVarCall = ingestXMLValidateBeforeCall(version, writeLayerID, searchLayerIDs, files, _callback);
        localVarApiClient.executeAsync(localVarCall, _callback);
        return localVarCall;
    }
}
