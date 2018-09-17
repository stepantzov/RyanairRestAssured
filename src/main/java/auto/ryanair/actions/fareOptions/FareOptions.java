package auto.ryanair.actions.fareOptions;

import auto.ryanair.actions.availability.Availability;
import auto.ryanair.actions.availability.dto.response.AvailabilityResponseDto;
import auto.ryanair.actions.fareOptions.dto.request.FareOptionsRequestDto;
import auto.ryanair.actions.fareOptions.dto.response.FareOptionsResponseDto;
import auto.ryanair.requests.FareOptionsRequest;

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