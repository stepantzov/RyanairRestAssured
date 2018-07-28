package auto.ryanair;

import auto.ryanair.dto.FareOptionsRequestDto;
import auto.ryanair.dto.LoginRequestDto;
import auto.ryanair.dto.OutboundDatesRequestDto;
import auto.ryanair.dto.PricesRequestDto;
import auto.ryanair.urlDefinitions.UrlDefinitions;
import auto.ryanair.usils.RedundantCharacterRemoveUtility;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import org.apache.commons.lang3.StringUtils;
import org.junit.Test;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.List;
import java.util.Map;

import static io.restassured.RestAssured.given;

public class RyanairBookingApiTest {
    String timeStamp = new SimpleDateFormat("yyyy-MM-dd").format(Calendar.getInstance().getTime());
    ObjectMapper oMapper = new ObjectMapper();

    @Test
    public void loginTest() {
        LoginRequestDto loginBody = new LoginRequestDto("zyclonc@gmail.com",
                "123ZZror", "false", "null");
        Map<String, Object> loginDataMap = oMapper.convertValue(loginBody, Map.class);

        JsonPath loginResponse = given().contentType(ContentType.URLENC).
                formParams(loginDataMap).
                when().
                post(UrlDefinitions.loginUrl).
                then().
                contentType(ContentType.JSON).
                statusCode(200).
                extract().response().andReturn().jsonPath();
        System.out.println("customerId: " + loginResponse.getString("customerId"));
        System.out.println("token: " + loginResponse.getString("token"));

        OutboundDatesRequestDto outboundDatesBody = new OutboundDatesRequestDto("KRK",
                "false", "false", "17", "LWO", timeStamp);
        Map<String, Object> loginOutboundDatesMap = oMapper.convertValue(outboundDatesBody, Map.class);

        JsonPath response = given().
                pathParams(loginOutboundDatesMap).
                when().
                get(UrlDefinitions.outboundDatesUrl).
                then().contentType(ContentType.JSON).
                statusCode(200).extract().response().andReturn().jsonPath();
        List<String> outboundDates = response.get("outboundDates");
        System.out.format("First available flight date for flight %s - %s is: %s\n", outboundDatesBody.getOrigin(),
                outboundDatesBody.getDestination(), outboundDates.get(0));

        PricesRequestDto pricesRequestBody = new PricesRequestDto("1", "0", outboundDates.get(0),
                "KRK", "1", "0", "true", "LWO",
                "false", "0", "AGREED", "false", "");
        Map<String, Object> pricesRequestMap = oMapper.convertValue(pricesRequestBody, Map.class);

        JsonPath priceResponse = given().
                pathParams(pricesRequestMap).
                when().
                get(UrlDefinitions.pricesRequestUrl).
                then().contentType(ContentType.JSON).
                statusCode(200).
                extract().response().andReturn().jsonPath();

        String priceForClosestDate = RedundantCharacterRemoveUtility.
                removeSpacesBracketsComas(priceResponse.getString("trips.dates.flights.regularFare.fares.amount"));

        String flightNumber = RedundantCharacterRemoveUtility.
                removeSpacesBracketsComas(priceResponse.getString("trips.dates.flights.segments.flightNumber"));

        String outboundFareKey = RedundantCharacterRemoveUtility.
                removeSpacesBracketsComas(priceResponse.getString("trips.dates.flights.regularFare.fareKey"));

        String outboundFlightKeyRaw = RedundantCharacterRemoveUtility.
                removeBracketsOnly(priceResponse.getString("trips.dates.flights.flightKey"));
        String outboundFlightKey = StringUtils.chop(outboundFlightKeyRaw);

        System.out.println("Price for first available date: " + priceForClosestDate);
        System.out.println("Flight number: " + flightNumber);
        System.out.println("fareKey: " + outboundFareKey);
        System.out.println("outboundFlightKey: " + outboundFlightKey);

        FareOptionsRequestDto fareOptionsBody = new FareOptionsRequestDto("1", "0",
                "0", "0", outboundFareKey, outboundFlightKey);
        Map<String, Object> fareOptionsMap = oMapper.convertValue(fareOptionsBody, Map.class);

        JsonPath fareOptionsResponse = given().contentType(ContentType.JSON).
                pathParams(fareOptionsMap).
                when().
                get(UrlDefinitions.fareOptionsUrl).
                then().contentType(ContentType.JSON).
                statusCode(200).
                extract().response().andReturn().jsonPath();
    }
}