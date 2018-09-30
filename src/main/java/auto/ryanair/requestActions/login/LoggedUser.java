package auto.ryanair.requestActions.login;

import auto.ryanair.requestActions.login.restAssuredRequest.LoggedInRequest;

public class LoggedUser {
    public static void getResponse(String token) {
        LoggedInRequest.getResponse(token);
    }
}