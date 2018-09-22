package auto.ryanair.requestActions.price.restAssuredRequest;

import auto.ryanair.requestActions.price.dto.request.PriceRequestRequestDto;
import auto.ryanair.requestActions.price.dto.response.PriceResponseDto;
import auto.ryanair.utils.Properties;
import io.restassured.http.ContentType;
import io.restassured.mapper.ObjectMapperType;

import static io.restassured.RestAssured.basePath;
import static io.restassured.RestAssured.given;

public class PriceRequest {
    private static final String pricePath = "/v4/en-ie/Price";

    public static PriceResponseDto getResponseDto(PriceRequestRequestDto priceRequestDto) {
        basePath = Properties.get("base.url").concat(pricePath);

        return given()
                .contentType(ContentType.JSON)
                .body(priceRequestDto, ObjectMapperType.GSON)
                .when()
                .post(basePath)
                .then()
                .statusCode(200)
                .extract()
                .response()
                .as(PriceResponseDto.class);
    }
}