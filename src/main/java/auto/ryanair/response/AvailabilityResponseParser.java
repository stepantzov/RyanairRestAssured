package auto.ryanair.response;

import auto.ryanair.utils.RedundantCharacterRemove;
import io.restassured.response.Response;
import org.apache.commons.lang3.StringUtils;

public class AvailabilityResponseParser {
    public static String getPriceForClosestDate(Response availabilityResponse) {
        return RedundantCharacterRemove.removeSpacesBracketsComas(
                availabilityResponse.jsonPath().getString("trips.dates.flights.regularFare.fares.amount"));
    }

    public static String getAvailableFlightNumber(Response availabilityResponse) {
        return RedundantCharacterRemove.removeSpacesBracketsComas(
                availabilityResponse.jsonPath().getString("trips.dates.flights.segments.flightNumber"));
    }

    public static String getOutboundFareKey(Response availabilityResponse) {
        return RedundantCharacterRemove.removeSpacesBracketsComas(
                availabilityResponse.jsonPath().getString("trips.dates.flights.regularFare.fareKey"));
    }

    public static String getOutboundFlightKey(Response availabilityResponse) {
        String outboundFlightKeyRaw = RedundantCharacterRemove.removeBracketsOnly(
                availabilityResponse.jsonPath().getString("trips.dates.flights.flightKey"));

        return StringUtils.chop(outboundFlightKeyRaw);
    }

    public static String getOutboundDateFullFormat(Response availabilityResponse) {
        return availabilityResponse.jsonPath().getString("trips.dates[0].dateOut[0]");
    }
}