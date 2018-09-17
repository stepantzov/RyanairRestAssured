package auto.ryanair.requestActions.price;

import auto.ryanair.requestActions.availability.Availability;
import auto.ryanair.requestActions.price.dto.request.PriceRequestRequestDto;
import auto.ryanair.requestActions.availability.dto.response.AvailabilityResponseDto;
import auto.ryanair.requestActions.price.dto.response.PriceResponseDto;
import auto.ryanair.requestActions.price.restAssuredRequest.PriceRequest;

public class Price {
    public static PriceResponseDto getResponse(AvailabilityResponseDto availabilityResponseDto) {
        PriceRequestRequestDto priceRequestDto = new PriceRequestRequestDto()
                .withFlights(Availability.getFlightFareKey(availabilityResponseDto),
                        Availability.getFlightKey(availabilityResponseDto))
                .withOutboundDate(Availability.getDateOut(availabilityResponseDto) + "Z");

        return PriceRequest.getResponseDto(priceRequestDto);
    }
}