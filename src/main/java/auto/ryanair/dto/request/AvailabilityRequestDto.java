package auto.ryanair.dto.request;

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
        this.adt = 1;
        this.chd = 1;
        this.flexDaysOut = "1";
        this.inf = 0;
        this.includeConnectingFlights = "true";
        this.roundTrip = "false";
        this.teen = 0;
        this.toUs = "AGREED";
        this.exists = "false";
        this.promoCode = "";
    }

    public String getDestination() {
        return destination;
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

    public AvailabilityRequestDto withAdt(int adt) {
        this.adt = adt;
        return this;
    }

    public AvailabilityRequestDto withChd(int chd) {
        this.chd = chd;
        return this;
    }

    public AvailabilityRequestDto withdateOut(String dateOut) {
        this.dateOut = dateOut;
        return this;
    }

    public AvailabilityRequestDto withDestination(String destination) {
        this.destination = destination;
        return this;
    }

    public AvailabilityRequestDto withOrigin(String origin) {
        this.origin = origin;
        return this;
    }
}