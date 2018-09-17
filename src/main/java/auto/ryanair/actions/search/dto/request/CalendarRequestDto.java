package auto.ryanair.actions.search.dto.request;

import auto.ryanair.dto.RequestDto;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.util.Map;

public class CalendarRequestDto implements RequestDto {
    private static ObjectMapper oMapper = new ObjectMapper();
    private String destination;
    private String includeConnectingFlights;
    private String isTwoWay;
    private String months;
    private String origin;
    private String startDate;

    public CalendarRequestDto() {
        this.includeConnectingFlights = "false";
        this.isTwoWay = "false";
        this.months = "17";
    }

    public String getDestination() {
        return destination;
    }

    public String getIncludeConnectingFlights() {
        return includeConnectingFlights;
    }

    public String getIsTwoWay() {
        return isTwoWay;
    }

    public String getMonths() {
        return months;
    }

    public String getOrigin() {
        return origin;
    }

    public String getStartDate() {
        return startDate;
    }

    public CalendarRequestDto withDestination(String destination) {
        this.destination = destination;
        return this;
    }

    public CalendarRequestDto withIncludeConnectingFlights(String includeConnectingFlights) {
        this.includeConnectingFlights = includeConnectingFlights;
        return this;
    }

    public CalendarRequestDto withIsTwoWay(String isTwoWay) {
        this.isTwoWay = isTwoWay;
        return this;
    }

    public CalendarRequestDto withMonths(String months) {
        this.months = months;
        return this;
    }

    public CalendarRequestDto withOrigin(String origin) {
        this.origin = origin;
        return this;
    }

    public CalendarRequestDto withStartDate(String startDate) {
        this.startDate = startDate;
        return this;
    }

    public Map<String, Object> convertToMap() {
        return oMapper.convertValue(this, Map.class);
    }
}