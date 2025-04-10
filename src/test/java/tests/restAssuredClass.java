package tests;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

public class restAssuredClass {

    @Test
    public void validLoginTest() {
        RestAssured.baseURI = "https://your-api.com";

        given()
                .header("Content-Type", "application/json")
                .body("{\"username\":\"user\", \"password\":\"pass\"}")
                .when()
                .post("/login")
                .then()
                .statusCode(200)
                .body("token", notNullValue());
    }
}

