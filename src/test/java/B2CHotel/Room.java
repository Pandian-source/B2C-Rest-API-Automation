package B2CHotel;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Room {

@SerializedName("no_of_rooms")
@Expose
private Integer noOfRooms;
@SerializedName("adult")
@Expose
private Integer adult;
@SerializedName("child")
@Expose
private Integer child;
@SerializedName("child_age")
@Expose
private List<Integer> childAge = null;

public Integer getNoOfRooms() {
return noOfRooms;
}

public void setNoOfRooms(Integer noOfRooms) {
this.noOfRooms = noOfRooms;
}

public Integer getAdult() {
return adult;
}

public void setAdult(Integer adult) {
this.adult = adult;
}

public Integer getChild() {
return child;
}

public void setChild(Integer child) {
this.child = child;
}

public List<Integer> getChildAge() {
return childAge;
}

public void setChildAge(List<Integer> childAge) {
this.childAge = childAge;
}

}