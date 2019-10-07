package com.restapiTest;

import java.io.IOException;
import java.util.HashMap;

import org.apache.http.client.ClientProtocolException;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.restBase.ResponseBase;
import com.restBase.TestBase;
import com.restClient.RestClient;

import io.restassured.http.Header;

public class GetAPITest extends TestBase{
	//TestBase testbase;
	String serviceurl;
	String apiurl;
	String url;
	RestClient rest;
	
	@BeforeClass
	public void setUp() {
		//testbase = new TestBase();
		// apiurl=prop.getProperty("serviceurl");
		rest = new RestClient();
		System.out.println("creating restclient");

	}
	//@Test
	public void getApiUrlNotFoundTest() throws IOException
	{
	int statuscode = rest.get("https://reqres.in/apiuserspage=2");
	
	Assert.assertEquals(statuscode, 404);
	
	}
	//@Test
	public void getApiSuccessTest() throws IOException
	{
	int statuscode = rest.get("https://reqres.in/api/users?page=2");
	
	Assert.assertEquals(statuscode, 200);
	
	}
	@Test
	public void getApiDataNotFoundTest() throws IOException
	{try {
		//ResponseBase resp = rest.getTo("");
	//int statuscode = rest.get("https://reqres.in/api/users?page=100");
	ResponseBase resp = rest.getTo("https://reqres.in/api/users?page=100");
	System.out.println("printing the result");
	System.out.println(resp.getStatuscode());
	System.out.println(resp.getJSONObject());
	}
	catch(Exception e) {
		System.out.println(e.getMessage());
	}
	//Assert.assertEquals(statuscode, 404);
	
	}
//	@Test
	public void postApiTest() throws IOException
	
	{
		
		//RestClient rest =new RestClient();
   	int code;
		
			code = rest.postTest("https://reqres.in/api/users");
			Assert.assertEquals(code, 201);
			
		RestClient rest = new RestClient();
		int sum=rest.add(20, 30);
		String stri = rest.concat("aaa", "bbb");
	}
	@Test
	public void getHeaderResponse() throws ClientProtocolException, IOException {
		RestClient rest =new RestClient();
		HashMap<String, String> header = rest.getResponseHeader("https://reqres.in/api/users?page=2");
		System.out.println(header);
		//TO GET HEADER IN PROPER WAY
		
			
		}
	}
     

