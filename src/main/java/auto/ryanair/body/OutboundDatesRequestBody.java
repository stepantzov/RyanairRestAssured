package auto.ryanair.body;

import auto.ryanair.dto.OutboundDatesRequestDto;
import auto.ryanair.utils.TimeStamp;

public class OutboundDatesRequestBody {
    public static OutboundDatesRequestDto constructRequestBody() {
        return new OutboundDatesRequestDto()
                .withOrigin("LGW")
                .withDestination("DUB")
                .withStartDate(TimeStamp.getTimeStampFormatted());
    }
}