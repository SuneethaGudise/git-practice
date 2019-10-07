package com.restassured.RestAssuredProject;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import junit.framework.Assert;
import io.restassured.RestAssured.*;
import io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

import org.hamcrest.Matchers;
import org.json.JSONObject;

public class RestAssuredmethodsTest {

	static String Base_URI = "https://reqres.in";//api/users?page=2";
	//GET METHOD 
	@Test
	public void get_Test()
	{
		RequestSpecification request =RestAssured.given();
		Response response =request.when().get("https://reqres.in/api/users/2");
		response.then().assertThat().statusCode(200);
		String headerValue =response.getHeader("Server");
		System.out.println(headerValue);
		Assert.assertEquals("cloudflare",headerValue );
		System.out.println(response.asString());
		request.then().body("data.id", Matchers.equalTo(2))
		.and()
		.body("data.first_name",Matchers.equalTo("Janet"));

	}

	@Test
	public void post_Test()
	{
		//CREATING AND SENDING DATA IN JSON FORMAT  IN THE REQUEST AND CTREATING HEADERS AND TESTING       
		RequestSpecification httprequest=   RestAssured.given();  
		httprequest.contentType(ContentType.JSON).accept(ContentType.JSON);
		Response response = httprequest.body("{\"name\": \"Priyanka\" ,\"job\": \"Teamleader\"}")
				.when().post(Base_URI+"/api/users");
		System.out.println("Post response:"+response.asString());        
		response.then().statusCode(201).body("name",Matchers.is("Priyanka"))
		.body("job", Matchers.is("Teamleader"));

	}

	@Test
	public void put_Test()
	{
		RequestSpecification httprequest = RestAssured.given();
		httprequest.contentType(ContentType.JSON).accept(ContentType.JSON);
		Response response =httprequest.body("{\"name\": \"Priyanka\",\"job\": \"Manager\"}").when().put(Base_URI+"/api/users/2");
		System.out.println("Put response:"+response.asString());
		response.then().body( "name" ,Matchers.is("Priyanka"))
		.body("job",Matchers.is("Manager"));

	}
	@Test
	public void delete_Test()
	{
		RequestSpecification httprequest = RestAssured.given();
		//httprequest.contentType(ContentType.JSON).accept(ContentType.JSON);
		Response response = httprequest.delete(Base_URI+"/api/users/652");
		int statusCode = response.statusCode();
		Assert.assertEquals(204,statusCode);
		//response.then().body("id", Matchers.not(652));

	}
	//	@Test(dataProvider = "dpGetWithParam")
	//	public void get_with_param(int id, String name) {
	//		RequestSpecification httprequest = RestAssured.given();
	//		httprequest.get(Base_URI +"/api/users" ).then().body("name", Matchers.is(name));
	//	}
	//
	//	@DataProvider
	//	public Object[][] dpGetWithParam() {
	//		Object[][] testDatas = new Object[][] { 
	//			new Object[] { 1, "Emily" },
	//			new Object[] { 2, "David" } };
	//		return testDatas;
	//	}

}
