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


import org.openapitools.client.model.BulkCIAttributeLayerScopeDTO;
import org.openapitools.client.model.CIAttributeDTO;
import org.threeten.bp.OffsetDateTime;
import java.util.UUID;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class AttributeApi {
    private ApiClient localVarApiClient;

    public AttributeApi() {
        this(Configuration.getDefaultApiClient());
    }

    public AttributeApi(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return localVarApiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    /**
     * Build call for bulkReplaceAttributesInLayer
     * @param version  (required)
     * @param bulkCIAttributeLayerScopeDTO  (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call bulkReplaceAttributesInLayerCall(String version, BulkCIAttributeLayerScopeDTO bulkCIAttributeLayerScopeDTO, final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = bulkCIAttributeLayerScopeDTO;

        // create path and map variables
        String localVarPath = "/api/v{version}/Attribute/bulkReplaceAttributesInLayer"
            .replaceAll("\\{" + "version" + "\\}", localVarApiClient.escapeString(version.toString()));

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
            "application/json;odata.metadata=minimal;odata.streaming=true", "application/json;odata.metadata=minimal;odata.streaming=false", "application/json;odata.metadata=minimal", "application/json;odata.metadata=full;odata.streaming=true", "application/json;odata.metadata=full;odata.streaming=false", "application/json;odata.metadata=full", "application/json;odata.metadata=none;odata.streaming=true", "application/json;odata.metadata=none;odata.streaming=false", "application/json;odata.metadata=none", "application/json;odata.streaming=true", "application/json;odata.streaming=false", "application/json", "application/xml", "application/odata", "application/json-patch+json", "text/json", "application/_*+json"
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        if (localVarHeaderParams != null) {
            localVarHeaderParams.put("Content-Type", localVarContentType);
        }

        String[] localVarAuthNames = new String[] { "oauth2", "oauth2" };
        return localVarApiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call bulkReplaceAttributesInLayerValidateBeforeCall(String version, BulkCIAttributeLayerScopeDTO bulkCIAttributeLayerScopeDTO, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'version' is set
        if (version == null) {
            throw new ApiException("Missing the required parameter 'version' when calling bulkReplaceAttributesInLayer(Async)");
        }
        
        // verify the required parameter 'bulkCIAttributeLayerScopeDTO' is set
        if (bulkCIAttributeLayerScopeDTO == null) {
            throw new ApiException("Missing the required parameter 'bulkCIAttributeLayerScopeDTO' when calling bulkReplaceAttributesInLayer(Async)");
        }
        

        okhttp3.Call localVarCall = bulkReplaceAttributesInLayerCall(version, bulkCIAttributeLayerScopeDTO, _callback);
        return localVarCall;

    }

    /**
     * bulk replace all attributes in specified layer
     * 
     * @param version  (required)
     * @param bulkCIAttributeLayerScopeDTO  (required)
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
     </table>
     */
    public void bulkReplaceAttributesInLayer(String version, BulkCIAttributeLayerScopeDTO bulkCIAttributeLayerScopeDTO) throws ApiException {
        bulkReplaceAttributesInLayerWithHttpInfo(version, bulkCIAttributeLayerScopeDTO);
    }

    /**
     * bulk replace all attributes in specified layer
     * 
     * @param version  (required)
     * @param bulkCIAttributeLayerScopeDTO  (required)
     * @return ApiResponse&lt;Void&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<Void> bulkReplaceAttributesInLayerWithHttpInfo(String version, BulkCIAttributeLayerScopeDTO bulkCIAttributeLayerScopeDTO) throws ApiException {
        okhttp3.Call localVarCall = bulkReplaceAttributesInLayerValidateBeforeCall(version, bulkCIAttributeLayerScopeDTO, null);
        return localVarApiClient.execute(localVarCall);
    }

    /**
     * bulk replace all attributes in specified layer (asynchronously)
     * 
     * @param version  (required)
     * @param bulkCIAttributeLayerScopeDTO  (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call bulkReplaceAttributesInLayerAsync(String version, BulkCIAttributeLayerScopeDTO bulkCIAttributeLayerScopeDTO, final ApiCallback<Void> _callback) throws ApiException {

        okhttp3.Call localVarCall = bulkReplaceAttributesInLayerValidateBeforeCall(version, bulkCIAttributeLayerScopeDTO, _callback);
        localVarApiClient.executeAsync(localVarCall, _callback);
        return localVarCall;
    }
    /**
     * Build call for findMergedAttributesByName
     * @param regex  (required)
     * @param layerIDs  (required)
     * @param version  (required)
     * @param ciids  (optional)
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
    public okhttp3.Call findMergedAttributesByNameCall(String regex, List<String> layerIDs, String version, List<UUID> ciids, OffsetDateTime atTime, final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/api/v{version}/Attribute/findMergedAttributesByName"
            .replaceAll("\\{" + "version" + "\\}", localVarApiClient.escapeString(version.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        if (regex != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("regex", regex));
        }

        if (ciids != null) {
            localVarCollectionQueryParams.addAll(localVarApiClient.parameterToPairs("multi", "ciids", ciids));
        }

        if (layerIDs != null) {
            localVarCollectionQueryParams.addAll(localVarApiClient.parameterToPairs("multi", "layerIDs", layerIDs));
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
        if (localVarHeaderParams != null) {
            localVarHeaderParams.put("Content-Type", localVarContentType);
        }

        String[] localVarAuthNames = new String[] { "oauth2", "oauth2" };
        return localVarApiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call findMergedAttributesByNameValidateBeforeCall(String regex, List<String> layerIDs, String version, List<UUID> ciids, OffsetDateTime atTime, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'regex' is set
        if (regex == null) {
            throw new ApiException("Missing the required parameter 'regex' when calling findMergedAttributesByName(Async)");
        }
        
        // verify the required parameter 'layerIDs' is set
        if (layerIDs == null) {
            throw new ApiException("Missing the required parameter 'layerIDs' when calling findMergedAttributesByName(Async)");
        }
        
        // verify the required parameter 'version' is set
        if (version == null) {
            throw new ApiException("Missing the required parameter 'version' when calling findMergedAttributesByName(Async)");
        }
        

        okhttp3.Call localVarCall = findMergedAttributesByNameCall(regex, layerIDs, version, ciids, atTime, _callback);
        return localVarCall;

    }

    /**
     * 
     * 
     * @param regex  (required)
     * @param layerIDs  (required)
     * @param version  (required)
     * @param ciids  (optional)
     * @param atTime  (optional)
     * @return List&lt;CIAttributeDTO&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
     </table>
     */
    public List<CIAttributeDTO> findMergedAttributesByName(String regex, List<String> layerIDs, String version, List<UUID> ciids, OffsetDateTime atTime) throws ApiException {
        ApiResponse<List<CIAttributeDTO>> localVarResp = findMergedAttributesByNameWithHttpInfo(regex, layerIDs, version, ciids, atTime);
        return localVarResp.getData();
    }

    /**
     * 
     * 
     * @param regex  (required)
     * @param layerIDs  (required)
     * @param version  (required)
     * @param ciids  (optional)
     * @param atTime  (optional)
     * @return ApiResponse&lt;List&lt;CIAttributeDTO&gt;&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<List<CIAttributeDTO>> findMergedAttributesByNameWithHttpInfo(String regex, List<String> layerIDs, String version, List<UUID> ciids, OffsetDateTime atTime) throws ApiException {
        okhttp3.Call localVarCall = findMergedAttributesByNameValidateBeforeCall(regex, layerIDs, version, ciids, atTime, null);
        Type localVarReturnType = new TypeToken<List<CIAttributeDTO>>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     *  (asynchronously)
     * 
     * @param regex  (required)
     * @param layerIDs  (required)
     * @param version  (required)
     * @param ciids  (optional)
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
    public okhttp3.Call findMergedAttributesByNameAsync(String regex, List<String> layerIDs, String version, List<UUID> ciids, OffsetDateTime atTime, final ApiCallback<List<CIAttributeDTO>> _callback) throws ApiException {

        okhttp3.Call localVarCall = findMergedAttributesByNameValidateBeforeCall(regex, layerIDs, version, ciids, atTime, _callback);
        Type localVarReturnType = new TypeToken<List<CIAttributeDTO>>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for getMergedAttribute
     * @param ciid  (required)
     * @param name  (required)
     * @param layerIDs  (required)
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
    public okhttp3.Call getMergedAttributeCall(UUID ciid, String name, List<String> layerIDs, String version, OffsetDateTime atTime, final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/api/v{version}/Attribute/getMergedAttribute"
            .replaceAll("\\{" + "version" + "\\}", localVarApiClient.escapeString(version.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        if (ciid != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("ciid", ciid));
        }

        if (name != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("name", name));
        }

        if (layerIDs != null) {
            localVarCollectionQueryParams.addAll(localVarApiClient.parameterToPairs("multi", "layerIDs", layerIDs));
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
        if (localVarHeaderParams != null) {
            localVarHeaderParams.put("Content-Type", localVarContentType);
        }

        String[] localVarAuthNames = new String[] { "oauth2", "oauth2" };
        return localVarApiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call getMergedAttributeValidateBeforeCall(UUID ciid, String name, List<String> layerIDs, String version, OffsetDateTime atTime, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'ciid' is set
        if (ciid == null) {
            throw new ApiException("Missing the required parameter 'ciid' when calling getMergedAttribute(Async)");
        }
        
        // verify the required parameter 'name' is set
        if (name == null) {
            throw new ApiException("Missing the required parameter 'name' when calling getMergedAttribute(Async)");
        }
        
        // verify the required parameter 'layerIDs' is set
        if (layerIDs == null) {
            throw new ApiException("Missing the required parameter 'layerIDs' when calling getMergedAttribute(Async)");
        }
        
        // verify the required parameter 'version' is set
        if (version == null) {
            throw new ApiException("Missing the required parameter 'version' when calling getMergedAttribute(Async)");
        }
        

        okhttp3.Call localVarCall = getMergedAttributeCall(ciid, name, layerIDs, version, atTime, _callback);
        return localVarCall;

    }

    /**
     * 
     * 
     * @param ciid  (required)
     * @param name  (required)
     * @param layerIDs  (required)
     * @param version  (required)
     * @param atTime  (optional)
     * @return CIAttributeDTO
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
     </table>
     */
    public CIAttributeDTO getMergedAttribute(UUID ciid, String name, List<String> layerIDs, String version, OffsetDateTime atTime) throws ApiException {
        ApiResponse<CIAttributeDTO> localVarResp = getMergedAttributeWithHttpInfo(ciid, name, layerIDs, version, atTime);
        return localVarResp.getData();
    }

    /**
     * 
     * 
     * @param ciid  (required)
     * @param name  (required)
     * @param layerIDs  (required)
     * @param version  (required)
     * @param atTime  (optional)
     * @return ApiResponse&lt;CIAttributeDTO&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<CIAttributeDTO> getMergedAttributeWithHttpInfo(UUID ciid, String name, List<String> layerIDs, String version, OffsetDateTime atTime) throws ApiException {
        okhttp3.Call localVarCall = getMergedAttributeValidateBeforeCall(ciid, name, layerIDs, version, atTime, null);
        Type localVarReturnType = new TypeToken<CIAttributeDTO>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     *  (asynchronously)
     * 
     * @param ciid  (required)
     * @param name  (required)
     * @param layerIDs  (required)
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
    public okhttp3.Call getMergedAttributeAsync(UUID ciid, String name, List<String> layerIDs, String version, OffsetDateTime atTime, final ApiCallback<CIAttributeDTO> _callback) throws ApiException {

        okhttp3.Call localVarCall = getMergedAttributeValidateBeforeCall(ciid, name, layerIDs, version, atTime, _callback);
        Type localVarReturnType = new TypeToken<CIAttributeDTO>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for getMergedAttributes
     * @param ciids  (required)
     * @param layerIDs  (required)
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
    public okhttp3.Call getMergedAttributesCall(List<UUID> ciids, List<String> layerIDs, String version, OffsetDateTime atTime, final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/api/v{version}/Attribute/getMergedAttributes"
            .replaceAll("\\{" + "version" + "\\}", localVarApiClient.escapeString(version.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        if (ciids != null) {
            localVarCollectionQueryParams.addAll(localVarApiClient.parameterToPairs("multi", "ciids", ciids));
        }

        if (layerIDs != null) {
            localVarCollectionQueryParams.addAll(localVarApiClient.parameterToPairs("multi", "layerIDs", layerIDs));
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
        if (localVarHeaderParams != null) {
            localVarHeaderParams.put("Content-Type", localVarContentType);
        }

        String[] localVarAuthNames = new String[] { "oauth2", "oauth2" };
        return localVarApiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call getMergedAttributesValidateBeforeCall(List<UUID> ciids, List<String> layerIDs, String version, OffsetDateTime atTime, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'ciids' is set
        if (ciids == null) {
            throw new ApiException("Missing the required parameter 'ciids' when calling getMergedAttributes(Async)");
        }
        
        // verify the required parameter 'layerIDs' is set
        if (layerIDs == null) {
            throw new ApiException("Missing the required parameter 'layerIDs' when calling getMergedAttributes(Async)");
        }
        
        // verify the required parameter 'version' is set
        if (version == null) {
            throw new ApiException("Missing the required parameter 'version' when calling getMergedAttributes(Async)");
        }
        

        okhttp3.Call localVarCall = getMergedAttributesCall(ciids, layerIDs, version, atTime, _callback);
        return localVarCall;

    }

    /**
     * 
     * 
     * @param ciids  (required)
     * @param layerIDs  (required)
     * @param version  (required)
     * @param atTime  (optional)
     * @return List&lt;CIAttributeDTO&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
     </table>
     */
    public List<CIAttributeDTO> getMergedAttributes(List<UUID> ciids, List<String> layerIDs, String version, OffsetDateTime atTime) throws ApiException {
        ApiResponse<List<CIAttributeDTO>> localVarResp = getMergedAttributesWithHttpInfo(ciids, layerIDs, version, atTime);
        return localVarResp.getData();
    }

    /**
     * 
     * 
     * @param ciids  (required)
     * @param layerIDs  (required)
     * @param version  (required)
     * @param atTime  (optional)
     * @return ApiResponse&lt;List&lt;CIAttributeDTO&gt;&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<List<CIAttributeDTO>> getMergedAttributesWithHttpInfo(List<UUID> ciids, List<String> layerIDs, String version, OffsetDateTime atTime) throws ApiException {
        okhttp3.Call localVarCall = getMergedAttributesValidateBeforeCall(ciids, layerIDs, version, atTime, null);
        Type localVarReturnType = new TypeToken<List<CIAttributeDTO>>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     *  (asynchronously)
     * 
     * @param ciids  (required)
     * @param layerIDs  (required)
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
    public okhttp3.Call getMergedAttributesAsync(List<UUID> ciids, List<String> layerIDs, String version, OffsetDateTime atTime, final ApiCallback<List<CIAttributeDTO>> _callback) throws ApiException {

        okhttp3.Call localVarCall = getMergedAttributesValidateBeforeCall(ciids, layerIDs, version, atTime, _callback);
        Type localVarReturnType = new TypeToken<List<CIAttributeDTO>>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for getMergedAttributesWithName
     * @param name  (required)
     * @param layerIDs  (required)
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
    public okhttp3.Call getMergedAttributesWithNameCall(String name, List<String> layerIDs, String version, OffsetDateTime atTime, final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/api/v{version}/Attribute/getMergedAttributesWithName"
            .replaceAll("\\{" + "version" + "\\}", localVarApiClient.escapeString(version.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        if (name != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("name", name));
        }

        if (layerIDs != null) {
            localVarCollectionQueryParams.addAll(localVarApiClient.parameterToPairs("multi", "layerIDs", layerIDs));
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
        if (localVarHeaderParams != null) {
            localVarHeaderParams.put("Content-Type", localVarContentType);
        }

        String[] localVarAuthNames = new String[] { "oauth2", "oauth2" };
        return localVarApiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call getMergedAttributesWithNameValidateBeforeCall(String name, List<String> layerIDs, String version, OffsetDateTime atTime, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'name' is set
        if (name == null) {
            throw new ApiException("Missing the required parameter 'name' when calling getMergedAttributesWithName(Async)");
        }
        
        // verify the required parameter 'layerIDs' is set
        if (layerIDs == null) {
            throw new ApiException("Missing the required parameter 'layerIDs' when calling getMergedAttributesWithName(Async)");
        }
        
        // verify the required parameter 'version' is set
        if (version == null) {
            throw new ApiException("Missing the required parameter 'version' when calling getMergedAttributesWithName(Async)");
        }
        

        okhttp3.Call localVarCall = getMergedAttributesWithNameCall(name, layerIDs, version, atTime, _callback);
        return localVarCall;

    }

    /**
     * 
     * 
     * @param name  (required)
     * @param layerIDs  (required)
     * @param version  (required)
     * @param atTime  (optional)
     * @return List&lt;CIAttributeDTO&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
     </table>
     */
    public List<CIAttributeDTO> getMergedAttributesWithName(String name, List<String> layerIDs, String version, OffsetDateTime atTime) throws ApiException {
        ApiResponse<List<CIAttributeDTO>> localVarResp = getMergedAttributesWithNameWithHttpInfo(name, layerIDs, version, atTime);
        return localVarResp.getData();
    }

    /**
     * 
     * 
     * @param name  (required)
     * @param layerIDs  (required)
     * @param version  (required)
     * @param atTime  (optional)
     * @return ApiResponse&lt;List&lt;CIAttributeDTO&gt;&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<List<CIAttributeDTO>> getMergedAttributesWithNameWithHttpInfo(String name, List<String> layerIDs, String version, OffsetDateTime atTime) throws ApiException {
        okhttp3.Call localVarCall = getMergedAttributesWithNameValidateBeforeCall(name, layerIDs, version, atTime, null);
        Type localVarReturnType = new TypeToken<List<CIAttributeDTO>>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     *  (asynchronously)
     * 
     * @param name  (required)
     * @param layerIDs  (required)
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
    public okhttp3.Call getMergedAttributesWithNameAsync(String name, List<String> layerIDs, String version, OffsetDateTime atTime, final ApiCallback<List<CIAttributeDTO>> _callback) throws ApiException {

        okhttp3.Call localVarCall = getMergedAttributesWithNameValidateBeforeCall(name, layerIDs, version, atTime, _callback);
        Type localVarReturnType = new TypeToken<List<CIAttributeDTO>>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
}
