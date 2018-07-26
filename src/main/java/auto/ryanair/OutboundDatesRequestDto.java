package auto.ryanair;

public class OutboundDatesRequestDto {
    private String destination;
    private String includeConnectingFlights;
    private String isTwoWay;
    private String months;
    private String origin;
    private String startDate;

    public OutboundDatesRequestDto() {
    }

    OutboundDatesRequestDto(String destination, String includeConnectingFlights, String isTwoWay, String months, String origin, String startDate) {
        this.destination = destination;
        this.includeConnectingFlights = includeConnectingFlights;
        this.isTwoWay = isTwoWay;
        this.months = months;
        this.origin = origin;
        this.startDate = startDate;
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

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public void setIncludeConnectingFlights(String includeConnectingFlights) {
        this.includeConnectingFlights = includeConnectingFlights;
    }

    public void setIsTwoWay(String isTwoWay) {
        this.isTwoWay = isTwoWay;
    }

    public void setMonths(String months) {
        this.months = months;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }
}
