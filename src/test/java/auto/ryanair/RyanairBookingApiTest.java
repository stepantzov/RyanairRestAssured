package auto.ryanair;

import auto.ryanair.requestActions.availability.Availability;
import auto.ryanair.requestActions.availability.dto.response.AvailabilityResponseDto;
import auto.ryanair.requestActions.fareOptions.FareOptions;
import auto.ryanair.requestActions.flight.Flight;
import auto.ryanair.requestActions.loggedUser.LoggedUser;
import auto.ryanair.requestActions.login.Login;
import auto.ryanair.requestActions.login.dto.response.LoginResponseDto;
import auto.ryanair.requestActions.price.Price;
import auto.ryanair.requestActions.searchCalendar.SearchCalendar;
import auto.ryanair.requestActions.searchCalendar.dto.response.CalendarResponseDto;
import org.junit.Test;

public class RyanairBookingApiTest {
    @Test
    public void customerFlightTest() {
        LoginResponseDto loginResponseDto = Login.getResponse();
        LoggedUser.getResponse(loginResponseDto);

        CalendarResponseDto calendarResponseDto = SearchCalendar.getResponseDto();
        SearchCalendar.printFlightDate(calendarResponseDto);

        AvailabilityResponseDto availabilityResponseDto = Availability.getResponse(calendarResponseDto);
        Availability.printFlightDetails(availabilityResponseDto);

        FareOptions.getResponse(availabilityResponseDto);

        Price.getResponse(availabilityResponseDto);

        Flight.getResponse(Availability.getFlightKey(availabilityResponseDto),
                Availability.getFlightFareKey(availabilityResponseDto));
    }
}