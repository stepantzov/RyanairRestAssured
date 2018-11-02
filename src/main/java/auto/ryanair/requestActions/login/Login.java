package auto.ryanair.requestActions.login;

import auto.ryanair.requestActions.login.dto.request.LoginRequestDto;
import auto.ryanair.requestActions.login.dto.response.LoginResponseDto;
import auto.ryanair.requestActions.login.restAssuredRequest.LoginRequest;

public class Login {
    public static void loginWithCredentials(String login, String password){
        LoginResponseDto loginResponse = LoginRequest
                .getResponseDto(new LoginRequestDto()
                        .withUsername(login)
                        .withPassword(password)
                        .convertToMap());

        printCredentialsFromResponse(loginResponse);

        LoggedUser.getResponse(loginResponse.getToken());
    }

    public static void printCredentialsFromResponse(LoginResponseDto responseDto) {
        System.out.println("customerId: " + responseDto.getCustomerId());
        System.out.println("token: " + responseDto.getToken());
        System.out.println();
    }
}