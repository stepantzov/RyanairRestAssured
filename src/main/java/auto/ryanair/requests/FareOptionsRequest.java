package auto.ryanair.requests;

import auto.ryanair.pathParams.PathParameters;
import auto.ryanair.utils.PropertiesReader;
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
                get(PropertiesReader.
                        getPropertyByName("fareOptions.url.base").
                        concat(PathParameters.fareOptionsParams)).
                then().
                contentType(ContentType.JSON).
                extract().
                response();
    }
}