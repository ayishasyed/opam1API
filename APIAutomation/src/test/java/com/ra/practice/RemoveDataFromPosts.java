package com.ra.practice;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class RemoveDataFromPosts {
	
	@Test
	public void removeData()
	{
		Response resp = RestAssured.delete("http://localhost:3000/comments/12");
		
		int statusCode = resp.getStatusCode();
		System.out.println("StatusCode is : "+statusCode);
		
		String contentType = resp.getContentType();
		System.out.println("ContentType is : "+contentType);
		
		long time = resp.getTime();
		System.out.println("Time is : "+time);
		
		String actualData = resp.asString();
		System.out.println("Actual Data is : "+actualData);
	}

}
