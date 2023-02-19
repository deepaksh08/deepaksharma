package stepsdefination;

import ApiVerification.ApiVerification;
import AppConfigs.ApiPath;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import utilities.ConfigReader;

public class GetApiStepDefination {

	public Response response;

	@Given("User open the api")
	public void user_open_the_api() {
		RestAssured.baseURI = ConfigReader.configRead().get("apiurl");
		response = RestAssured.given().when().get(ApiPath.apiPath.GET_LIST_OF_USERS);
	}

	@Then("user valided status as {int}")
	public void user_valided_status_as(int int1) {
		ApiVerification.responseCodeValiddation(response, int1);
	}

	@Then("user validated reponse contains {string}")
	public void user_validated_reponse_contains(String string) {
		ApiVerification.responseKeyValidationFromJsonObject(response, string);

	}

}

