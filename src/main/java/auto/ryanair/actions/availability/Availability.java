package auto.ryanair.actions.availability;

import auto.ryanair.dto.request.AvailabilityRequestDto;
import auto.ryanair.dto.response.CalendarResponseDto;
import auto.ryanair.dto.response.avaliabilityResponseDto.AvailabilityResponseDto;
import auto.ryanair.requests.AvailabilityRequest;

public class Availability {
    static AvailabilityRequestDto getRequestDto(CalendarResponseDto calendarResponseDto) {
        return new AvailabilityRequestDto()
                .withDestination("DUB")
                .withOrigin("LGW")
                .withDateOut(calendarResponseDto.getOutboundDates().get(0));
    }

    public static AvailabilityResponseDto getResponse(CalendarResponseDto calendarResponseDto) {
        return AvailabilityRequest.getResponseDto(getRequestDto(calendarResponseDto).convertToMap());
    }

    public static void printFlightDetails(AvailabilityResponseDto availabilityResponseDto) {
        System.out.println("Price available date: " + getFlightPrice(availabilityResponseDto));
        System.out.println("FareKey: " + getFlightFareKey(availabilityResponseDto));
        System.out.println("Flight number: " + getFlightNumber(availabilityResponseDto));
        System.out.println("outboundFlightKey: " + getFlightKey(availabilityResponseDto));
    }

    static String getFlightPrice(AvailabilityResponseDto availabilityResponseDto) {
        return availabilityResponseDto
                .getTrips().get(0)
                .getDates().get(0)
                .getFlights().get(0)
                .getRegularFare()
                .getFares().get(0)
                .getAmount().toString();
    }

    static String getFlightNumber(AvailabilityResponseDto availabilityResponseDto) {
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
        return availabilityResponseDto
                .getTrips().get(0)
                .getDates().get(0)
                .getDateOut();
    }
}