package auto.ryanair.dto.response.priceResponseDto;

import com.fasterxml.jackson.annotation.*;

import java.util.HashMap;
import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "segmentNum",
        "aircraft",
        "flown",
        "isCancelled",
        "vatRate",
        "duration",
        "flt",
        "orig",
        "dest",
        "depart",
        "departUTC",
        "arrive",
        "arriveUTC"
})
public class Segment {
    @JsonProperty("segmentNum")
    private Integer segmentNum;
    @JsonProperty("aircraft")
    private String aircraft;
    @JsonProperty("flown")
    private Boolean flown;
    @JsonProperty("isCancelled")
    private Boolean isCancelled;
    @JsonProperty("vatRate")
    private Double vatRate;
    @JsonProperty("duration")
    private String duration;
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
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("segmentNum")
    public Integer getSegmentNum() {
        return segmentNum;
    }

    @JsonProperty("segmentNum")
    public void setSegmentNum(Integer segmentNum) {
        this.segmentNum = segmentNum;
    }

    @JsonProperty("aircraft")
    public String getAircraft() {
        return aircraft;
    }

    @JsonProperty("aircraft")
    public void setAircraft(String aircraft) {
        this.aircraft = aircraft;
    }

    @JsonProperty("flown")
    public Boolean getFlown() {
        return flown;
    }

    @JsonProperty("flown")
    public void setFlown(Boolean flown) {
        this.flown = flown;
    }

    @JsonProperty("isCancelled")
    public Boolean getIsCancelled() {
        return isCancelled;
    }

    @JsonProperty("isCancelled")
    public void setIsCancelled(Boolean isCancelled) {
        this.isCancelled = isCancelled;
    }

    @JsonProperty("vatRate")
    public Double getVatRate() {
        return vatRate;
    }

    @JsonProperty("vatRate")
    public void setVatRate(Double vatRate) {
        this.vatRate = vatRate;
    }

    @JsonProperty("duration")
    public String getDuration() {
        return duration;
    }

    @JsonProperty("duration")
    public void setDuration(String duration) {
        this.duration = duration;
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