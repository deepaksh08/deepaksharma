package TestCases;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

public class BaseClass {
	
	@BeforeSuite
	public void setUp() {
		System.out.println("-------------SETTING UP EVERYTHING INITIALLY @BEFORESUITE-------------");
	}
	
	@AfterSuite
	public void tearDown() {
		System.out.println("---------QUITTING EVERYTHING AT THE END @AFTERSUITE-------------");
	}

	@BeforeTest
	public void dbConnection() {
		System.out.println("TEST STARTED with @beforetest");

	}

	@AfterTest
	public void closeConnection() {
		System.out.println("TEST COMPLETE  with @aftertest");
	}

	@BeforeMethod
	public void initBrowser() {
		System.out.println("METHOD STARTED with @beforemethod");
	}

	@AfterMethod
	public void teadDown() {
		System.out.println("METHOD COMPLETE with @aftermethod");
	}
	
	@BeforeClass
	public void methodone() {
		System.out.println("this  method is @beforeclass method");
	}
	
	@AfterClass
	public void methodtwo() {
		System.out.println("this method is @afterclass method");
	}
}
