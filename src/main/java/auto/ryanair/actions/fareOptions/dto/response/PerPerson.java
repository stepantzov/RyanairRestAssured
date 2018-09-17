package auto.ryanair.actions.fareOptions.dto.response;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class PerPerson {
    @SerializedName("amt")
    @Expose
    private Double amt;
    @SerializedName("total")
    @Expose
    private Double total;
    @SerializedName("totalWithoutDiscount")
    @Expose
    private Double totalWithoutDiscount;
    @SerializedName("vat")
    @Expose
    private Double vat;

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

    public Double getTotalWithoutDiscount() {
        return totalWithoutDiscount;
    }

    public void setTotalWithoutDiscount(Double totalWithoutDiscount) {
        this.totalWithoutDiscount = totalWithoutDiscount;
    }

    public Double getVat() {
        return vat;
    }

    public void setVat(Double vat) {
        this.vat = vat;
    }
}