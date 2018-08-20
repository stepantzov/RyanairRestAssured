package auto.ryanair.dto.request;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.util.Map;

public class LoginRequestDto {
    private String username;
    private String password;
    private String rememberme;
    private String policyAgreed;

    public LoginRequestDto() {
        this.policyAgreed = null;
        this.rememberme = "false";
    }

    public Map<String, Object> convertToMap(LoginRequestDto loginRequestDto) {
        ObjectMapper oMapper = new ObjectMapper();
        Map<String, Object> loginDataMap = oMapper.convertValue(loginRequestDto, Map.class);

        return loginDataMap;
    }

    public String getPassword() {
        return password;
    }

    public String getPolicyAgreed() {
        return policyAgreed;
    }

    public String getRememberme() {
        return rememberme;
    }

    public String getUsername() {
        return username;
    }

    public LoginRequestDto withUsername(String username) {
        this.username = username;
        return this;
    }

    public LoginRequestDto withPassword(String password) {
        this.password = password;
        return this;
    }
}