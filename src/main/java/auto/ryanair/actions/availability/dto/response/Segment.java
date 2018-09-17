package auto.ryanair.actions.availability.dto.response;

import com.fasterxml.jackson.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "segmentNr",
        "origin",
        "destination",
        "flightNumber",
        "time",
        "timeUTC",
        "duration"
})
public class Segment {
    @JsonProperty("segmentNr")
    private Integer segmentNr;
    @JsonProperty("origin")
    private String origin;
    @JsonProperty("destination")
    private String destination;
    @JsonProperty("flightNumber")
    private String flightNumber;
    @JsonProperty("time")
    private List<String> time = null;
    @JsonProperty("timeUTC")
    private List<String> timeUTC = null;
    @JsonProperty("duration")
    private String duration;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<>();

    @JsonProperty("segmentNr")
    public Integer getSegmentNr() {
        return segmentNr;
    }

    @JsonProperty("segmentNr")
    public void setSegmentNr(Integer segmentNr) {
        this.segmentNr = segmentNr;
    }

    @JsonProperty("origin")
    public String getOrigin() {
        return origin;
    }

    @JsonProperty("origin")
    public void setOrigin(String origin) {
        this.origin = origin;
    }

    @JsonProperty("destination")
    public String getDestination() {
        return destination;
    }

    @JsonProperty("destination")
    public void setDestination(String destination) {
        this.destination = destination;
    }

    @JsonProperty("flightNumber")
    public String getFlightNumber() {
        return flightNumber;
    }

    @JsonProperty("flightNumber")
    public void setFlightNumber(String flightNumber) {
        this.flightNumber = flightNumber;
    }

    @JsonProperty("time")
    public List<String> getTime() {
        return time;
    }

    @JsonProperty("time")
    public void setTime(List<String> time) {
        this.time = time;
    }

    @JsonProperty("timeUTC")
    public List<String> getTimeUTC() {
        return timeUTC;
    }

    @JsonProperty("timeUTC")
    public void setTimeUTC(List<String> timeUTC) {
        this.timeUTC = timeUTC;
    }

    @JsonProperty("duration")
    public String getDuration() {
        return duration;
    }

    @JsonProperty("duration")
    public void setDuration(String duration) {
        this.duration = duration;
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