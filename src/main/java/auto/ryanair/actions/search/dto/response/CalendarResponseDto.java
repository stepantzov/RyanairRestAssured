package auto.ryanair.actions.search.dto.response;

import java.util.ArrayList;

public class CalendarResponseDto {
    private ArrayList<String> returnDates;
    private ArrayList<String> outboundDates;

    public ArrayList<String> getOutboundDates() {
        return outboundDates;
    }

    public ArrayList<String> getReturnDates() {
        return returnDates;
    }
}