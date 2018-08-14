package auto.ryanair.dto;

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

    public FareOptionsRequestDto build() {
        return new FareOptionsRequestDto(adultsCount, childrenCount, infantCount, teensCount, outboundFareKey,
                outboundFlightKey);
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

    public FareOptionsRequestDto withAdultsCount(String adultsCount) {
        this.adultsCount = adultsCount;
        return this;
    }

    public FareOptionsRequestDto withChildrenCount(String childrenCount) {
        this.childrenCount = childrenCount;
        return this;
    }

    public FareOptionsRequestDto withInfantCount(String infantCount) {
        this.infantCount = infantCount;
        return this;
    }

    public FareOptionsRequestDto withTeensCount(String teensCount) {
        this.teensCount = teensCount;
        return this;
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