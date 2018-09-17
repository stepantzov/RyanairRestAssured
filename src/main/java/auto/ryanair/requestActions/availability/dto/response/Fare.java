package auto.ryanair.requestActions.availability.dto.response;

import com.fasterxml.jackson.annotation.*;

import java.util.HashMap;
import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "type",
        "amount",
        "count",
        "hasDiscount",
        "publishedFare",
        "discountInPercent",
        "hasPromoDiscount"
})
public class Fare {
    @JsonProperty("type")
    private String type;
    @JsonProperty("amount")
    private Double amount;
    @JsonProperty("count")
    private Integer count;
    @JsonProperty("hasDiscount")
    private Boolean hasDiscount;
    @JsonProperty("publishedFare")
    private Double publishedFare;
    @JsonProperty("discountInPercent")
    private Integer discountInPercent;
    @JsonProperty("hasPromoDiscount")
    private Boolean hasPromoDiscount;
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

    @JsonProperty("amount")
    public Double getAmount() {
        return amount;
    }

    @JsonProperty("amount")
    public void setAmount(Double amount) {
        this.amount = amount;
    }

    @JsonProperty("count")
    public Integer getCount() {
        return count;
    }

    @JsonProperty("count")
    public void setCount(Integer count) {
        this.count = count;
    }

    @JsonProperty("hasDiscount")
    public Boolean getHasDiscount() {
        return hasDiscount;
    }

    @JsonProperty("hasDiscount")
    public void setHasDiscount(Boolean hasDiscount) {
        this.hasDiscount = hasDiscount;
    }

    @JsonProperty("publishedFare")
    public Double getPublishedFare() {
        return publishedFare;
    }

    @JsonProperty("publishedFare")
    public void setPublishedFare(Double publishedFare) {
        this.publishedFare = publishedFare;
    }

    @JsonProperty("discountInPercent")
    public Integer getDiscountInPercent() {
        return discountInPercent;
    }

    @JsonProperty("discountInPercent")
    public void setDiscountInPercent(Integer discountInPercent) {
        this.discountInPercent = discountInPercent;
    }

    @JsonProperty("hasPromoDiscount")
    public Boolean getHasPromoDiscount() {
        return hasPromoDiscount;
    }

    @JsonProperty("hasPromoDiscount")
    public void setHasPromoDiscount(Boolean hasPromoDiscount) {
        this.hasPromoDiscount = hasPromoDiscount;
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