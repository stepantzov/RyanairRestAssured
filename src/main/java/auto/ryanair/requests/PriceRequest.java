package auto.ryanair.requests;

import auto.ryanair.dto.response.priceResponseDto.PriceResponseDto;
import auto.ryanair.utils.PropertiesReader;
import io.restassured.http.ContentType;

import static io.restassured.RestAssured.given;

public class PriceRequest {
    public static PriceResponseDto getResponse(Object jsonBody) {
        return given()
                .contentType(ContentType.JSON)
                .body(jsonBody)
                .expect().statusCode(200)
                .when()
                .post(PropertiesReader.getPropertyByName("price.url.base"))
                .then()
                .contentType(ContentType.JSON)
                .extract()
                .as(PriceResponseDto.class);
    }
}