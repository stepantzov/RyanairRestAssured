package auto.ryanair.actions.price;

import auto.ryanair.actions.availability.Availability;
import auto.ryanair.actions.price.dto.request.PriceRequestRequestDto;
import auto.ryanair.actions.availability.dto.response.AvailabilityResponseDto;
import auto.ryanair.actions.price.dto.response.PriceResponseDto;
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