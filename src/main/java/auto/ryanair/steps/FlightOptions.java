package auto.ryanair.steps;

import auto.ryanair.dto.request.FlightOptionsRequestDto;
import auto.ryanair.dto.response.avaliabilityResponseDto.AvailabilityResponseDto;
import auto.ryanair.dto.response.flightOptionsResponseDto.FlightOptionsResponseDto;
import auto.ryanair.requests.FlightOptionsRequest;

public class FlightOptions {
    public static FlightOptionsResponseDto[] getResponse(AvailabilityResponseDto availabilityResponseDto) {
        FlightOptionsRequestDto flightOptionsRequestDto = new FlightOptionsRequestDto();

        return FlightOptionsRequest.getResponseDto(
                flightOptionsRequestDto.getParametersMap(getRequestDto(availabilityResponseDto)));
    }

    public static FlightOptionsRequestDto getRequestDto(AvailabilityResponseDto availabilityResponseDto) {
        return new FlightOptionsRequestDto()
                .withOutboundFareKey(Availability.getFlightFareKey(availabilityResponseDto))
                .withOutboundFlightKey(Availability.getFlightKey(availabilityResponseDto));
    }
}