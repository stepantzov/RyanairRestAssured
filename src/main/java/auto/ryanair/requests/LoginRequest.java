package auto.ryanair.requests;

import auto.ryanair.actions.login.dto.request.LoginRequestDto;
import auto.ryanair.actions.login.dto.response.LoginResponseDto;
import auto.ryanair.utils.Properties;

import static io.restassured.RestAssured.basePath;
import static io.restassured.RestAssured.given;

public class LoginRequest {
    private static final String loginPath = "/userprofile/rest/api/v1/login";

    public static LoginResponseDto getResponseDto(LoginRequestDto loginBodyDto) {
        basePath = Properties.get("api.base.url").concat(loginPath);

        return given()
                .formParams(loginBodyDto.convertToMap())
                .when()
                .post(basePath)
                .then()
                .statusCode(200)
                .extract()
                .response()
                .as(LoginResponseDto.class);
    }
}