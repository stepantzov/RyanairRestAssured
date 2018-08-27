package auto.ryanair.dto.request.PriceRequestDto;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PriceRequestDto {
    private Object promoCode;
    private Integer dISC;
    private Object operatedBy;
    private String outboundDate;
    private Object inboundDate;
    private List<Flight> flights = null;
    private Integer iNF;
    private Integer cHD;
    private Integer aDT;
    private Integer tEEN;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    public Object getPromoCode() {
        return promoCode;
    }

    public void setPromoCode(Object promoCode) {
        this.promoCode = promoCode;
    }

    public Integer getDISC() {
        return dISC;
    }

    public void setDISC(Integer dISC) {
        this.dISC = dISC;
    }

    public Object getOperatedBy() {
        return operatedBy;
    }

    public void setOperatedBy(Object operatedBy) {
        this.operatedBy = operatedBy;
    }

    public String getOutboundDate() {
        return outboundDate;
    }

    public void setOutboundDate(String outboundDate) {
        this.outboundDate = outboundDate;
    }

    public Object getInboundDate() {
        return inboundDate;
    }

    public void setInboundDate(Object inboundDate) {
        this.inboundDate = inboundDate;
    }

    public List<Flight> getFlights() {
        return flights;
    }

    public void setFlights(List<Flight> flights) {
        this.flights = flights;
    }

    public Integer getINF() {
        return iNF;
    }

    public void setINF(Integer iNF) {
        this.iNF = iNF;
    }

    public Integer getCHD() {
        return cHD;
    }

    public void setCHD(Integer cHD) {
        this.cHD = cHD;
    }

    public Integer getADT() {
        return aDT;
    }

    public void setADT(Integer aDT) {
        this.aDT = aDT;
    }

    public Integer getTEEN() {
        return tEEN;
    }

    public void setTEEN(Integer tEEN) {
        this.tEEN = tEEN;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

    public String getDtoJsonString(PriceRequestDto priceRequestDto) {
        ObjectMapper objectMapper = new ObjectMapper();
        String jsonString = null;
        try {
            jsonString = objectMapper.writeValueAsString(this);
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }

        return jsonString;
    }
}