package auto.ryanair.dto.response;

import java.util.ArrayList;

public class OutboundDatesResponseDto {
    private ArrayList<String> returnDates;
    private ArrayList<String> outboundDates;

    public OutboundDatesResponseDto build(OutboundDatesResponseDto dto) {
        this.returnDates = dto.returnDates;
        this.outboundDates = dto.outboundDates;

        return this;
    }

    public ArrayList<String> getOutboundDates() {
        return outboundDates;
    }

    public ArrayList<String> getReturnDates() {
        return returnDates;
    }
}