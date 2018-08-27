package auto.ryanair.steps;

import auto.ryanair.dto.request.SearchRequestDto;
import auto.ryanair.dto.response.SearchResponseDto;
import auto.ryanair.requests.SearchRequest;
import auto.ryanair.utils.TimeStamp;

public class Search {
    private static SearchRequestDto searchRequestDto = new SearchRequestDto()
            .withOrigin("LGW")
            .withDestination("DUB")
            .withStartDate(TimeStamp.getTimeStampFormatted());

    public static SearchResponseDto getResponseDto() {
        return SearchRequest.getResponseDto(searchRequestDto);
    }

    public static void printFlightDate(SearchResponseDto searchResponseDto) {
        System.out.format("Available flight date for flight %s - %s is: %s\n",
                searchRequestDto.getOrigin(),
                searchRequestDto.getDestination(),
                searchResponseDto.getOutboundDates().get(0));

    }
}