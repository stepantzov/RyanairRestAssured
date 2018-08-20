package auto.ryanair.steps;

import auto.ryanair.body.AvailabilityRequestBody;
import auto.ryanair.body.OutboundDatesRequestBody;
import auto.ryanair.dto.request.AvailabilityRequestDto;
import auto.ryanair.dto.request.OutboundDatesRequestDto;
import auto.ryanair.dto.response.AvaliabilityResponseDto.AvailabilityResponseDto;
import auto.ryanair.dto.response.OutboundDatesResponseDto;
import auto.ryanair.requests.AvailabilityRequest;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.util.Map;

public class FlightAvailability {
    static OutboundDatesRequestDto outboundDatesBody = OutboundDatesRequestBody.constructRequestBody();
    static ObjectMapper oMapper = new ObjectMapper();

    public static AvailabilityRequestDto getAvailabilityRequestBody(OutboundDatesResponseDto outboundDatesResponse) {
        AvailabilityRequestDto availabilityRequestBody = AvailabilityRequestBody
                .constructRequestBody(
                        outboundDatesResponse.getOutboundDates().get(0),
                        outboundDatesBody.getDestination(),
                        outboundDatesBody.getOrigin());

        return availabilityRequestBody;
    }

    public static AvailabilityResponseDto getResponseForFlightAvailability(OutboundDatesResponseDto outboundDatesResponseDto) {

        return AvailabilityRequest.getResponse(oMapper
                .convertValue(getAvailabilityRequestBody(outboundDatesResponseDto), Map.class));
    }

    public static void printFirstAvailableFlightDetails(AvailabilityResponseDto availabilityResponseDto) {
        System.out.println("Price for first available date: " + (availabilityResponseDto
                .getTrips().get(0)
                .getDates().get(0)
                .getFlights().get(0)
                .getRegularFare()
                .getFares()
                .get(0)
                .getAmount()));
       /* System.out.println("fareKey: " + AvailabilityResponseParser.
                getOutboundFareKey(availabilityResponseDto));
        System.out.println("Flight number: " + AvailabilityResponseParser.
                getAvailableFlightNumber(availabilityResponseDto));
        System.out.println("outboundFlightKey: " + AvailabilityResponseParser.
                getOutboundFlightKey(availabilityResponseDto));*/
    }
}