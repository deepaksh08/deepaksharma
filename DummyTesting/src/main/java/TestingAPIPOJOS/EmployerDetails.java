package TestingAPIPOJOS;

public class EmployerDetails {
	
	private String companyName;
	private String companyAddress;
	private String companyPAN;
	public String getCompanyName() {
		return companyName;
	}
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}
	public String getCompanyAddress() {
		return companyAddress;
	}
	public void setCompanyAddress(String companyAddress) {
		this.companyAddress = companyAddress;
	}
	public String getCompanyPAN() {
		return companyPAN;
	}
	public void setCompanyPAN(String companyPAN) {
		this.companyPAN = companyPAN;
	}
	public EmployerDetails(String companyName, String companyAddress, String companyPAN) {
		this.companyName = companyName;
		this.companyAddress = companyAddress;
		this.companyPAN = companyPAN;
	}
	public EmployerDetails() {
		
	}
	

}
