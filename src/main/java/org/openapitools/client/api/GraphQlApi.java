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


import org.openapitools.client.model.GraphQLQuery;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GraphQlApi {
    private ApiClient localVarApiClient;
    private int localHostIndex;
    private String localCustomBaseUrl;

    public GraphQlApi() {
        this(Configuration.getDefaultApiClient());
    }

    public GraphQlApi(ApiClient apiClient) {
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
     * Build call for graphQLDebug
     * @param graphQLQuery  (optional)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call graphQLDebugCall(GraphQLQuery graphQLQuery, final ApiCallback _callback) throws ApiException {
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

        Object localVarPostBody = graphQLQuery;

        // create path and map variables
        String localVarPath = "/graphql-debug";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
            "application/json",
            "application/json;odata.metadata=minimal;odata.streaming=true",
            "application/json;odata.metadata=minimal;odata.streaming=false",
            "application/json;odata.metadata=minimal",
            "application/json;odata.metadata=full;odata.streaming=true",
            "application/json;odata.metadata=full;odata.streaming=false",
            "application/json;odata.metadata=full",
            "application/json;odata.metadata=none;odata.streaming=true",
            "application/json;odata.metadata=none;odata.streaming=false",
            "application/json;odata.metadata=none",
            "application/json;odata.streaming=true",
            "application/json;odata.streaming=false",
            "application/xml",
            "text/plain",
            "text/json",
            "application/*+json"
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        if (localVarContentType != null) {
            localVarHeaderParams.put("Content-Type", localVarContentType);
        }

        String[] localVarAuthNames = new String[] { "oauth2", "oauth2" };
        return localVarApiClient.buildCall(basePath, localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call graphQLDebugValidateBeforeCall(GraphQLQuery graphQLQuery, final ApiCallback _callback) throws ApiException {
        return graphQLDebugCall(graphQLQuery, _callback);

    }

    /**
     * 
     * 
     * @param graphQLQuery  (optional)
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
     </table>
     */
    public void graphQLDebug(GraphQLQuery graphQLQuery) throws ApiException {
        graphQLDebugWithHttpInfo(graphQLQuery);
    }

    /**
     * 
     * 
     * @param graphQLQuery  (optional)
     * @return ApiResponse&lt;Void&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<Void> graphQLDebugWithHttpInfo(GraphQLQuery graphQLQuery) throws ApiException {
        okhttp3.Call localVarCall = graphQLDebugValidateBeforeCall(graphQLQuery, null);
        return localVarApiClient.execute(localVarCall);
    }

    /**
     *  (asynchronously)
     * 
     * @param graphQLQuery  (optional)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call graphQLDebugAsync(GraphQLQuery graphQLQuery, final ApiCallback<Void> _callback) throws ApiException {

        okhttp3.Call localVarCall = graphQLDebugValidateBeforeCall(graphQLQuery, _callback);
        localVarApiClient.executeAsync(localVarCall, _callback);
        return localVarCall;
    }
    /**
     * Build call for graphQLGet
     * @param operationName  (optional)
     * @param query  (optional)
     * @param variables  (optional)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call graphQLGetCall(String operationName, String query, Map<String, Object> variables, final ApiCallback _callback) throws ApiException {
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
        String localVarPath = "/graphql";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        if (operationName != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("operationName", operationName));
        }

        if (query != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("query", query));
        }

        if (variables != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("variables", variables));
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
    private okhttp3.Call graphQLGetValidateBeforeCall(String operationName, String query, Map<String, Object> variables, final ApiCallback _callback) throws ApiException {
        return graphQLGetCall(operationName, query, variables, _callback);

    }

    /**
     * 
     * 
     * @param operationName  (optional)
     * @param query  (optional)
     * @param variables  (optional)
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
     </table>
     */
    public void graphQLGet(String operationName, String query, Map<String, Object> variables) throws ApiException {
        graphQLGetWithHttpInfo(operationName, query, variables);
    }

    /**
     * 
     * 
     * @param operationName  (optional)
     * @param query  (optional)
     * @param variables  (optional)
     * @return ApiResponse&lt;Void&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<Void> graphQLGetWithHttpInfo(String operationName, String query, Map<String, Object> variables) throws ApiException {
        okhttp3.Call localVarCall = graphQLGetValidateBeforeCall(operationName, query, variables, null);
        return localVarApiClient.execute(localVarCall);
    }

    /**
     *  (asynchronously)
     * 
     * @param operationName  (optional)
     * @param query  (optional)
     * @param variables  (optional)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call graphQLGetAsync(String operationName, String query, Map<String, Object> variables, final ApiCallback<Void> _callback) throws ApiException {

        okhttp3.Call localVarCall = graphQLGetValidateBeforeCall(operationName, query, variables, _callback);
        localVarApiClient.executeAsync(localVarCall, _callback);
        return localVarCall;
    }
    /**
     * Build call for graphQLIndex
     * @param graphQLQuery  (optional)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call graphQLIndexCall(GraphQLQuery graphQLQuery, final ApiCallback _callback) throws ApiException {
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

        Object localVarPostBody = graphQLQuery;

        // create path and map variables
        String localVarPath = "/graphql";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
            "application/json",
            "application/json;odata.metadata=minimal;odata.streaming=true",
            "application/json;odata.metadata=minimal;odata.streaming=false",
            "application/json;odata.metadata=minimal",
            "application/json;odata.metadata=full;odata.streaming=true",
            "application/json;odata.metadata=full;odata.streaming=false",
            "application/json;odata.metadata=full",
            "application/json;odata.metadata=none;odata.streaming=true",
            "application/json;odata.metadata=none;odata.streaming=false",
            "application/json;odata.metadata=none",
            "application/json;odata.streaming=true",
            "application/json;odata.streaming=false",
            "application/xml",
            "text/plain",
            "text/json",
            "application/*+json"
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        if (localVarContentType != null) {
            localVarHeaderParams.put("Content-Type", localVarContentType);
        }

        String[] localVarAuthNames = new String[] { "oauth2", "oauth2" };
        return localVarApiClient.buildCall(basePath, localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call graphQLIndexValidateBeforeCall(GraphQLQuery graphQLQuery, final ApiCallback _callback) throws ApiException {
        return graphQLIndexCall(graphQLQuery, _callback);

    }

    /**
     * 
     * 
     * @param graphQLQuery  (optional)
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
     </table>
     */
    public void graphQLIndex(GraphQLQuery graphQLQuery) throws ApiException {
        graphQLIndexWithHttpInfo(graphQLQuery);
    }

    /**
     * 
     * 
     * @param graphQLQuery  (optional)
     * @return ApiResponse&lt;Void&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<Void> graphQLIndexWithHttpInfo(GraphQLQuery graphQLQuery) throws ApiException {
        okhttp3.Call localVarCall = graphQLIndexValidateBeforeCall(graphQLQuery, null);
        return localVarApiClient.execute(localVarCall);
    }

    /**
     *  (asynchronously)
     * 
     * @param graphQLQuery  (optional)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call graphQLIndexAsync(GraphQLQuery graphQLQuery, final ApiCallback<Void> _callback) throws ApiException {

        okhttp3.Call localVarCall = graphQLIndexValidateBeforeCall(graphQLQuery, _callback);
        localVarApiClient.executeAsync(localVarCall, _callback);
        return localVarCall;
    }
}
