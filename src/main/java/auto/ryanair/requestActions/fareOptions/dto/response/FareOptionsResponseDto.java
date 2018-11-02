package auto.ryanair.requestActions.fareOptions.dto.response;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class FareOptionsResponseDto {
    @SerializedName("code")
    @Expose
    private String code;
    @SerializedName("vat")
    @Expose
    private Double vat;
    @SerializedName("amt")
    @Expose
    private Double amt;
    @SerializedName("total")
    @Expose
    private Double total;
    @SerializedName("journeyNum")
    @Expose
    private Integer journeyNum;
    @SerializedName("segmentNum")
    @Expose
    private Integer segmentNum;
    @SerializedName("includedSsrs")
    @Expose
    private List<String> includedSsrs = null;
    @SerializedName("totalDiscount")
    @Expose
    private Double totalDiscount;
    @SerializedName("percentageDiscount")
    @Expose
    private Double percentageDiscount;
    @SerializedName("totalWithoutDiscount")
    @Expose
    private Double totalWithoutDiscount;
    @SerializedName("perPerson")
    @Expose
    private PerPerson perPerson;

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public Double getVat() {
        return vat;
    }

    public void setVat(Double vat) {
        this.vat = vat;
    }

    public Double getAmt() {
        return amt;
    }

    public void setAmt(Double amt) {
        this.amt = amt;
    }

    public Double getTotal() {
        return total;
    }

    public void setTotal(Double total) {
        this.total = total;
    }

    public Integer getJourneyNum() {
        return journeyNum;
    }

    public void setJourneyNum(Integer journeyNum) {
        this.journeyNum = journeyNum;
    }

    public Integer getSegmentNum() {
        return segmentNum;
    }

    public void setSegmentNum(Integer segmentNum) {
        this.segmentNum = segmentNum;
    }

    public List<String> getIncludedSsrs() {
        return includedSsrs;
    }

    public void setIncludedSsrs(List<String> includedSsrs) {
        this.includedSsrs = includedSsrs;
    }

    public Double getTotalDiscount() {
        return totalDiscount;
    }

    public void setTotalDiscount(Double totalDiscount) {
        this.totalDiscount = totalDiscount;
    }

    public Double getPercentageDiscount() {
        return percentageDiscount;
    }

    public void setPercentageDiscount(Double percentageDiscount) {
        this.percentageDiscount = percentageDiscount;
    }

    public Double getTotalWithoutDiscount() {
        return totalWithoutDiscount;
    }

    public void setTotalWithoutDiscount(Double totalWithoutDiscount) {
        this.totalWithoutDiscount = totalWithoutDiscount;
    }

    public PerPerson getPerPerson() {
        return perPerson;
    }

    public void setPerPerson(PerPerson perPerson) {
        this.perPerson = perPerson;
    }
}