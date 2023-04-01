package TestingAPIPOJOS;

import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class ReadingJsonResponseusingPOJO {

	public static void main(String[] args) throws JsonMappingException, JsonProcessingException {

		DummyJson obj = new DummyJson();

		ObjectMapper objectMapper = new ObjectMapper();

		EmployerMain mainobj = objectMapper.readValue(obj.getJson(), EmployerMain.class);

		System.out.println("printing employee");
		System.out.println(mainobj.getEmployee());
		System.out.println("printing employer");
		System.out.println(mainobj.getEmployer());
		System.out.println("printing headofficebranch");
		System.out.println(mainobj.getHeadOfficeBranch());
		System.out.println("printing headofficelocation");
		System.out.println(mainobj.getHeadOfficeLocation());
		System.out.println("printing no of employees");
		System.out.println(mainobj.getNoOfEmployees());
		System.out.println("printing supportedBanks");
		System.out.println(mainobj.getSupportedBanks());

		System.out.println("------------------------------------------"  );
		
		
		System.out.println("printing employee more details");
		System.out.println("------------------------------------------"  );
		
		List<Employee> employeeList = mainobj.getEmployee();

		for (Employee e : employeeList) {

			System.out.println("Name : " + e.getFirstName() + e.getLastName());
			System.out.println("Age : " + e.getAge());
			System.out.println("Job : " + e.getJob());
			System.out.println("Married : " + e.isMarried() );
		}
		
		System.out.println("------------------------------------------"  );
		
		List<EmployerDetails> employerList = mainobj.getEmployer();

		for (EmployerDetails ed : employerList) {

			System.out.println("Company Address : " + ed.getCompanyAddress());
			System.out.println("Company Name : " + ed.getCompanyName());
			System.out.println("Company Pan" + ed.getCompanyPAN());
	
		}
		

	}

}
