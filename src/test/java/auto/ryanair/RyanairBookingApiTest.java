package auto.ryanair;

import auto.ryanair.dto.AvailabilityRequestDto;
import auto.ryanair.dto.FareOptionsRequestDto;
import auto.ryanair.dto.LoginRequestDto;
import auto.ryanair.dto.OutboundDatesRequestDto;
import auto.ryanair.urlDefinitions.UrlDefinitions;
import auto.ryanair.utils.RedundantCharacterRemoveUtility;
import auto.ryanair.utils.TimeStampUtility;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import org.apache.commons.lang3.StringUtils;
import org.junit.Test;

import java.util.List;
import java.util.Map;

import static io.restassured.RestAssured.given;

public class RyanairBookingApiTest {
    private ObjectMapper oMapper = new ObjectMapper();
    private Gson gson = new Gson();

    @Test
    public void loginTest() {
        LoginRequestDto loginBody = new LoginRequestDto("zyclonc@gmail.com",
                "123ZZror", "false", "null");
        Map<String, Object> loginDataMap = oMapper.convertValue(loginBody, Map.class);

        Response loginResponse = given().
                contentType(ContentType.URLENC).
                formParams(loginDataMap).
                when().
                post(UrlDefinitions.loginUrl).
                then().
                contentType(ContentType.JSON).
                statusCode(200).
                extract().response();

        JsonPath loginResponseJsonPath = loginResponse.jsonPath();
        System.out.println("customerId: " + loginResponseJsonPath.getString("customerId"));
        System.out.println("token: " + loginResponseJsonPath.getString("token"));

        Response loggedInResponse = given().
                contentType(ContentType.JSON).
                header("X-AUTH-TOKEN", loginResponseJsonPath.getString("token")).
                when().
                get(UrlDefinitions.loggedInUrl).
                then().
                contentType(ContentType.JSON).
                statusCode(200).
                extract().
                response();

        Map<String, String> loggedInCookies = loggedInResponse.getCookies();
        OutboundDatesRequestDto outboundDatesBody = new OutboundDatesRequestDto("KRK",
                "false", "false", "17", "LWO", TimeStampUtility.getTimeStampPrettyFormatted());
        Map<String, Object> loginOutboundDatesMap = oMapper.convertValue(outboundDatesBody, Map.class);

        Response outboundDatesResponse = given().
                pathParams(loginOutboundDatesMap).
                when().
                get(UrlDefinitions.outboundDatesUrl).
                then().contentType(ContentType.JSON).
                statusCode(200).extract().response();

        JsonPath outboundDatesJsonPath = outboundDatesResponse.jsonPath();
        List<String> outboundDatesShortFormat = outboundDatesJsonPath.get("outboundDates");
        System.out.format("First available flight date for flight %s - %s is: %s\n", outboundDatesBody.getOrigin(),
                outboundDatesBody.getDestination(), outboundDatesShortFormat.get(0));

        AvailabilityRequestDto availabilityRequestBody = new AvailabilityRequestDto(
                1,
                0,
                outboundDatesShortFormat.get(0),
                "KRK",
                "1",
                0,
                "true",
                "LWO",
                "false",
                0,
                "AGREED",
                "false",
                "");
        Map<String, Object> pricesRequestMap = oMapper.convertValue(availabilityRequestBody, Map.class);

        Response availabilityResponseJson = given().
                pathParams(pricesRequestMap).
                when().
                get(UrlDefinitions.availabilityRequestUrl).
                then().contentType(ContentType.JSON).
                statusCode(200).
                extract().response();

        JsonPath availabilityResponseJsonPath = availabilityResponseJson.jsonPath();

        String priceForClosestDate = RedundantCharacterRemoveUtility.
                removeSpacesBracketsComas(availabilityResponseJsonPath.getString("trips.dates.flights.regularFare.fares.amount"));
        String flightNumber = RedundantCharacterRemoveUtility.
                removeSpacesBracketsComas(availabilityResponseJsonPath.getString("trips.dates.flights.segments.flightNumber"));
        String outboundFareKey = RedundantCharacterRemoveUtility.
                removeSpacesBracketsComas(availabilityResponseJsonPath.getString("trips.dates.flights.regularFare.fareKey"));
        String outboundFlightKeyRaw = RedundantCharacterRemoveUtility.
                removeBracketsOnly(availabilityResponseJsonPath.getString("trips.dates.flights.flightKey"));
        String outboundFlightKey = StringUtils.chop(outboundFlightKeyRaw);

        String outboundDateFullFormat = availabilityResponseJson.jsonPath().getString("trips.dates[0].dateOut[0]");
        System.out.println("Price for first available date: " + priceForClosestDate);
        System.out.println("Flight number: " + flightNumber);
        System.out.println("fareKey: " + outboundFareKey);
        System.out.println("outboundFlightKey: " + outboundFlightKey);

        FareOptionsRequestDto fareOptionsBody = new FareOptionsRequestDto("1", "0",
                "0", "0", outboundFareKey, outboundFlightKey);
        Map<String, Object> fareOptionsMap = oMapper.convertValue(fareOptionsBody, Map.class);

        Response fareOptionsResponse = given().
                contentType(ContentType.JSON).
                pathParams(fareOptionsMap).
                expect().
                statusCode(200).
                when().
                get(UrlDefinitions.fareOptionsUrl).
                then().
                contentType(ContentType.JSON).
                extract().
                response();

        JsonObject priceRequestPayload = new JsonObject();
        priceRequestPayload.addProperty("PromoCode", "");
        priceRequestPayload.addProperty("DISC", 0);
        priceRequestPayload.add("OperatedBy", null);
        priceRequestPayload.addProperty("OutboundDate", outboundDateFullFormat + "Z");
        priceRequestPayload.add("InboundDate", null);

        JsonObject flight = new JsonObject();
        flight.addProperty("flightKey", outboundFlightKey);
        flight.addProperty("fareKey", outboundFareKey);
        flight.addProperty("promoDiscount", false);
        flight.addProperty("fareOption", "");

        JsonArray flights = new JsonArray();
        flights.add(flight);

        priceRequestPayload.add("flights", flights);
        priceRequestPayload.addProperty("INF", availabilityRequestBody.getInf());
        priceRequestPayload.addProperty("CHD", availabilityRequestBody.getChd());
        priceRequestPayload.addProperty("ADT", availabilityRequestBody.getAdt());
        priceRequestPayload.addProperty("TEEN", availabilityRequestBody.getTeen());

        Response priceResponse = given().
                contentType(ContentType.JSON).
                body(gson.toJson(priceRequestPayload)).
                expect().
                statusCode(200).
                when().
                post(UrlDefinitions.priceUrl).
                then().
                contentType(ContentType.JSON).
                extract().
                response();
    }
}