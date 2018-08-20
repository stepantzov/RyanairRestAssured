package auto.ryanair.requests;

import auto.ryanair.dto.request.OutboundDatesRequestDto;
import auto.ryanair.dto.response.OutboundDatesResponseDto;
import auto.ryanair.pathParams.PathParameters;
import auto.ryanair.utils.PropertiesReader;

import static io.restassured.RestAssured.given;

public class OutboundDatesRequest {
    public static OutboundDatesResponseDto getOutboundDatesResponse(OutboundDatesRequestDto outboundDatesBody) {

        return given()
                .pathParams(outboundDatesBody.convertToMap(outboundDatesBody))
                .when()
                .get(PropertiesReader
                        .getPropertyByName("outboundDates.url.base")
                        .concat(PathParameters.outboundDatesParams))
                .then()
                .extract()
                .response()
                .as(OutboundDatesResponseDto.class);
    }
}