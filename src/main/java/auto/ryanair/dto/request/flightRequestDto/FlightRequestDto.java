package auto.ryanair.dto.request.flightRequestDto;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FlightRequestDto {
    private String inf;
    private String chd;
    private String adt;
    private String teen;
    private String disc;
    private List<Flight> flights = null;

    public FlightRequestDto() {
        this.inf = "0";
        this.chd = "0";
        this.adt = "1";
        this.teen = "0";
        this.disc = "";
    }

    public List<Flight> getFlights() {
        return flights;
    }

    public void setFlights(List<Flight> flights) {
        this.flights = flights;
    }

    public FlightRequestDto withFlights(String fareKey, String flightKey) {
        List<Flight> flightList = new ArrayList<>(Arrays.asList(new Flight()
                .withFareKey(fareKey)
                .withFlightKey(flightKey)));
        this.flights = flightList;

        return this;
    }
}