package auto.ryanair.requestActions.flight.dto.response;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class ChangeInfo {
    @SerializedName("isChangeable")
    @Expose
    private Boolean isChangeable;
    @SerializedName("freeMove")
    @Expose
    private Boolean freeMove;
    @SerializedName("isChanged")
    @Expose
    private Boolean isChanged;

    public Boolean getIsChangeable() {
        return isChangeable;
    }

    public void setIsChangeable(Boolean isChangeable) {
        this.isChangeable = isChangeable;
    }

    public Boolean getFreeMove() {
        return freeMove;
    }

    public void setFreeMove(Boolean freeMove) {
        this.freeMove = freeMove;
    }

    public Boolean getIsChanged() {
        return isChanged;
    }

    public void setIsChanged(Boolean isChanged) {
        this.isChanged = isChanged;
    }
}