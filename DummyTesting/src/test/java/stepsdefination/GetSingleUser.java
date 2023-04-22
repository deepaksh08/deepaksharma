package stepsdefination;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import AppConfigs.ApiPath;
import Pojo.DeserialPojo;
import io.cucumber.java.en.Given;
import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

import org.junit.Assert;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import utilities.ConfigReader;

public class GetSingleUser {
	
	public Response response;
	
	@Given("User open the single user api")
	public void user_open_the_single_user_api() throws JsonMappingException, JsonProcessingException {
		
		RestAssured.baseURI = ConfigReader.configRead().get("apiurl");
		RestAssured.basePath = ApiPath.apiPath.SINGLE_USER;
		
		Response response = RestAssured.given().when().get().then().log().all().extract().response();
		
		 
		String respstring = response.asString();
		
		ObjectMapper objectMapper = new ObjectMapper();
		DeserialPojo DP = objectMapper.readValue(respstring, DeserialPojo.class);
		
		
		System.out.println("below is DP print");
		System.out.println(DP.getData());
		System.out.println("support print below");
		System.out.println(DP.getSupport().getUrl());
		System.out.println("support print above");
		
		
		
		Assert.assertEquals(true,respstring.contains("first_name"));
		Assert.assertEquals(200,response.getStatusCode());
		
		
		JsonPath jp = JsonPath.from(response.getBody().asString());
		
		int i  = jp.get("data.id");
		
		System.out.println(i);
		
		
		
		
	
		
		
	
		
		
		
	
	  
	}

	private void JsonPath(String asString) {
		// TODO Auto-generated method stub
		
	}


}
