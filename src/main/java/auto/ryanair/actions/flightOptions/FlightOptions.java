package auto.ryanair.actions.flightOptions;

import auto.ryanair.actions.availability.Availability;
import auto.ryanair.dto.request.FlightOptionsRequestDto;
import auto.ryanair.dto.response.avaliabilityResponseDto.AvailabilityResponseDto;
import auto.ryanair.dto.response.flightOptionsResponseDto.FareOptionsResponseDto;
import auto.ryanair.requests.FareOptionsRequest;

public class FlightOptions {
    public static FareOptionsResponseDto[] getResponse(AvailabilityResponseDto availabilityResponseDto) {
        return FareOptionsRequest.getResponseDto(getRequestDto(availabilityResponseDto).convertToMap());
    }

    public static FlightOptionsRequestDto getRequestDto(AvailabilityResponseDto availabilityResponseDto) {
        return new FlightOptionsRequestDto()
                .withOutboundFareKey(Availability.getFlightFareKey(availabilityResponseDto))
                .withOutboundFlightKey(Availability.getFlightKey(availabilityResponseDto));
    }
}