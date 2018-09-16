package auto.ryanair.actions.search;

import auto.ryanair.dto.request.SearchRequestDto;
import auto.ryanair.dto.response.CalendarResponseDto;
import auto.ryanair.requests.CalendarRequest;
import auto.ryanair.utils.TimeStamp;

public class Search {
    private static SearchRequestDto searchRequestDto = new SearchRequestDto()
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