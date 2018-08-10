package auto.ryanair.steps;

import auto.ryanair.body.OutboundDatesRequestBody;
import auto.ryanair.dto.OutboundDatesRequestDto;
import auto.ryanair.requests.OutboundDatesRequest;
import auto.ryanair.response.OutboundDatesResponseParser;
import io.restassured.response.Response;

import java.util.List;

public class FlightSearch {
    static OutboundDatesRequestDto outboundDatesBody = OutboundDatesRequestBody.constructRequestBody();

    public static Response getResponseAfterFlightSearch() {
        return OutboundDatesRequest.getOutboundDatesResponse(outboundDatesBody);
    }

    public static void printFlights(Response outboundDatesResponse) {
        List<String> outboundDatesShortFormat = outboundDatesResponse.jsonPath().get("outboundDates");
        OutboundDatesResponseParser.printFirstAvailableFlightDate(
                outboundDatesBody.getOrigin(), outboundDatesBody.getDestination(), outboundDatesShortFormat.get(0));
    }
}