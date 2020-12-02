package cucumberjunit;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(plugin = { "pretty", "html:target/cucumber-reports",
		"json:target/cucumber.json", }, features = "src/test/java/CucumberFramework", tags = {
				"@sample" }, glue = "stepdefinition")

/*
 * @RunWith(Cucumber.class)
 * 
 * @CucumberOptions(plugin = { "json:target/cucumber.json" }, features = {
 * "src/test/resources/com/tnow/qa/features/tmrgp" }, tags = {
 * "@TMR_NZ_Sell_Flow" })
 */

public class JunitTest {

}
