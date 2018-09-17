package auto.ryanair.actions.fareOptions.dto.request;

import auto.ryanair.dto.RequestDto;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.util.Map;

public class FareOptionsRequestDto implements RequestDto {
    private static ObjectMapper oMapper = new ObjectMapper();
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

    public Map convertToMap() {
        return oMapper.convertValue(this, Map.class);
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