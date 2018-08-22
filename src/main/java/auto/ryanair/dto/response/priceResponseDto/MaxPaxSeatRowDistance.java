package auto.ryanair.dto.response.priceResponseDto;

import com.fasterxml.jackson.annotation.*;

import java.util.HashMap;
import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "segmentNum",
        "rowDistance"
})
public class MaxPaxSeatRowDistance {
    @JsonProperty("segmentNum")
    private Integer segmentNum;
    @JsonProperty("rowDistance")
    private Integer rowDistance;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("segmentNum")
    public Integer getSegmentNum() {
        return segmentNum;
    }

    @JsonProperty("segmentNum")
    public void setSegmentNum(Integer segmentNum) {
        this.segmentNum = segmentNum;
    }

    @JsonProperty("rowDistance")
    public Integer getRowDistance() {
        return rowDistance;
    }

    @JsonProperty("rowDistance")
    public void setRowDistance(Integer rowDistance) {
        this.rowDistance = rowDistance;
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