package auto.ryanair.requestActions.login;

import auto.ryanair.requestActions.login.dto.request.LoginRequestDto;
import auto.ryanair.requestActions.login.dto.response.LoginResponseDto;
import auto.ryanair.requestActions.login.restAssuredRequest.LoginRequest;

public class Login {
    public static LoginResponseDto getResponse() {
        LoginResponseDto loginResponse = LoginRequest
                .getResponseDto(new LoginRequestDto()
                        .withUsername("zyclonc@gmail.com")
                        .withPassword("123ZZror")
                        .convertToMap());

        printCredentialsFromResponse(loginResponse);

        return loginResponse;
    }

    public static void printCredentialsFromResponse(LoginResponseDto responseDto) {
        System.out.println("customerId: " + responseDto.getCustomerId());
        System.out.println("token: " + responseDto.getToken());
    }
}