package auto.ryanair.actions.login.dto.request;

import auto.ryanair.dto.RequestDto;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.util.Map;

public class LoginRequestDto implements RequestDto {
    private String username;
    private String password;
    private String rememberme;
    private String policyAgreed;

    public LoginRequestDto() {
        this.policyAgreed = null;
        this.rememberme = "false";
    }

    public Map<String, Object> convertToMap() {
        ObjectMapper oMapper = new ObjectMapper();

        return oMapper.convertValue(this, Map.class);
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