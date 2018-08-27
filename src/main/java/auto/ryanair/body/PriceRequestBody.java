package auto.ryanair.body;

import auto.ryanair.dto.request.AvailabilityRequestDto;
import auto.ryanair.dto.request.PriceRequestDto.PriceRequestDto;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonObject;

import java.io.IOException;

public class PriceRequestBody {
    public static String constructRequestJson(String outboundDate, String flightKey, String fareKey,
                                              AvailabilityRequestDto availabilityRequestBody) {

        ObjectMapper mapper = new ObjectMapper();
        Gson gson = new Gson();
        PriceRequestDto priceRequestDto = new PriceRequestDto();
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

        try {
            priceRequestDto = mapper.readValue(gson.toJson(priceRequestPayload), PriceRequestDto.class);
        } catch (IOException e) {
            e.printStackTrace();
        }
//TODO: if DTO is actually needed here?
        return priceRequestDto.getDtoJsonString(priceRequestDto);
    }
}