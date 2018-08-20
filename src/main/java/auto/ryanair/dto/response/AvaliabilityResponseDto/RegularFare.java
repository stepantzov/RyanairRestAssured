package auto.ryanair.dto.response.AvaliabilityResponseDto;
import com.fasterxml.jackson.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "fareKey",
        "fareClass",
        "fares"
})
public class RegularFare {

    @JsonProperty("fareKey")
    private String fareKey;
    @JsonProperty("fareClass")
    private String fareClass;
    @JsonProperty("fares")
    private List<Fare> fares = null;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("fareKey")
    public String getFareKey() {
        return fareKey;
    }

    @JsonProperty("fareKey")
    public void setFareKey(String fareKey) {
        this.fareKey = fareKey;
    }

    @JsonProperty("fareClass")
    public String getFareClass() {
        return fareClass;
    }

    @JsonProperty("fareClass")
    public void setFareClass(String fareClass) {
        this.fareClass = fareClass;
    }

    @JsonProperty("fares")
    public List<Fare> getFares() {
        return fares;
    }

    @JsonProperty("fares")
    public void setFares(List<Fare> fares) {
        this.fares = fares;
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