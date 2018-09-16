package auto.ryanair.requests;

import auto.ryanair.utils.Properties;
import io.restassured.response.Response;

import static io.restassured.RestAssured.basePath;

public class LoggedInUserRequest {
    private static final String loginPath = "/userprofile/v2/loggedin";

    public static Response extractResponse(String xAuthTokenHeader) {
        basePath = Properties.get("api.base.url").concat(loginPath);

        return Request.withHeader("X-AUTH-TOKEN", xAuthTokenHeader, basePath);
    }
}