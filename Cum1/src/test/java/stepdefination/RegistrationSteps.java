package stepdefination;

import java.util.List;
import java.util.Map;

import org.openqa.selenium.WebDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;

public class RegistrationSteps  {

//	WebDriver driver;
//	Base base;
//
//	public RegistrationSteps(Base base) {
//		this.base = base;
//	}

	
		
		Hooks hook = new Hooks();
		WebDriver driver = hook.setDriver();
		
	
	
	
	@And("user Fills the registration Form with username {string} email {string} and password {string}")
	public void user_fills_the_registration_form_with_username_email_and_password(String username, String email,
			String password) {
		System.out.println("User fills the registration form with username as " + username + "and password as"
				+ password + "and email as " + email);

	}

	@Then("user click on Register button")
	public void user_click_on_register_button() {
		System.out.println("User Registered successfully");
	}

	@Then("then user enters firstname and lastname")
	public void then_user_enters_firstname_and_lastname(io.cucumber.datatable.DataTable dataTable) {
		List<List<String>> data = dataTable.asLists();

		System.out.println("Name1 = " + data.get(0).get(0) + data.get(0).get(1));
	}

	@Then("then user enters Name and Address")
	public void then_user_enters_name_and_address(io.cucumber.datatable.DataTable dataTable) {
		List<Map<String, String>> data1 = dataTable.asMaps();

		System.out.println(data1.get(0).get("Name") + "This is done using List<map<string,string>>");

		for (Map<String, String> data2 : dataTable.asMaps()) {

			System.out.println("Name = " + data2.get("Name") + "address = " + data2.get("Address"));
		}

	}

}
