package auto.ryanair.requests;

import auto.ryanair.dto.OutboundDatesRequestDto;
import auto.ryanair.urlDefinitions.UrlDefinitions;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.restassured.response.Response;

import java.util.Map;

import static io.restassured.RestAssured.given;

public class OutboundDatesRequest {
    public static Response getOutboundDatesResponse(OutboundDatesRequestDto outboundDatesBody) {
        ObjectMapper oMapper = new ObjectMapper();
        Map<String, Object> loginOutboundDatesMap = oMapper.convertValue(outboundDatesBody, Map.class);

        return given().
                pathParams(loginOutboundDatesMap).
                when().
                get(UrlDefinitions.outboundDatesUrl).
                then().
                extract().
                response();
    }
}