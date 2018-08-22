package auto.ryanair.steps;

import auto.ryanair.dto.request.FlightOptionsRequestDto;
import auto.ryanair.dto.response.avaliabilityResponseDto.AvailabilityResponseDto;
import auto.ryanair.requests.FlightOptionsRequest;
import io.restassured.response.Response;

public class FlightOptions {
    public static Response getResponse(AvailabilityResponseDto availabilityResponseDto) {
        FlightOptionsRequestDto flightOptionsRequestDto = new FlightOptionsRequestDto();
        flightOptionsRequestDto
                .withOutboundFareKey(Availability.getFlightFareKey(availabilityResponseDto))
                .withOutboundFlightKey(Availability.getFlightKey(availabilityResponseDto));

        return FlightOptionsRequest.extractResponse(flightOptionsRequestDto.getParametersMap(flightOptionsRequestDto));
    }
}