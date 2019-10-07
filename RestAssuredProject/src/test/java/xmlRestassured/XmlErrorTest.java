package xmlRestassured;

import org.hamcrest.Matchers;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class XmlErrorTest {
	static String Base_URI = "https://reqres.in";//api/users?page=2";
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

}
