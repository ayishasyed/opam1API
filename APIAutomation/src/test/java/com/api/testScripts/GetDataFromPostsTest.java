package com.api.testScripts;

import java.io.IOException;

import org.testng.annotations.Test;

import com.api.genericLib.BaseClass;

import io.restassured.response.Response;

public class GetDataFromPostsTest extends BaseClass {
    @Test
	public void getData() throws IOException
	{
		String apiTestData = config.getApiTestData("getAllPosts");
		Response resp = config.executeRequest(apiTestData);
		resp.then().log().all();
	}
}
