package apitesting;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class GetApiAutomation {

	@Test
	public void testResponseCode() {

		RestAssured.baseURI = "https://reqres.in/api/users";
		
		RestAssured.given().param("page", "2")
			.when()
			.get()
			.then()
			.assertThat()
			.log()
			.all()
			.statusCode(200);
		

	}

	@Test
	public void testResp1() {

		RestAssured.baseURI = "https://reqres.in/api/users?page=2";
		Response resp = RestAssured.given().param("page","1").when().get();
		
		System.out.println(resp.getBody().asString());
		System.out.println(resp.getStatusCode());
		System.out.println(resp.getBody().asPrettyString());
		System.out.println(resp.contentType());
		System.out.println(resp.time());
		System.out.println(resp.getTime());
		System.out.println(resp.getCookies());

	}

}
