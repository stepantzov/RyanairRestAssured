package auto.ryanair;

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
    @Test
    public void loginTest() {
        String timeStamp = new SimpleDateFormat("yyyy-MM-dd").format(Calendar.getInstance().getTime());
        ObjectMapper oMapper = new ObjectMapper();

        LoginRequestDto loginBody = new LoginRequestDto("zyclonc@gmail.com", "123ZZror", "false", "null");
        Map<String, Object> loginDataMap = oMapper.convertValue(loginBody, Map.class);

        JsonPath loginResponse = given().contentType(ContentType.URLENC).
                formParams(loginDataMap).
                when().
                post("https://api.ryanair.com/userprofile/rest/api/v1/login").
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
                get("https://desktopapps.ryanair.com/v4/" +
                        "Calendar?Destination={destination}&IncludeConnectingFlights={includeConnectingFlights}" +
                        "&IsTwoWay={isTwoWay}&Months={months}&Origin={origin}&StartDate={startDate}").
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
                get("https://desktopapps.ryanair.com/v4/en-ie/" +
                        "availability?" +
                        "ADT={adt}" +
                        "&CHD={chd}" +
                        "&DateOut={dateOut}" +
                        "&Destination={destination}" +
                        "&FlexDaysOut={flexDaysOut}" +
                        "&INF={inf}" +
                        "&IncludeConnectingFlights={includeConnectingFlights}" +
                        "&Origin={origin}" +
                        "&RoundTrip={roundTrip}" +
                        "&TEEN={teen}" +
                        "&ToUs={toUs}" +
                        "&exists={exists}" +
                        "&promoCode={promoCode}").
                then().contentType(ContentType.JSON).
                statusCode(200).
                extract().response().andReturn().jsonPath();

        String priceForClosestDate = priceResponse.getString("trips.dates.flights.regularFare.fares.amount").
                replace("[", "").replace("]", "").replace(",", "")
                .replaceAll("\\s+", "");

        String flightNumber = priceResponse.getString("trips.dates.flights.segments.flightNumber").
                replace("[", "").replace("]", "").replace(",", "")
                .replaceAll("\\s+", "");

        String outboundFareKeyRaw = priceResponse.getString("trips.dates.flights.regularFare.fareKey").
                replace("[", "").replace("]", "");

        String outboundFlightKeyRaw = priceResponse.getString("trips.dates.flights.flightKey").
                replace("[", "").replace("]", "").replace(",", "").
                replace(" ", "+").replace("/", "%2F");

        String outboundFareKey = StringUtils.chop(outboundFlightKeyRaw);
        String outboundFlightKey = StringUtils.chop(outboundFlightKeyRaw);

        System.out.println("Price for first available date: " + priceForClosestDate);
        System.out.println("Flight number: " + flightNumber);
        System.out.println("fareKey: " + outboundFareKey);
        System.out.println("outboundFlightKey: " + outboundFlightKey);

        FareOptionsRequestDto fareOptionsBody = new FareOptionsRequestDto("1", "0",
                "0", "0", outboundFareKey, outboundFlightKey);
        Map<String, Object> fareOptionsMap = oMapper.convertValue(fareOptionsBody, Map.class);

        JsonPath fareOptionsResponse = given().
                pathParams(fareOptionsMap).
                when().
                get("https://desktopapps.ryanair.com/v4/en-ie/" +
                        "FareOptions?" +
                        "AdultsCount={adultsCount}" +
                        "&ChildrenCount={childrenCount}" +
                        "&InfantCount={infantCount}" +
                        "&TeensCount={teensCount}" +
                        "&outboundFareKey={outboundFareKey}" +
                        "&outboundFlightKey={outboundFlightKey}").
                then().contentType(ContentType.JSON).
                statusCode(200).
                extract().response().andReturn().jsonPath();
    }
}