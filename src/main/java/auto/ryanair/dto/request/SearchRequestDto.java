package auto.ryanair.dto.request;

import auto.ryanair.utils.TimeStamp;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.util.Map;

public class SearchRequestDto {
    private String destination;
    private String includeConnectingFlights;
    private String isTwoWay;
    private String months;
    private String origin;
    private String startDate;

    public SearchRequestDto() {
        this.includeConnectingFlights = "false";
        this.isTwoWay = "false";
        this.months = "17";
        this.startDate = TimeStamp.getTimeStampFormatted();
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

    public SearchRequestDto withDestination(String destination) {
        this.destination = destination;
        return this;
    }

    public SearchRequestDto withIncludeConnectingFlights(String includeConnectingFlights) {
        this.includeConnectingFlights = includeConnectingFlights;
        return this;
    }

    public SearchRequestDto withIsTwoWay(String isTwoWay) {
        this.isTwoWay = isTwoWay;
        return this;
    }

    public SearchRequestDto withMonths(String months) {
        this.months = months;
        return this;
    }

    public SearchRequestDto withOrigin(String origin) {
        this.origin = origin;
        return this;
    }

    public SearchRequestDto withStartDate(String startDate) {
        this.startDate = startDate;
        return this;
    }

    public Map<String, Object> convertToMap() {
        ObjectMapper oMapper = new ObjectMapper();
        Map<String, Object> outboundDatesRequestMap = oMapper.convertValue(this, Map.class);

        return outboundDatesRequestMap;
    }
}