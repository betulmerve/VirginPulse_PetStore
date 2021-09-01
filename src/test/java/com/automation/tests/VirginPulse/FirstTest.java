package com.automation.tests.VirginPulse;

import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;


import static io.restassured.RestAssured.given;

public class FirstTest {

    String BASE_URL="https://petstore.swagger.io/v2";

    @Test
    @DisplayName("Create a pet")
    public void createPet() {
        String body="{\n" +
                "  \"id\": 0,\n" +
                "  \"category\": {\n" +
                "    \"id\": 0,\n" +
                "    \"name\": \"string\"\n" +
                "  },\n" +
                "  \"name\": \"string\",\n" +
                "  \"photoUrls\": [\n" +
                "    \"string\"\n" +
                "  ],\n" +
                "  \"tags\": [\n" +
                "    {\n" +
                "      \"id\": 0,\n" +
                "      \"name\": \"string\"\n" +
                "    }\n" +
                "  ],\n" +
                "  \"status\": \"available\"\n" +
                "}";


        Response response= given().contentType(ContentType.JSON).body(body).baseUri(BASE_URL).
        when().post("/pet").prettyPeek();


    }


    @Test
    @DisplayName("Get a specific pet")
    public void getPet() {
        Response response= given().baseUri(BASE_URL).
                when().get("/pet/{petId}",100).prettyPeek();

    }


//    @Test
//    @DisplayName("Create a pet and add a picture")
//    public void createAndAddPicToPet() {
//
//        File imageFile = new File(System.getProperty("user.dir") + "/download.jpeg");
//
//        String body="{\n" +
//                "  \"id\": 0,\n" +
//                "  \"category\": {\n" +
//                "    \"id\": 0,\n" +
//                "    \"name\": \"string\"\n" +
//                "  },\n" +
//                "  \"name\": \"doggie\",\n" +
//                "  \"photoUrls\": [\n" + imageFile +
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
//
//
//        Response response= given().contentType(ContentType.JSON).body(body).baseUri(BASE_URL).
//                when().post("/pet/{petId}/uploadImage",2000).prettyPeek();
//
//    }






}
