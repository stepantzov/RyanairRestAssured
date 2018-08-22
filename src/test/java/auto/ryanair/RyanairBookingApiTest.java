package auto.ryanair;

import auto.ryanair.steps.*;
import org.junit.Test;

public class RyanairBookingApiTest {
    @Test
    public void customerFlightTest() {
        Login.getResponse(Login.getResponseDto());
        Search.printFlightDate(Search.getResponseDto());
        Availability.printFlightDetails(Availability.getResponse(Search.getResponseDto()));
        FlightOptions.getResponse(Availability.getResponse(Search.getResponseDto()));
        Price.getResponse(Availability.getResponse(Search.getResponseDto()), Search.getResponseDto());
    }
}