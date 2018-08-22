package auto.ryanair.steps;

import auto.ryanair.dto.request.AvailabilityRequestDto;
import auto.ryanair.dto.response.OutboundDatesResponseDto;
import auto.ryanair.dto.response.avaliabilityResponseDto.AvailabilityResponseDto;
import auto.ryanair.requests.AvailabilityRequest;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.util.Map;

public class Availability {
    private static ObjectMapper oMapper = new ObjectMapper();

    public static AvailabilityRequestDto getRequestDto(OutboundDatesResponseDto outboundDatesResponse) {
        AvailabilityRequestDto availabilityRequestDto = new AvailabilityRequestDto();
        availabilityRequestDto
                .withDestination("DUB")
                .withOrigin("LGW")
                .withDateOut(outboundDatesResponse.getOutboundDates().get(0));

        return availabilityRequestDto;
    }

    public static AvailabilityResponseDto getResponse(OutboundDatesResponseDto outboundDatesResponseDto) {
        //TODO: change outboundDatesResponseDto to return Map;
        return AvailabilityRequest.getResponseDto(oMapper.convertValue(getRequestDto(outboundDatesResponseDto), Map.class));
    }

    public static void printFlightDetails(AvailabilityResponseDto availabilityResponseDto) {
        System.out.println("Price available date: " + getFlightPrice(availabilityResponseDto));
        System.out.println("FareKey: " + getFlightFareKey(availabilityResponseDto));
        System.out.println("Flight number: " + getFlightNumber(availabilityResponseDto));
        System.out.println("outboundFlightKey: " + getFlightKey(availabilityResponseDto));
    }

    public static String getFlightPrice(AvailabilityResponseDto availabilityResponseDto) {
        return availabilityResponseDto
                .getTrips().get(0)
                .getDates().get(0)
                .getFlights().get(0)
                .getRegularFare()
                .getFares().get(0)
                .getAmount().toString();
    }

    public static String getFlightNumber(AvailabilityResponseDto availabilityResponseDto) {
        return availabilityResponseDto
                .getTrips().get(0)
                .getDates().get(0)
                .getFlights().get(0)
                .getFlightNumber();
    }

    public static String getFlightFareKey(AvailabilityResponseDto availabilityResponseDto) {
        return availabilityResponseDto
                .getTrips().get(0)
                .getDates().get(0)
                .getFlights().get(0)
                .getRegularFare()
                .getFareKey();
    }

    public static String getFlightKey(AvailabilityResponseDto availabilityResponseDto) {
        return availabilityResponseDto
                .getTrips().get(0)
                .getDates().get(0)
                .getFlights().get(0)
                .getFlightKey();
    }

    public static String getDateOut(AvailabilityResponseDto availabilityResponseDto) {
        return availabilityResponseDto.getTrips().get(0).getDates().get(0).getDateOut();
    }
}