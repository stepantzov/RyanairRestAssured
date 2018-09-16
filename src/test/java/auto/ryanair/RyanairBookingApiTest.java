package auto.ryanair;

import auto.ryanair.actions.availability.Availability;
import auto.ryanair.actions.flight.Flight;
import auto.ryanair.actions.flightOptions.FlightOptions;
import auto.ryanair.actions.loggedUser.LoggedUser;
import auto.ryanair.actions.login.Login;
import auto.ryanair.actions.price.Price;
import auto.ryanair.actions.search.Search;
import auto.ryanair.dto.response.LoginResponseDto;
import auto.ryanair.dto.response.CalendarResponseDto;
import auto.ryanair.dto.response.avaliabilityResponseDto.AvailabilityResponseDto;
import org.junit.Test;

public class RyanairBookingApiTest {
    @Test
    public void customerFlightTest() {
        LoginResponseDto loginResponseDto = Login.getResponse();
        LoggedUser.getResponse(loginResponseDto);

        CalendarResponseDto calendarResponseDto = Search.getResponseDto();
        Search.printFlightDate(calendarResponseDto);

        AvailabilityResponseDto availabilityResponseDto = Availability.getResponse(calendarResponseDto);
        Availability.printFlightDetails(availabilityResponseDto);

        FlightOptions.getResponse(availabilityResponseDto);

        Price.getResponse(availabilityResponseDto);

        Flight.getResponse(Availability.getFlightKey(availabilityResponseDto),
                Availability.getFlightFareKey(availabilityResponseDto));
    }
}