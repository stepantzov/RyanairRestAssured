package auto.ryanair.requestActions.price;

import auto.ryanair.requestActions.availability.AvailableFlight;
import auto.ryanair.requestActions.availability.dto.response.AvailabilityResponseDto;
import auto.ryanair.requestActions.availability.dto.response.Date;
import auto.ryanair.requestActions.availability.dto.response.Flight;
import auto.ryanair.requestActions.price.dto.request.PriceRequestRequestDto;
import auto.ryanair.requestActions.price.dto.response.PriceResponseDto;
import auto.ryanair.requestActions.price.restAssuredRequest.PriceRequest;

public class Price {
    public static PriceResponseDto getResponse(AvailabilityResponseDto availabilityResponseDto) {
        Flight flight = AvailableFlight.getAvailableFlight(availabilityResponseDto);
        Date date = AvailableFlight.getFlightDate(availabilityResponseDto);

        PriceRequestRequestDto priceRequestDto = new PriceRequestRequestDto()
                .withFlights(AvailableFlight.getFareKey(flight), AvailableFlight.getFlightKey(flight))
                .withOutboundDate(date.getDateOut() + "Z");

        return PriceRequest.getResponseDto(priceRequestDto);
    }
}