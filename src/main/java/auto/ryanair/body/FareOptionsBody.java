package auto.ryanair.body;

import auto.ryanair.dto.request.FareOptionsRequestDto;
import auto.ryanair.response.AvailabilityResponseParser;
import io.restassured.response.Response;

public class FareOptionsBody {
    public static FareOptionsRequestDto constructRequestBody(Response availabilityResponse) {
        return new FareOptionsRequestDto()
                .withOutboundFareKey(AvailabilityResponseParser.getOutboundFareKey(availabilityResponse))
                .withOutboundFlightKey(AvailabilityResponseParser.getOutboundFlightKey(availabilityResponse));
    }
}