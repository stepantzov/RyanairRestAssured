package auto.ryanair.actions.flight.dto.response;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class Passenger {
    @SerializedName("type")
    @Expose
    private String type;
    @SerializedName("paxNum")
    @Expose
    private Integer paxNum;
    @SerializedName("name")
    @Expose
    private Name name;
    @SerializedName("nationality")
    @Expose
    private String nationality;
    @SerializedName("segPrm")
    @Expose
    private List<Object> segPrm = null;
    @SerializedName("segSsrs")
    @Expose
    private List<Object> segSsrs = null;
    @SerializedName("segFees")
    @Expose
    private List<Object> segFees = null;
    @SerializedName("paxFees")
    @Expose
    private List<Object> paxFees = null;
    @SerializedName("segSeats")
    @Expose
    private List<Object> segSeats = null;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Integer getPaxNum() {
        return paxNum;
    }

    public void setPaxNum(Integer paxNum) {
        this.paxNum = paxNum;
    }

    public Name getName() {
        return name;
    }

    public void setName(Name name) {
        this.name = name;
    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public List<Object> getSegPrm() {
        return segPrm;
    }

    public void setSegPrm(List<Object> segPrm) {
        this.segPrm = segPrm;
    }

    public List<Object> getSegSsrs() {
        return segSsrs;
    }

    public void setSegSsrs(List<Object> segSsrs) {
        this.segSsrs = segSsrs;
    }

    public List<Object> getSegFees() {
        return segFees;
    }

    public void setSegFees(List<Object> segFees) {
        this.segFees = segFees;
    }

    public List<Object> getPaxFees() {
        return paxFees;
    }

    public void setPaxFees(List<Object> paxFees) {
        this.paxFees = paxFees;
    }

    public List<Object> getSegSeats() {
        return segSeats;
    }

    public void setSegSeats(List<Object> segSeats) {
        this.segSeats = segSeats;
    }
}