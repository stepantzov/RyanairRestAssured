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
import io.restassured.response.Response;
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

        Response loginResponse = given().
                contentType(ContentType.URLENC).
                formParams(loginDataMap).
                when().
                post(UrlDefinitions.loginUrl).
                then().
                contentType(ContentType.JSON).
                statusCode(200).
                extract().response();

        Map<String, String> loginResponseCookies = loginResponse.getCookies();
        JsonPath loginResponseJsonPath = loginResponse.jsonPath();
        System.out.println("customerId: " + loginResponseJsonPath.getString("customerId"));
        System.out.println("token: " + loginResponseJsonPath.getString("token"));

        Response loggedInResponse = given().
                contentType(ContentType.JSON).
                header("X-AUTH-TOKEN", loginResponseJsonPath.getString("token")).
                cookies(loginResponseCookies).
                when().
                get(UrlDefinitions.loggedInUrl).
                then().
                contentType(ContentType.JSON).
                statusCode(200).
                extract().
                response();

        OutboundDatesRequestDto outboundDatesBody = new OutboundDatesRequestDto("KRK",
                "false", "false", "17", "LWO", timeStamp);
        Map<String, Object> loginOutboundDatesMap = oMapper.convertValue(outboundDatesBody, Map.class);

        Response outboundDatesResponse = given().
                pathParams(loginOutboundDatesMap).
                cookies(loginResponseCookies).
                when().
                get(UrlDefinitions.outboundDatesUrl).
                then().contentType(ContentType.JSON).
                statusCode(200).extract().response();

        JsonPath outboundDatesJsonPath = outboundDatesResponse.jsonPath();
        List<String> outboundDates = outboundDatesJsonPath.get("outboundDates");
        System.out.format("First available flight date for flight %s - %s is: %s\n", outboundDatesBody.getOrigin(),
                outboundDatesBody.getDestination(), outboundDates.get(0));

        PricesRequestDto pricesRequestBody = new PricesRequestDto("1", "0", outboundDates.get(0),
                "KRK", "1", "0", "true", "LWO",
                "false", "0", "AGREED", "false", "");
        Map<String, Object> pricesRequestMap = oMapper.convertValue(pricesRequestBody, Map.class);

        Response availabilityResponse = given().
                pathParams(pricesRequestMap).
                when().
                get(UrlDefinitions.availabilityRequestUrl).
                then().contentType(ContentType.JSON).
                statusCode(200).
                extract().response();

        JsonPath availabilityResponseJsonPath = availabilityResponse.jsonPath();
        Map<String, String> availabilityResponseCookie = availabilityResponse.getCookies();

        String priceForClosestDate = RedundantCharacterRemoveUtility.
                removeSpacesBracketsComas(availabilityResponseJsonPath.getString("trips.dates.flights.regularFare.fares.amount"));
        String flightNumber = RedundantCharacterRemoveUtility.
                removeSpacesBracketsComas(availabilityResponseJsonPath.getString("trips.dates.flights.segments.flightNumber"));
        String outboundFareKey = RedundantCharacterRemoveUtility.
                removeSpacesBracketsComas(availabilityResponseJsonPath.getString("trips.dates.flights.regularFare.fareKey"));
        String outboundFlightKeyRaw = RedundantCharacterRemoveUtility.
                removeBracketsOnly(availabilityResponseJsonPath.getString("trips.dates.flights.flightKey"));
        String outboundFlightKey = StringUtils.chop(outboundFlightKeyRaw);

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
                cookies(availabilityResponseCookie).
                expect().
                statusCode(200).
                when().
                get(UrlDefinitions.fareOptionsUrl).
                then().
                contentType(ContentType.JSON).
                extract().
                response();
        Map<String, String> fareOptionsCookies = fareOptionsResponse.getCookies();

        Response priceResponse = given().
                contentType(ContentType.JSON).
                cookies(fareOptionsCookies).
                expect().
                statusCode(200).
                when().
                post(UrlDefinitions.priceUrl);
    }
}