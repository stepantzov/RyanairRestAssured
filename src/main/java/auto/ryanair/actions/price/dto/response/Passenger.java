package auto.ryanair.actions.price.dto.response;

import com.fasterxml.jackson.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "type",
        "paxNum",
        "name",
        "nationality",
        "segPrm",
        "segSsrs",
        "segFees",
        "paxFees",
        "segSeats"
})
public class Passenger {
    @JsonProperty("type")
    private String type;
    @JsonProperty("paxNum")
    private Integer paxNum;
    @JsonProperty("name")
    private Name name;
    @JsonProperty("nationality")
    private String nationality;
    @JsonProperty("segPrm")
    private List<Object> segPrm = null;
    @JsonProperty("segSsrs")
    private List<Object> segSsrs = null;
    @JsonProperty("segFees")
    private List<Object> segFees = null;
    @JsonProperty("paxFees")
    private List<Object> paxFees = null;
    @JsonProperty("segSeats")
    private List<Object> segSeats = null;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<>();

    @JsonProperty("type")
    public String getType() {
        return type;
    }

    @JsonProperty("type")
    public void setType(String type) {
        this.type = type;
    }

    @JsonProperty("paxNum")
    public Integer getPaxNum() {
        return paxNum;
    }

    @JsonProperty("paxNum")
    public void setPaxNum(Integer paxNum) {
        this.paxNum = paxNum;
    }

    @JsonProperty("name")
    public Name getName() {
        return name;
    }

    @JsonProperty("name")
    public void setName(Name name) {
        this.name = name;
    }

    @JsonProperty("nationality")
    public String getNationality() {
        return nationality;
    }

    @JsonProperty("nationality")
    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    @JsonProperty("segPrm")
    public List<Object> getSegPrm() {
        return segPrm;
    }

    @JsonProperty("segPrm")
    public void setSegPrm(List<Object> segPrm) {
        this.segPrm = segPrm;
    }

    @JsonProperty("segSsrs")
    public List<Object> getSegSsrs() {
        return segSsrs;
    }

    @JsonProperty("segSsrs")
    public void setSegSsrs(List<Object> segSsrs) {
        this.segSsrs = segSsrs;
    }

    @JsonProperty("segFees")
    public List<Object> getSegFees() {
        return segFees;
    }

    @JsonProperty("segFees")
    public void setSegFees(List<Object> segFees) {
        this.segFees = segFees;
    }

    @JsonProperty("paxFees")
    public List<Object> getPaxFees() {
        return paxFees;
    }

    @JsonProperty("paxFees")
    public void setPaxFees(List<Object> paxFees) {
        this.paxFees = paxFees;
    }

    @JsonProperty("segSeats")
    public List<Object> getSegSeats() {
        return segSeats;
    }

    @JsonProperty("segSeats")
    public void setSegSeats(List<Object> segSeats) {
        this.segSeats = segSeats;
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