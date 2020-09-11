package com.ra.practice;

import java.util.ArrayList;
import java.util.Iterator;

import org.testng.annotations.Test;
import io.restassured.RestAssured;
import io.restassured.response.Response;
public class FetchRpPcPdByBook {
	@Test
	public void fetchRPPCPD() throws InterruptedException
	{
		String givenTitle = "Alan Turing: His Work and Impact";
       Response resp = RestAssured.get("https://www.googleapis.com/books/v1/volumes?q=turing");
		ArrayList<Object> allTitles = resp.jsonPath().get("items.volumeInfo.title");
		int count = 0;
		int flag = 0;
		
 /*   if(allTitles.contains(givenTitle))
	{
		int index = allTitles.indexOf(givenTitle);
		Object pageCount = resp.jsonPath().get("items.volumeInfo.pageCount["+ index +"]");
		Object publishedDate = resp.jsonPath().get("items.volumeInfo.publishedDate["+ index +"]");
		Object retailPrice = resp.jsonPath().get("items.saleInfo.retailPrice.amount["+ index +"]");
		Object selfLink = resp.jsonPath().get("items.selfLink["+index+"]");
		System.out.println(givenTitle + " is having PageCount as : "+pageCount);
		System.out.println(givenTitle + "  Published date as : "+publishedDate);
		System.out.println(givenTitle + " Retail Price is : "+retailPrice);
		System.out.println("allSelfLinks : "+selfLink);

	}
     else {
   	  System.out.println(givenTitle + " is not presents in list ");
     } */
	System.out.println("given Title is : "+givenTitle);
	Iterator it = allTitles.iterator();
	while(it.hasNext())	
	{
		if(allTitles.contains(givenTitle))
		{
		Object pageCount = resp.jsonPath().get("items.volumeInfo.pageCount["+ count +"]");
		Object publishedDate = resp.jsonPath().get("items.volumeInfo.publishedDate["+ count +"]");
		Object retailPrice = resp.jsonPath().get("items.saleInfo.retailPrice.amount["+ count +"]");
		Thread.sleep(2000);
		Object selfLink = resp.jsonPath().get("items.selfLink["+ count +"]");
		System.out.println("PageCount for givenTitle is : "+pageCount);
		System.out.println("Published date for givenTitle is : "+publishedDate);
		System.out.println("Retail Price for givenTitle is : "+retailPrice);
		Thread.sleep(2000);
		System.out.println("selfLink for givenTitle is : "+ selfLink);

        flag = 1;
        break;
		}
		
		count++;
	 }
	if(flag ==0)
	{
	System.out.println(givenTitle + " is not present in list.. ");
	} 
	}

}
