package auto.ryanair.requests;

import auto.ryanair.dto.request.flightRequestDto.FlightRequestRequestDto;
import auto.ryanair.dto.response.flightResponseDto.FlightResponseDto;
import auto.ryanair.utils.Properties;

import static io.restassured.RestAssured.basePath;

public class FlightRequest {
    private static final String flightPath = "/v4/en-ie/Flight";

    public static FlightResponseDto getResponseDto(FlightRequestRequestDto flightRequestDto) {
        basePath = Properties.get("base.url").concat(flightPath);

        return Request.withJsonBody(flightRequestDto, basePath).as(FlightResponseDto.class);
    }
}