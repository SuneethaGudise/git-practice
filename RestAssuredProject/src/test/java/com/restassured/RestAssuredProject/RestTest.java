package com.restassured.RestAssuredProject;

import org.testng.annotations.Test;
import io.restassured.RestAssured;
//import io.restassured.matcher.ResponseAwareMatcher;
//import io.restassured.matcher.RestAssuredMatchers.*;
//import io.restassured.response.Response;
import static org.hamcrest.Matchers.*;

import org.hamcrest.Matchers;
public class RestTest {
	@Test
	public void testno_of_Circuit() {
		
		RestAssured.given().when().get("http://ergast.com/api/f1/2019").
			then().
			assertThat().statusCode(200).and().body("MRData.Race.Circuit.circuitId", hasSize(10));
			
			
	}

	
	}