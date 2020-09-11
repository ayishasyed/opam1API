package com.ra.practice;

import java.util.ArrayList;
import java.util.Iterator;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class FetchEmpDetailsFmRest {
	@Test
	public void fetchDetails()
	{
	 /*	String givenId = "2";
		Response resp = RestAssured.get("http://dummy.restapiexample.com/api/v1/employees");
		ArrayList<Object> allEmployID = resp.jsonPath().get("data.id");
		int count = 0;
		int flag = 0;
		Iterator it = allEmployID.iterator();
		while(it.hasNext())
		{
			if(allEmployID.contains(givenId))
			{
				Object empName = resp.jsonPath().get("data.employee_name["+count+"]");
				System.out.println("Employee Name for given Id is "+empName);
				flag =1;
				break;
			}
			count++;
		}
		if(flag ==0)
		{
			System.out.println("given Id is not Exist..");
		} */
		
		//Response resp = RestAssured.get("http://dummy.restapiexample.com/api/v1/employees");
		Response resp1 = RestAssured.get("http://dummy.restapiexample.com/api/v1/employee/5");
		resp1.then().log().all();

	}

}
