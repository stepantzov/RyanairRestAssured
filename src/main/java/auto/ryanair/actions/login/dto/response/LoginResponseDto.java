package auto.ryanair.actions.login.dto.response;

public class LoginResponseDto {
    private String customerId;
    private String token;

    public String getCustomerId() {
        return customerId;
    }

    public String getToken() {
        return token;
    }
}