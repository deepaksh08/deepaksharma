package BaseTestApi;


import io.restassured.RestAssured;
import io.restassured.response.Response;
import utilities.ConfigReader;

public class BaseTest {

	public void baseTest() {
		
		RestAssured.baseURI = "https://reqres.in";
		
	}
	
	
}
