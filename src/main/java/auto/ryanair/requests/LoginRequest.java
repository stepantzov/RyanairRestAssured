package auto.ryanair.requests;

import auto.ryanair.dto.LoginRequestDto;
import auto.ryanair.utils.PropertiesReader;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

import java.util.Map;

import static io.restassured.RestAssured.given;

public class LoginRequest {
    public static Response extractLoginResponse() {
        ObjectMapper oMapper = new ObjectMapper();
        LoginRequestDto loginBody = new LoginRequestDto().withUsername("zyclonc@gmail.com").
                withPassword("123ZZror").withRememberme("false").withPolicyAgreed("null").build();
        Map<String, Object> loginDataMap = oMapper.convertValue(loginBody, Map.class);

        return given().
                contentType(ContentType.URLENC).
                formParams(loginDataMap).
                when().
                post(PropertiesReader.getPropertyByName("login.url.base")).
                then().
                extract().response();
    }
}