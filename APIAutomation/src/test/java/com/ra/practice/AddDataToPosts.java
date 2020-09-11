package com.ra.practice;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSender;
import io.restassured.specification.RequestSpecification;

public class AddDataToPosts {
	
	@Test
	public void addData()
	{
		RequestSpecification reqsp = RestAssured.given();
		
		JSONObject jobj = new JSONObject();
		
		jobj.put("id", 15);
		jobj.put("name", "Sayira");
		jobj.put("job", "ManualTestEngg");
		
		System.out.println(jobj);
		
		String JSONData = jobj.toJSONString();
		
		reqsp.body(JSONData);
		
		reqsp.contentType(ContentType.JSON);
		
		RequestSender sender = reqsp.when();
	    Response resp = sender.post("http://localhost:3000/posts");
	    System.out.println("Data Added Successfully...");
	    
	     /* int statusCode = resp.getStatusCode();
	      System.out.println("Status Code is : "+statusCode);
	      
	      String contentType = resp.getContentType();
	      System.out.println("Content type is : "+contentType);
	      
	      long time = resp.getTime();
	      System.out.println("time is : "+time);
	      
	      String actualContent = resp.asString();
	      System.out.println("Actual Content is : "+actualContent); */
	    
	    ValidatableResponse validate = resp.then();
	    validate.log().all();
	}

}
