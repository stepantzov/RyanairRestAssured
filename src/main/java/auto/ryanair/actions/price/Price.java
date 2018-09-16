package auto.ryanair.actions.price;

import auto.ryanair.actions.availability.Availability;
import auto.ryanair.dto.request.PriceRequestDto.PriceRequestRequestDto;
import auto.ryanair.dto.response.avaliabilityResponseDto.AvailabilityResponseDto;
import auto.ryanair.dto.response.priceResponseDto.PriceResponseDto;
import auto.ryanair.requests.PriceRequest;

public class Price {
    public static PriceResponseDto getResponse(AvailabilityResponseDto availabilityResponseDto) {
        PriceRequestRequestDto priceRequestDto = new PriceRequestRequestDto()
                .withFlights(Availability.getFlightFareKey(availabilityResponseDto),
                        Availability.getFlightKey(availabilityResponseDto))
                .withOutboundDate(Availability.getDateOut(availabilityResponseDto) + "Z");

        return PriceRequest.getResponseDto(priceRequestDto);
    }
}