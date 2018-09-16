package auto.ryanair.requests;

import auto.ryanair.dto.response.flightOptionsResponseDto.FareOptionsResponseDto;
import auto.ryanair.pathParams.PathParameters;
import auto.ryanair.utils.Properties;

import java.util.Map;

import static io.restassured.RestAssured.basePath;

public class FareOptionsRequest {
    public static FareOptionsResponseDto[] getResponseDto(Map fareOptionsMap) {
        basePath = Properties.get("base.url").concat(PathParameters.fareOptionsParameters);

        return Request.withPathParams(fareOptionsMap, basePath).as(FareOptionsResponseDto[].class);
    }
}