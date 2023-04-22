package InterviewPojo;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class Pojo1 {

	
	private String firstname;
	private String lastname;
	private String address;
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
	
	public static void main(String[] args) throws JsonProcessingException {
		
		
		Pojo1 obj = new Pojo1();
		
		obj.setAddress("Shalimar");
		obj.setFirstname("Deepak");
		obj.setLastname("sharma");
		
		ObjectMapper m = new ObjectMapper();
		String json = m.writerWithDefaultPrettyPrinter().writeValueAsString(obj);
		
		System.out.println(json);
		
	}
	

	
}
