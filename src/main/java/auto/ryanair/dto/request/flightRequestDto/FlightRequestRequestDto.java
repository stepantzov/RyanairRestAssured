package auto.ryanair.dto.request.flightRequestDto;

import auto.ryanair.dto.request.RequestDto;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FlightRequestRequestDto implements RequestDto {
    private String inf;
    private String chd;
    private String adt;
    private String teen;
    private String disc;
    private List<Flight> flights = null;

    public FlightRequestRequestDto() {
        this.inf = "0";
        this.chd = "0";
        this.adt = "1";
        this.teen = "0";
        this.disc = "";
    }

    public List<Flight> getFlights() {
        return flights;
    }

    public FlightRequestRequestDto withFlights(String fareKey, String flightKey) {
        this.flights = new ArrayList<>(Arrays.asList(new Flight()
                .withFareKey(fareKey)
                .withFlightKey(flightKey)));

        return this;
    }
}