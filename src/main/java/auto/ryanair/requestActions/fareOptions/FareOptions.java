package auto.ryanair.requestActions.fareOptions;

import auto.ryanair.requestActions.availability.Availability;
import auto.ryanair.requestActions.availability.dto.response.AvailabilityResponseDto;
import auto.ryanair.requestActions.fareOptions.dto.request.FareOptionsRequestDto;
import auto.ryanair.requestActions.fareOptions.dto.response.FareOptionsResponseDto;
import auto.ryanair.requestActions.fareOptions.restAssuredRequest.FareOptionsRequest;

public class FareOptions {
    public static FareOptionsResponseDto[] getResponse(AvailabilityResponseDto availabilityResponseDto) {
        return FareOptionsRequest.getResponseDto(getRequestDto(availabilityResponseDto).convertToMap());
    }

    public static FareOptionsRequestDto getRequestDto(AvailabilityResponseDto availabilityResponseDto) {
        return new FareOptionsRequestDto()
                .withOutboundFareKey(Availability.getFlightFareKey(availabilityResponseDto))
                .withOutboundFlightKey(Availability.getFlightKey(availabilityResponseDto));
    }
}