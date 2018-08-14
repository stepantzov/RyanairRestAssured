package auto.ryanair.dto;

public class OutboundDatesRequestDto {
    private String destination;
    private String includeConnectingFlights;
    private String isTwoWay;
    private String months;
    private String origin;
    private String startDate;

    public OutboundDatesRequestDto() {
    }

    public OutboundDatesRequestDto(String destination, String includeConnectingFlights, String isTwoWay, String months, String origin, String startDate) {
        this.destination = destination;
        this.includeConnectingFlights = includeConnectingFlights;
        this.isTwoWay = isTwoWay;
        this.months = months;
        this.origin = origin;
        this.startDate = startDate;
    }

    public OutboundDatesRequestDto bild() {
        return new OutboundDatesRequestDto(destination, includeConnectingFlights, isTwoWay, months, origin, startDate);
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

    public OutboundDatesRequestDto withDestinationd(String destination) {
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
}