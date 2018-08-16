package auto.ryanair.body;

import auto.ryanair.dto.AvailabilityRequestDto;
import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonObject;

public class PriceRequestBody {
    public static String constructRequestBody(String outboundDate, String flightKey,
                                              String fareKey, AvailabilityRequestDto availabilityRequestBody) {
        Gson gson = new Gson();
        JsonObject priceRequestPayload = new JsonObject();
        priceRequestPayload.addProperty("PromoCode", "");
        priceRequestPayload.addProperty("DISC", 0);
        priceRequestPayload.add("OperatedBy", null);
        priceRequestPayload.addProperty("OutboundDate", outboundDate + "Z");
        priceRequestPayload.add("InboundDate", null);

        JsonObject flight = new JsonObject();
        flight.addProperty("flightKey", flightKey);
        flight.addProperty("fareKey", fareKey);
        flight.addProperty("promoDiscount", false);
        flight.addProperty("fareOption", "");

        JsonArray flights = new JsonArray();
        flights.add(flight);

        priceRequestPayload.add("flights", flights);
        priceRequestPayload.addProperty("INF", availabilityRequestBody.getInf());
        priceRequestPayload.addProperty("CHD", availabilityRequestBody.getChd());
        priceRequestPayload.addProperty("ADT", availabilityRequestBody.getAdt());
        priceRequestPayload.addProperty("TEEN", availabilityRequestBody.getTeen());

        return gson.toJson(priceRequestPayload);
    }
}