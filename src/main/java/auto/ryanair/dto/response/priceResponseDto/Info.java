package auto.ryanair.dto.response.priceResponseDto;

import com.fasterxml.jackson.annotation.*;

import java.util.HashMap;
import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "pnr",
        "status",
        "curr",
        "currPrecision",
        "isHoldable",
        "bookingId",
        "createdUtcDate",
        "modifiedUtcDate",
        "balanceDue",
        "isConnectingFlight",
        "allSeatsAutoAllocated",
        "bookingAgent"
})
public class Info {
    @JsonProperty("pnr")
    private String pnr;
    @JsonProperty("status")
    private String status;
    @JsonProperty("curr")
    private String curr;
    @JsonProperty("currPrecision")
    private Integer currPrecision;
    @JsonProperty("isHoldable")
    private Boolean isHoldable;
    @JsonProperty("bookingId")
    private Integer bookingId;
    @JsonProperty("createdUtcDate")
    private String createdUtcDate;
    @JsonProperty("modifiedUtcDate")
    private String modifiedUtcDate;
    @JsonProperty("balanceDue")
    private Double balanceDue;
    @JsonProperty("isConnectingFlight")
    private Boolean isConnectingFlight;
    @JsonProperty("allSeatsAutoAllocated")
    private Boolean allSeatsAutoAllocated;
    @JsonProperty("bookingAgent")
    private String bookingAgent;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("pnr")
    public String getPnr() {
        return pnr;
    }

    @JsonProperty("pnr")
    public void setPnr(String pnr) {
        this.pnr = pnr;
    }

    @JsonProperty("status")
    public String getStatus() {
        return status;
    }

    @JsonProperty("status")
    public void setStatus(String status) {
        this.status = status;
    }

    @JsonProperty("curr")
    public String getCurr() {
        return curr;
    }

    @JsonProperty("curr")
    public void setCurr(String curr) {
        this.curr = curr;
    }

    @JsonProperty("currPrecision")
    public Integer getCurrPrecision() {
        return currPrecision;
    }

    @JsonProperty("currPrecision")
    public void setCurrPrecision(Integer currPrecision) {
        this.currPrecision = currPrecision;
    }

    @JsonProperty("isHoldable")
    public Boolean getIsHoldable() {
        return isHoldable;
    }

    @JsonProperty("isHoldable")
    public void setIsHoldable(Boolean isHoldable) {
        this.isHoldable = isHoldable;
    }

    @JsonProperty("bookingId")
    public Integer getBookingId() {
        return bookingId;
    }

    @JsonProperty("bookingId")
    public void setBookingId(Integer bookingId) {
        this.bookingId = bookingId;
    }

    @JsonProperty("createdUtcDate")
    public String getCreatedUtcDate() {
        return createdUtcDate;
    }

    @JsonProperty("createdUtcDate")
    public void setCreatedUtcDate(String createdUtcDate) {
        this.createdUtcDate = createdUtcDate;
    }

    @JsonProperty("modifiedUtcDate")
    public String getModifiedUtcDate() {
        return modifiedUtcDate;
    }

    @JsonProperty("modifiedUtcDate")
    public void setModifiedUtcDate(String modifiedUtcDate) {
        this.modifiedUtcDate = modifiedUtcDate;
    }

    @JsonProperty("balanceDue")
    public Double getBalanceDue() {
        return balanceDue;
    }

    @JsonProperty("balanceDue")
    public void setBalanceDue(Double balanceDue) {
        this.balanceDue = balanceDue;
    }

    @JsonProperty("isConnectingFlight")
    public Boolean getIsConnectingFlight() {
        return isConnectingFlight;
    }

    @JsonProperty("isConnectingFlight")
    public void setIsConnectingFlight(Boolean isConnectingFlight) {
        this.isConnectingFlight = isConnectingFlight;
    }

    @JsonProperty("allSeatsAutoAllocated")
    public Boolean getAllSeatsAutoAllocated() {
        return allSeatsAutoAllocated;
    }

    @JsonProperty("allSeatsAutoAllocated")
    public void setAllSeatsAutoAllocated(Boolean allSeatsAutoAllocated) {
        this.allSeatsAutoAllocated = allSeatsAutoAllocated;
    }

    @JsonProperty("bookingAgent")
    public String getBookingAgent() {
        return bookingAgent;
    }

    @JsonProperty("bookingAgent")
    public void setBookingAgent(String bookingAgent) {
        this.bookingAgent = bookingAgent;
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