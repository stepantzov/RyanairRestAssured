package auto.ryanair.response;

public class OutboundDatesResponseParser {
    public static void printFirstAvailableFlightDate(String origin, String destination, String firstDate) {
        System.out.format("Available flight date for flight %s - %s is: %s\n", origin,
                destination, firstDate);
    }
}