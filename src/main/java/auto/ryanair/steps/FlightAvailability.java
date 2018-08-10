package auto.ryanair.steps;

import auto.ryanair.body.AvailabilityRequestBody;
import auto.ryanair.body.OutboundDatesRequestBody;
import auto.ryanair.dto.AvailabilityRequestDto;
import auto.ryanair.dto.OutboundDatesRequestDto;
import auto.ryanair.requests.AvailabilityRequest;
import auto.ryanair.response.AvailabilityResponseParser;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.restassured.response.Response;

import java.util.List;
import java.util.Map;

public class FlightAvailability {
    static OutboundDatesRequestDto outboundDatesBody = OutboundDatesRequestBody.constructRequestBody();
    static ObjectMapper oMapper = new ObjectMapper();

    public static AvailabilityRequestDto getAvailabilityRequestBody(Response outboundDatesResponse) {
        List<String> outboundDatesShortFormat = outboundDatesResponse.jsonPath().get("outboundDates");
        AvailabilityRequestDto availabilityRequestBody = AvailabilityRequestBody.constructRequestBody(
                outboundDatesShortFormat.get(0), outboundDatesBody.getDestination(), outboundDatesBody.getOrigin());

        return availabilityRequestBody;
    }

    public static Response getResponseForFlightAvailability(Response outboundDatesResponse) {

        return AvailabilityRequest.getAvailabilityRequestResponse(
                oMapper.convertValue(getAvailabilityRequestBody(outboundDatesResponse), Map.class));
    }

    public static void printFirstAvailableFlightDetails(Response flightAvailabilityResponse) {
        System.out.println("Price for first available date: " + AvailabilityResponseParser.
                getPriceForClosestDate(flightAvailabilityResponse));
        System.out.println("fareKey: " + AvailabilityResponseParser.
                getOutboundFareKey(flightAvailabilityResponse));
        System.out.println("Flight number: " + AvailabilityResponseParser.
                getAvailableFlightNumber(flightAvailabilityResponse));
        System.out.println("outboundFlightKey: " + AvailabilityResponseParser.
                getOutboundFlightKey(flightAvailabilityResponse));
    }
}