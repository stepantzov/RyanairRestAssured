package auto.ryanair.steps;

import auto.ryanair.dto.request.OutboundDatesRequestDto;
import auto.ryanair.dto.response.OutboundDatesResponseDto;
import auto.ryanair.requests.OutboundDatesRequest;
import auto.ryanair.response.OutboundDatesResponseParser;
import auto.ryanair.utils.TimeStamp;

public class Search {
    static OutboundDatesRequestDto outboundDatesRequestDto = new OutboundDatesRequestDto()
            .withOrigin("LGW")
            .withDestination("DUB")
            .withStartDate(TimeStamp.getTimeStampFormatted());

    public static OutboundDatesResponseDto getResponseDto() {
        return OutboundDatesRequest.getOutboundDatesResponse(outboundDatesRequestDto);
    }

    public static void printFlightDate(OutboundDatesResponseDto outboundDatesResponseDto) {
        OutboundDatesResponseParser.printFirstAvailableFlightDate(
                outboundDatesRequestDto.getOrigin(),
                outboundDatesRequestDto.getDestination(),
                outboundDatesResponseDto.getOutboundDates().get(0));
    }
}