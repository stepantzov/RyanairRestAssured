package auto.ryanair.dto.response;

public class LoginResponseDto {
    private String customerId;
    private String token;

    public LoginResponseDto build(LoginResponseDto response) {
        this.customerId = response.customerId;
        this.token = response.token;

        return this;
    }

    public String getCustomerId() {
        return customerId;
    }

    public String getToken() {
        return token;
    }
}