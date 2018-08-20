package auto.ryanair.dto.request;

public class FareOptionsRequestDto {
    private String adultsCount;
    private String childrenCount;
    private String infantCount;
    private String teensCount;
    private String outboundFareKey;
    private String outboundFlightKey;

    public FareOptionsRequestDto() {
        this.adultsCount = "1";
        this.childrenCount = "0";
        this.infantCount = "0";
        this.teensCount = "0";
    }

    public String getAdultsCount() {
        return adultsCount;
    }

    public String getChildrenCount() {
        return childrenCount;
    }

    public String getInfantCount() {
        return infantCount;
    }

    public String getOutboundFareKey() {
        return outboundFareKey;
    }

    public String getOutboundFlightKey() {
        return outboundFlightKey;
    }

    public String getTeensCount() {
        return teensCount;
    }

    public FareOptionsRequestDto withOutboundFareKey(String outboundFareKey) {
        this.outboundFareKey = outboundFareKey;
        return this;
    }

    public FareOptionsRequestDto withOutboundFlightKey(String outboundFlightKey) {
        this.outboundFlightKey = outboundFlightKey;
        return this;
    }
}