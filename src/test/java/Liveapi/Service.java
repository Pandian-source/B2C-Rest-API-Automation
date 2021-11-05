package Liveapi;
import java.util.ArrayList;
import java.util.List;

import org.json.simple.parser.ParseException;
import org.testng.annotations.Test;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import Liveapi.ExtraOptions;
import Liveapi.Firstapitest;
import Liveapi.FlightReq;
import Liveapi.Passengers;
import Liveapi.Sector;
import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
public class Service {
	
@Test
public void firstapitest() throws JsonProcessingException, ParseException
	{
		Firstapitest firstapitest = new Firstapitest();	
	    FlightReq flightReq = new FlightReq();
		firstapitest.setFlightReq(flightReq);
		flightReq.setTripType("oneway");
		flightReq.setCurrency("LKR");
		flightReq.setCabin("Y");
		flightReq.setShareUrlId("");
		flightReq.setSearchType("lowFareSearch");
		
		Passengers passengers = new Passengers();
		flightReq.setPassengers(passengers);
		passengers.setAdult(1);
		passengers.setChild(0);
		passengers.setInfant(0);
		passengers.setLapInfant(0);
		passengers.setJunior(0);
		passengers.setSeniorCitizen(0);
		passengers.setYouth(0);
		
		ExtraOptions extraOptions = new ExtraOptions();
		flightReq.setExtraOptions(extraOptions);
		extraOptions.setDirectFlights(false);
		extraOptions.setFreeBaggage(true);
		extraOptions.setRefundableFaresOnly(false);
		extraOptions.setNearByAirports(false);
		extraOptions.setAvoidUs(false);
		extraOptions.setAllowUpsaleFare(false);
		
		Sector sectors = new Sector ();
		sectors.setDepartureDate("2021-03-18");
		sectors.setDestinationNearByAirport("N");
	    sectors.setDestination("YYC");
		sectors.setOrigin("YVR");
	    sectors.setOriginNearByAirport("N");
	    
	    Sector sectorsreturn = new Sector();
	    sectorsreturn.setDepartureDate("2021-03-21");
	    sectorsreturn.setDestinationNearByAirport("N");
	    sectorsreturn.setDestination("YYZ");
	    sectorsreturn.setOrigin("YYC");
	    sectorsreturn.setOriginNearByAirport("N");
	    
	    List<Sector>allsectors = new ArrayList<Sector>();
	    allsectors.add(sectors);
	    allsectors.add(sectorsreturn);
	    flightReq.setSectors(allsectors);	   
	    
	    
	    Gson gson = new GsonBuilder().setPrettyPrinting().create();
	    String jsonEmp = gson.toJson(firstapitest);
	    //JSONParser parser = new JSONParser();
	   // JSONObject jsonObj = (JSONObject)parser.parse(jsonEmp);
	    System.out.print(jsonEmp);
	  
	    
	    //ObjectMapper objectMapper = new ObjectMapper();
	   // String nestedJsonPayloaad = objectMapper.writerWithDefaultPrettyPrinter().writeValueAsString(firstapitest);
	    //System.out.println(nestedJsonPayloaad); 
	    
	    RestAssured.baseURI ="https://b2b2capi.tltid.com";
		RequestSpecification requestspecification = RestAssured.given();
		requestspecification.header("content-type", "application/json");
		requestspecification.header("Connection", "keep-alive");
		requestspecification.header("portal-origin", "https://b2cui2.tltid.com/lk/");
		requestspecification.body(jsonEmp);
		Response response= requestspecification.request(Method.POST,"/api/flights/getResult/deal");
	    String responseBody = response.getBody().asString();
		System.out.println("Response body is:"+responseBody);
	}}
