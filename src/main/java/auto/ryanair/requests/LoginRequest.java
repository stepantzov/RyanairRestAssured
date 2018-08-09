package auto.ryanair.requests;

import auto.ryanair.dto.LoginRequestDto;
import auto.ryanair.urlDefinitions.UrlDefinitions;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

import java.util.Map;

import static io.restassured.RestAssured.given;

public class LoginRequest {
    public static Response extractLoginResponse() {
        ObjectMapper oMapper = new ObjectMapper();
        LoginRequestDto loginBody = new LoginRequestDto("zyclonc@gmail.com",
                "123ZZror", "false", "null");
        Map<String, Object> loginDataMap = oMapper.convertValue(loginBody, Map.class);

        return given().
                contentType(ContentType.URLENC).
                formParams(loginDataMap).
                when().
                post(UrlDefinitions.loginUrl).
                then().
                extract().response();
    }
}