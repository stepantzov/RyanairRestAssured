package auto.ryanair.actions.flight.dto.request;


import auto.ryanair.dto.FlightDto;

public class Flight implements FlightDto {
    private String flightKey;
    private String fareKey;
    private Boolean promoDiscount;
    private String fareOption;

    public Flight() {
        this.promoDiscount = false;
        this.fareOption = "";
    }

    public Flight withFlightKey(String flightKey) {
        this.flightKey = flightKey;
        return this;
    }

    public Flight withFareKey(String fareKey) {
        this.fareKey = fareKey;
        return this;
    }

    public String getFlightKey() {
        return flightKey;
    }

    public void setFlightKey(String flightKey) {
        this.flightKey = flightKey;
    }

    public String getFareKey() {
        return fareKey;
    }

    public void setFareKey(String fareKey) {
        this.fareKey = fareKey;
    }

    @Override
    public Boolean getPromoDiscount() {
        return promoDiscount;
    }

    @Override
    public void setPromoDiscount(Boolean promoDiscount) {
        this.promoDiscount = promoDiscount;
    }

    @Override
    public String getFareOption() {
        return fareOption;
    }

    @Override
    public void setFareOption(String fareOption) {
        this.fareOption = fareOption;
    }
}