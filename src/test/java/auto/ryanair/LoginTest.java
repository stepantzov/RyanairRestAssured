package auto.ryanair;

import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import org.junit.Test;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.List;

import static io.restassured.RestAssured.given;

public class LoginTest {
    @Test
    public void basicLoginTest() {
        given().
                contentType(ContentType.URLENC).
                param("username", "zyclonc@gmail.com").
                param("password", "123ZZror").
                param("rememberme", "false").
                param("policyAgreed", "null").
                when().
                post("https://api.ryanair.com/userprofile/rest/api/v1/login").
                then().statusCode(200);
    }

    @Test
    public void flightDatesTest() {
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
        System.out.println(outboundDates.get(0));
    }
}