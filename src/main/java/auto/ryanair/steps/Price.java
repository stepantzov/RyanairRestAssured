package auto.ryanair.steps;

import auto.ryanair.body.PriceRequestBody;
import auto.ryanair.dto.response.OutboundDatesResponseDto;
import auto.ryanair.requests.PriceRequest;
import auto.ryanair.response.AvailabilityResponseParser;
import io.restassured.response.Response;

public class Price {
    public static Response getResponseForFlightPrice(Response flightAvailabilityResponse, OutboundDatesResponseDto outboundDatesResponse) {
        return PriceRequest.getPriceResponse(PriceRequestBody.constructRequestBody(
                AvailabilityResponseParser.getOutboundDateFullFormat(flightAvailabilityResponse),
                AvailabilityResponseParser.getOutboundFlightKey(flightAvailabilityResponse),
                AvailabilityResponseParser.getOutboundFareKey(flightAvailabilityResponse),
                FlightAvailability.getAvailabilityRequestBody(outboundDatesResponse)));
    }
}