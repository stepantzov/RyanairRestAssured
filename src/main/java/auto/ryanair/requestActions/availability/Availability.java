package auto.ryanair.requestActions.availability;

import auto.ryanair.requestActions.availability.dto.request.AvailabilityRequestDto;
import auto.ryanair.requestActions.availability.dto.response.AvailabilityResponseDto;
import auto.ryanair.requestActions.availability.dto.response.Date;
import auto.ryanair.requestActions.availability.dto.response.Flight;
import auto.ryanair.requestActions.availability.restAssuredRequest.AvailabilityRequest;
import auto.ryanair.requestActions.searchCalendar.dto.response.CalendarResponseDto;

import java.util.List;

public class Availability {
    static AvailabilityRequestDto getRequestDto(CalendarResponseDto calendarResponseDto, String origin, String destination) {
        return new AvailabilityRequestDto()
                .withOrigin(origin)
                .withDestination(destination)
                .withDateOut(calendarResponseDto.getOutboundDates().get(0));
    }

    public static AvailabilityResponseDto getDetailedResponse(CalendarResponseDto calendarResponseDto, String origin, String destination) {
        AvailabilityResponseDto availabilityResponseDto = AvailabilityRequest
                .getResponseDto(getRequestDto(calendarResponseDto, origin, destination).convertToMap());
        printFlightDetails(availabilityResponseDto);

        return availabilityResponseDto;
    }

    public static void printFlightDetails(AvailabilityResponseDto availabilityResponseDto) {
        Flight flight = AvailableFlight.getAvailableFlight(availabilityResponseDto);
        Date date = AvailableFlight.getFlightDate(availabilityResponseDto);

        System.out.format("For date %.10s next flight available: %s%n", date.getDateOut(), flight.getFlightNumber());

        System.out.format("Price for flight %s is: %s%s\n", AvailableFlight.getNumber(flight),
                AvailableFlight.getPrice(flight), getCurrency(availabilityResponseDto));
        System.out.println("FareKey: " + AvailableFlight.getFareKey(flight));
        System.out.println("outboundFlightKey: " + AvailableFlight.getFlightKey(flight));
    }

    public static String getCurrency(AvailabilityResponseDto availabilityResponseDto) {
        return availabilityResponseDto.getCurrency();
    }

    public static List<Date> getDates(AvailabilityResponseDto availabilityResponseDto) {
        return availabilityResponseDto
                .getTrips()
                .get(0)
                .getDates();
    }
}