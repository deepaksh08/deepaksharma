package TestingAPIPOJOS;

import java.util.List;

public class EmployerMain {

	private String headOfficeBranch;
	private String headOfficeLocation;
	private int noOfEmployees;
	private List<String> supportedBanks;
	private List<Employee> employee;
	private List<EmployerDetails> employer;

	public EmployerMain(String headOfficeBranch, String headOfficeLocation, int noOfEmployees,
			List<String> supportedBanks, List<Employee> employee, List<EmployerDetails> employer) {
		this.headOfficeBranch = headOfficeBranch;
		this.headOfficeLocation = headOfficeLocation;
		this.noOfEmployees = noOfEmployees;
		this.supportedBanks = supportedBanks;
		this.employee = employee;
		this.employer = employer;

	}
	
	public EmployerMain() {
	}
	

	public String getHeadOfficeBranch() {
		return headOfficeBranch;
	}

	public void setHeadOfficeBranch(String headOfficeBranch) {
		this.headOfficeBranch = headOfficeBranch;
	}

	public String getHeadOfficeLocation() {
		return headOfficeLocation;
	}

	public void setHeadOfficeLocation(String headOfficeLocation) {
		this.headOfficeLocation = headOfficeLocation;
	}

	public int getNoOfEmployees() {
		return noOfEmployees;
	}

	public void setNoOfEmployees(int noOfEmployees) {
		this.noOfEmployees = noOfEmployees;
	}

	public List<String> getSupportedBanks() {
		return supportedBanks;
	}

	public void setSupportedBanks(List<String> supportedBanks) {
		this.supportedBanks = supportedBanks;
	}

	public List<Employee> getEmployee() {
		return employee;
	}

	public void setEmployee(List<Employee> employee) {
		this.employee = employee;
	}

	public List<EmployerDetails> getEmployer() {
		return employer;
	}

	public void setEmployer(List<EmployerDetails> employer) {
		this.employer = employer;
	}

	@Override
	public String toString() {
		return "EmployerMain [headOfficeBranch=" + headOfficeBranch + ", headOfficeLocation=" + headOfficeLocation
				+ ", noOfEmployees=" + noOfEmployees + ", supportedBanks=" + supportedBanks + ", employee=" + employee
				+ ", employer=" + employer + "]";
	}

}
