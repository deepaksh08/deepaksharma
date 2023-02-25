package stepsdefination;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import AppConfigs.ApiPath;
import Pojo.DeserialPojo;
import io.cucumber.java.en.Given;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import utilities.ConfigReader;

public class GetSingleUser {
	
	public Response response;
	
	@Given("User open the single user api")
	public void user_open_the_single_user_api() throws JsonMappingException, JsonProcessingException {
		
		RestAssured.baseURI = ConfigReader.configRead().get("apiurl");
		
		String respstring = RestAssured.given().when().get(ApiPath.apiPath.SINGLE_USER).asString();
		
		
		ObjectMapper objectMapper = new ObjectMapper();
		DeserialPojo DP = objectMapper.readValue(respstring, DeserialPojo.class);
		
		
		
	
	  
	}


}
