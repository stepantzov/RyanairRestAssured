package auto.ryanair;

import auto.ryanair.requestActions.availability.Availability;
import auto.ryanair.requestActions.availability.dto.response.AvailabilityResponseDto;
import auto.ryanair.requestActions.fareOptions.FareOptions;
import auto.ryanair.requestActions.flight.FlightActions;
import auto.ryanair.requestActions.login.Login;
import auto.ryanair.requestActions.price.Price;
import auto.ryanair.requestActions.searchCalendar.SearchCalendar;
import auto.ryanair.requestActions.searchCalendar.dto.response.CalendarResponseDto;
import auto.ryanair.utils.TimeStamp;
import org.junit.Test;

public class RyanairBookingApiTest {
    String username = "zyclonc@gmail.com";
    String password = "123ZZror";
    String origin = "LGW";
    String destination = "DUB";

    @Test
    public void availableFlightTest() {
        String startDate = TimeStamp.getTimeStampFormatted(0);

        Login.loginWithCredentials(username, password);
        CalendarResponseDto calendarResponseDto = SearchCalendar.getResponseDto(origin, destination, startDate);
        AvailabilityResponseDto availabilityResponseDto = Availability.getDetailedResponse(calendarResponseDto, origin, destination);
        FareOptions.getResponse(availabilityResponseDto);
        Price.getResponse(availabilityResponseDto);
        FlightActions.getResponse(availabilityResponseDto);
    }

    @Test
    public void availableFlightAnyDateTest() {
        String startDate = TimeStamp.getTimeStampFormatted(10);

        Login.loginWithCredentials(username, password);
        CalendarResponseDto calendarResponseDto = SearchCalendar.getResponseDto(origin, destination, startDate);
        AvailabilityResponseDto availabilityResponseDto = Availability.getDetailedResponse(calendarResponseDto, origin, destination);
        FareOptions.getResponse(availabilityResponseDto);
        Price.getResponse(availabilityResponseDto);
        FlightActions.getResponse(availabilityResponseDto);
    }
}