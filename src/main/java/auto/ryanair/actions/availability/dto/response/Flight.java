package auto.ryanair.actions.availability.dto.response;
import com.fasterxml.jackson.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "faresLeft",
        "flightKey",
        "infantsLeft",
        "regularFare",
        "operatedBy",
        "segments",
        "flightNumber",
        "time",
        "timeUTC",
        "duration"
})
public class Flight {

    @JsonProperty("faresLeft")
    private Integer faresLeft;
    @JsonProperty("flightKey")
    private String flightKey;
    @JsonProperty("infantsLeft")
    private Integer infantsLeft;
    @JsonProperty("regularFare")
    private RegularFare regularFare;
    @JsonProperty("operatedBy")
    private String operatedBy;
    @JsonProperty("segments")
    private List<Segment> segments = null;
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

    @JsonProperty("faresLeft")
    public Integer getFaresLeft() {
        return faresLeft;
    }

    @JsonProperty("faresLeft")
    public void setFaresLeft(Integer faresLeft) {
        this.faresLeft = faresLeft;
    }

    @JsonProperty("flightKey")
    public String getFlightKey() {
        return flightKey;
    }

    @JsonProperty("flightKey")
    public void setFlightKey(String flightKey) {
        this.flightKey = flightKey;
    }

    @JsonProperty("infantsLeft")
    public Integer getInfantsLeft() {
        return infantsLeft;
    }

    @JsonProperty("infantsLeft")
    public void setInfantsLeft(Integer infantsLeft) {
        this.infantsLeft = infantsLeft;
    }

    @JsonProperty("regularFare")
    public RegularFare getRegularFare() {
        return regularFare;
    }

    @JsonProperty("regularFare")
    public void setRegularFare(RegularFare regularFare) {
        this.regularFare = regularFare;
    }

    @JsonProperty("operatedBy")
    public String getOperatedBy() {
        return operatedBy;
    }

    @JsonProperty("operatedBy")
    public void setOperatedBy(String operatedBy) {
        this.operatedBy = operatedBy;
    }

    @JsonProperty("segments")
    public List<Segment> getSegments() {
        return segments;
    }

    @JsonProperty("segments")
    public void setSegments(List<Segment> segments) {
        this.segments = segments;
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