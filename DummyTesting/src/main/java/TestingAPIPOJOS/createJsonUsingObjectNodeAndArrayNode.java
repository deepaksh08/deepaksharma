package TestingAPIPOJOS;

import java.util.HashMap;
import java.util.Map;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ArrayNode;
import com.fasterxml.jackson.databind.node.ObjectNode;

public class createJsonUsingObjectNodeAndArrayNode {

	public static ObjectNode createNestedJson() {
		ObjectMapper objectMapper = new ObjectMapper();
		ObjectNode jsonoutput = objectMapper.createObjectNode();

		jsonoutput.put("job", "software");
		jsonoutput.put("address", "shalimar");
		jsonoutput.put("Nationality", "Indian");

		ObjectNode jsonnamedetails = objectMapper.createObjectNode();

		jsonnamedetails.put("firstName", "deepak");
		jsonnamedetails.put("lastName", "sharma");

		jsonoutput.set("name", jsonnamedetails);

		return jsonoutput;

	}

	public static ArrayNode createNestedJsonArray() {
		ObjectMapper objectMapper = new ObjectMapper();
		ObjectNode first = objectMapper.createObjectNode();

		first.put("job", "software");
		first.put("address", "shalimar");
		first.put("Nationality", "Indian");

		ObjectNode firstdetails = objectMapper.createObjectNode();

		firstdetails.put("firstName", "deepak");
		firstdetails.put("lastName", "sharma");

		first.set("name", firstdetails);

		ObjectNode second = objectMapper.createObjectNode();
		second.put("job", "software");
		second.put("address", "shalimar");
		second.put("Nationality", "Indian");

		ObjectNode seconddetails = objectMapper.createObjectNode();

		seconddetails.put("firstName", "rani");
		seconddetails.put("lastName", "sharma");

		second.set("name", seconddetails);

		ArrayNode jsonArray = objectMapper.createArrayNode();

		jsonArray.add(first);
		jsonArray.add(second);

		return jsonArray;

	}

	public static void main(String[] args) {

		System.out.println(createNestedJson().toPrettyString());

		System.out.println(createNestedJsonArray().toPrettyString());
	}
}
