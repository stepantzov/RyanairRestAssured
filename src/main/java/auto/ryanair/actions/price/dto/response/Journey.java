package auto.ryanair.actions.price.dto.response;

import com.fasterxml.jackson.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "journeyNum",
        "duration",
        "seatsLeft",
        "fares",
        "infSsrs",
        "fats",
        "fareType",
        "fareClass",
        "checkInOpenUtcDate",
        "checkInCloseUtcDate",
        "changeInfo",
        "mobilebp",
        "segments",
        "maxPaxSeatRowDistance",
        "flt",
        "orig",
        "dest",
        "depart",
        "departUTC",
        "arrive",
        "arriveUTC"
})
public class Journey {
    @JsonProperty("journeyNum")
    private Integer journeyNum;
    @JsonProperty("duration")
    private String duration;
    @JsonProperty("seatsLeft")
    private Integer seatsLeft;
    @JsonProperty("fares")
    private List<Fare> fares = null;
    @JsonProperty("infSsrs")
    private List<Object> infSsrs = null;
    @JsonProperty("fats")
    private List<Object> fats = null;
    @JsonProperty("fareType")
    private String fareType;
    @JsonProperty("fareClass")
    private String fareClass;
    @JsonProperty("checkInOpenUtcDate")
    private String checkInOpenUtcDate;
    @JsonProperty("checkInCloseUtcDate")
    private String checkInCloseUtcDate;
    @JsonProperty("changeInfo")
    private ChangeInfo changeInfo;
    @JsonProperty("mobilebp")
    private Boolean mobilebp;
    @JsonProperty("segments")
    private List<Segment> segments = null;
    @JsonProperty("maxPaxSeatRowDistance")
    private List<MaxPaxSeatRowDistance> maxPaxSeatRowDistance = null;
    @JsonProperty("flt")
    private String flt;
    @JsonProperty("orig")
    private String orig;
    @JsonProperty("dest")
    private String dest;
    @JsonProperty("depart")
    private String depart;
    @JsonProperty("departUTC")
    private String departUTC;
    @JsonProperty("arrive")
    private String arrive;
    @JsonProperty("arriveUTC")
    private String arriveUTC;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<>();

    @JsonProperty("journeyNum")
    public Integer getJourneyNum() {
        return journeyNum;
    }

    @JsonProperty("journeyNum")
    public void setJourneyNum(Integer journeyNum) {
        this.journeyNum = journeyNum;
    }

    @JsonProperty("duration")
    public String getDuration() {
        return duration;
    }

    @JsonProperty("duration")
    public void setDuration(String duration) {
        this.duration = duration;
    }

    @JsonProperty("seatsLeft")
    public Integer getSeatsLeft() {
        return seatsLeft;
    }

    @JsonProperty("seatsLeft")
    public void setSeatsLeft(Integer seatsLeft) {
        this.seatsLeft = seatsLeft;
    }

    @JsonProperty("fares")
    public List<Fare> getFares() {
        return fares;
    }

    @JsonProperty("fares")
    public void setFares(List<Fare> fares) {
        this.fares = fares;
    }

    @JsonProperty("infSsrs")
    public List<Object> getInfSsrs() {
        return infSsrs;
    }

    @JsonProperty("infSsrs")
    public void setInfSsrs(List<Object> infSsrs) {
        this.infSsrs = infSsrs;
    }

    @JsonProperty("fats")
    public List<Object> getFats() {
        return fats;
    }

    @JsonProperty("fats")
    public void setFats(List<Object> fats) {
        this.fats = fats;
    }

    @JsonProperty("fareType")
    public String getFareType() {
        return fareType;
    }

    @JsonProperty("fareType")
    public void setFareType(String fareType) {
        this.fareType = fareType;
    }

    @JsonProperty("fareClass")
    public String getFareClass() {
        return fareClass;
    }

    @JsonProperty("fareClass")
    public void setFareClass(String fareClass) {
        this.fareClass = fareClass;
    }

    @JsonProperty("checkInOpenUtcDate")
    public String getCheckInOpenUtcDate() {
        return checkInOpenUtcDate;
    }

    @JsonProperty("checkInOpenUtcDate")
    public void setCheckInOpenUtcDate(String checkInOpenUtcDate) {
        this.checkInOpenUtcDate = checkInOpenUtcDate;
    }

    @JsonProperty("checkInCloseUtcDate")
    public String getCheckInCloseUtcDate() {
        return checkInCloseUtcDate;
    }

    @JsonProperty("checkInCloseUtcDate")
    public void setCheckInCloseUtcDate(String checkInCloseUtcDate) {
        this.checkInCloseUtcDate = checkInCloseUtcDate;
    }

    @JsonProperty("changeInfo")
    public ChangeInfo getChangeInfo() {
        return changeInfo;
    }

    @JsonProperty("changeInfo")
    public void setChangeInfo(ChangeInfo changeInfo) {
        this.changeInfo = changeInfo;
    }

    @JsonProperty("mobilebp")
    public Boolean getMobilebp() {
        return mobilebp;
    }

    @JsonProperty("mobilebp")
    public void setMobilebp(Boolean mobilebp) {
        this.mobilebp = mobilebp;
    }

    @JsonProperty("segments")
    public List<Segment> getSegments() {
        return segments;
    }

    @JsonProperty("segments")
    public void setSegments(List<Segment> segments) {
        this.segments = segments;
    }

    @JsonProperty("maxPaxSeatRowDistance")
    public List<MaxPaxSeatRowDistance> getMaxPaxSeatRowDistance() {
        return maxPaxSeatRowDistance;
    }

    @JsonProperty("maxPaxSeatRowDistance")
    public void setMaxPaxSeatRowDistance(List<MaxPaxSeatRowDistance> maxPaxSeatRowDistance) {
        this.maxPaxSeatRowDistance = maxPaxSeatRowDistance;
    }

    @JsonProperty("flt")
    public String getFlt() {
        return flt;
    }

    @JsonProperty("flt")
    public void setFlt(String flt) {
        this.flt = flt;
    }

    @JsonProperty("orig")
    public String getOrig() {
        return orig;
    }

    @JsonProperty("orig")
    public void setOrig(String orig) {
        this.orig = orig;
    }

    @JsonProperty("dest")
    public String getDest() {
        return dest;
    }

    @JsonProperty("dest")
    public void setDest(String dest) {
        this.dest = dest;
    }

    @JsonProperty("depart")
    public String getDepart() {
        return depart;
    }

    @JsonProperty("depart")
    public void setDepart(String depart) {
        this.depart = depart;
    }

    @JsonProperty("departUTC")
    public String getDepartUTC() {
        return departUTC;
    }

    @JsonProperty("departUTC")
    public void setDepartUTC(String departUTC) {
        this.departUTC = departUTC;
    }

    @JsonProperty("arrive")
    public String getArrive() {
        return arrive;
    }

    @JsonProperty("arrive")
    public void setArrive(String arrive) {
        this.arrive = arrive;
    }

    @JsonProperty("arriveUTC")
    public String getArriveUTC() {
        return arriveUTC;
    }

    @JsonProperty("arriveUTC")
    public void setArriveUTC(String arriveUTC) {
        this.arriveUTC = arriveUTC;
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