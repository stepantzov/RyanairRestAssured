package auto.ryanair.dto;

public class AvailabilityRequestDto {
    private int adt;
    private int chd;
    private String dateOut;
    private String destination;
    private String flexDaysOut;
    private int inf;
    private String includeConnectingFlights;
    private String origin;
    private String roundTrip;
    private int teen;
    private String toUs;
    private String exists;
    private String promoCode;

    public AvailabilityRequestDto() {
    }

    public AvailabilityRequestDto(int adt, int chd, String dateOut, String destination, String flexDaysOut,
                                  int inf, String includeConnectingFlights, String origin, String roundTrip,
                                  int teen, String toUs, String exists, String promoCode) {
        this.adt = adt;
        this.chd = chd;
        this.dateOut = dateOut;
        this.destination = destination;
        this.flexDaysOut = flexDaysOut;
        this.inf = inf;
        this.includeConnectingFlights = includeConnectingFlights;
        this.origin = origin;
        this.roundTrip = roundTrip;
        this.teen = teen;
        this.toUs = toUs;
        this.exists = exists;
        this.promoCode = promoCode;
    }

    public String getDestination() {
        return destination;
    }

    public AvailabilityRequestDto withDestinstion(String destination) {
        this.destination = destination;
        return this;
    }

    public int getInf() {
        return inf;
    }

    public String getOrigin() {
        return origin;
    }

    public int getAdt() {
        return adt;
    }

    public String getIncludeConnectingFlights() {
        return includeConnectingFlights;
    }

    public int getChd() {
        return chd;
    }

    public String getDateOut() {
        return dateOut;
    }

    public String getExists() {
        return exists;
    }

    public String getFlexDaysOut() {
        return flexDaysOut;
    }

    public String getPromoCode() {
        return promoCode;
    }

    public String getRoundTrip() {
        return roundTrip;
    }

    public int getTeen() {
        return teen;
    }

    public String getToUs() {
        return toUs;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }

    public void setIncludeConnectingFlights(String includeConnectingFlights) {
        this.includeConnectingFlights = includeConnectingFlights;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public void setAdt(int adt) {
        this.adt = adt;
    }

    public void setChd(int chd) {
        this.chd = chd;
    }

    public void setDateOut(String dateOut) {
        this.dateOut = dateOut;
    }

    public void setExists(String exists) {
        this.exists = exists;
    }

    public void setFlexDaysOut(String flexDaysOut) {
        this.flexDaysOut = flexDaysOut;
    }

    public void setInf(int inf) {
        this.inf = inf;
    }

    public void setPromoCode(String promoCode) {
        this.promoCode = promoCode;
    }

    public void setRoundTrip(String roundTrip) {
        this.roundTrip = roundTrip;
    }

    public void setTeen(int teen) {
        this.teen = teen;
    }

    public void setToUs(String toUs) {
        this.toUs = toUs;
    }
}