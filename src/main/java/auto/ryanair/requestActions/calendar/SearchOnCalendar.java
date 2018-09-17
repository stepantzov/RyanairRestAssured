package auto.ryanair.requestActions.calendar;

import auto.ryanair.requestActions.calendar.dto.request.CalendarRequestDto;
import auto.ryanair.requestActions.calendar.dto.response.CalendarResponseDto;
import auto.ryanair.requestActions.calendar.restAssuredRequest.CalendarRequest;
import auto.ryanair.utils.TimeStamp;

public class SearchOnCalendar {
    private static CalendarRequestDto searchRequestDto = new CalendarRequestDto()
            .withOrigin("LGW")
            .withDestination("DUB")
            .withStartDate(TimeStamp.getTimeStampFormatted());

    public static CalendarResponseDto getResponseDto() {
        return CalendarRequest.getResponseDto(searchRequestDto.convertToMap());
    }

    public static void printFlightDate(CalendarResponseDto calendarResponseDto) {
        System.out.format("Available flight date for flight %s - %s is: %s\n",
                searchRequestDto.getOrigin(),
                searchRequestDto.getDestination(),
                calendarResponseDto.getOutboundDates().get(0));

    }
}