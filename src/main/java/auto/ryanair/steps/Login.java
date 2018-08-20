package auto.ryanair.steps;

import auto.ryanair.dto.response.LoginResponseDto;
import auto.ryanair.requests.LoggedInUserRequest;
import auto.ryanair.requests.LoginRequest;
import auto.ryanair.response.LoginResponseParser;

public class Login {
    public static LoginResponseDto getLoginResponse() {
        LoginResponseDto loginResponse = LoginRequest.extractLoginResponse();
        LoginResponseParser.printCredentialsFromResponse(loginResponse);

        return loginResponse;
    }

    public static int getAuthorizationResponseStatusCode(LoginResponseDto loginResponse) {
        LoginResponseDto loginResponseDto = new LoginResponseDto();

        return LoggedInUserRequest.extractStatusCode(loginResponseDto.build(loginResponse).getToken());
    }
}