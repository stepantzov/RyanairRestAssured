package auto.ryanair.actions.loggedUser;

import auto.ryanair.dto.response.LoginResponseDto;
import auto.ryanair.requests.LoggedInUserRequest;

public class LoggedUser {
    public static void getResponse(LoginResponseDto loginResponse) {
        LoggedInUserRequest.extractResponse(loginResponse.getToken());
    }
}