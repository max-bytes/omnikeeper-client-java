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


package org.openapitools.client.model;

import java.util.Objects;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.util.Arrays;
import org.openapitools.client.model.InboundIDMethodByAttribute;
import org.openapitools.client.model.InboundIDMethodByAttributeModifiers;
import org.openapitools.client.model.InboundIDMethodByByUnion;
import org.openapitools.client.model.InboundIDMethodByData;
import org.openapitools.client.model.InboundIDMethodByIntersect;
import org.openapitools.client.model.InboundIDMethodByRelatedTempID;
import org.openapitools.client.model.InboundIDMethodByTemporaryCIID;



import java.io.IOException;
import java.lang.reflect.Type;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonParseException;
import com.google.gson.TypeAdapter;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.reflect.TypeToken;
import com.google.gson.JsonPrimitive;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSerializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonArray;
import com.google.gson.JsonParseException;

import org.openapitools.client.JSON;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-08-21T10:11:10.300752Z[Etc/UTC]")
public class GenericInboundCIIdMethod extends AbstractOpenApiSchema {
    private static final Logger log = Logger.getLogger(GenericInboundCIIdMethod.class.getName());

    public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
        @SuppressWarnings("unchecked")
        @Override
        public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
            if (!GenericInboundCIIdMethod.class.isAssignableFrom(type.getRawType())) {
                return null; // this class only serializes 'GenericInboundCIIdMethod' and its subtypes
            }
            final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
            final TypeAdapter<InboundIDMethodByData> adapterInboundIDMethodByData = gson.getDelegateAdapter(this, TypeToken.get(InboundIDMethodByData.class));
            final TypeAdapter<InboundIDMethodByAttributeModifiers> adapterInboundIDMethodByAttributeModifiers = gson.getDelegateAdapter(this, TypeToken.get(InboundIDMethodByAttributeModifiers.class));
            final TypeAdapter<InboundIDMethodByAttribute> adapterInboundIDMethodByAttribute = gson.getDelegateAdapter(this, TypeToken.get(InboundIDMethodByAttribute.class));
            final TypeAdapter<InboundIDMethodByRelatedTempID> adapterInboundIDMethodByRelatedTempID = gson.getDelegateAdapter(this, TypeToken.get(InboundIDMethodByRelatedTempID.class));
            final TypeAdapter<InboundIDMethodByTemporaryCIID> adapterInboundIDMethodByTemporaryCIID = gson.getDelegateAdapter(this, TypeToken.get(InboundIDMethodByTemporaryCIID.class));
            final TypeAdapter<InboundIDMethodByByUnion> adapterInboundIDMethodByByUnion = gson.getDelegateAdapter(this, TypeToken.get(InboundIDMethodByByUnion.class));
            final TypeAdapter<InboundIDMethodByIntersect> adapterInboundIDMethodByIntersect = gson.getDelegateAdapter(this, TypeToken.get(InboundIDMethodByIntersect.class));

            return (TypeAdapter<T>) new TypeAdapter<GenericInboundCIIdMethod>() {
                @Override
                public void write(JsonWriter out, GenericInboundCIIdMethod value) throws IOException {
                    if (value == null || value.getActualInstance() == null) {
                        elementAdapter.write(out, null);
                        return;
                    }

                    // check if the actual instance is of the type `InboundIDMethodByData`
                    if (value.getActualInstance() instanceof InboundIDMethodByData) {
                      JsonElement element = adapterInboundIDMethodByData.toJsonTree((InboundIDMethodByData)value.getActualInstance());
                      elementAdapter.write(out, element);
                      return;
                    }
                    // check if the actual instance is of the type `InboundIDMethodByAttributeModifiers`
                    if (value.getActualInstance() instanceof InboundIDMethodByAttributeModifiers) {
                      JsonElement element = adapterInboundIDMethodByAttributeModifiers.toJsonTree((InboundIDMethodByAttributeModifiers)value.getActualInstance());
                      elementAdapter.write(out, element);
                      return;
                    }
                    // check if the actual instance is of the type `InboundIDMethodByAttribute`
                    if (value.getActualInstance() instanceof InboundIDMethodByAttribute) {
                      JsonElement element = adapterInboundIDMethodByAttribute.toJsonTree((InboundIDMethodByAttribute)value.getActualInstance());
                      elementAdapter.write(out, element);
                      return;
                    }
                    // check if the actual instance is of the type `InboundIDMethodByRelatedTempID`
                    if (value.getActualInstance() instanceof InboundIDMethodByRelatedTempID) {
                      JsonElement element = adapterInboundIDMethodByRelatedTempID.toJsonTree((InboundIDMethodByRelatedTempID)value.getActualInstance());
                      elementAdapter.write(out, element);
                      return;
                    }
                    // check if the actual instance is of the type `InboundIDMethodByTemporaryCIID`
                    if (value.getActualInstance() instanceof InboundIDMethodByTemporaryCIID) {
                      JsonElement element = adapterInboundIDMethodByTemporaryCIID.toJsonTree((InboundIDMethodByTemporaryCIID)value.getActualInstance());
                      elementAdapter.write(out, element);
                      return;
                    }
                    // check if the actual instance is of the type `InboundIDMethodByByUnion`
                    if (value.getActualInstance() instanceof InboundIDMethodByByUnion) {
                      JsonElement element = adapterInboundIDMethodByByUnion.toJsonTree((InboundIDMethodByByUnion)value.getActualInstance());
                      elementAdapter.write(out, element);
                      return;
                    }
                    // check if the actual instance is of the type `InboundIDMethodByIntersect`
                    if (value.getActualInstance() instanceof InboundIDMethodByIntersect) {
                      JsonElement element = adapterInboundIDMethodByIntersect.toJsonTree((InboundIDMethodByIntersect)value.getActualInstance());
                      elementAdapter.write(out, element);
                      return;
                    }
                    throw new IOException("Failed to serialize as the type doesn't match oneOf schemas: InboundIDMethodByAttribute, InboundIDMethodByAttributeModifiers, InboundIDMethodByByUnion, InboundIDMethodByData, InboundIDMethodByIntersect, InboundIDMethodByRelatedTempID, InboundIDMethodByTemporaryCIID");
                }

                @Override
                public GenericInboundCIIdMethod read(JsonReader in) throws IOException {
                    Object deserialized = null;
                    JsonElement jsonElement = elementAdapter.read(in);

                    int match = 0;
                    ArrayList<String> errorMessages = new ArrayList<>();
                    TypeAdapter actualAdapter = elementAdapter;

                    // deserialize InboundIDMethodByData
                    try {
                      // validate the JSON object to see if any exception is thrown
                      InboundIDMethodByData.validateJsonElement(jsonElement);
                      actualAdapter = adapterInboundIDMethodByData;
                      match++;
                      log.log(Level.FINER, "Input data matches schema 'InboundIDMethodByData'");
                    } catch (Exception e) {
                      // deserialization failed, continue
                      errorMessages.add(String.format("Deserialization for InboundIDMethodByData failed with `%s`.", e.getMessage()));
                      log.log(Level.FINER, "Input data does not match schema 'InboundIDMethodByData'", e);
                    }
                    // deserialize InboundIDMethodByAttributeModifiers
                    try {
                      // validate the JSON object to see if any exception is thrown
                      InboundIDMethodByAttributeModifiers.validateJsonElement(jsonElement);
                      actualAdapter = adapterInboundIDMethodByAttributeModifiers;
                      match++;
                      log.log(Level.FINER, "Input data matches schema 'InboundIDMethodByAttributeModifiers'");
                    } catch (Exception e) {
                      // deserialization failed, continue
                      errorMessages.add(String.format("Deserialization for InboundIDMethodByAttributeModifiers failed with `%s`.", e.getMessage()));
                      log.log(Level.FINER, "Input data does not match schema 'InboundIDMethodByAttributeModifiers'", e);
                    }
                    // deserialize InboundIDMethodByAttribute
                    try {
                      // validate the JSON object to see if any exception is thrown
                      InboundIDMethodByAttribute.validateJsonElement(jsonElement);
                      actualAdapter = adapterInboundIDMethodByAttribute;
                      match++;
                      log.log(Level.FINER, "Input data matches schema 'InboundIDMethodByAttribute'");
                    } catch (Exception e) {
                      // deserialization failed, continue
                      errorMessages.add(String.format("Deserialization for InboundIDMethodByAttribute failed with `%s`.", e.getMessage()));
                      log.log(Level.FINER, "Input data does not match schema 'InboundIDMethodByAttribute'", e);
                    }
                    // deserialize InboundIDMethodByRelatedTempID
                    try {
                      // validate the JSON object to see if any exception is thrown
                      InboundIDMethodByRelatedTempID.validateJsonElement(jsonElement);
                      actualAdapter = adapterInboundIDMethodByRelatedTempID;
                      match++;
                      log.log(Level.FINER, "Input data matches schema 'InboundIDMethodByRelatedTempID'");
                    } catch (Exception e) {
                      // deserialization failed, continue
                      errorMessages.add(String.format("Deserialization for InboundIDMethodByRelatedTempID failed with `%s`.", e.getMessage()));
                      log.log(Level.FINER, "Input data does not match schema 'InboundIDMethodByRelatedTempID'", e);
                    }
                    // deserialize InboundIDMethodByTemporaryCIID
                    try {
                      // validate the JSON object to see if any exception is thrown
                      InboundIDMethodByTemporaryCIID.validateJsonElement(jsonElement);
                      actualAdapter = adapterInboundIDMethodByTemporaryCIID;
                      match++;
                      log.log(Level.FINER, "Input data matches schema 'InboundIDMethodByTemporaryCIID'");
                    } catch (Exception e) {
                      // deserialization failed, continue
                      errorMessages.add(String.format("Deserialization for InboundIDMethodByTemporaryCIID failed with `%s`.", e.getMessage()));
                      log.log(Level.FINER, "Input data does not match schema 'InboundIDMethodByTemporaryCIID'", e);
                    }
                    // deserialize InboundIDMethodByByUnion
                    try {
                      // validate the JSON object to see if any exception is thrown
                      InboundIDMethodByByUnion.validateJsonElement(jsonElement);
                      actualAdapter = adapterInboundIDMethodByByUnion;
                      match++;
                      log.log(Level.FINER, "Input data matches schema 'InboundIDMethodByByUnion'");
                    } catch (Exception e) {
                      // deserialization failed, continue
                      errorMessages.add(String.format("Deserialization for InboundIDMethodByByUnion failed with `%s`.", e.getMessage()));
                      log.log(Level.FINER, "Input data does not match schema 'InboundIDMethodByByUnion'", e);
                    }
                    // deserialize InboundIDMethodByIntersect
                    try {
                      // validate the JSON object to see if any exception is thrown
                      InboundIDMethodByIntersect.validateJsonElement(jsonElement);
                      actualAdapter = adapterInboundIDMethodByIntersect;
                      match++;
                      log.log(Level.FINER, "Input data matches schema 'InboundIDMethodByIntersect'");
                    } catch (Exception e) {
                      // deserialization failed, continue
                      errorMessages.add(String.format("Deserialization for InboundIDMethodByIntersect failed with `%s`.", e.getMessage()));
                      log.log(Level.FINER, "Input data does not match schema 'InboundIDMethodByIntersect'", e);
                    }

                    if (match == 1) {
                        GenericInboundCIIdMethod ret = new GenericInboundCIIdMethod();
                        ret.setActualInstance(actualAdapter.fromJsonTree(jsonElement));
                        return ret;
                    }

                    throw new IOException(String.format("Failed deserialization for GenericInboundCIIdMethod: %d classes match result, expected 1. Detailed failure message for oneOf schemas: %s. JSON: %s", match, errorMessages, jsonElement.toString()));
                }
            }.nullSafe();
        }
    }

    // store a list of schema names defined in oneOf
    public static final Map<String, Class<?>> schemas = new HashMap<String, Class<?>>();

    public GenericInboundCIIdMethod() {
        super("oneOf", Boolean.FALSE);
    }

    public GenericInboundCIIdMethod(InboundIDMethodByAttribute o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }

    public GenericInboundCIIdMethod(InboundIDMethodByAttributeModifiers o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }

    public GenericInboundCIIdMethod(InboundIDMethodByByUnion o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }

    public GenericInboundCIIdMethod(InboundIDMethodByData o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }

    public GenericInboundCIIdMethod(InboundIDMethodByIntersect o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }

    public GenericInboundCIIdMethod(InboundIDMethodByRelatedTempID o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }

    public GenericInboundCIIdMethod(InboundIDMethodByTemporaryCIID o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }

    static {
        schemas.put("InboundIDMethodByData", InboundIDMethodByData.class);
        schemas.put("InboundIDMethodByAttributeModifiers", InboundIDMethodByAttributeModifiers.class);
        schemas.put("InboundIDMethodByAttribute", InboundIDMethodByAttribute.class);
        schemas.put("InboundIDMethodByRelatedTempID", InboundIDMethodByRelatedTempID.class);
        schemas.put("InboundIDMethodByTemporaryCIID", InboundIDMethodByTemporaryCIID.class);
        schemas.put("InboundIDMethodByByUnion", InboundIDMethodByByUnion.class);
        schemas.put("InboundIDMethodByIntersect", InboundIDMethodByIntersect.class);
    }

    @Override
    public Map<String, Class<?>> getSchemas() {
        return GenericInboundCIIdMethod.schemas;
    }

    /**
     * Set the instance that matches the oneOf child schema, check
     * the instance parameter is valid against the oneOf child schemas:
     * InboundIDMethodByAttribute, InboundIDMethodByAttributeModifiers, InboundIDMethodByByUnion, InboundIDMethodByData, InboundIDMethodByIntersect, InboundIDMethodByRelatedTempID, InboundIDMethodByTemporaryCIID
     *
     * It could be an instance of the 'oneOf' schemas.
     */
    @Override
    public void setActualInstance(Object instance) {
        if (instance instanceof InboundIDMethodByData) {
            super.setActualInstance(instance);
            return;
        }

        if (instance instanceof InboundIDMethodByAttributeModifiers) {
            super.setActualInstance(instance);
            return;
        }

        if (instance instanceof InboundIDMethodByAttribute) {
            super.setActualInstance(instance);
            return;
        }

        if (instance instanceof InboundIDMethodByRelatedTempID) {
            super.setActualInstance(instance);
            return;
        }

        if (instance instanceof InboundIDMethodByTemporaryCIID) {
            super.setActualInstance(instance);
            return;
        }

        if (instance instanceof InboundIDMethodByByUnion) {
            super.setActualInstance(instance);
            return;
        }

        if (instance instanceof InboundIDMethodByIntersect) {
            super.setActualInstance(instance);
            return;
        }

        throw new RuntimeException("Invalid instance type. Must be InboundIDMethodByAttribute, InboundIDMethodByAttributeModifiers, InboundIDMethodByByUnion, InboundIDMethodByData, InboundIDMethodByIntersect, InboundIDMethodByRelatedTempID, InboundIDMethodByTemporaryCIID");
    }

    /**
     * Get the actual instance, which can be the following:
     * InboundIDMethodByAttribute, InboundIDMethodByAttributeModifiers, InboundIDMethodByByUnion, InboundIDMethodByData, InboundIDMethodByIntersect, InboundIDMethodByRelatedTempID, InboundIDMethodByTemporaryCIID
     *
     * @return The actual instance (InboundIDMethodByAttribute, InboundIDMethodByAttributeModifiers, InboundIDMethodByByUnion, InboundIDMethodByData, InboundIDMethodByIntersect, InboundIDMethodByRelatedTempID, InboundIDMethodByTemporaryCIID)
     */
    @Override
    public Object getActualInstance() {
        return super.getActualInstance();
    }

    /**
     * Get the actual instance of `InboundIDMethodByData`. If the actual instance is not `InboundIDMethodByData`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `InboundIDMethodByData`
     * @throws ClassCastException if the instance is not `InboundIDMethodByData`
     */
    public InboundIDMethodByData getInboundIDMethodByData() throws ClassCastException {
        return (InboundIDMethodByData)super.getActualInstance();
    }
    /**
     * Get the actual instance of `InboundIDMethodByAttributeModifiers`. If the actual instance is not `InboundIDMethodByAttributeModifiers`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `InboundIDMethodByAttributeModifiers`
     * @throws ClassCastException if the instance is not `InboundIDMethodByAttributeModifiers`
     */
    public InboundIDMethodByAttributeModifiers getInboundIDMethodByAttributeModifiers() throws ClassCastException {
        return (InboundIDMethodByAttributeModifiers)super.getActualInstance();
    }
    /**
     * Get the actual instance of `InboundIDMethodByAttribute`. If the actual instance is not `InboundIDMethodByAttribute`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `InboundIDMethodByAttribute`
     * @throws ClassCastException if the instance is not `InboundIDMethodByAttribute`
     */
    public InboundIDMethodByAttribute getInboundIDMethodByAttribute() throws ClassCastException {
        return (InboundIDMethodByAttribute)super.getActualInstance();
    }
    /**
     * Get the actual instance of `InboundIDMethodByRelatedTempID`. If the actual instance is not `InboundIDMethodByRelatedTempID`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `InboundIDMethodByRelatedTempID`
     * @throws ClassCastException if the instance is not `InboundIDMethodByRelatedTempID`
     */
    public InboundIDMethodByRelatedTempID getInboundIDMethodByRelatedTempID() throws ClassCastException {
        return (InboundIDMethodByRelatedTempID)super.getActualInstance();
    }
    /**
     * Get the actual instance of `InboundIDMethodByTemporaryCIID`. If the actual instance is not `InboundIDMethodByTemporaryCIID`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `InboundIDMethodByTemporaryCIID`
     * @throws ClassCastException if the instance is not `InboundIDMethodByTemporaryCIID`
     */
    public InboundIDMethodByTemporaryCIID getInboundIDMethodByTemporaryCIID() throws ClassCastException {
        return (InboundIDMethodByTemporaryCIID)super.getActualInstance();
    }
    /**
     * Get the actual instance of `InboundIDMethodByByUnion`. If the actual instance is not `InboundIDMethodByByUnion`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `InboundIDMethodByByUnion`
     * @throws ClassCastException if the instance is not `InboundIDMethodByByUnion`
     */
    public InboundIDMethodByByUnion getInboundIDMethodByByUnion() throws ClassCastException {
        return (InboundIDMethodByByUnion)super.getActualInstance();
    }
    /**
     * Get the actual instance of `InboundIDMethodByIntersect`. If the actual instance is not `InboundIDMethodByIntersect`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `InboundIDMethodByIntersect`
     * @throws ClassCastException if the instance is not `InboundIDMethodByIntersect`
     */
    public InboundIDMethodByIntersect getInboundIDMethodByIntersect() throws ClassCastException {
        return (InboundIDMethodByIntersect)super.getActualInstance();
    }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to GenericInboundCIIdMethod
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
    // validate oneOf schemas one by one
    int validCount = 0;
    ArrayList<String> errorMessages = new ArrayList<>();
    // validate the json string with InboundIDMethodByData
    try {
      InboundIDMethodByData.validateJsonElement(jsonElement);
      validCount++;
    } catch (Exception e) {
      errorMessages.add(String.format("Deserialization for InboundIDMethodByData failed with `%s`.", e.getMessage()));
      // continue to the next one
    }
    // validate the json string with InboundIDMethodByAttributeModifiers
    try {
      InboundIDMethodByAttributeModifiers.validateJsonElement(jsonElement);
      validCount++;
    } catch (Exception e) {
      errorMessages.add(String.format("Deserialization for InboundIDMethodByAttributeModifiers failed with `%s`.", e.getMessage()));
      // continue to the next one
    }
    // validate the json string with InboundIDMethodByAttribute
    try {
      InboundIDMethodByAttribute.validateJsonElement(jsonElement);
      validCount++;
    } catch (Exception e) {
      errorMessages.add(String.format("Deserialization for InboundIDMethodByAttribute failed with `%s`.", e.getMessage()));
      // continue to the next one
    }
    // validate the json string with InboundIDMethodByRelatedTempID
    try {
      InboundIDMethodByRelatedTempID.validateJsonElement(jsonElement);
      validCount++;
    } catch (Exception e) {
      errorMessages.add(String.format("Deserialization for InboundIDMethodByRelatedTempID failed with `%s`.", e.getMessage()));
      // continue to the next one
    }
    // validate the json string with InboundIDMethodByTemporaryCIID
    try {
      InboundIDMethodByTemporaryCIID.validateJsonElement(jsonElement);
      validCount++;
    } catch (Exception e) {
      errorMessages.add(String.format("Deserialization for InboundIDMethodByTemporaryCIID failed with `%s`.", e.getMessage()));
      // continue to the next one
    }
    // validate the json string with InboundIDMethodByByUnion
    try {
      InboundIDMethodByByUnion.validateJsonElement(jsonElement);
      validCount++;
    } catch (Exception e) {
      errorMessages.add(String.format("Deserialization for InboundIDMethodByByUnion failed with `%s`.", e.getMessage()));
      // continue to the next one
    }
    // validate the json string with InboundIDMethodByIntersect
    try {
      InboundIDMethodByIntersect.validateJsonElement(jsonElement);
      validCount++;
    } catch (Exception e) {
      errorMessages.add(String.format("Deserialization for InboundIDMethodByIntersect failed with `%s`.", e.getMessage()));
      // continue to the next one
    }
    if (validCount != 1) {
      throw new IOException(String.format("The JSON string is invalid for GenericInboundCIIdMethod with oneOf schemas: InboundIDMethodByAttribute, InboundIDMethodByAttributeModifiers, InboundIDMethodByByUnion, InboundIDMethodByData, InboundIDMethodByIntersect, InboundIDMethodByRelatedTempID, InboundIDMethodByTemporaryCIID. %d class(es) match the result, expected 1. Detailed failure message for oneOf schemas: %s. JSON: %s", validCount, errorMessages, jsonElement.toString()));
    }
  }

 /**
  * Create an instance of GenericInboundCIIdMethod given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of GenericInboundCIIdMethod
  * @throws IOException if the JSON string is invalid with respect to GenericInboundCIIdMethod
  */
  public static GenericInboundCIIdMethod fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, GenericInboundCIIdMethod.class);
  }

 /**
  * Convert an instance of GenericInboundCIIdMethod to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

