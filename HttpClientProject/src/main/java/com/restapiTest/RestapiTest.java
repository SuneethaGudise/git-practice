package com.restapiTest;


import io.restassured.RestAssured;
import io.restassured.RestAssured.*;
import io.restassured.matcher.RestAssuredMatchers.*;
import org.hamcrest.Matchers;//.*;
import org.testng.annotations.Test;


public class RestapiTest {
	
	@Test
	public void getRequest() {
	
	
		RestAssured.given().when().get("https://reqres.in/api/users/2")
		.then().statusCode(200)
		.body("data.id", Matchers.equalTo(2));
	}
	
}