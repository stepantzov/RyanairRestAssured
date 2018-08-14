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

    public AvailabilityRequestDto build() {
        return new AvailabilityRequestDto(adt, chd, dateOut, destination, flexDaysOut, inf,
                includeConnectingFlights, origin, roundTrip, teen, toUs, exists, promoCode);
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

    public AvailabilityRequestDto withFlexDaysOut(String flexDaysOut) {
        this.flexDaysOut = flexDaysOut;
        return this;
    }

    public AvailabilityRequestDto withInf(int inf) {
        this.inf = inf;
        return this;
    }

    public AvailabilityRequestDto withIncludeConnectingFlights(String includeConnectingFlights) {
        this.includeConnectingFlights = includeConnectingFlights;
        return this;
    }

    public AvailabilityRequestDto withOrigin(String origin) {
        this.origin = origin;
        return this;
    }

    public AvailabilityRequestDto withRoundTrip(String roundTrip) {
        this.roundTrip = roundTrip;
        return this;
    }

    public AvailabilityRequestDto withTeen(int teen) {
        this.teen = teen;
        return this;
    }

    public AvailabilityRequestDto withToUs(String toUs) {
        this.toUs = toUs;
        return this;
    }

    public AvailabilityRequestDto withExists(String exists) {
        this.exists = exists;
        return this;
    }

    public AvailabilityRequestDto withPromoCode(String promoCode) {
        this.promoCode = promoCode;
        return this;
    }
}