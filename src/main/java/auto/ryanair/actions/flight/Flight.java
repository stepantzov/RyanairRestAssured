package auto.ryanair.actions.flight;

import auto.ryanair.actions.flight.dto.request.FlightRequestRequestDto;
import auto.ryanair.actions.flight.dto.response.FlightResponseDto;
import auto.ryanair.requests.FlightRequest;

public class Flight {
    public static FlightResponseDto getResponse(String flightKey, String fareKey) {
        return FlightRequest
                .getResponseDto(new FlightRequestRequestDto().withFlights(fareKey, flightKey));
    }
}