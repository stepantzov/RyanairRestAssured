package auto.ryanair.requests;

import auto.ryanair.dto.response.priceResponseDto.PriceResponseDto;
import auto.ryanair.utils.PropertiesReader;
import io.restassured.http.ContentType;

import static io.restassured.RestAssured.given;

public class PriceRequest {
    public static PriceResponseDto getResponseDto(String jsonBody) {
        return given()
                .contentType(ContentType.JSON)
                .body(jsonBody)
                .when()
                .post(PropertiesReader.getPropertyByName("price.url.base"))
                .then()
                .statusCode(200)
                .contentType(ContentType.JSON)
                .extract()
                .as(PriceResponseDto.class);
    }
}