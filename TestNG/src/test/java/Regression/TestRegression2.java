package Regression;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import TestCases.BaseClass;

public class TestRegression2 extends BaseClass{
	
	@Test(priority = 2, groups = "Regression")
	public void doregression2test1() {
		System.out.println("hello this is first test of regression2");
	}

	@Test(priority = 1)
	public void doregression2test2() {
		System.out.println("hello this is Second test of regression2");
	}

}
