package auto.ryanair.steps;

import auto.ryanair.body.FareOptionsBody;
import auto.ryanair.dto.FareOptionsRequestDto;
import auto.ryanair.requests.FareOptionsRequest;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.restassured.response.Response;

import java.util.Map;

public class FlightOptions {
    static ObjectMapper oMapper = new ObjectMapper();

    public static Response getResponseForFlightOptions(Response flightAvailabilityResponse) {
        FareOptionsRequestDto fareOptionsBody = FareOptionsBody.constructRequestBody(flightAvailabilityResponse);
        Map<String, Object> fareOptionsMap = oMapper.convertValue(fareOptionsBody, Map.class);

        return FareOptionsRequest.extractFareOptionsResponse(fareOptionsMap);
    }
}