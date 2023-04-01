package TestingAPIPOJOS;

public class Employee {
	
	private String firstName;
	private String lastName;
	private String job;
	private String Address;
	private int age;
	private boolean married;
	
	public Employee(String firstName,String lastName,String job,String Address,int age,boolean married){
		this.firstName=firstName;
		this.lastName=lastName;
		this.job=job;
		this.Address=Address;
		this.age=age;
		this.married=married;
		
	}
	public Employee() {
		
	}
	
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getJob() {
		return job;
	}
	public void setJob(String job) {
		this.job = job;
	}
	public String getAddress() {
		return Address;
	}
	public void setAddress(String address) {
		Address = address;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public boolean isMarried() {
		return married;
	}
	public void setMarried(boolean married) {
		this.married = married;
	}

	
}
