package com.ra.practice;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSender;
import io.restassured.specification.RequestSpecification;

public class UDPartiallyInPosts {
	
	@Test
	public void updateData()
	{
		RequestSpecification reqsp = RestAssured.given();
		
		JSONObject jobj = new JSONObject();
		jobj.put("author", "Rajnikanth");
		jobj.put("title", "Kollywood");
		
		String JsonData = jobj.toJSONString();
		
		reqsp.body(JsonData);
		
		reqsp.contentType(ContentType.JSON);
		
		RequestSender sender =reqsp.when();
		Response resp = sender.patch("http://localhost:3000/posts/9");
		 ValidatableResponse validate = resp.then();
		    validate.log().all();
	}
}
