package auto.ryanair.dto;

public class LoginRequestDto {
    private String username;
    private String password;
    private String rememberme;
    private String policyAgreed;

    public LoginRequestDto() {
    }

    public LoginRequestDto(String username, String password, String rememberme, String policyAgreed) {
        this.username = username;
        this.password = password;
        this.policyAgreed = policyAgreed;
        this.rememberme = rememberme;
    }

    public LoginRequestDto build() {
        return new LoginRequestDto(username, password, policyAgreed, rememberme);
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

    public LoginRequestDto withRememberme(String rememberme) {
        this.rememberme = rememberme;
        return this;
    }

    public LoginRequestDto withPolicyAgreed(String policyAgreed) {
        this.policyAgreed = policyAgreed;
        return this;
    }
}