package B2CHotel;

import java.util.ArrayList;
import java.util.List;

import org.testng.annotations.Test;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class traveller {
    @Test
	public void hoteltraveller()
	{
		Hotelsearch hotelsearch1 = new Hotelsearch();	
		HotelRequest hotelrequest1 = new HotelRequest();
		hotelsearch1.setHotelRequest(hotelrequest1);
		hotelrequest1.setAccountId("dW5kZWZpbmVk");
		hotelrequest1.setCurrency("LKR");
		hotelrequest1.setSelectionType("travellers_groups");
		hotelrequest1.setCheckInDate("2021-04-13");
		hotelrequest1.setCheckOutDate("2021-04-16");
		hotelrequest1.setCity("Singapore");
		hotelrequest1.setNationality("IN");
		hotelrequest1.setStateName("Singapore");
		hotelrequest1.setState("1");
		hotelrequest1.setCountry("SG");
		hotelrequest1.setSearchId("161011886800030");
		hotelrequest1.setRequest("{\\\"startDatePrevEnable\\\":\\\"\\\",\\\"selectionType\\\":\\\"travellers_groups"
				+ "\\\",\\\"accountId\\\":[],\\\"city\\\":\\\"Singapore\\\",\\\"state\\\":\\\"Singapore\\\","
				+ "\\\"country\\\":\\\"Singapore\\\",\\\"locationName\\\":\\\"Singapore, Singapore, Singapore"
				+ "\\\",\\\"selectedCity\\\":{\\\"locationName\\\":\\\"Singapore, Singapore, Singapore\\\",\\\"country"
				+ "\\\":\\\"Singapore\\\",\\\"countryCode\\\":\\\"SG\\\",\\\"state\\\":\\\"Singapore\\\",\\\"stateCode"
				+ "\\\":\\\"1\\\",\\\"city\\\":\\\"Singapore\\\",\\\"cityCode\\\":\\\"SIN\\\",\\\"id\\\":\\\"3027\\\"},"
				+ "\\\"startDate\\\":\\\"2021-04-13\\\",\\\"endDate\\\":\\\"2021-04-16\\\",\\\"totalPaxCount\\\":11,"
				+ "\\\"tGrproomCount\\\":6,\\\"displayRoomCount\\\":6,\\\"roomCount\\\":1,\\\"adultCount\\\":1,"
				+ "\\\"childCount\\\":0,\\\"childAges\\\":[],\\\"nationality\\\":{\\\"label\\\":\\\"India\\\","
				+ "\\\"value\\\":\\\"IN\\\"},\\\"travellerGroup\\\":[{\\\"totalPaxCount\\\":2,\\\"adultCount\\\":1,"
				+ "\\\"childCount\\\":1,\\\"childAges\\\":[{\\\"age\\\":5}]},{\\\"totalPaxCount\\\":2,"
				+ "\\\"adultCount\\\":1,\\\"childCount\\\":1,\\\"childAges\\\":[{\\\"age\\\":10}]},"
				+ "{\\\"totalPaxCount\\\":2,\\\"adultCount\\\":1,\\\"childCount\\\":1,\\\"childAges\\\":[{\\\"age\\\":4}]},"
				+ "{\\\"totalPaxCount\\\":1,\\\"adultCount\\\":1,\\\"childCount\\\":0,\\\"childAges\\\":[]},"
				+ "{\\\"totalPaxCount\\\":2,\\\"adultCount\\\":1,\\\"childCount\\\":1,\\\"childAges\\\":[{\\\"age\\\":5}]},"
				+ "{\\\"totalPaxCount\\\":2,\\\"adultCount\\\":1,\\\"childCount\\\":1,\\\"childAges\\\":[{\\\"age\\\":6}]}]}");

        
		Room roomstraveller = new Room();
		roomstraveller.setAdult(2);
		roomstraveller.setChild(1);
		roomstraveller.setNoOfRooms(2);
		ArrayList<Integer>childAgeroom1traveller = new ArrayList<Integer>();
		childAgeroom1traveller.add(5);
		roomstraveller.setChildAge(childAgeroom1traveller);

		List<Room>allroomtraveller = new ArrayList<Room>();
		allroomtraveller.add(roomstraveller);
		hotelrequest1.setRooms(allroomtraveller);

		Gson gson = new GsonBuilder().setPrettyPrinting().create();
		String jsonEmp = gson.toJson(hotelsearch1);
		System.out.println(jsonEmp);

		RestAssured.baseURI ="https://b2b2capi.tltid.com";
		RequestSpecification requestspecification = RestAssured.given();
		requestspecification.header("content-type", "application/json");
		requestspecification.header("Connection", "keep-alive");
		requestspecification.header("portal-origin", "https://b2cui2.tltid.com/lk/");

		requestspecification.body(jsonEmp);
		Response response= requestspecification.request(Method.POST,"/api/hotels/getResults");
		String responseBody = response.getBody().asString();
		System.out.println("Response body is:"+responseBody);
		

	}

}
