package auto.ryanair.requestActions.flight;

import auto.ryanair.requestActions.availability.AvailableFlight;
import auto.ryanair.requestActions.availability.dto.response.AvailabilityResponseDto;
import auto.ryanair.requestActions.availability.dto.response.Flight;
import auto.ryanair.requestActions.flight.dto.request.FlightRequestRequestDto;
import auto.ryanair.requestActions.flight.dto.response.FlightResponseDto;
import auto.ryanair.requestActions.flight.restAssuredRequest.FlightRequest;

public class FlightActions {
    public static FlightResponseDto getResponse(AvailabilityResponseDto availabilityResponseDto) {
        Flight flight = AvailableFlight.getAvailableFlight(availabilityResponseDto);

        String fareKey = AvailableFlight.getFareKey(flight);
        String flightKey = AvailableFlight.getFlightKey(flight);

        return FlightRequest.getResponseDto(new FlightRequestRequestDto().withFlights(fareKey, flightKey));
    }
}