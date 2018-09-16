package auto.ryanair.requests;

import auto.ryanair.dto.response.avaliabilityResponseDto.AvailabilityResponseDto;
import auto.ryanair.pathParams.PathParameters;
import auto.ryanair.utils.Properties;

import java.util.Map;

import static io.restassured.RestAssured.basePath;

public class AvailabilityRequest {
    public static AvailabilityResponseDto getResponseDto(Map pathParams) {
        basePath = Properties.get("base.url").concat(PathParameters.availability);

        return Request.withPathParams(pathParams, basePath).as(AvailabilityResponseDto.class);
    }
}