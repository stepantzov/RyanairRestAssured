package auto.ryanair.dto.response.flightResponseDto;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Fat {
    @SerializedName("code")
    @Expose
    private String code;
    @SerializedName("amt")
    @Expose
    private Double amt;

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public Double getAmt() {
        return amt;
    }

    public void setAmt(Double amt) {
        this.amt = amt;
    }
}