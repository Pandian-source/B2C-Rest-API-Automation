package Liveapi;
public class ExtraOptions {

private Boolean direct_flights;
private Boolean free_baggage;
private Boolean avoid_us;
private Boolean near_by_airports;
private Boolean refundable_fares_only;
private Boolean allow_upsale_fare;

public Boolean getDirect_flights() {
return direct_flights;
}

public void setDirectFlights(Boolean directFlights) {
this.direct_flights = directFlights;
}

public Boolean getFree_baggage() {
return free_baggage;
}

public void setFreeBaggage(Boolean freeBaggage) {
this.free_baggage = freeBaggage;
}

public Boolean getAvoid_us() {
return avoid_us;
}

public void setAvoidUs(Boolean avoidUs) {
this.avoid_us = avoidUs;
}

public Boolean getNear_by_airports() {
return near_by_airports;
}

public void setNearByAirports(Boolean nearByAirports) {
this.near_by_airports = nearByAirports;
}

public Boolean getRefundable_fares_only() {
return refundable_fares_only;
}

public void setRefundableFaresOnly(Boolean refundableFaresOnly) {
this.refundable_fares_only = refundableFaresOnly;
}

public Boolean getAllow_upsale_fare() {
return allow_upsale_fare;
}

public void setAllowUpsaleFare(Boolean allowUpsaleFare) {
this.allow_upsale_fare = allowUpsaleFare;
}

}