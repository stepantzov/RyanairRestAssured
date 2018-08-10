package auto.ryanair.urlDefinitions;

import auto.ryanair.utils.PropertiesReaderUtility;

public class UrlDefinitions {
    public static final String loginUrl = PropertiesReaderUtility.getPropertyByName("login.url.base");
    public static final String priceUrl = PropertiesReaderUtility.getPropertyByName("price.url.base");
    public static final String loggedInUrl = PropertiesReaderUtility.getPropertyByName("loggedIn.url.base");

    public static final String outboundDatesUrl = PropertiesReaderUtility.getPropertyByName("outboundDates.url.base") +
            "Calendar?Destination={destination}" +
            "&IncludeConnectingFlights={includeConnectingFlights}" +
            "&IsTwoWay={isTwoWay}" +
            "&Months={months}" +
            "&Origin={origin}" +
            "&StartDate={startDate}";

    public static final String availabilityRequestUrl = PropertiesReaderUtility.getPropertyByName("availabilityRequest.url.base") +
            "availability?" +
            "ADT={adt}" +
            "&CHD={chd}" +
            "&DateOut={dateOut}" +
            "&Destination={destination}" +
            "&FlexDaysOut={flexDaysOut}" +
            "&INF={inf}" +
            "&IncludeConnectingFlights={includeConnectingFlights}" +
            "&Origin={origin}" +
            "&RoundTrip={roundTrip}" +
            "&TEEN={teen}" +
            "&ToUs={toUs}" +
            "&exists={exists}" +
            "&promoCode={promoCode}";

    public static final String fareOptionsUrl = PropertiesReaderUtility.getPropertyByName("fareOptions.url.base") +
            "FareOptions?" +
            "AdultsCount={adultsCount}" +
            "&ChildrenCount={childrenCount}" +
            "&InfantCount={infantCount}" +
            "&TeensCount={teensCount}" +
            "&outboundFareKey={outboundFareKey}" +
            "&outboundFlightKey={outboundFlightKey}";
}