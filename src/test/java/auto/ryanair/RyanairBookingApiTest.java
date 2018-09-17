package auto.ryanair;

import auto.ryanair.actions.availability.Availability;
import auto.ryanair.actions.availability.dto.response.AvailabilityResponseDto;
import auto.ryanair.actions.fareOptions.FareOptions;
import auto.ryanair.actions.flight.Flight;
import auto.ryanair.actions.loggedUser.LoggedUser;
import auto.ryanair.actions.login.Login;
import auto.ryanair.actions.login.dto.response.LoginResponseDto;
import auto.ryanair.actions.price.Price;
import auto.ryanair.actions.search.SearchOnCalendar;
import auto.ryanair.actions.search.dto.response.CalendarResponseDto;
import org.junit.Test;

public class RyanairBookingApiTest {
    @Test
    public void customerFlightTest() {
        LoginResponseDto loginResponseDto = Login.getResponse();
        LoggedUser.getResponse(loginResponseDto);

        CalendarResponseDto calendarResponseDto = SearchOnCalendar.getResponseDto();
        SearchOnCalendar.printFlightDate(calendarResponseDto);

        AvailabilityResponseDto availabilityResponseDto = Availability.getResponse(calendarResponseDto);
        Availability.printFlightDetails(availabilityResponseDto);

        FareOptions.getResponse(availabilityResponseDto);

        Price.getResponse(availabilityResponseDto);

        Flight.getResponse(Availability.getFlightKey(availabilityResponseDto),
                Availability.getFlightFareKey(availabilityResponseDto));
    }
}