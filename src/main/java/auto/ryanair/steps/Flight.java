package auto.ryanair.steps;

import auto.ryanair.dto.request.flightRequestDto.FlightRequestDto;
import auto.ryanair.dto.response.flightResponseDto.FlightResponseDto;
import auto.ryanair.requests.FlightRequest;
import com.google.gson.Gson;

public class Flight {
    public static FlightResponseDto getResponse(String flightKey, String fareKey) {
        FlightRequestDto flightRequestDto = new FlightRequestDto().withFlights(fareKey, flightKey);
        Gson gson = new Gson();
        String flightRequestDtoJsonString = gson.toJson(flightRequestDto);

        return FlightRequest.getResponseDto(flightRequestDtoJsonString);
    }
}