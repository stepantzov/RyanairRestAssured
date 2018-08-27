package auto.ryanair.requests;

import auto.ryanair.dto.request.SearchRequestDto;
import auto.ryanair.dto.response.SearchResponseDto;
import auto.ryanair.pathParams.PathParameters;
import auto.ryanair.utils.PropertiesReader;

import static io.restassured.RestAssured.given;

public class SearchRequest {
    public static SearchResponseDto getResponseDto(SearchRequestDto searchRequestDto) {
        return given()
                .pathParams(searchRequestDto.convertToMap())
                .when()
                .get(PropertiesReader
                        .getPropertyByName("outboundDates.url.base")
                        .concat(PathParameters.outboundDatesParams))
                .then()
                .extract()
                .response()
                .as(SearchResponseDto.class);
    }
}