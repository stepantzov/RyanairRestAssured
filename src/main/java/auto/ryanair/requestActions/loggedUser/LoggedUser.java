package auto.ryanair.requestActions.loggedUser;

import auto.ryanair.requestActions.login.dto.response.LoginResponseDto;
import auto.ryanair.requestActions.loggedUser.restAssuredRequest.LoggedInRequest;

public class LoggedUser {
    public static void getResponse(LoginResponseDto loginResponse) {
        LoggedInRequest.extractResponse(loginResponse.getToken());
    }
}