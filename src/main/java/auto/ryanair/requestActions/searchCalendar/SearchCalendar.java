package auto.ryanair.requestActions.searchCalendar;

import auto.ryanair.requestActions.searchCalendar.dto.request.CalendarRequestDto;
import auto.ryanair.requestActions.searchCalendar.dto.response.CalendarResponseDto;
import auto.ryanair.requestActions.searchCalendar.restAssuredRequest.CalendarRequest;

public class SearchCalendar {
    public static CalendarResponseDto getResponseDto(String origin, String destination, String date) {
        return CalendarRequest.getResponseDto(new CalendarRequestDto()
                .withOrigin(origin)
                .withDestination(destination)
                .withStartDate(date)
                .convertToMap());

    }
}