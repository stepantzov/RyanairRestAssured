package auto.ryanair.requestActions.flight;

import auto.ryanair.requestActions.flight.dto.request.FlightRequestRequestDto;
import auto.ryanair.requestActions.flight.dto.response.FlightResponseDto;
import auto.ryanair.requestActions.flight.restAssuredRequest.FlightRequest;

public class Flight {
    public static FlightResponseDto getResponse(String flightKey, String fareKey) {
        return FlightRequest.getResponseDto(new FlightRequestRequestDto().withFlights(fareKey, flightKey));
    }
}