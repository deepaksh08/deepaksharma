package TestCases;

import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestCase2 extends BaseClass {
	
	
	@Test(priority = 1, groups = "Sanity")
	public void validateTitle() {
		System.out.println("validating title");
//		Assert.fail("failing test case");
		
	}
	
	@Test(priority = 2,dependsOnMethods = "validateTitle",groups = "Sanity" )
	public void validateHeading() {
		System.out.println("Validating heading");
		
	}
	
	@Test(priority = 3, dependsOnMethods = "validateTitle",alwaysRun = true,groups = "Sanity")
	public void testLogin() {
		System.out.println("Login method");
	}
	
//	@Test(priority = 4)
//	public void skipTest() {
//		if (true) {
//			throw new SkipException("this is skipped forcefully ");
//		}
//		
//	}

}
