package auto.ryanair.steps;

import auto.ryanair.dto.response.LoginResponseDto;
import auto.ryanair.requests.LoggedInUserRequest;
import auto.ryanair.requests.LoginRequest;
import auto.ryanair.response.LoginResponseParser;

public class Login {
    public static LoginResponseDto getResponseDto() {
        LoginResponseDto loginResponse = LoginRequest.getResponseDto();
        LoginResponseParser.printCredentialsFromResponse(loginResponse);

        return loginResponse;
    }

    public static void getResponse(LoginResponseDto loginResponse) {
        LoginResponseDto loginResponseDto = new LoginResponseDto();
        LoggedInUserRequest.extractStatusCode(loginResponseDto.build(loginResponse).getToken());
    }
}