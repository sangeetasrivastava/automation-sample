package cucumberTestNG;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(features = "src/test/java/CucumberFramework", // the path of the feature files
		glue = { "stepdefinition" }, // the path of the step definition files
		plugin = { "json:target/cucumber-reports/cucumber.json" } // to generate different types of reporting

)

public class TestNGTest extends AbstractTestNGCucumberTests {

}
