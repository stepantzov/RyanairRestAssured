package auto.ryanair.requestActions.flight.dto.response;


import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class FlightResponseDto {
    @SerializedName("info")
    @Expose
    private Info info;
    @SerializedName("journeys")
    @Expose
    private List<Journey> journeys = null;
    @SerializedName("passengers")
    @Expose
    private List<Passenger> passengers = null;
    @SerializedName("extras")
    @Expose
    private List<Object> extras = null;
    @SerializedName("addons")
    @Expose
    private List<Object> addons = null;
    @SerializedName("fees")
    @Expose
    private List<Object> fees = null;
    @SerializedName("serverTimeUTC")
    @Expose
    private String serverTimeUTC;

    public Info getInfo() {
        return info;
    }

    public void setInfo(Info info) {
        this.info = info;
    }

    public List<Journey> getJourneys() {
        return journeys;
    }

    public void setJourneys(List<Journey> journeys) {
        this.journeys = journeys;
    }

    public List<Passenger> getPassengers() {
        return passengers;
    }

    public void setPassengers(List<Passenger> passengers) {
        this.passengers = passengers;
    }

    public List<Object> getExtras() {
        return extras;
    }

    public void setExtras(List<Object> extras) {
        this.extras = extras;
    }

    public List<Object> getAddons() {
        return addons;
    }

    public void setAddons(List<Object> addons) {
        this.addons = addons;
    }

    public List<Object> getFees() {
        return fees;
    }

    public void setFees(List<Object> fees) {
        this.fees = fees;
    }

    public String getServerTimeUTC() {
        return serverTimeUTC;
    }

    public void setServerTimeUTC(String serverTimeUTC) {
        this.serverTimeUTC = serverTimeUTC;
    }
}