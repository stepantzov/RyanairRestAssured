package auto.ryanair;

import auto.ryanair.body.AvailabilityRequestBody;
import auto.ryanair.body.FareOptionsBody;
import auto.ryanair.body.OutboundDatesRequestBody;
import auto.ryanair.body.PriceRequestBody;
import auto.ryanair.dto.AvailabilityRequestDto;
import auto.ryanair.dto.FareOptionsRequestDto;
import auto.ryanair.dto.OutboundDatesRequestDto;
import auto.ryanair.requests.*;
import auto.ryanair.response.AvailabilityResponseParser;
import auto.ryanair.response.LoginResponseParser;
import auto.ryanair.response.OutboundDatesResponseParser;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.restassured.response.Response;
import org.junit.Assert;
import org.junit.Test;

import java.util.List;
import java.util.Map;

public class RyanairBookingApiTest {
    private ObjectMapper oMapper = new ObjectMapper();

    @Test
    public void loginTest() {
        Response loginResponse = LoginRequest.extractLoginResponse();
        LoginResponseParser.printCustomerCredentialsFromResponse(loginResponse);
        Assert.assertEquals(loginResponse.getStatusCode(), 200);

        Response loggedInUserResponse = LoggedInUserRequest.
                extractLoggedInUserResponse(loginResponse.jsonPath().getString("token"));
        Assert.assertEquals(200, loggedInUserResponse.getStatusCode());

        OutboundDatesRequestDto outboundDatesBody = OutboundDatesRequestBody.constructRequestBody();
        Response outboundDatesResponse = OutboundDatesRequest.getOutboundDatesResponse(outboundDatesBody);
        Assert.assertEquals(200, outboundDatesResponse.getStatusCode());

        List<String> outboundDatesShortFormat = outboundDatesResponse.jsonPath().get("outboundDates");
        OutboundDatesResponseParser.printFirstAvailableFlightDate(outboundDatesBody.getOrigin(), outboundDatesBody.getDestination(), outboundDatesShortFormat.get(0));

        AvailabilityRequestDto availabilityRequestBody = AvailabilityRequestBody.
                constructRequestBody(outboundDatesShortFormat.get(0), outboundDatesBody.getDestination(), outboundDatesBody.getOrigin());
        Map<String, Object> pricesRequestMap = oMapper.convertValue(availabilityRequestBody, Map.class);

        Response availabilityResponse = AvailabilityRequest.getAvailabilityRequestResponse(pricesRequestMap);
        Assert.assertEquals(200, availabilityResponse.getStatusCode());

        System.out.println("Price for first available date: " + AvailabilityResponseParser.getPriceForClosestDate(availabilityResponse));
        System.out.println("Flight number: " + AvailabilityResponseParser.getAvailableFlightNumber(availabilityResponse));
        System.out.println("fareKey: " + AvailabilityResponseParser.getOutboundFareKey(availabilityResponse));
        System.out.println("outboundFlightKey: " + AvailabilityResponseParser.getOutboundFlightKey(availabilityResponse));

        FareOptionsRequestDto fareOptionsBody = FareOptionsBody.constructRequestBody(availabilityResponse);
        Map<String, Object> fareOptionsMap = oMapper.convertValue(fareOptionsBody, Map.class);

        Response fareOptionsResponse = FareOptionsRequest.extractFareOptionsResponse(fareOptionsMap);
        Assert.assertEquals(200, fareOptionsResponse.getStatusCode());

        Response priceResponse = PriceRequest.getPriceResponse(PriceRequestBody.constructRequestBody(
                AvailabilityResponseParser.getOutboundDateFullFormat(availabilityResponse),
                AvailabilityResponseParser.getOutboundFlightKey(availabilityResponse),
                AvailabilityResponseParser.getOutboundFareKey(availabilityResponse),
                availabilityRequestBody));
        Assert.assertEquals(200, priceResponse.getStatusCode());
    }
}