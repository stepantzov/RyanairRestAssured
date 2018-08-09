package auto.ryanair.urlDefinitions;

public class UrlDefinitions {
    //need to put into system properties
    public static final String loginUrl = "https://api.ryanair.com/userprofile/rest/api/v1/login";
    public static final String priceUrl = "https://desktopapps.ryanair.com/v4/en-ie/Price";
    public static final String loggedInUrl = "https://api.ryanair.com/userprofile/v2/loggedin";

    public static final String outboundDatesUrl = "https://desktopapps.ryanair.com/v4/" +
            "Calendar?Destination={destination}" +
            "&IncludeConnectingFlights={includeConnectingFlights}" +
            "&IsTwoWay={isTwoWay}" +
            "&Months={months}" +
            "&Origin={origin}" +
            "&StartDate={startDate}";

    public static final String availabilityRequestUrl = "https://desktopapps.ryanair.com/v4/en-ie/" +
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

    public static final String fareOptionsUrl = "https://desktopapps.ryanair.com/v4/en-ie/" +
            "FareOptions?" +
            "AdultsCount={adultsCount}" +
            "&ChildrenCount={childrenCount}" +
            "&InfantCount={infantCount}" +
            "&TeensCount={teensCount}" +
            "&outboundFareKey={outboundFareKey}" +
            "&outboundFlightKey={outboundFlightKey}";
}