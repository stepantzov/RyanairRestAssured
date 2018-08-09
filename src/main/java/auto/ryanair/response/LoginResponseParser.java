package auto.ryanair.response;

import io.restassured.response.Response;

public class LoginResponseParser {
    public static void printCustomerCredentialsFromResponse(Response loginResponse) {
        System.out.println("customerId: " + loginResponse.jsonPath().getString("customerId"));
        System.out.println("token: " + loginResponse.jsonPath().getString("token"));
    }
}