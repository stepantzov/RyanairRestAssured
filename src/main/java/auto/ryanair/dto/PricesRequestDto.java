package auto.ryanair.dto;

public class PricesRequestDto {
    private String adt;
    private String chd;
    private String dateOut;
    private String destination;
    private String flexDaysOut;
    private String inf;
    private String includeConnectingFlights;
    private String origin;
    private String roundTrip;
    private String teen;
    private String toUs;
    private String exists;
    private String promoCode;

    public PricesRequestDto() {
    }

    public PricesRequestDto(String adt, String chd, String dateOut, String destination, String flexDaysOut,
                            String inf, String includeConnectingFlights, String origin, String roundTrip,
                            String teen, String toUs, String exists, String promoCode) {
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

    public String getInf() {
        return inf;
    }

    public String getOrigin() {
        return origin;
    }

    public String getAdt() {
        return adt;
    }

    public String getIncludeConnectingFlights() {
        return includeConnectingFlights;
    }

    public String getChd() {
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

    public String getTeen() {
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

    public void setAdt(String adt) {
        this.adt = adt;
    }

    public void setChd(String chd) {
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

    public void setInf(String inf) {
        this.inf = inf;
    }

    public void setPromoCode(String promoCode) {
        this.promoCode = promoCode;
    }

    public void setRoundTrip(String roundTrip) {
        this.roundTrip = roundTrip;
    }

    public void setTeen(String teen) {
        this.teen = teen;
    }

    public void setToUs(String toUs) {
        this.toUs = toUs;
    }
}