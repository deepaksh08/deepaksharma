package Regression;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import TestCases.BaseClass;

public class TestRegression1 extends BaseClass {

	@Test(priority = 2, groups = { "Sanity", "Regression" })
	public void doregression1test1() {
		System.out.println("hello this is first test of regression1");

	}

	@Test(priority = 1)
	public void doregression1test2() {
		System.out.println("hello try another this is Second test regression1");
	}

}
