package auto.ryanair;

import auto.ryanair.steps.*;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.restassured.response.Response;
import org.junit.Assert;
import org.junit.Test;

public class RyanairBookingApiTest {
    private ObjectMapper oMapper = new ObjectMapper();

    @Test
    public void loginTest() {
        Response loginResponse = Login.getResponseAfterLoginWithExistingCredentials();
        Assert.assertEquals(loginResponse.getStatusCode(), 200);

        Response loggedInUserResponse = Login.getResponseAfterTokenAuthorization(loginResponse);
        Assert.assertEquals(200, loggedInUserResponse.getStatusCode());

        Response outboundDatesResponse = FlightSearch.getResponseAfterFlightSearch();
        FlightSearch.printFlights(outboundDatesResponse);
        Assert.assertEquals(200, outboundDatesResponse.getStatusCode());

        Response flightAvailabilityResponse = FlightAvailability.getResponseForFlightAvailability(outboundDatesResponse);
        FlightAvailability.printFirstAvailableFlightDetails(flightAvailabilityResponse);
        Assert.assertEquals(200, flightAvailabilityResponse.getStatusCode());

        Response fareOptionsResponse = FlightOptions.getResponseForFlightOptions(flightAvailabilityResponse);
        Assert.assertEquals(200, fareOptionsResponse.getStatusCode());

        Response priceResponse = Price.getResponseForFlightPrice(flightAvailabilityResponse, outboundDatesResponse);
        Assert.assertEquals(200, priceResponse.getStatusCode());
    }
}