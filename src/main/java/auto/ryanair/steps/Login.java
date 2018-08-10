package auto.ryanair.steps;

import auto.ryanair.requests.LoggedInUserRequest;
import auto.ryanair.requests.LoginRequest;
import auto.ryanair.response.LoginResponseParser;
import io.restassured.response.Response;

public class Login {
    public static Response getResponseAfterLoginWithExistingCredentials() {
        Response loginResponse = LoginRequest.extractLoginResponse();
        LoginResponseParser.printCustomerCredentialsFromResponse(loginResponse);

        return loginResponse;
    }

    public static Response getResponseAfterTokenAuthorization(Response loginResponse) {
        return LoggedInUserRequest.extractLoggedInUserResponse(loginResponse.jsonPath().getString("token"));
    }
}