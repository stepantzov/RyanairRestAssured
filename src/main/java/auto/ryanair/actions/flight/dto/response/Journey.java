package auto.ryanair.actions.flight.dto.response;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class Journey {
    @SerializedName("journeyNum")
    @Expose
    private Integer journeyNum;
    @SerializedName("duration")
    @Expose
    private String duration;
    @SerializedName("seatsLeft")
    @Expose
    private Integer seatsLeft;
    @SerializedName("fares")
    @Expose
    private List<Fare> fares = null;
    @SerializedName("infSsrs")
    @Expose
    private List<Object> infSsrs = null;
    @SerializedName("fats")
    @Expose
    private List<Fat> fats = null;
    @SerializedName("fareType")
    @Expose
    private String fareType;
    @SerializedName("fareClass")
    @Expose
    private String fareClass;
    @SerializedName("checkInOpenUtcDate")
    @Expose
    private String checkInOpenUtcDate;
    @SerializedName("checkInCloseUtcDate")
    @Expose
    private String checkInCloseUtcDate;
    @SerializedName("changeInfo")
    @Expose
    private ChangeInfo changeInfo;
    @SerializedName("mobilebp")
    @Expose
    private Boolean mobilebp;
    @SerializedName("segments")
    @Expose
    private List<Segment> segments = null;
    @SerializedName("maxPaxSeatRowDistance")
    @Expose
    private List<MaxPaxSeatRowDistance> maxPaxSeatRowDistance = null;
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

    public Integer getJourneyNum() {
        return journeyNum;
    }

    public void setJourneyNum(Integer journeyNum) {
        this.journeyNum = journeyNum;
    }

    public String getDuration() {
        return duration;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }

    public Integer getSeatsLeft() {
        return seatsLeft;
    }

    public void setSeatsLeft(Integer seatsLeft) {
        this.seatsLeft = seatsLeft;
    }

    public List<Fare> getFares() {
        return fares;
    }

    public void setFares(List<Fare> fares) {
        this.fares = fares;
    }

    public List<Object> getInfSsrs() {
        return infSsrs;
    }

    public void setInfSsrs(List<Object> infSsrs) {
        this.infSsrs = infSsrs;
    }

    public List<Fat> getFats() {
        return fats;
    }

    public void setFats(List<Fat> fats) {
        this.fats = fats;
    }

    public String getFareType() {
        return fareType;
    }

    public void setFareType(String fareType) {
        this.fareType = fareType;
    }

    public String getFareClass() {
        return fareClass;
    }

    public void setFareClass(String fareClass) {
        this.fareClass = fareClass;
    }

    public String getCheckInOpenUtcDate() {
        return checkInOpenUtcDate;
    }

    public void setCheckInOpenUtcDate(String checkInOpenUtcDate) {
        this.checkInOpenUtcDate = checkInOpenUtcDate;
    }

    public String getCheckInCloseUtcDate() {
        return checkInCloseUtcDate;
    }

    public void setCheckInCloseUtcDate(String checkInCloseUtcDate) {
        this.checkInCloseUtcDate = checkInCloseUtcDate;
    }

    public ChangeInfo getChangeInfo() {
        return changeInfo;
    }

    public void setChangeInfo(ChangeInfo changeInfo) {
        this.changeInfo = changeInfo;
    }

    public Boolean getMobilebp() {
        return mobilebp;
    }

    public void setMobilebp(Boolean mobilebp) {
        this.mobilebp = mobilebp;
    }

    public List<Segment> getSegments() {
        return segments;
    }

    public void setSegments(List<Segment> segments) {
        this.segments = segments;
    }

    public List<MaxPaxSeatRowDistance> getMaxPaxSeatRowDistance() {
        return maxPaxSeatRowDistance;
    }

    public void setMaxPaxSeatRowDistance(List<MaxPaxSeatRowDistance> maxPaxSeatRowDistance) {
        this.maxPaxSeatRowDistance = maxPaxSeatRowDistance;
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