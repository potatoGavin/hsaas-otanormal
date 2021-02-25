package com.hemily.hsaasotanormal.utils;

import com.fasterxml.jackson.databind.ObjectMapper;

public class JSON {


    public static String toString(Object obj) {
        try {
            ObjectMapper objectMapper = new ObjectMapper();
            return objectMapper.writeValueAsString(obj);
        } catch (Exception ex) {
            return "";
        }
    }

    public static <T> T toObject(String json, Class<T> valueType) {
        try {
            ObjectMapper objectMapper = new ObjectMapper();
            return objectMapper.readValue(json, valueType);
        } catch (Exception ex) {
            return null;
        }
    }

}
