package stepsdefination;



import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


import ApiVerification.ApiVerification;
import AppConfigs.ApiPath;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import utilities.ConfigReader;

public class GetApiStepDefination {

	
	
	public static Logger log = LogManager.getLogger(GetApiStepDefination.class);
	
	
	
	
	
	public Response response;
	

	@Given("User open the api")
	public void user_open_the_api() {
		RestAssured.baseURI = ConfigReader.configRead().get("apiurl");
		response = RestAssured.given().when().get(ApiPath.apiPath.GET_LIST_OF_USERS);
		
		log.info("this is a test log");
		log.error("this is error log");
		log.debug("this is a debug message");
	

	}

	@Then("user valided status as {int}")
	public void user_valided_status_as(int int1) {
		
//		try {
//			ApiVerification.responseCodeValiddation(response, int1);
//			
//		} catch (Throwable t) {
//			log.error("Error occured",t);
//		}
		
		ApiVerification.responseCodeValiddation(response, int1);
	}

	@Then("user validated reponse contains {string}")
	public void user_validated_reponse_contains(String string) {
		ApiVerification.responseKeyValidationFromJsonObject(response, string);

	}

}

