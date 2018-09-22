package auto.ryanair.requestActions.login.restAssuredRequest;

import auto.ryanair.requestActions.login.dto.response.LoginResponseDto;
import auto.ryanair.utils.Properties;

import java.util.Map;

import static io.restassured.RestAssured.basePath;
import static io.restassured.RestAssured.given;

public class LoginRequest {
    private static final String loginPath = "/userprofile/rest/api/v1/login";

    public static LoginResponseDto getResponseDto(Map loginBodyDto) {
        basePath = Properties.get("api.base.url").concat(loginPath);

        return given()
                .formParams(loginBodyDto)
                .when()
                .post(basePath)
                .then()
                .statusCode(200)
                .extract()
                .response()
                .as(LoginResponseDto.class);
    }
}