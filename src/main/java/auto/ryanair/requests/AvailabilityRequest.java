package auto.ryanair.requests;

import auto.ryanair.pathParams.PathParameters;
import auto.ryanair.utils.PropertiesReader;
import io.restassured.response.Response;

import java.util.Map;

import static io.restassured.RestAssured.given;

public class AvailabilityRequest {
    public static Response getAvailabilityRequestResponse(Map pathParams) {
        return given().
                pathParams(pathParams).
                when().
                get(PropertiesReader.
                        getPropertyByName("availabilityRequest.url.base").
                        concat(PathParameters.availabilityRequestParams)).
                then().
                extract().
                response();
    }
}