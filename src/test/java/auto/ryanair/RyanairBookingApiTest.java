package auto.ryanair;

import auto.ryanair.dto.response.AvaliabilityResponseDto.AvailabilityResponseDto;
import auto.ryanair.steps.FlightAvailability;
import auto.ryanair.steps.Login;
import auto.ryanair.steps.Search;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.junit.Assert;
import org.junit.Test;

public class RyanairBookingApiTest {
    @Test
    @JsonIgnoreProperties(ignoreUnknown = true)
    public void customerFlightTest() {
        Assert.assertEquals(200, Login.getAuthorizationResponseStatusCode(Login.getLoginResponse()));
        Search.printFlightDate(Search.getResponseAfterFlightSearch());

        AvailabilityResponseDto flightAvailabilityResponse = FlightAvailability
                .getResponseForFlightAvailability(Search.getResponseAfterFlightSearch());

        FlightAvailability.printFirstAvailableFlightDetails(flightAvailabilityResponse);
        /*Assert.assertEquals(200, flightAvailabilityResponse.getStatusCode());

        Response fareOptionsResponse = FlightOptions.getResponseForFlightOptions(flightAvailabilityResponse);
        Assert.assertEquals(200, fareOptionsResponse.getStatusCode());

        Response priceResponse = Price.getResponseForFlightPrice(flightAvailabilityResponse, outboundDatesResponse);
        Assert.assertEquals(200, priceResponse.getStatusCode());*/
    }
}