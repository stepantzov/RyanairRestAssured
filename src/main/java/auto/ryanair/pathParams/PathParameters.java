package auto.ryanair.pathParams;

public class PathParameters {
    public static final String outboundDatesParams =
            "Calendar?Destination={destination}" +
            "&IncludeConnectingFlights={includeConnectingFlights}" +
            "&IsTwoWay={isTwoWay}" +
            "&Months={months}" +
            "&Origin={origin}" +
            "&StartDate={startDate}";

    public static final String availabilityRequestParams =
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

    public static final String flightOptionsParams =
            "FareOptions?" +
            "AdultsCount={adultsCount}" +
            "&ChildrenCount={childrenCount}" +
            "&InfantCount={infantCount}" +
            "&TeensCount={teensCount}" +
            "&outboundFareKey={outboundFareKey}" +
            "&outboundFlightKey={outboundFlightKey}";
}