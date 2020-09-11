package com.ra.practice;

import java.util.ArrayList;
import java.util.Iterator;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
public class FetchCapCCPopByCurr {
	@Test
	public void fetchCapital()
	{
	/*	String givenCap = "Oranjestad";
	  Response resp = RestAssured.get("https://restcountries.eu/rest/v2/all");
	  ArrayList<Object> allCapitals= resp.jsonPath().get("capital");
	  System.out.println(allCapitals);
	  
    if(allCapitals.contains(givenCap))
	 {
		 int index = allCapitals.indexOf(givenCap);
		 Object currencyCode = resp.jsonPath().get("currencies.code["+index+"]");
		 Object callingCode = resp.jsonPath().get("callingCodes["+ index +"]");
		 Object population = resp.jsonPath().get("population["+ index +"]");
		 System.out.println(givenCap + " is having CurrencyCode as : "+ currencyCode);
		 System.out.println(givenCap + " is having CallingCode as : "+ callingCode);
		 System.out.println(givenCap + "is having Population as : "+population);

	  }
	  else {
		  System.out.println(givenCap + " is not present in a list ");
	  } */
		
		String currencyCode = "KHR";
		Response resp = RestAssured.get("https://restcountries.eu/rest/v2/all");
		ArrayList<Object> allCurrencyCode = resp.jsonPath().get("currencies.code");
		/*Object allCurrencyName = resp.jsonPath().get("currencies.name");
		System.out.println(allCurrencyCode);
		System.out.println(allCurrencyName); */
		int count = 0;
		int flag = 0;
		System.out.println("Given Currency Code is : "+currencyCode);
		Iterator it = (allCurrencyCode).iterator();
		while(it.hasNext())
		{
			Object obj = it.next();
			String str = obj.toString();
			if(str.contains(currencyCode))
			{
				Object countryName = resp.jsonPath().get("name["+ count +"]");
				Object population = resp.jsonPath().get("population["+ count +"]");
				Object capital = resp.jsonPath().get("capital["+ count +"]");
				Object callingCodes = resp.jsonPath().get("callingCodes["+ count +"]");
				Object currencyName = resp.jsonPath().get("currencies.name["+ count +"]");
				System.out.println("Countryname for given CurrencyCode is "+countryName);
				System.out.println("Population for given Country is "+population);
				System.out.println("Capital for given Country is "+capital);
				System.out.println("CallingCodes for given Country is "+callingCodes);
				System.out.println("CurrenyName for given Country is : "+currencyName);
				flag = 1;
				break;
			}
			count++;
		}
		if(flag == 0)
		{
			System.out.println("Given CurrencyCode is not Present...");
		}
		
	}

}
