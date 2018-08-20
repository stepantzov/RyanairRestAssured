package auto.ryanair.requests;

import auto.ryanair.utils.PropertiesReader;
import io.restassured.http.ContentType;

import static io.restassured.RestAssured.given;

public class LoggedInUserRequest {
    public static int extractStatusCode(String xAuthTokenHeader) {
        return given()
                .contentType(ContentType.JSON)
                .header("X-AUTH-TOKEN", xAuthTokenHeader)
                .when()
                .get(PropertiesReader.getPropertyByName("loggedIn.url.base"))
                .then()
                .extract()
                .statusCode();
    }
}