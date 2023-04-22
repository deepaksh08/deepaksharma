package stepsdefination;

import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.devtools.v85.network.model.Request;

import AppConfigs.ApiHeaders;
import AppConfigs.ApiPath;
import io.cucumber.java.en.Given;

import io.restassured.RestAssured;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.builder.ResponseSpecBuilder;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import io.restassured.specification.ResponseSpecification;

import static io.restassured.RestAssured.*;
import utilities.ConfigReader;

public class TRYFORPOSTAPI {

	@Given("User hit the post api try Call")
	public void user_hit_the_post_api_try_call() {

		Map map = new HashMap();

		map.put("name", "deepak");
		map.put("job", "tester");

		RestAssured.baseURI = "https://reqres.in";
		RestAssured.basePath = ApiPath.apiPath.CREATE_POST;

		given().headers(ApiHeaders.defaultHeaders()).body(map).when().post().then().log().all();

		RequestSpecBuilder request = new RequestSpecBuilder();
		request.setBasePath(basePath);
		request.setBaseUri(baseURI);
		request.addParam("firstName", "deepak");
		request.setBody(map);
		request.addHeaders(ApiHeaders.defaultHeaders());
		request.addCookies(map);
		RequestSpecification req = request.build();

		ResponseSpecBuilder response = new ResponseSpecBuilder();
		response.expectContentType("application/json");
		response.expectStatusCode(200);
		response.expectStatusLine("http/OK");
		ResponseSpecification res = response.build();

		Response resp = given().spec(req).expect().spec(res).when().get();

	}

}
