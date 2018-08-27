package auto.ryanair.dto.request.PriceRequestDto;

import com.fasterxml.jackson.annotation.*;

import java.util.HashMap;
import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "flightKey",
        "fareKey",
        "promoDiscount",
        "fareOption"
})

public class Flight {
    @JsonProperty("flightKey")
    private String flightKey;
    @JsonProperty("fareKey")
    private String fareKey;
    @JsonProperty("promoDiscount")
    private Boolean promoDiscount;
    @JsonProperty("fareOption")
    private String fareOption;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("flightKey")
    public String getFlightKey() {
        return flightKey;
    }

    @JsonProperty("flightKey")
    public void setFlightKey(String flightKey) {
        this.flightKey = flightKey;
    }

    @JsonProperty("fareKey")
    public String getFareKey() {
        return fareKey;
    }

    @JsonProperty("fareKey")
    public void setFareKey(String fareKey) {
        this.fareKey = fareKey;
    }

    @JsonProperty("promoDiscount")
    public Boolean getPromoDiscount() {
        return promoDiscount;
    }

    @JsonProperty("promoDiscount")
    public void setPromoDiscount(Boolean promoDiscount) {
        this.promoDiscount = promoDiscount;
    }

    @JsonProperty("fareOption")
    public String getFareOption() {
        return fareOption;
    }

    @JsonProperty("fareOption")
    public void setFareOption(String fareOption) {
        this.fareOption = fareOption;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }
}