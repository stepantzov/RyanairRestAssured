package auto.ryanair.requestActions.fareOptions.restAssuredRequest;

import auto.ryanair.requestActions.fareOptions.dto.response.FareOptionsResponseDto;
import auto.ryanair.setup.requests.RequestSpecification;
import auto.ryanair.utils.Properties;

import java.util.Map;

import static io.restassured.RestAssured.basePath;

public class FareOptionsRequest {
    public static final String pathParameters =
            "/v4/en-ie/FareOptions?" +
                    "AdultsCount={adultsCount}" +
                    "&ChildrenCount={childrenCount}" +
                    "&InfantCount={infantCount}" +
                    "&TeensCount={teensCount}" +
                    "&outboundFareKey={outboundFareKey}" +
                    "&outboundFlightKey={outboundFlightKey}";

    public static FareOptionsResponseDto[] getResponseDto(Map fareOptionsMap) {
        basePath = Properties.get("base.url").concat(pathParameters);

        return RequestSpecification.withPathParams(fareOptionsMap, basePath).as(FareOptionsResponseDto[].class);
    }
}