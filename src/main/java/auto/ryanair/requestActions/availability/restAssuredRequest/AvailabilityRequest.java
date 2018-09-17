package auto.ryanair.requestActions.availability.restAssuredRequest;

import auto.ryanair.requestActions.availability.dto.response.AvailabilityResponseDto;
import auto.ryanair.setup.requests.RequestSpecification;
import auto.ryanair.utils.Properties;

import java.util.Map;

import static io.restassured.RestAssured.basePath;

public class AvailabilityRequest {
    public static final String pathParameter =
            "/v4/en-ie/availability?" +
                    "ADT={adt}" +
                    "&CHD={chd}" +
                    "&DateOut={dateOut}" +
                    "&Destination={destination}" +
                    "&FlexDaysOut={flexDaysOut}" +
                    "&INF={inf}" +
                    "&IncludeConnectingFlights={includeConnectingFlights}" +
                    "&Origin={origin}" +
                    "&RoundTrip={roundTrip}" +
                    "&TEEN={teen}" +
                    "&ToUs={toUs}" +
                    "&exists={exists}" +
                    "&promoCode={promoCode}";

    public static AvailabilityResponseDto getResponseDto(Map pathParams) {
        basePath = Properties.get("base.url").concat(pathParameter);

        return RequestSpecification.withPathParams(pathParams, basePath).as(AvailabilityResponseDto.class);
    }
}