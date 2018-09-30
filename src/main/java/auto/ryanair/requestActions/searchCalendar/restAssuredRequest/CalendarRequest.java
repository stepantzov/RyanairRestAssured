package auto.ryanair.requestActions.searchCalendar.restAssuredRequest;

import auto.ryanair.requestActions.searchCalendar.dto.response.CalendarResponseDto;
import auto.ryanair.setup.requests.RequestSpecification;
import auto.ryanair.utils.Properties;

import java.util.Map;

import static io.restassured.RestAssured.basePath;

public class CalendarRequest {
    public static final String pathParameters = "/v4/Calendar";

    public static CalendarResponseDto getResponseDto(Map searchRequestDto) {
        basePath = Properties.get("base.url").concat(pathParameters);

        return RequestSpecification
                .getWithParams(searchRequestDto, basePath)
                .as(CalendarResponseDto.class);
    }
}