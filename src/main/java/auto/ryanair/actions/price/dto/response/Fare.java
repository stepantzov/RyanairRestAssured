package auto.ryanair.actions.price.dto.response;

import com.fasterxml.jackson.annotation.*;

import java.util.HashMap;
import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "disc",
        "fat",
        "sold",
        "total",
        "vat",
        "amt",
        "totalWithoutDiscount",
        "code",
        "qty"
})
public class Fare {
    @JsonProperty("disc")
    private Double disc;
    @JsonProperty("fat")
    private Double fat;
    @JsonProperty("sold")
    private Boolean sold;
    @JsonProperty("total")
    private Double total;
    @JsonProperty("vat")
    private Double vat;
    @JsonProperty("amt")
    private Double amt;
    @JsonProperty("totalWithoutDiscount")
    private Double totalWithoutDiscount;
    @JsonProperty("code")
    private String code;
    @JsonProperty("qty")
    private Integer qty;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<>();

    @JsonProperty("disc")
    public Double getDisc() {
        return disc;
    }

    @JsonProperty("disc")
    public void setDisc(Double disc) {
        this.disc = disc;
    }

    @JsonProperty("fat")
    public Double getFat() {
        return fat;
    }

    @JsonProperty("fat")
    public void setFat(Double fat) {
        this.fat = fat;
    }

    @JsonProperty("sold")
    public Boolean getSold() {
        return sold;
    }

    @JsonProperty("sold")
    public void setSold(Boolean sold) {
        this.sold = sold;
    }

    @JsonProperty("total")
    public Double getTotal() {
        return total;
    }

    @JsonProperty("total")
    public void setTotal(Double total) {
        this.total = total;
    }

    @JsonProperty("vat")
    public Double getVat() {
        return vat;
    }

    @JsonProperty("vat")
    public void setVat(Double vat) {
        this.vat = vat;
    }

    @JsonProperty("amt")
    public Double getAmt() {
        return amt;
    }

    @JsonProperty("amt")
    public void setAmt(Double amt) {
        this.amt = amt;
    }

    @JsonProperty("totalWithoutDiscount")
    public Double getTotalWithoutDiscount() {
        return totalWithoutDiscount;
    }

    @JsonProperty("totalWithoutDiscount")
    public void setTotalWithoutDiscount(Double totalWithoutDiscount) {
        this.totalWithoutDiscount = totalWithoutDiscount;
    }

    @JsonProperty("code")
    public String getCode() {
        return code;
    }

    @JsonProperty("code")
    public void setCode(String code) {
        this.code = code;
    }

    @JsonProperty("qty")
    public Integer getQty() {
        return qty;
    }

    @JsonProperty("qty")
    public void setQty(Integer qty) {
        this.qty = qty;
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