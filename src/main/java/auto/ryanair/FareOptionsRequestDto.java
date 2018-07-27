package auto.ryanair;

public class FareOptionsRequestDto {
    private String adultsCount;
    private String childrenCount;
    private String infantCount;
    private String teensCount;
    private String outboundFareKey;
    private String outboundFlightKey;

    public FareOptionsRequestDto() {
    }

    public FareOptionsRequestDto(String adultsCount, String childrenCount, String infantCount, String teensCount,
                                 String outboundFareKey, String outboundFlightKey) {
        this.adultsCount = adultsCount;
        this.childrenCount = childrenCount;
        this.infantCount = infantCount;
        this.teensCount = teensCount;
        this.outboundFareKey = outboundFareKey;
        this.outboundFlightKey = outboundFlightKey;
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

    public void setAdultsCount(String adultsCount) {
        this.adultsCount = adultsCount;
    }

    public void setChildrenCount(String childrenCount) {
        this.childrenCount = childrenCount;
    }

    public void setInfantCount(String infantCount) {
        this.infantCount = infantCount;
    }

    public void setOutboundFareKey(String outboundFareKey) {
        this.outboundFareKey = outboundFareKey;
    }

    public void setOutboundFlightKey(String outboundFlightKey) {
        this.outboundFlightKey = outboundFlightKey;
    }

    public void setTeensCount(String teensCount) {
        this.teensCount = teensCount;
    }
}