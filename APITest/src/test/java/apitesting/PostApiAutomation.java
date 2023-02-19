package apitesting;

import org.testng.annotations.Test;

import com.google.gson.JsonObject;

import io.restassured.RestAssured;

public class PostApiAutomation {
	


	
	
	
	@Test
	public void postApi() {
		
		RestAssured.baseURI = "https://reqres.in/api/users";
		
		String json = "{\"name\": \"deepak\",\"job\": \"baba\"}";
		
						
		RestAssured.given().body(json)
		.when()
		.post()
		.then()
		.assertThat()
		.log()
		.all()
		.statusCode(201);
		
			
	}

}
