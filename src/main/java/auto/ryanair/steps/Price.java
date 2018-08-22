package auto.ryanair.steps;

import auto.ryanair.body.PriceRequestBody;
import auto.ryanair.dto.response.OutboundDatesResponseDto;
import auto.ryanair.dto.response.avaliabilityResponseDto.AvailabilityResponseDto;
import auto.ryanair.dto.response.priceResponseDto.PriceResponseDto;
import auto.ryanair.requests.PriceRequest;

public class Price {
    public static PriceResponseDto getResponse(AvailabilityResponseDto availabilityResponseDto, OutboundDatesResponseDto outboundDatesResponse) {
        Availability availability = new Availability();

        return PriceRequest.getResponse(PriceRequestBody.constructRequestJson(
                availability.getDateOut(availabilityResponseDto),
                availability.getFlightKey(availabilityResponseDto),
                availability.getFlightFareKey(availabilityResponseDto),
                Availability.getRequestDto(outboundDatesResponse)));
    }
}