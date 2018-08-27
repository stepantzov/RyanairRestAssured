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
                .expect()
                .statusCode(200)
                .when()
                .post(PropertiesReader.getPropertyByName("flight.url.base"))
                .then()
                .contentType(ContentType.JSON)
                .extract()
                .as(FlightResponseDto.class);
    }
}