package auto.ryanair.actions.availability.dto.response;

import com.fasterxml.jackson.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "origin",
        "originName",
        "destination",
        "destinationName",
        "dates"
})
public class Trip {
    @JsonProperty("origin")
    private String origin;
    @JsonProperty("originName")
    private String originName;
    @JsonProperty("destination")
    private String destination;
    @JsonProperty("destinationName")
    private String destinationName;
    @JsonProperty("dates")
    private List<Date> dates = null;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<>();

    @JsonProperty("origin")
    public String getOrigin() {
        return origin;
    }

    @JsonProperty("origin")
    public void setOrigin(String origin) {
        this.origin = origin;
    }

    @JsonProperty("originName")
    public String getOriginName() {
        return originName;
    }

    @JsonProperty("originName")
    public void setOriginName(String originName) {
        this.originName = originName;
    }

    @JsonProperty("destination")
    public String getDestination() {
        return destination;
    }

    @JsonProperty("destination")
    public void setDestination(String destination) {
        this.destination = destination;
    }

    @JsonProperty("destinationName")
    public String getDestinationName() {
        return destinationName;
    }

    @JsonProperty("destinationName")
    public void setDestinationName(String destinationName) {
        this.destinationName = destinationName;
    }

    @JsonProperty("dates")
    public List<Date> getDates() {
        return dates;
    }

    @JsonProperty("dates")
    public void setDates(List<Date> dates) {
        this.dates = dates;
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