package auto.ryanair.requests;

import auto.ryanair.urlDefinitions.UrlDefinitions;
import io.restassured.response.Response;

import java.util.Map;

import static io.restassured.RestAssured.given;

public class AvailabilityRequest {
    public static Response getAvailabilityRequestResponse(Map pathParams) {
        return given().
                pathParams(pathParams).
                when().
                get(UrlDefinitions.availabilityRequestUrl).
                then().
                extract().
                response();
    }
}