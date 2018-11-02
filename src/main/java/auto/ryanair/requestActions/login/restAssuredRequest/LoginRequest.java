package auto.ryanair.requestActions.login.restAssuredRequest;

import auto.ryanair.requestActions.login.dto.response.LoginResponseDto;
import auto.ryanair.setup.requests.RequestSpecification;
import auto.ryanair.utils.Properties;

import java.util.Map;

import static io.restassured.RestAssured.basePath;

public class LoginRequest {
    private static final String loginPath = "/userprofile/rest/api/v1/login";

    public static LoginResponseDto getResponseDto(Map loginBodyDto) {
        basePath = Properties.get("api.base.url").concat(loginPath);

        return RequestSpecification
                .postWithParams(loginBodyDto, basePath)
                .as(LoginResponseDto.class);
    }
}