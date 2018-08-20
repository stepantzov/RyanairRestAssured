package auto.ryanair.dto.request;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.util.Map;

public class OutboundDatesRequestDto {
    private String destination;
    private String includeConnectingFlights;
    private String isTwoWay;
    private String months;
    private String origin;
    private String startDate;

    public OutboundDatesRequestDto() {
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

    public OutboundDatesRequestDto withDestination(String destination) {
        this.destination = destination;
        return this;
    }

    public OutboundDatesRequestDto withIncludeConnectingFlights(String includeConnectingFlights) {
        this.includeConnectingFlights = includeConnectingFlights;
        return this;
    }

    public OutboundDatesRequestDto withIsTwoWay(String isTwoWay) {
        this.isTwoWay = isTwoWay;
        return this;
    }

    public OutboundDatesRequestDto withMonths(String months) {
        this.months = months;
        return this;
    }

    public OutboundDatesRequestDto withOrigin(String origin) {
        this.origin = origin;
        return this;
    }

    public OutboundDatesRequestDto withStartDate(String startDate) {
        this.startDate = startDate;
        return this;
    }

    public Map<String, Object> convertToMap(OutboundDatesRequestDto outboundDatesRequestDto) {
        ObjectMapper oMapper = new ObjectMapper();
        Map<String, Object> outboundDatesRequestMap = oMapper.convertValue(outboundDatesRequestDto, Map.class);

        return outboundDatesRequestMap;
    }
}