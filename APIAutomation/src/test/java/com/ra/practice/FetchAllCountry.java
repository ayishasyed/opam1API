package com.ra.practice;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class FetchAllCountry {
	
	@Test
	public void getAllCountry()
	{
		Response resp = RestAssured.get("https://restcountries.eu/rest/v2/all");
		
		/*String s = resp.asString();
		System.out.println(s);*/
		
		 resp.then().log().all(); 
		
		/* resp.prettyPrint(); */
	}

}
