package auto.ryanair.requestActions.price.restAssuredRequest;

import auto.ryanair.requestActions.price.dto.request.PriceRequestRequestDto;
import auto.ryanair.requestActions.price.dto.response.PriceResponseDto;
import auto.ryanair.setup.requests.RequestSpecification;
import auto.ryanair.utils.Properties;

import static io.restassured.RestAssured.basePath;

public class PriceRequest {
    private static final String pricePath = "/v4/en-ie/Price";

    public static PriceResponseDto getResponseDto(PriceRequestRequestDto priceRequestDto) {
        basePath = Properties.get("base.url").concat(pricePath);

        return RequestSpecification.postWithJsonBody(priceRequestDto, basePath).as(PriceResponseDto.class);
    }
}