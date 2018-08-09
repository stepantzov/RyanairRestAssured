package auto.ryanair.requests;

import auto.ryanair.urlDefinitions.UrlDefinitions;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

import static io.restassured.RestAssured.given;

public class LoggedInUserRequest {
    public static Response extractLoggedInUserResponse(String xAuthTokenHeader) {
        return given().
                contentType(ContentType.JSON).
                header("X-AUTH-TOKEN", xAuthTokenHeader).
                when().
                get(UrlDefinitions.loggedInUrl).
                then().
                extract().
                response();
    }
}