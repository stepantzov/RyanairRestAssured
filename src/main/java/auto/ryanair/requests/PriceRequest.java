package auto.ryanair.requests;

import auto.ryanair.urlDefinitions.UrlDefinitions;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

import static io.restassured.RestAssured.given;

public class PriceRequest {
    public static Response getPriceResponse(Object jsonBody) {
        return given().
                contentType(ContentType.JSON).
                body(jsonBody).
                expect().
                when().
                post(UrlDefinitions.priceUrl).
                then().
                contentType(ContentType.JSON).
                extract().
                response();
    }
}