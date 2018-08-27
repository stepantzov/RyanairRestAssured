package auto.ryanair.dto.response.flightResponseDto;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Info {
    @SerializedName("pnr")
    @Expose
    private String pnr;
    @SerializedName("status")
    @Expose
    private String status;
    @SerializedName("curr")
    @Expose
    private String curr;
    @SerializedName("currPrecision")
    @Expose
    private Integer currPrecision;
    @SerializedName("isHoldable")
    @Expose
    private Boolean isHoldable;
    @SerializedName("bookingId")
    @Expose
    private Integer bookingId;
    @SerializedName("createdUtcDate")
    @Expose
    private String createdUtcDate;
    @SerializedName("modifiedUtcDate")
    @Expose
    private String modifiedUtcDate;
    @SerializedName("balanceDue")
    @Expose
    private Double balanceDue;
    @SerializedName("isConnectingFlight")
    @Expose
    private Boolean isConnectingFlight;
    @SerializedName("allSeatsAutoAllocated")
    @Expose
    private Boolean allSeatsAutoAllocated;
    @SerializedName("bookingAgent")
    @Expose
    private String bookingAgent;

    public String getPnr() {
        return pnr;
    }

    public void setPnr(String pnr) {
        this.pnr = pnr;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getCurr() {
        return curr;
    }

    public void setCurr(String curr) {
        this.curr = curr;
    }

    public Integer getCurrPrecision() {
        return currPrecision;
    }

    public void setCurrPrecision(Integer currPrecision) {
        this.currPrecision = currPrecision;
    }

    public Boolean getIsHoldable() {
        return isHoldable;
    }

    public void setIsHoldable(Boolean isHoldable) {
        this.isHoldable = isHoldable;
    }

    public Integer getBookingId() {
        return bookingId;
    }

    public void setBookingId(Integer bookingId) {
        this.bookingId = bookingId;
    }

    public String getCreatedUtcDate() {
        return createdUtcDate;
    }

    public void setCreatedUtcDate(String createdUtcDate) {
        this.createdUtcDate = createdUtcDate;
    }

    public String getModifiedUtcDate() {
        return modifiedUtcDate;
    }

    public void setModifiedUtcDate(String modifiedUtcDate) {
        this.modifiedUtcDate = modifiedUtcDate;
    }

    public Double getBalanceDue() {
        return balanceDue;
    }

    public void setBalanceDue(Double balanceDue) {
        this.balanceDue = balanceDue;
    }

    public Boolean getIsConnectingFlight() {
        return isConnectingFlight;
    }

    public void setIsConnectingFlight(Boolean isConnectingFlight) {
        this.isConnectingFlight = isConnectingFlight;
    }

    public Boolean getAllSeatsAutoAllocated() {
        return allSeatsAutoAllocated;
    }

    public void setAllSeatsAutoAllocated(Boolean allSeatsAutoAllocated) {
        this.allSeatsAutoAllocated = allSeatsAutoAllocated;
    }

    public String getBookingAgent() {
        return bookingAgent;
    }

    public void setBookingAgent(String bookingAgent) {
        this.bookingAgent = bookingAgent;
    }
}