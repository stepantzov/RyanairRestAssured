package auto.ryanair.body;

import auto.ryanair.dto.request.AvailabilityRequestDto;

public class AvailabilityRequestBody {
    public static AvailabilityRequestDto constructRequestBody(String date, String destination, String origin) {
        return new AvailabilityRequestDto().withdateOut(date).withDestination(destination).withOrigin(origin);
    }
}