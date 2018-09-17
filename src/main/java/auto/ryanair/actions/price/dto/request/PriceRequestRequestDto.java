package auto.ryanair.actions.price.dto.request;


import auto.ryanair.dto.RequestDto;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PriceRequestRequestDto implements RequestDto {
    private Object promoCode;
    private Integer disc;
    private Object operatedBy;
    private String outboundDate;
    private String inboundDate;
    private List<Flight> flights = null;
    private Integer inf;
    private Integer chd;
    private Integer adt;
    private Integer teen;

    public PriceRequestRequestDto() {
        this.promoCode = "";
        this.disc = 0;
        this.operatedBy = null;
        this.inboundDate = null;
        this.inf = 0;
        this.chd = 0;
        this.adt = 1;
        this.teen = 0;
    }

    public PriceRequestRequestDto withFlights(String fareKey, String flightKey) {
        this.flights = new ArrayList<>(Arrays.asList(new Flight()
                .withFareKey(fareKey)
                .withFlightKey(flightKey)));

        return this;
    }

    public PriceRequestRequestDto withOutboundDate(String outboundDate) {
        this.outboundDate = outboundDate;

        return this;
    }
}