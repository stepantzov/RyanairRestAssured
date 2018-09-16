package auto.ryanair.pathParams;

public class PathParameters {
    public static final String calendarDates =
            "/v4/Calendar?Destination={destination}" +
                    "&IncludeConnectingFlights={includeConnectingFlights}" +
                    "&IsTwoWay={isTwoWay}" +
                    "&Months={months}" +
                    "&Origin={origin}" +
                    "&StartDate={startDate}";

    public static final String availability =
            "/v4/en-ie/availability?" +
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

    public static final String fareOptionsParameters =
            "/v4/en-ie/FareOptions?" +
                    "AdultsCount={adultsCount}" +
                    "&ChildrenCount={childrenCount}" +
                    "&InfantCount={infantCount}" +
                    "&TeensCount={teensCount}" +
                    "&outboundFareKey={outboundFareKey}" +
                    "&outboundFlightKey={outboundFlightKey}";
}