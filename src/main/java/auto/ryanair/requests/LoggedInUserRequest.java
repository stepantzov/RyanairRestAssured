package auto.ryanair.requests;

import auto.ryanair.utils.PropertiesReader;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

import static io.restassured.RestAssured.given;

public class LoggedInUserRequest {
    public static Response extractStatusCode(String xAuthTokenHeader) {
        return given()
                .contentType(ContentType.JSON)
                .header("X-AUTH-TOKEN", xAuthTokenHeader)
                .when()
                .get(PropertiesReader.getPropertyByName("loggedIn.url.base"))
                .then()
                .statusCode(200)
                .extract()
                .response();
    }
}