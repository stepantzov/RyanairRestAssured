package auto.ryanair.dto.response.priceResponseDto;

import com.fasterxml.jackson.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "info",
        "journeys",
        "passengers",
        "extras",
        "addons",
        "fees",
        "serverTimeUTC"
})
public class PriceResponseDto {
    @JsonProperty("info")
    private Info info;
    @JsonProperty("journeys")
    private List<Journey> journeys = null;
    @JsonProperty("passengers")
    private List<Passenger> passengers = null;
    @JsonProperty("extras")
    private List<Object> extras = null;
    @JsonProperty("addons")
    private List<Object> addons = null;
    @JsonProperty("fees")
    private List<Object> fees = null;
    @JsonProperty("serverTimeUTC")
    private String serverTimeUTC;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("info")
    public Info getInfo() {
        return info;
    }

    @JsonProperty("info")
    public void setInfo(Info info) {
        this.info = info;
    }

    @JsonProperty("journeys")
    public List<Journey> getJourneys() {
        return journeys;
    }

    @JsonProperty("journeys")
    public void setJourneys(List<Journey> journeys) {
        this.journeys = journeys;
    }

    @JsonProperty("passengers")
    public List<Passenger> getPassengers() {
        return passengers;
    }

    @JsonProperty("passengers")
    public void setPassengers(List<Passenger> passengers) {
        this.passengers = passengers;
    }

    @JsonProperty("extras")
    public List<Object> getExtras() {
        return extras;
    }

    @JsonProperty("extras")
    public void setExtras(List<Object> extras) {
        this.extras = extras;
    }

    @JsonProperty("addons")
    public List<Object> getAddons() {
        return addons;
    }

    @JsonProperty("addons")
    public void setAddons(List<Object> addons) {
        this.addons = addons;
    }

    @JsonProperty("fees")
    public List<Object> getFees() {
        return fees;
    }

    @JsonProperty("fees")
    public void setFees(List<Object> fees) {
        this.fees = fees;
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