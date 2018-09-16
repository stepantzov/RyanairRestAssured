package auto.ryanair.dto.request;

public interface FlightDto {
    String getFlightKey();

    void setFlightKey(String flightKey);

    String getFareKey();

    void setFareKey(String fareKey);

    Boolean getPromoDiscount();

    void setPromoDiscount(Boolean promoDiscount);

    String getFareOption();

    void setFareOption(String fareOption);
}
