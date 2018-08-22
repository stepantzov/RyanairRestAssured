package auto.ryanair.dto.response.priceResponseDto;

import com.fasterxml.jackson.annotation.*;

import java.util.HashMap;
import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "isChangeable",
        "freeMove",
        "isChanged"
})
public class ChangeInfo {
    @JsonProperty("isChangeable")
    private Boolean isChangeable;
    @JsonProperty("freeMove")
    private Boolean freeMove;
    @JsonProperty("isChanged")
    private Boolean isChanged;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("isChangeable")
    public Boolean getIsChangeable() {
        return isChangeable;
    }

    @JsonProperty("isChangeable")
    public void setIsChangeable(Boolean isChangeable) {
        this.isChangeable = isChangeable;
    }

    @JsonProperty("freeMove")
    public Boolean getFreeMove() {
        return freeMove;
    }

    @JsonProperty("freeMove")
    public void setFreeMove(Boolean freeMove) {
        this.freeMove = freeMove;
    }

    @JsonProperty("isChanged")
    public Boolean getIsChanged() {
        return isChanged;
    }

    @JsonProperty("isChanged")
    public void setIsChanged(Boolean isChanged) {
        this.isChanged = isChanged;
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