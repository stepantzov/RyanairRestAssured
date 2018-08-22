package auto.ryanair.response;

import auto.ryanair.dto.response.LoginResponseDto;

public class LoginResponseParser {
    //TODO: can be moved to above calling method
    public static void printCredentialsFromResponse(LoginResponseDto responseDto) {
        LoginResponseDto loginResponseDto = new LoginResponseDto();
        loginResponseDto.build(responseDto);

        System.out.println("customerId: " + loginResponseDto.getCustomerId());
        System.out.println("token: " + loginResponseDto.getToken());
    }
}