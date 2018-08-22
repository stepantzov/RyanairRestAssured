package auto.ryanair.requests;

import auto.ryanair.dto.response.avaliabilityResponseDto.AvailabilityResponseDto;
import auto.ryanair.pathParams.PathParameters;
import auto.ryanair.utils.PropertiesReader;

import java.util.Map;

import static io.restassured.RestAssured.given;

public class AvailabilityRequest {
    public static AvailabilityResponseDto getResponseDto(Map pathParams) {
        return given()
                .pathParams(pathParams)
                .when()
                .get(PropertiesReader
                        .getPropertyByName("availabilityRequest.url.base")
                        .concat(PathParameters.availabilityRequestParams))
                .then()
                .statusCode(200)
                .extract()
                .response()
                .as(AvailabilityResponseDto.class);
    }
}