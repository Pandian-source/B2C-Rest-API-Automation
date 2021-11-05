package Liveapi;

public class Sector {

private String departure_date;
private String destination;
private String destination_near_by_airport;
private String origin;
private String origin_near_by_airport;

public String getDeparture_date() {
return departure_date;
}

public void setDepartureDate(String departureDate) {
this.departure_date = departureDate;
}

public String getDestination() {
return destination;
}

public void setDestination(String destination) {
this.destination = destination;
}

public String getDestination_near_by_airport() {
return destination_near_by_airport;
}

public void setDestinationNearByAirport(String destinationNearByAirport) {
this.destination_near_by_airport = destinationNearByAirport;
}

public String getOrigin() {
return origin;
}

public void setOrigin(String origin) {
this.origin = origin;
}

public String getOrigin_near_by_airport() {
return origin_near_by_airport;
}

public void setOriginNearByAirport(String originNearByAirport) {
this.origin_near_by_airport = originNearByAirport;
}

}