package auto.ryanair.steps;

import auto.ryanair.dto.response.LoginResponseDto;
import auto.ryanair.requests.LoggedInUserRequest;

public class LoggedUser {
    public static void getResponse(LoginResponseDto loginResponse) {
        LoginResponseDto loginResponseDto = new LoginResponseDto();
        LoggedInUserRequest.extractStatusCode(loginResponseDto.build(loginResponse).getToken());
    }
}