package auto.ryanair.steps;

import auto.ryanair.body.PriceRequestBody;
import auto.ryanair.dto.response.SearchResponseDto;
import auto.ryanair.dto.response.avaliabilityResponseDto.AvailabilityResponseDto;
import auto.ryanair.dto.response.priceResponseDto.PriceResponseDto;
import auto.ryanair.requests.PriceRequest;

public class Price {
    public static PriceResponseDto getResponse(AvailabilityResponseDto availabilityResponseDto, SearchResponseDto outboundDatesResponse) {
        Availability availability = new Availability();

        return PriceRequest.getResponseDto(PriceRequestBody
                .constructRequestJson(
                        availability.getDateOut(availabilityResponseDto),
                        availability.getFlightKey(availabilityResponseDto),
                        availability.getFlightFareKey(availabilityResponseDto),
                        availability.getRequestDto(outboundDatesResponse)));
    }
}