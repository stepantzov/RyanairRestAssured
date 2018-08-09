package auto.ryanair.requests;

import auto.ryanair.urlDefinitions.UrlDefinitions;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

import java.util.Map;

import static io.restassured.RestAssured.given;

public class FareOptionsRequest {
    public static Response extractFareOptionsResponse(Map fareOptionsMap) {
        return given().
                contentType(ContentType.JSON).
                pathParams(fareOptionsMap).
                expect().
                when().
                get(UrlDefinitions.fareOptionsUrl).
                then().
                contentType(ContentType.JSON).
                extract().
                response();
    }
}