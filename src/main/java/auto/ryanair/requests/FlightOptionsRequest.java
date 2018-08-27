package auto.ryanair.requests;

import auto.ryanair.dto.response.flightOptionsResponseDto.FlightOptionsResponseDto;
import auto.ryanair.pathParams.PathParameters;
import auto.ryanair.utils.PropertiesReader;

import java.util.Map;

import static io.restassured.RestAssured.given;

public class FlightOptionsRequest {
    public static FlightOptionsResponseDto[] getResponseDto(Map fareOptionsMap) {
        return given()
                .pathParams(fareOptionsMap)
                .when()
                .get(PropertiesReader
                        .getPropertyByName("fareOptions.url.base")
                        .concat(PathParameters.flightOptionsParams))
                .then()
                .statusCode(200)
                .extract()
                .response()
                .as(FlightOptionsResponseDto[].class);
    }
}