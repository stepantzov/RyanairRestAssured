package auto.ryanair.requestActions.availability.restAssuredRequest;

import auto.ryanair.requestActions.availability.dto.response.AvailabilityResponseDto;
import auto.ryanair.setup.requests.RequestSpecification;
import auto.ryanair.utils.Properties;

import java.util.Map;

import static io.restassured.RestAssured.basePath;

public class AvailabilityRequest {
    public static final String pathParameters = "/v4/en-ie/availability";

    public static AvailabilityResponseDto getResponseDto(Map pathParams) {
        basePath = Properties.get("base.url").concat(pathParameters);

        return RequestSpecification.withPathParams(pathParams, basePath).as(AvailabilityResponseDto.class);
    }
}