package Liveapi;

import java.util.List;
public class FlightReq {


private String trip_type;
private String currency;
private String cabin;
private List<Sector> sectors = null;
private Passengers passengers;
private ExtraOptions extra_options;
private String shareUrlId;
private String search_type;

public String getTrip_type() {
return trip_type;
}

public void setTripType(String tripType) {
this.trip_type = tripType;
}

public String getCurrency() {
return currency;
}

public void setCurrency(String currency) {
this.currency = currency;
}

public String getCabin() {
return cabin;
}

public void setCabin(String cabin) {
this.cabin = cabin;
}

public List<Sector> getSectors() {
return sectors;
}

public void setSectors(List<Sector> sectors) {
this.sectors = sectors;
}

public Passengers getPassengers() {
return passengers;
}

public void setPassengers(Passengers passengers) {
this.passengers = passengers;
}

public ExtraOptions getExtra_options() {
return extra_options;
}

public void setExtraOptions(ExtraOptions extraOptions) {
this.extra_options = extraOptions;
}

public String getShareUrlId() {
return shareUrlId;
}

public void setShareUrlId(String shareUrlId) {
this.shareUrlId = shareUrlId;
}

public String getSearch_type() {
return search_type;
}

public void setSearchType(String searchType) {
this.search_type = searchType;
}

}