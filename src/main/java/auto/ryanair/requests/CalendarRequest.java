package auto.ryanair.requests;

import auto.ryanair.dto.response.CalendarResponseDto;
import auto.ryanair.pathParams.PathParameters;
import auto.ryanair.utils.Properties;

import java.util.Map;

import static io.restassured.RestAssured.basePath;

public class CalendarRequest {
    private static final String searchPath = PathParameters.calendarDates;

    public static CalendarResponseDto getResponseDto(Map searchRequestDto) {
        basePath = Properties.get("base.url").concat(searchPath);

        return Request.withPathParams(searchRequestDto, basePath).as(CalendarResponseDto.class);
    }
}