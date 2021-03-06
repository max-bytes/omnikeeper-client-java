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

import org.openapitools.client.ApiException;
import org.openapitools.client.model.BulkCIAttributeLayerScopeDTO;
import org.openapitools.client.model.CIAttributeDTO;
import org.threeten.bp.OffsetDateTime;
import java.util.UUID;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for AttributeApi
 */
@Ignore
public class AttributeApiTest {

    private final AttributeApi api = new AttributeApi();

    
    /**
     * bulk replace all attributes in specified layer
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void bulkReplaceAttributesInLayerTest() throws ApiException {
        String version = null;
        BulkCIAttributeLayerScopeDTO bulkCIAttributeLayerScopeDTO = null;
        api.bulkReplaceAttributesInLayer(version, bulkCIAttributeLayerScopeDTO);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void findMergedAttributesByNameTest() throws ApiException {
        String regex = null;
        List<Long> layerIDs = null;
        String version = null;
        List<UUID> ciids = null;
        OffsetDateTime atTime = null;
        List<CIAttributeDTO> response = api.findMergedAttributesByName(regex, layerIDs, version, ciids, atTime);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getMergedAttributeTest() throws ApiException {
        UUID ciid = null;
        String name = null;
        List<Long> layerIDs = null;
        String version = null;
        OffsetDateTime atTime = null;
        CIAttributeDTO response = api.getMergedAttribute(ciid, name, layerIDs, version, atTime);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getMergedAttributesTest() throws ApiException {
        List<UUID> ciids = null;
        List<Long> layerIDs = null;
        String version = null;
        OffsetDateTime atTime = null;
        List<CIAttributeDTO> response = api.getMergedAttributes(ciids, layerIDs, version, atTime);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getMergedAttributesWithNameTest() throws ApiException {
        String name = null;
        List<Long> layerIDs = null;
        String version = null;
        OffsetDateTime atTime = null;
        List<CIAttributeDTO> response = api.getMergedAttributesWithName(name, layerIDs, version, atTime);

        // TODO: test validations
    }
    
}
