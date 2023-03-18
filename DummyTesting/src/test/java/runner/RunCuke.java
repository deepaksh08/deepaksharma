package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;


@CucumberOptions(features = "src/test/resources/feature", monochrome = true,tags = "@XTSCENARIO", glue = {
		"stepsdefination","applixationHooks" }, plugin = { "html:target/cucumber-reports/cucumber-html-report.html",
				"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:" })

public class RunCuke extends AbstractTestNGCucumberTests{

}