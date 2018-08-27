package auto.ryanair.requests;

import auto.ryanair.dto.request.LoginRequestDto;
import auto.ryanair.dto.response.LoginResponseDto;
import auto.ryanair.utils.PropertiesReader;
import io.restassured.http.ContentType;

import static io.restassured.RestAssured.given;

public class LoginRequest {
    public static LoginResponseDto getResponseDto(LoginRequestDto loginBodyDto) {
        return given()
                .contentType(ContentType.URLENC)
                .formParams(loginBodyDto.convertToMap())
                .when()
                .post(PropertiesReader.getPropertyByName("login.url.base"))
                .then()
                .statusCode(200)
                .contentType(ContentType.JSON)
                .extract()
                .body()
                .as(LoginResponseDto.class);
    }
}