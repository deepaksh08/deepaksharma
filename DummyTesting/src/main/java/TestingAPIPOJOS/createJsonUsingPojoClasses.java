package TestingAPIPOJOS;

import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class createJsonUsingPojoClasses {

	Employee employ1 = new Employee("deepak", "sharma", "testing", "Delhi", 30, false);
	Employee employ2 = new Employee("rani", "sharma", "developer", "Chandigarh", 30, false);


	public String getSingleEmployObjectJson() throws JsonProcessingException {
		ObjectMapper objectMapper = new ObjectMapper();
		String jsonObject = objectMapper.writerWithDefaultPrettyPrinter().writeValueAsString(employ1);
		return jsonObject;
	}

	public String getEmployArrayJson() throws JsonProcessingException {
		List<Employee> EmployeeList = new ArrayList<Employee>();
		EmployeeList.add(employ1);
		EmployeeList.add(employ2);

		ObjectMapper objectMapper = new ObjectMapper();
		String jsonObjectArray = objectMapper.writerWithDefaultPrettyPrinter().writeValueAsString(EmployeeList);
		return jsonObjectArray;
	}

	public static void main(String[] args) throws JsonProcessingException {

		createJsonUsingPojoClasses obj = new createJsonUsingPojoClasses();
		System.out.println(obj.getSingleEmployObjectJson());
		System.out.println("------------------------------------");
		System.out.println(obj.getEmployArrayJson());
		
		
	}

}
