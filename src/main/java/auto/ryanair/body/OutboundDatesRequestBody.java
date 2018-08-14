package auto.ryanair.body;

import auto.ryanair.dto.OutboundDatesRequestDto;
import auto.ryanair.utils.TimeStamp;

public class OutboundDatesRequestBody {
    public static OutboundDatesRequestDto constructRequestBody() {
        return new OutboundDatesRequestDto(
                "KRK",
                "false",
                "false",
                "17",
                "LWO",
                TimeStamp.getTimeStampFormatted());
    }
}