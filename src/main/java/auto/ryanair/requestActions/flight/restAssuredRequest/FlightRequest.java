package auto.ryanair.requestActions.flight.restAssuredRequest;

import auto.ryanair.requestActions.flight.dto.request.FlightRequestRequestDto;
import auto.ryanair.requestActions.flight.dto.response.FlightResponseDto;
import auto.ryanair.setup.requests.RequestSpecification;
import auto.ryanair.utils.Properties;

import static io.restassured.RestAssured.basePath;

public class FlightRequest {
    private static final String flightPath = "/v4/en-ie/Flight";

    public static FlightResponseDto getResponseDto(FlightRequestRequestDto flightRequestDto) {
        basePath = Properties.get("base.url").concat(flightPath);

        return RequestSpecification.postWithJsonBody(flightRequestDto, basePath).as(FlightResponseDto.class);
    }
}