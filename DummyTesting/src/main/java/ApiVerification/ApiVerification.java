package ApiVerification;

import org.json.JSONArray;
import org.json.JSONObject;
import org.junit.Assert;

import io.restassured.response.Response;

public class ApiVerification {

	public static void responseCodeValiddation(Response response, int statusCode) {
		Assert.assertEquals(statusCode, response.getStatusCode());
		System.out.println("new branch commit c1");

	}

	public static void responseKeyValidationFromJsonObject(Response response, String key) {

		JSONObject json = new JSONObject(response.getBody().asString());
		Assert.assertTrue(json.has(key) && json.get(key) != null);

	}

	public static void responseKeyValidationfromArray(Response response, String key) {

		JSONArray array = new JSONArray(response.getBody().asString());
		for (int i = 0; i < array.length(); i++) {
			JSONObject obj = array.getJSONObject(i);
			Assert.assertTrue(obj.has(key) && obj.get(key) != null);
		}
	}

}
