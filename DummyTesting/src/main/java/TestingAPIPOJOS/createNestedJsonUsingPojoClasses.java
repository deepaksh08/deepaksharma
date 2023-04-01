package TestingAPIPOJOS;

import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class createNestedJsonUsingPojoClasses {
	
	
	
	Employee employ1 = new Employee("deepak", "sharma", "testing", "Delhi", 30, false);
	Employee employ2 = new Employee("rani", "sharma", "developer", "Chandigarh", 30, false);
	Employee employ3 = new Employee("Jai", "sharma", "head", "Delhi", 40, true);
	EmployerDetails empdetail1 = new EmployerDetails("ABC infotect","Gurugram","BDDFH99003S");
	EmployerDetails empdetail2 = new EmployerDetails("XYZ infotect","DELHI","BDDFH99003T");
	
	
	public  String createdNestedJson() throws JsonProcessingException {
		
		List<String> supportedBanks = new ArrayList<String>();
		supportedBanks.add("ICICI");
		supportedBanks.add("HDFC");
		supportedBanks.add("SBI");
		
		List<Employee> employeeList = new ArrayList<Employee>();
		employeeList.add(employ1);
		employeeList.add(employ2);
		employeeList.add(employ3);
		
		List<EmployerDetails> employerList = new ArrayList<EmployerDetails>();
		employerList.add(empdetail1);
		employerList.add(empdetail2);
		
		EmployerMain empMain = new EmployerMain();
		empMain.setEmployee(employeeList);
		empMain.setEmployer(employerList);
		empMain.setHeadOfficeBranch("Shyam");
		empMain.setHeadOfficeLocation("Khatu");
		empMain.setNoOfEmployees(1100);
		empMain.setSupportedBanks(supportedBanks);
		
		ObjectMapper objectMapper = new ObjectMapper();
		
		String nestedJson = objectMapper.writerWithDefaultPrettyPrinter().writeValueAsString(empMain);
		return nestedJson;
		
	}
	
	
	public static void main(String[] args) throws JsonProcessingException {
		
		createNestedJsonUsingPojoClasses obj = new createNestedJsonUsingPojoClasses();
		System.out.println(obj.createdNestedJson());
	}

}
