package auto.ryanair.actions.flight;

import auto.ryanair.dto.request.flightRequestDto.FlightRequestRequestDto;
import auto.ryanair.dto.response.flightResponseDto.FlightResponseDto;
import auto.ryanair.requests.FlightRequest;

public class Flight {
    public static FlightResponseDto getResponse(String flightKey, String fareKey) {
        return FlightRequest
                .getResponseDto(new FlightRequestRequestDto().withFlights(fareKey, flightKey));
    }
}