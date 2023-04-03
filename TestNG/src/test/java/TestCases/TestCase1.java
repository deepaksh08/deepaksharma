package TestCases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class TestCase1 extends BaseClass{

	@BeforeTest
	public void dbConnection() {
		System.out.println("TEST STARTED with beforetest");

	}

	@AfterTest
	public void closeConnection() {
		System.out.println("TEST COMPLETE  with aftertest");
	}

	@BeforeMethod
	public void initBrowser() {
		System.out.println("METHOD STARTED with beforemethod");
	}

	@AfterMethod
	public void teadDown() {
		System.out.println("METHOD COMPLETE with aftermethod");
	}

	@Test(priority = 3)
	public void doBasicTest() {
		System.out.println("basic test");
	}

	@Test(priority = 2)
	public void doLogin() {
		System.out.println("hello this is first test ng test case");

		SoftAssert sf = new SoftAssert();
		sf.assertFalse(true);
		sf.assertTrue(false);
		sf.assertAll();
	}

	@Test(priority = 1, groups = "Sanity")
	public void doUserRegistration() {
		System.out.println("hello this is Second test ng test case");
	}
}
