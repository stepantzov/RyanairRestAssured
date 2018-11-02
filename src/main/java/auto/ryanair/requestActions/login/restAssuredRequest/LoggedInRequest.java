package auto.ryanair.requestActions.login.restAssuredRequest;

import auto.ryanair.setup.requests.RequestSpecification;
import auto.ryanair.utils.Properties;
import io.restassured.response.Response;

import static io.restassured.RestAssured.basePath;

public class LoggedInRequest {
    private static final String loginPath = "/userprofile/v2/loggedin";

    public static Response getResponse(String xAuthTokenHeader) {
        basePath = Properties.get("api.base.url").concat(loginPath);

        return RequestSpecification
                .getWithHeader("X-AUTH-TOKEN", xAuthTokenHeader, basePath);
    }
}