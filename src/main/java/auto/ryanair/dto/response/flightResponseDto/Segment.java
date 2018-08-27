package auto.ryanair.dto.response.flightResponseDto;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Segment {
    @SerializedName("segmentNum")
    @Expose
    private Integer segmentNum;
    @SerializedName("aircraft")
    @Expose
    private String aircraft;
    @SerializedName("flown")
    @Expose
    private Boolean flown;
    @SerializedName("isCancelled")
    @Expose
    private Boolean isCancelled;
    @SerializedName("vatRate")
    @Expose
    private Double vatRate;
    @SerializedName("duration")
    @Expose
    private String duration;
    @SerializedName("flt")
    @Expose
    private String flt;
    @SerializedName("orig")
    @Expose
    private String orig;
    @SerializedName("dest")
    @Expose
    private String dest;
    @SerializedName("depart")
    @Expose
    private String depart;
    @SerializedName("departUTC")
    @Expose
    private String departUTC;
    @SerializedName("arrive")
    @Expose
    private String arrive;
    @SerializedName("arriveUTC")
    @Expose
    private String arriveUTC;

    public Integer getSegmentNum() {
        return segmentNum;
    }

    public void setSegmentNum(Integer segmentNum) {
        this.segmentNum = segmentNum;
    }

    public String getAircraft() {
        return aircraft;
    }

    public void setAircraft(String aircraft) {
        this.aircraft = aircraft;
    }

    public Boolean getFlown() {
        return flown;
    }

    public void setFlown(Boolean flown) {
        this.flown = flown;
    }

    public Boolean getIsCancelled() {
        return isCancelled;
    }

    public void setIsCancelled(Boolean isCancelled) {
        this.isCancelled = isCancelled;
    }

    public Double getVatRate() {
        return vatRate;
    }

    public void setVatRate(Double vatRate) {
        this.vatRate = vatRate;
    }

    public String getDuration() {
        return duration;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }

    public String getFlt() {
        return flt;
    }

    public void setFlt(String flt) {
        this.flt = flt;
    }

    public String getOrig() {
        return orig;
    }

    public void setOrig(String orig) {
        this.orig = orig;
    }

    public String getDest() {
        return dest;
    }

    public void setDest(String dest) {
        this.dest = dest;
    }

    public String getDepart() {
        return depart;
    }

    public void setDepart(String depart) {
        this.depart = depart;
    }

    public String getDepartUTC() {
        return departUTC;
    }

    public void setDepartUTC(String departUTC) {
        this.departUTC = departUTC;
    }

    public String getArrive() {
        return arrive;
    }

    public void setArrive(String arrive) {
        this.arrive = arrive;
    }

    public String getArriveUTC() {
        return arriveUTC;
    }

    public void setArriveUTC(String arriveUTC) {
        this.arriveUTC = arriveUTC;
    }
}
