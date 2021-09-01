package com.automation.tests.VirginPulse;

import io.restassured.response.Response;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.is;

public class SecondTest {


        String BASE_URL="https://petstore.swagger.io/v2";

        @Test
        @DisplayName("Search for a new pet")
        public void searchNewPet() {
            Response response= given().baseUri(BASE_URL).queryParam("status","available").
                    when().get("/pet/findByStatus").prettyPeek();



        }


    @Test
    @DisplayName("Get a specific pet")
    public void getPet() {
        Response response=given().baseUri(BASE_URL).
                when().get("/pet/{petId}",200).prettyPeek();

        response.
                then().assertThat().statusCode(200).
                and().
                body("id",is(200));

    }




    }

    //for the second part of the task, we need to find similar pets,
    // i though to use tags but this endpoint is deprecated.


