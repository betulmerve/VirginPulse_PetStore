package com.automation.tests.VirginPulse;



import io.restassured.http.ContentType;
import io.restassured.response.Response;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;


import java.awt.*;
import java.io.File;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.*;

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
    @DisplayName("Create a pet and add a picture")
    public void createAndAddPicToPet() {

        File imageFile = new File("/Users/mervefaki/IdeaProjects/VirginPulse_PetStore/download.jpeg");

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



                given().
                        multiPart("file",new File("/Users/mervefaki/IdeaProjects/VirginPulse_PetStore/download.jpeg")).
                        body(body).baseUri(BASE_URL).
                when().
                        post("/pet/{petId}/uploadImage",200).prettyPeek().
                        then().statusCode(200);

    }






}
