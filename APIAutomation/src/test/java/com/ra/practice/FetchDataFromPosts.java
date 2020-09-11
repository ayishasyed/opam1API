package com.ra.practice;

import org.testng.annotations.Test;
import io.restassured.RestAssured;
import io.restassured.response.Response;

public class FetchDataFromPosts {
	
	@Test
	public void getData()
	{
	  Response resp = RestAssured.get("http://localhost:3000/posts");
      int statusCode = resp.getStatusCode();
      System.out.println("Status Code is : "+statusCode);
      
      String contentType = resp.getContentType();
      System.out.println("Content type is : "+contentType);
      
      long time = resp.getTime();
      System.out.println("time is : "+time);
      
      String actualContent = resp.asString();
      System.out.println("Actual Content is : "+actualContent);
      
	}

}
