package auto.ryanair.requestActions.flight.dto.response;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Fare {
    @SerializedName("disc")
    @Expose
    private Double disc;
    @SerializedName("fat")
    @Expose
    private Double fat;
    @SerializedName("sold")
    @Expose
    private Boolean sold;
    @SerializedName("total")
    @Expose
    private Double total;
    @SerializedName("vat")
    @Expose
    private Double vat;
    @SerializedName("amt")
    @Expose
    private Double amt;
    @SerializedName("totalWithoutDiscount")
    @Expose
    private Double totalWithoutDiscount;
    @SerializedName("code")
    @Expose
    private String code;
    @SerializedName("qty")
    @Expose
    private Integer qty;

    public Double getDisc() {
        return disc;
    }

    public void setDisc(Double disc) {
        this.disc = disc;
    }

    public Double getFat() {
        return fat;
    }

    public void setFat(Double fat) {
        this.fat = fat;
    }

    public Boolean getSold() {
        return sold;
    }

    public void setSold(Boolean sold) {
        this.sold = sold;
    }

    public Double getTotal() {
        return total;
    }

    public void setTotal(Double total) {
        this.total = total;
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

    public Double getTotalWithoutDiscount() {
        return totalWithoutDiscount;
    }

    public void setTotalWithoutDiscount(Double totalWithoutDiscount) {
        this.totalWithoutDiscount = totalWithoutDiscount;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public Integer getQty() {
        return qty;
    }

    public void setQty(Integer qty) {
        this.qty = qty;
    }
}