package auto.ryanair.body;

import auto.ryanair.dto.FareOptionsRequestDto;
import auto.ryanair.response.AvailabilityResponseParser;
import io.restassured.response.Response;

public class FareOptionsBody {
    public static FareOptionsRequestDto constructRequestBody(Response availabilityResponse){
        return new FareOptionsRequestDto(
                "1",
                "0",
                "0",
                "0",
                AvailabilityResponseParser.getOutboundFareKey(availabilityResponse),
                AvailabilityResponseParser.getOutboundFlightKey(availabilityResponse));
    }
}