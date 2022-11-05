package ru.netology.test;

import io.restassured.http.ContentType;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;

public class SuccessfulTests {

    @Test
    public void jsonTest (){
        given()
                .baseUri("http://localhost:9999/api/v1")
                .when ()
                .get("/demo/accounts")
                .then()
                .statusCode(200)
                .contentType(ContentType.JSON);
    }

    }

