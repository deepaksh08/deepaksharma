package TestingAPIPOJOS;

import com.fasterxml.jackson.core.JsonProcessingException;

import AppConfigs.ApiHeaders;
import AppConfigs.ApiPath;
import Pojo.PostApiPojo;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import utilities.ConfigReader;

public class TestAPICall {

	
	
	public static void main(String[] args) throws JsonProcessingException {
		
	ApiHeaders header = new ApiHeaders();
	RestAssured.baseURI = "https://reqres.in/";
	
	PostApiPojo pojo = new PostApiPojo("radhe1","shyam1");
	
	Response response = RestAssured.given().when().headers(header.defaultHeaders()).body(createJsonUsingMapandList.basicjsonAsString())
			
			.when().post(ApiPath.apiPath.CREATE_POST);
	
	response.then().log().all();	
	
	}
}
