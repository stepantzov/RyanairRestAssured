package auto.ryanair.requestActions.fareOptions;

import auto.ryanair.requestActions.availability.AvailableFlight;
import auto.ryanair.requestActions.availability.dto.response.AvailabilityResponseDto;
import auto.ryanair.requestActions.availability.dto.response.Flight;
import auto.ryanair.requestActions.fareOptions.dto.request.FareOptionsRequestDto;
import auto.ryanair.requestActions.fareOptions.dto.response.FareOptionsResponseDto;
import auto.ryanair.requestActions.fareOptions.restAssuredRequest.FareOptionsRequest;

public class FareOptions {
    public static FareOptionsResponseDto[] getResponse(AvailabilityResponseDto availabilityResponseDto) {
        Flight flight = AvailableFlight.getAvailableFlight(availabilityResponseDto);

        return FareOptionsRequest.getResponseDto(getRequestDto(flight).convertToMap());
    }

    public static FareOptionsRequestDto getRequestDto(Flight flight) {
        return new FareOptionsRequestDto()
                .withOutboundFareKey(AvailableFlight.getFareKey(flight))
                .withOutboundFlightKey(AvailableFlight.getFlightKey(flight));
    }
}