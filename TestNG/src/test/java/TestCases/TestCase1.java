package TestCases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class TestCase1 extends BaseClass{

	

	@Test(priority = 3)
	public void doBasicTest() {
		System.out.println("hello this is priority three test case ");
	}

	@Test(priority = 2)
	public void doLogin() {
		System.out.println("hello this is priority two test case");

//		SoftAssert sf = new SoftAssert();
//		sf.assertFalse(true);
//		sf.assertTrue(false);
//		sf.assertAll();
	}

	@Test(priority = 1, groups = "Sanity")
	public void doUserRegistration() {
		System.out.println("hello this is priority one test case");
	}
}
