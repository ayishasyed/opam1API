package com.ra.practice;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSender;
import io.restassured.specification.RequestSpecification;

public class AddComplexData {
	
	@Test
	public void createComplexData()
	{
		RequestSpecification reqsp= RestAssured.given();
		
		JSONObject jobj1 = new JSONObject();
		jobj1.put("java", "verygood");
		jobj1.put("selenium", "good");
		jobj1.put("manual", "average");
		jobj1.put("Sql", "good");
		jobj1.put("Api", "average");


		
		JSONObject jobj2 = new JSONObject();
		jobj2.put("name","sabina");
		jobj2.put("id", 100);
		jobj2.put("skills", jobj1);
		
		JSONObject jobj3 = new JSONObject();
		jobj3.put("employees", jobj2);
		
		String jsonData = jobj3.toJSONString();
		
		reqsp.body(jsonData);		
		reqsp.contentType(ContentType.JSON);
		RequestSender sender = reqsp.when();
		Response resp = sender.post("http://localhost:3000/comments");
		resp.then().log().all();
		
	}

}
