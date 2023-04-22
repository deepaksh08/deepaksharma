package stepsdefination;

import com.fasterxml.jackson.core.JsonProcessingException;

import ApiBuilders.PostApiBuilder;
import AppConfigs.ApiHeaders;
import AppConfigs.ApiPath;
import BaseTestApi.BaseTest;
import Pojo.PostApiPojo;
import io.cucumber.java.en.Given;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import utilities.ConfigReader;

public class postApiStepDefination  {
	public Response response;
	
	ApiHeaders header = new ApiHeaders();
	PostApiBuilder apibuilder = new PostApiBuilder();
	
	String json = "{\r\n"
			+ "    \"name\": \"deepak\",\r\n"
			+ "    \"job\": \"sharma\"\r\n"
			+ "}";
	
	PostApiPojo pojo = new PostApiPojo("radhe1","shyam1");

	@Given("User open the post api")
	public void user_open_the_post_api() throws JsonProcessingException {
		
		RestAssured.baseURI = ConfigReader.configRead().get("apiurl");
		
		
	
		Response response = RestAssured.given().when().headers(header.defaultHeaders()).body(PostApiPojo.getpojooutput(pojo))
				
				.post(ApiPath.apiPath.CREATE_POST);
		
		response.then().log().all();	
		
		
		
		
		
		
		
	}

}
