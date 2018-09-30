package auto.ryanair.requestActions.availability;

import auto.ryanair.requestActions.availability.dto.response.AvailabilityResponseDto;
import auto.ryanair.requestActions.availability.dto.response.Date;
import auto.ryanair.requestActions.availability.dto.response.Flight;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class AvailableFlight {
    private static List<Flight> getFlightsForDate(Date dates) {
        return dates.getFlights();
    }

    private static Map<String, Object> getFirstAvailableOnUpcomingDates(AvailabilityResponseDto availabilityResponseDto) {
        List<Date> dates = Availability.getDates(availabilityResponseDto);
        Map<String, Object> flightDetails = new HashMap<>();

        for (Date tempDate : dates) {
            for (int i = 0; i < tempDate.getFlights().size(); i++) {
                if (getFlightsForDate(tempDate).get(i).getFaresLeft() != 0) {
                    Flight flight = getFlightsForDate(tempDate).get(i);
                    flightDetails.put("dateOut", tempDate);
                    flightDetails.put("flight", flight);

                    return flightDetails;
                }
            }
        }
        return flightDetails;
    }

    public static String getPrice(Flight flight) {
        return flight
                .getRegularFare()
                .getFares().get(0)
                .getAmount().toString();
    }

    public static String getNumber(Flight flight) {
        return flight.getFlightNumber();
    }

    public static String getFareKey(Flight flight) {
        return flight.getRegularFare().getFareKey();
    }

    public static String getFlightKey(Flight flight) {
        return flight.getFlightKey();
    }

    public static Flight getAvailableFlight(AvailabilityResponseDto availabilityResponseDto) {
        Map flightDetailsMap = AvailableFlight.getFirstAvailableOnUpcomingDates(availabilityResponseDto);

        return (Flight) flightDetailsMap.get("flight");
    }

    public static Date getFlightDate(AvailabilityResponseDto availabilityResponseDto) {
        Map flightDetailsMap = AvailableFlight.getFirstAvailableOnUpcomingDates(availabilityResponseDto);

        return (Date) flightDetailsMap.get("dateOut");
    }
}