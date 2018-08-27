package auto.ryanair;

import auto.ryanair.dto.response.LoginResponseDto;
import auto.ryanair.dto.response.SearchResponseDto;
import auto.ryanair.dto.response.avaliabilityResponseDto.AvailabilityResponseDto;
import auto.ryanair.steps.*;
import org.junit.Test;

public class RyanairBookingApiTest {
    @Test
    public void customerFlightTest() {
        LoginResponseDto loginResponseDto = Login.getResponse();
        LoggedUser.getResponse(loginResponseDto);

        SearchResponseDto searchResponseDto = Search.getResponseDto();
        Search.printFlightDate(searchResponseDto);

        AvailabilityResponseDto availabilityResponseDto = Availability.getResponse(searchResponseDto);
        Availability.printFlightDetails(availabilityResponseDto);

        FlightOptions.getResponse(availabilityResponseDto);

        Price.getResponse(availabilityResponseDto, searchResponseDto);

        Flight.getResponse(Availability.getFlightKey(availabilityResponseDto),
                Availability.getFlightFareKey(availabilityResponseDto));
    }
}