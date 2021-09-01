package com.automation.tests.VirginPulse;


import com.fasterxml.jackson.core.type.TypeReference;

import com.fasterxml.jackson.databind.ObjectMapper;
import io.restassured.response.Response;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

import static io.restassured.RestAssured.given;

public class SecondTest {


        String BASE_URL="https://petstore.swagger.io/v2";

        @Test
        @DisplayName("Search for a new pet")
        public void searchNewPet() {
            Response response= given().baseUri(BASE_URL).queryParam("status","available").
                    when().get("/pet/findByStatus").prettyPeek();


        }

        @Test
        @DisplayName("djsbfk")


    //    @Test
//    @DisplayName("Search for a category")
//    public void searchCategory() {
//        Response response= given().baseUri(BASE_URL).queryParam("category","dog").
//                when().get("/pet/findByStatus").prettyPeek();
//
//    }
//try

//    @Test
//    public void getAllKeysFromNestedJsonObjectUsingMap() throws IOException {
//
//        String jsonObject ="{\n" +
//                "  \"id\": 0,\n" +
//                "  \"category\": {\n" +
//                "    \"id\": 0,\n" +
//                "    \"name\": \"string\"\n" +
//                "  },\n" +
//                "  \"name\": \"string\",\n" +
//                "  \"photoUrls\": [\n" +
//                "    \"string\"\n" +
//                "  ],\n" +
//                "  \"tags\": [\n" +
//                "    {\n" +
//                "      \"id\": 0,\n" +
//                "      \"name\": \"string\"\n" +
//                "    }\n" +
//                "  ],\n" +
//                "  \"status\": \"available\"\n" +
//                "}";
//        ObjectMapper objectMapper = new ObjectMapper();
//        // Deserialize into Map
//        Map<String, Object> parsedJsonObject = objectMapper.readValue(jsonObject, new TypeReference<Map<String, Object>>() {
//        });
//        // Get all keys
//        Set<String> allKeys = parsedJsonObject.keySet();
//        // Iterate keys
//        allKeys.stream().forEach(key -> {
//            Object value = parsedJsonObject.get(key);
//            // If value is a String. You may need to add more if value is of different types
//            if (value instanceof String)
//                System.out.println(key);
//                // If value is another JSON Object which will be LinkedHashMap. You can see this while debugging
//            else if (value instanceof LinkedHashMap<?, ?>) {
//                @SuppressWarnings("unchecked")
//                Set<String> allKeysOfNestedJsonObject = ((LinkedHashMap<String, ?>) value).keySet();
//                allKeysOfNestedJsonObject.stream().forEach(k -> System.out.println(k));
//            }
//        });
//    }





    }

