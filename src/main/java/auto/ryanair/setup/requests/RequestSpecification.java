package auto.ryanair.setup.requests;

import auto.ryanair.setup.dto.RequestDto;
import io.restassured.http.ContentType;
import io.restassured.mapper.ObjectMapperType;
import io.restassured.response.Response;

import java.util.Map;

import static io.restassured.RestAssured.given;

public class RequestSpecification {
    public static Response withPathParams(Map pathParams, String basePath) {
        return given()
                .params(pathParams)
                .when()
                .get(basePath)
                .then()
                .statusCode(200)
                .extract()
                .response();
    }

    public static Response withJsonBody(RequestDto requestDto, String basePath) {
        return given()
                .contentType(ContentType.JSON)
                .body(requestDto, ObjectMapperType.GSON)
                .when()
                .post(basePath)
                .then()
                .statusCode(200)
                .extract()
                .response();
    }

    public static Response withHeader(String headerName, String headerValue, String basePath){
        return given()
                .header(headerName, headerValue)
                .when()
                .get(basePath)
                .then()
                .statusCode(200)
                .extract()
                .response();
    }
}