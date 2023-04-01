package TestingAPIPOJOS;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class createJsonUsingMapandList {
	// this json as string will work as input for body
	public static String basicjsonAsString() throws JsonProcessingException {
		Map<String, String> basicJson = new HashMap<String, String>();
		basicJson.put("name", "deepak");
		basicJson.put("job", "Sharma");

		ObjectMapper objectMapper = new ObjectMapper();
		String basicJson1 = objectMapper.writerWithDefaultPrettyPrinter().writeValueAsString(basicJson);

		return basicJson1;
	}

	// this json as map wont work as the input is not correct for body
	public static Map basicjsonAsMap() {
		Map<String, String> basicJson = new HashMap<String, String>();
		basicJson.put("name", "deepak");
		basicJson.put("job", "Sharma");

		return basicJson;
	}

	public static String nestedBasicJsonAsString() throws JsonProcessingException {

		Map<String, Object> nestedBasic = new HashMap<String, Object>();
		nestedBasic.put("job", "software");
		nestedBasic.put("address", "shalimar");
		nestedBasic.put("Nationality", "Indian");

		Map<String, String> nameDetails = new HashMap<String, String>();
		nameDetails.put("firstName", "deepak");
		nameDetails.put("lastName", "sharma");

		nestedBasic.put("Name", nameDetails);

		ObjectMapper objectMapper = new ObjectMapper();
		String nestedjson = objectMapper.writerWithDefaultPrettyPrinter().writeValueAsString(nestedBasic);

		return nestedjson;

	}
	
	
	public static String jsonArrayBasic() throws JsonProcessingException {
		
		Map<String, Object> firstjson = new HashMap<String, Object>();
		firstjson.put("job", "software");
		firstjson.put("address", "shalimar");
		firstjson.put("Nationality", "Indian");
		Map<String, String> firstjsondetails = new HashMap<String, String>();
		firstjsondetails.put("firstName", "deepak");
		firstjsondetails.put("lastName", "sharma");
		firstjson.put("Name", firstjsondetails);
		
		Map<String, Object> secondjson = new HashMap<String, Object>();
		secondjson.put("job", "hardware");
		secondjson.put("address", "rohini");
		secondjson.put("Nationality", "Indian");
		Map<String, String> secondjsondetails = new HashMap<String, String>();
		secondjsondetails.put("firstName", "rani");
		secondjsondetails.put("lastName", "sharma");
		secondjson.put("Name", secondjsondetails);

		List<Map<String,Object>> jsonArray = new ArrayList<Map<String,Object>> ();
		jsonArray.add(firstjson);
		jsonArray.add(secondjson);
		
		ObjectMapper objectMapper = new ObjectMapper();
		String Arrayjsonsimple = objectMapper.writerWithDefaultPrettyPrinter().writeValueAsString(jsonArray);
		
		return Arrayjsonsimple;
		
		
	}

	public static void main(String[] args) throws JsonProcessingException {

		
		System.out.println(basicjsonAsString());
		System.out.println("-------------------------------------");
		System.out.println(basicjsonAsMap());
		System.out.println("-------------------------------------");
		System.out.println(nestedBasicJsonAsString());
		System.out.println("-------------------------------------");
		System.out.println(jsonArrayBasic());

	}

}
