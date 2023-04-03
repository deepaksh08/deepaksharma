package TestCases;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public class BaseClass {
	
	@BeforeSuite
	public void setUp() {
		System.out.println("-------------SETTING UP EVERYTHING INITIALLY @BEFORESUITE-------------");
	}
	
	@AfterSuite
	public void tearDown() {
		System.out.println("---------QUITTING EVERYTHING AT THE END @AFTERSUITE-------------");
	}

}
