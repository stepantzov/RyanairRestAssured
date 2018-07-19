package auto.ryanair;

import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import org.junit.Test;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.List;

import static io.restassured.RestAssured.given;

public class RyanairApiTest {
    @Test
    public void loginTest() {
        JsonPath loginResponse = given().
                contentType(ContentType.URLENC).
                param("username", "zyclonc@gmail.com").
                param("password", "123ZZror").
                param("rememberme", "false").
                param("policyAgreed", "null").
                when().
                post("https://api.ryanair.com/userprofile/rest/api/v1/login").
                then().
                contentType(ContentType.JSON).
                statusCode(200).
                extract().response().andReturn().jsonPath();

        System.out.println("customerId: " + loginResponse.getString("customerId"));
        System.out.println("token: " + loginResponse.getString("token"));
    }

    @Test
    public void flightOutDatesTest() {
        String timeStamp = new SimpleDateFormat("yyyy-MM-dd").format(Calendar.getInstance().getTime());

        JsonPath response = given().
                pathParam("destination", "KRK").
                pathParam("includeConnectingFlights", "false").
                pathParam("isTwoWay", "false").
                pathParam("months", "17").
                pathParam("origin", "LWO").
                pathParam("startDate", timeStamp).
                when().
                get("https://desktopapps.ryanair.com/v4/" +
                        "Calendar?Destination={destination}&IncludeConnectingFlights={includeConnectingFlights}" +
                        "&IsTwoWay={isTwoWay}&Months={months}&Origin={origin}&StartDate={startDate}").
                then().contentType(ContentType.JSON).
                statusCode(200).extract().response().andReturn().jsonPath();

        List<String> outboundDates = response.get("outboundDates");
        System.out.println("First available flight date: " + outboundDates.get(0));
    }

    @Test
    public void priceTest() {
        String timeStamp = new SimpleDateFormat("yyyy-MM-dd").format(Calendar.getInstance().getTime());

        JsonPath dateResponse = given().
                pathParam("destination", "KRK").
                pathParam("includeConnectingFlights", "false").
                pathParam("isTwoWay", "false").
                pathParam("months", "17").
                pathParam("origin", "LWO").
                pathParam("startDate", timeStamp).
                when().
                get("https://desktopapps.ryanair.com/v4/" +
                        "Calendar?" +
                        "Destination={destination}" +
                        "&IncludeConnectingFlights={includeConnectingFlights}" +
                        "&IsTwoWay={isTwoWay}" +
                        "&Months={months}&Origin={origin}" +
                        "&StartDate={startDate}").
                then().contentType(ContentType.JSON).
                statusCode(200).extract().response().andReturn().jsonPath();

        List<String> outboundDates = dateResponse.get("outboundDates");

        JsonPath priceResponse = given().
                pathParam("adt", "1").
                pathParam("chd", "0").
                pathParam("dateOut", outboundDates.get(0)).
                pathParam("destination", "KRK").
                pathParam("flexDaysOut", "1").
                pathParam("inf", "0").
                pathParam("includeConnectingFlights", "true").
                pathParam("origin", "LWO").
                pathParam("roundTrip", "false").
                pathParam("teen", "0").
                pathParam("toUs", "AGREED").
                pathParam("exists", "false").
                pathParam("promoCode", "").
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

        System.out.println("Price for first available date: " + priceForClosestDate);
        System.out.println("Flight number: " + flightNumber);
    }
}