package auto.ryanair.dto.response.avaliabilityResponseDto;

import com.fasterxml.jackson.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "termsOfUse",
        "currency",
        "currPrecision",
        "trips",
        "serverTimeUTC"
})
public class AvailabilityResponseDto {
    @JsonProperty("termsOfUse")
    private String termsOfUse;
    @JsonProperty("currency")
    private String currency;
    @JsonProperty("currPrecision")
    private Integer currPrecision;
    @JsonProperty("trips")
    private List<Trip> trips = null;
    @JsonProperty("serverTimeUTC")
    private String serverTimeUTC;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("termsOfUse")
    public String getTermsOfUse() {
        return termsOfUse;
    }

    @JsonProperty("termsOfUse")
    public void setTermsOfUse(String termsOfUse) {
        this.termsOfUse = termsOfUse;
    }

    @JsonProperty("currency")
    public String getCurrency() {
        return currency;
    }

    @JsonProperty("currency")
    public void setCurrency(String currency) {
        this.currency = currency;
    }

    @JsonProperty("currPrecision")
    public Integer getCurrPrecision() {
        return currPrecision;
    }

    @JsonProperty("currPrecision")
    public void setCurrPrecision(Integer currPrecision) {
        this.currPrecision = currPrecision;
    }

    @JsonProperty("trips")
    public List<Trip> getTrips() {
        return trips;
    }

    @JsonProperty("trips")
    public void setTrips(List<Trip> trips) {
        this.trips = trips;
    }

    @JsonProperty("serverTimeUTC")
    public String getServerTimeUTC() {
        return serverTimeUTC;
    }

    @JsonProperty("serverTimeUTC")
    public void setServerTimeUTC(String serverTimeUTC) {
        this.serverTimeUTC = serverTimeUTC;
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