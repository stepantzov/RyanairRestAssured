package auto.ryanair.requestActions.calendar.restAssuredRequest;

import auto.ryanair.requestActions.calendar.dto.response.CalendarResponseDto;
import auto.ryanair.setup.requests.RequestSpecification;
import auto.ryanair.utils.Properties;

import java.util.Map;

import static io.restassured.RestAssured.basePath;

public class CalendarRequest {
    public static final String pathParameters =
            "/v4/Calendar?Destination={destination}" +
                    "&IncludeConnectingFlights={includeConnectingFlights}" +
                    "&IsTwoWay={isTwoWay}" +
                    "&Months={months}" +
                    "&Origin={origin}" +
                    "&StartDate={startDate}";

    public static CalendarResponseDto getResponseDto(Map searchRequestDto) {
        basePath = Properties.get("base.url").concat(pathParameters);

        return RequestSpecification.withPathParams(searchRequestDto, basePath).as(CalendarResponseDto.class);
    }
}