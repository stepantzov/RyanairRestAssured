package auto.ryanair.requests;

import auto.ryanair.dto.request.SearchRequestDto;
import auto.ryanair.dto.response.SearchResponseDto;
import auto.ryanair.pathParams.EndPoints;
import auto.ryanair.utils.PropertiesReader;

import static io.restassured.RestAssured.given;

public class SearchRequest {
    public static SearchResponseDto getResponseDto(SearchRequestDto searchRequestDto) {
        return given()
                .pathParams(searchRequestDto.convertToMap())
                .when()
                .get(PropertiesReader
                        .getPropertyByName("searchDates.url.base")
                        .concat(EndPoints.searchDatesParams))
                .then()
                .statusCode(200)
                .extract()
                .response()
                .as(SearchResponseDto.class);
    }
}