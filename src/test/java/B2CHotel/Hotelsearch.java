package B2CHotel;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Hotelsearch {

@SerializedName("hotel_request")
@Expose
private HotelRequest hotelRequest;

public HotelRequest getHotelRequest() {
return hotelRequest;
}

public void setHotelRequest(HotelRequest hotelRequest) {
this.hotelRequest = hotelRequest;
}

}
