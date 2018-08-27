package auto.ryanair.steps;

import auto.ryanair.dto.request.LoginRequestDto;
import auto.ryanair.dto.response.LoginResponseDto;
import auto.ryanair.requests.LoginRequest;

public class Login {
    public static LoginResponseDto getResponse() {
        LoginRequestDto loginRequestDto = new LoginRequestDto()
                .withUsername("zyclonc@gmail.com")
                .withPassword("123ZZror");

        LoginResponseDto loginResponse = LoginRequest.getResponseDto(loginRequestDto);
        printCredentialsFromResponse(loginResponse);

        return loginResponse;
    }

    public static void printCredentialsFromResponse(LoginResponseDto responseDto) {
        LoginResponseDto loginResponseDto = new LoginResponseDto();
        loginResponseDto.build(responseDto);

        System.out.println("customerId: " + loginResponseDto.getCustomerId());
        System.out.println("token: " + loginResponseDto.getToken());
    }
}