package com.unit.testing.dto;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class ObjectMapping {

    public static void main(String[] args) throws JsonProcessingException {

        String inputJson = "{\"id\":1\"name\":\"ganesh\",\"mailid\":\"ganesh@gmail.com\"}";

        ObjectMapper objectMapper = new ObjectMapper();

        ObjectMap objectMap = objectMapper.readValue(inputJson,ObjectMap.class);

        System.out.println(objectMap);

    }
}
