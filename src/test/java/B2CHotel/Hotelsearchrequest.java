package B2CHotel;

import java.util.ArrayList;
import java.util.List;

import org.json.simple.parser.ParseException;
import org.testng.annotations.Test;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;


public class Hotelsearchrequest {

	@Test
	public void Hotelsearch() throws JsonProcessingException, ParseException
	{
		Hotelsearch hotelsearch = new Hotelsearch();	
		HotelRequest hotelrequest = new HotelRequest();
		hotelsearch.setHotelRequest(hotelrequest);
		hotelrequest.setAccountId("dW5kZWZpbmVk");
		hotelrequest.setCurrency("LKR");
		hotelrequest.setSelectionType("travellers_groups");
		hotelrequest.setCheckInDate("2021-04-13");
		hotelrequest.setCheckOutDate("2021-04-16");
		hotelrequest.setCity("Singapore");
		hotelrequest.setNationality("IN");
		hotelrequest.setStateName("Singapore");
		hotelrequest.setState("1");
		hotelrequest.setCountry("SG");
		hotelrequest.setSearchId("161011886800030");
		hotelrequest.setRequest("{\\\"startDatePrevEnable\\\":\\\"\\\",\\\"selectionType\\\":\\\"travellers_groups"
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


		Room rooms1 = new Room();
		rooms1.setAdult(1);
		rooms1.setChild(1);
		rooms1.setNoOfRooms(1);
		ArrayList<Integer>childAgeroom1 = new ArrayList<Integer>();
		childAgeroom1.add(5);
		rooms1.setChildAge(childAgeroom1);

		Room rooms2 = new Room();
		rooms2.setAdult(1);
		rooms2.setChild(1);
		rooms2.setNoOfRooms(1);
		ArrayList<Integer>childAgeroom2 = new ArrayList<Integer>();
		childAgeroom2.add(6);
		rooms2.setChildAge(childAgeroom2);

		Room rooms3 = new Room();
		rooms3.setAdult(1);
		rooms3.setChild(1);
		rooms3.setNoOfRooms(1);
		ArrayList<Integer>childAgeroom3 = new ArrayList<Integer>();
		childAgeroom3.add(7);
		rooms3.setChildAge(childAgeroom3);

		Room rooms4 = new Room();
		rooms4.setAdult(1);
		rooms4.setChild(1);
		rooms4.setNoOfRooms(1);
		ArrayList<Integer>childAgeroom4 = new ArrayList<Integer>();
		childAgeroom4.add(8);
		rooms4.setChildAge(childAgeroom4);

		Room rooms5 = new Room();
		rooms5.setAdult(1);
		rooms5.setChild(1);
		rooms5.setNoOfRooms(1);
		ArrayList<Integer>childAgeroom5 = new ArrayList<Integer>();
		childAgeroom5.add(9);
		rooms5.setChildAge(childAgeroom5);

		Room rooms6 = new Room();
		rooms6.setAdult(1);
		rooms6.setChild(1);
		rooms6.setNoOfRooms(1);
		ArrayList<Integer>childAgeroom6 = new ArrayList<Integer>();
		childAgeroom6.add(10);
		rooms6.setChildAge(childAgeroom6);


		List<Room>allroom = new ArrayList<Room>();
		allroom.add(rooms1);
		allroom.add(rooms2);
		allroom.add(rooms3);
		allroom.add(rooms4);
		allroom.add(rooms5);
		allroom.add(rooms6);
		hotelrequest.setRooms(allroom);


		Gson gson = new GsonBuilder().setPrettyPrinting().create();
		String jsonEmp = gson.toJson(hotelsearch);
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
		String offerid="30820511610";
		if(responseBody.startsWith(offerid));
		{
			System.out.println(offerid.startsWith(offerid));
		}}}
		
