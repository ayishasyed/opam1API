package com.ra.practice;
import java.util.ArrayList;
import org.testng.annotations.Test;
import io.restassured.RestAssured;
import io.restassured.response.Response;

public class DemoJsonPath {
	@Test
	public void checckJsonPath()
	{
		Response resp = RestAssured.get("http://localhost:3000/comments");
		Object obj = resp.jsonPath().get("employees.name[1]");
		System.out.println("Employee name is : "+obj);
		
		Object obj1 = resp.jsonPath().get("employees.skills.java[1]");
		System.out.println("Manual rating is : "+obj1);
		
		ArrayList<Object> obj2 = resp.jsonPath().get("employees.skills.Api");
		System.out.println("api rating is : "+obj2);
		
		ArrayList<Object> obj3 = resp.jsonPath().get("employees.skills.Sql");
		System.out.println("Sql rating is : "+obj3);
		
		ArrayList<Object> obj4 = resp.jsonPath().get("employees.id");
		System.out.println("Employees ID is : "+obj4);
	}

}
