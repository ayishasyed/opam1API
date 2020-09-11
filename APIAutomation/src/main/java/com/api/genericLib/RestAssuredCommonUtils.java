package com.api.genericLib;

import org.hamcrest.Matchers;
import org.testng.Assert;

import io.restassured.http.ContentType;
import io.restassured.response.Response;

/**
 * @author sabira
 * {@code} this is useful for all common Scenorios for RestAPI
 * @since 2020
 *
 */
public class RestAssuredCommonUtils {
	
	/**
	 * @author sabira
	 * @param resp is used to fetch StatusCode
	 * @param expectedStatusCode is for Validation of ActualStatusCode
	 */
	public void ValidateStatusCode(Response resp,int expectedStatusCode) {
		resp.then().assertThat().statusCode(expectedStatusCode);
		System.out.println("StatusCode Validation is Succussfull");
	}
	
	/**
	 * @param resp is used to fetch ContentType
	 */
	public void ValidateContentType(Response resp)
	{
		resp.then().assertThat().contentType(ContentType.JSON);
		System.out.println("ContentType Validation is Successfull");
	}
   public void ValidateResponseTime(Response resp,long rangeOfWithInTime)
   {
	   resp.then().assertThat().time(Matchers.lessThan(rangeOfWithInTime));
	   System.out.println("ResponseTime Validation is Successfull");
   }
   public void validateKeyValuePair(Response resp,String jsonpath,String expectedValue)
   {
	   Object obj = resp.jsonPath().get(jsonpath);
	   String actualValue = obj.toString();
	   Assert.assertEquals(actualValue, expectedValue);
   }
   public String fetchTokenID(Response resp,String jsonPath)
   {
	   Object objtoken = resp.jsonPath().get(jsonPath);
	   return objtoken.toString();
   }
}
