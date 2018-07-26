package auto.ryanair;

public class LoginRequestDto {
    private String username;
    private String password;
    private String rememberme;
    private String policyAgreed;

    public LoginRequestDto() {
    }

    LoginRequestDto(String username, String password, String rememberme, String policyAgreed) {
        this.username = username;
        this.password = password;
        this.policyAgreed = policyAgreed;
        this.rememberme = rememberme;
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

    public void setPassword(String password) {
        this.password = password;
    }

    public void setPolicyAgreed(String policyAgreed) {
        this.policyAgreed = policyAgreed;
    }

    public void setRememberme(String rememberme) {
        this.rememberme = rememberme;
    }

    public void setUsername(String username) {
        this.username = username;
    }
}
