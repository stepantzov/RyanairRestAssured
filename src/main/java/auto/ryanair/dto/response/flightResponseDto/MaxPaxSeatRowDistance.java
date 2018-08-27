package auto.ryanair.dto.response.flightResponseDto;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class MaxPaxSeatRowDistance {
    @SerializedName("segmentNum")
    @Expose
    private Integer segmentNum;
    @SerializedName("rowDistance")
    @Expose
    private Integer rowDistance;

    public Integer getSegmentNum() {
        return segmentNum;
    }

    public void setSegmentNum(Integer segmentNum) {
        this.segmentNum = segmentNum;
    }

    public Integer getRowDistance() {
        return rowDistance;
    }

    public void setRowDistance(Integer rowDistance) {
        this.rowDistance = rowDistance;
    }
}
