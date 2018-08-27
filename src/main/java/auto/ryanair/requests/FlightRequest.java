package auto.ryanair.requests;

import auto.ryanair.dto.response.flightResponseDto.FlightResponseDto;
import auto.ryanair.utils.PropertiesReader;
import io.restassured.http.ContentType;

import static io.restassured.RestAssured.given;

public class FlightRequest {
    public static FlightResponseDto getResponseDto(String flightRequestDto) {
        return given()
                .contentType(ContentType.JSON)
                .body(flightRequestDto)
                .when()
                .post(PropertiesReader.getPropertyByName("flight.url.base"))
                .then()
                .statusCode(200)
                .contentType(ContentType.JSON)
                .extract()
                .as(FlightResponseDto.class);
    }
}