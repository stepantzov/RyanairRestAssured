package auto.ryanair.body;

import auto.ryanair.dto.AvailabilityRequestDto;

public class AvailabilityRequestBody {
    public static AvailabilityRequestDto constructRequestBody(String date, String destination, String origin) {
        return new AvailabilityRequestDto(
                1,
                0,
                date,
                destination,
                "1",
                0,
                "true",
                origin,
                "false",
                0,
                "AGREED",
                "false",
                "");
    }
}