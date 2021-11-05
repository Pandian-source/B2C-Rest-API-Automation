package B2CHotel;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class HotelRequest {

@SerializedName("account_id")
@Expose
private String accountId;
@SerializedName("currency")
@Expose
private String currency;
@SerializedName("selection_type")
@Expose
private String selectionType;
@SerializedName("check_in_date")
@Expose
private String checkInDate;
@SerializedName("check_out_date")
@Expose
private String checkOutDate;
@SerializedName("city")
@Expose
private String city;
@SerializedName("nationality")
@Expose
private String nationality;
@SerializedName("state_name")
@Expose
private String stateName;
@SerializedName("state")
@Expose
private String state;
@SerializedName("country")
@Expose
private String country;
@SerializedName("search_id")
@Expose
private String searchId;
@SerializedName("rooms")
@Expose
private List<Room> rooms = null;
@SerializedName("request")
@Expose
private String request;

public String getAccountId() {
return accountId;
}

public void setAccountId(String accountId) {
this.accountId = accountId;
}

public String getCurrency() {
return currency;
}

public void setCurrency(String currency) {
this.currency = currency;
}

public String getSelectionType() {
return selectionType;
}

public void setSelectionType(String selectionType) {
this.selectionType = selectionType;
}

public String getCheckInDate() {
return checkInDate;
}

public void setCheckInDate(String checkInDate) {
this.checkInDate = checkInDate;
}

public String getCheckOutDate() {
return checkOutDate;
}

public void setCheckOutDate(String checkOutDate) {
this.checkOutDate = checkOutDate;
}

public String getCity() {
return city;
}

public void setCity(String city) {
this.city = city;
}

public String getNationality() {
return nationality;
}

public void setNationality(String nationality) {
this.nationality = nationality;
}

public String getStateName() {
return stateName;
}

public void setStateName(String stateName) {
this.stateName = stateName;
}

public String getState() {
return state;
}

public void setState(String state) {
this.state = state;
}

public String getCountry() {
return country;
}

public void setCountry(String country) {
this.country = country;
}

public String getSearchId() {
return searchId;
}

public void setSearchId(String searchId) {
this.searchId = searchId;
}

public List<Room> getRooms() {
return rooms;
}

public void setRooms(List<Room> rooms) {
this.rooms = rooms;
}

public String getRequest() {
return request;
}

public void setRequest(String request) {
this.request = request;
}
	
}

