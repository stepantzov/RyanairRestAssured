package auto.ryanair.steps;

import auto.ryanair.body.OutboundDatesRequestBody;
import auto.ryanair.dto.request.OutboundDatesRequestDto;
import auto.ryanair.dto.response.OutboundDatesResponseDto;
import auto.ryanair.requests.OutboundDatesRequest;
import auto.ryanair.response.OutboundDatesResponseParser;

public class Search {
    static OutboundDatesRequestDto outboundDatesRequestDto = OutboundDatesRequestBody.constructRequestBody();

    public static OutboundDatesResponseDto getResponseAfterFlightSearch() {
        return OutboundDatesRequest.getOutboundDatesResponse(outboundDatesRequestDto);
    }

    public static void printFlightDate(OutboundDatesResponseDto outboundDatesResponse) {
        OutboundDatesResponseDto outboundDatesResponseDto = new OutboundDatesResponseDto();
        outboundDatesResponseDto.build(outboundDatesResponse);

        OutboundDatesResponseParser
                .printFirstAvailableFlightDate(
                        outboundDatesRequestDto.getOrigin(),
                        outboundDatesRequestDto.getDestination(),
                        outboundDatesResponseDto.getOutboundDates().get(0));
    }
}