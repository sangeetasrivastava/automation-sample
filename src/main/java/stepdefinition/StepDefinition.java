package stepdefinition;

import java.io.IOException;
import java.util.Iterator;
import java.util.Map;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import cucumber.api.DataTable;
import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepDefinition extends Base {

	private static final String String = null;
	private Map<String, String> xpathMap = null;

	public WebElement findElement(String fieldName) {
		return driver.findElement(By.xpath(locators.getProperty(fieldName)));
	}

	@Given("^I open landingpage$")
	public void i_open_url() throws Throwable {
		initialize();
		driver.get(prop.getProperty("url"));
		driver.manage().window().maximize();

		System.out.println("Step--> I open landingpage");
	}

	@When("^I enter (.*) '(.*)'$")
	public void I_enter_element_value_(String textboxName, String fieldValue) {
		findElement(textboxName).sendKeys(fieldValue);

		System.out.println("Step--> I enter " + textboxName + " " + fieldValue);
	}

	@Then("^I click on '(.*)' button$")
	public void i_click_on_button(String buttonName) {
		findElement(buttonName).click();

		System.out.println("Step--> I click on " + buttonName + " button");
	}

	@Then("^I need more time - (.*) sec$")
	public void i_need_more_time_sec(String seconds) throws Throwable {
		Thread.sleep(Integer.valueOf(seconds) * 1000);

		System.out.println("Step--> I need more time - " + seconds + " sec");
	}

	@Then("^I verify the values$")
	public void i_verify_the_values(DataTable datatable) {
		Map<String, String> conditionMap = datatable.asMap(String.class, String.class);

		// for (String condition : conditionMap.keySet()) {
		Iterator<String> it = conditionMap.keySet().iterator();
		while (it.hasNext()) {
			String condition = it.next();
			String expected = conditionMap.get(condition);
			String actual = findElement(condition).getText();

			System.out.println("Comparing " + actual + " with " + expected);
			Assert.assertEquals(actual, expected);
		}

		System.out.println("Step--> I verify the values");
	}

	@Then("^I clear values for '(.*)'$")
	public void i_clear_values_for_Field(String textboxName) {
		findElement(textboxName).clear();

		System.out.println("Step--> I clear values for " + textboxName);
	}

	@Then("^I scroll down$")
	public void i_scroll_down() {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,1000)");

		System.out.println("Step--> I scroll down");
	}

	@Then("^I scroll up$")
	public void i_scroll_up() {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,-1000)");

		System.out.println("Step--> I scroll up");
	}

	@Then("^I select '(.*)' from '(.*)' dropdownbox$")
	public void i_select_rows_from_dropdownList(String dropdownValue, String dropdownName) {
		Select s = new Select(findElement(dropdownName));
		s.selectByVisibleText(dropdownValue);

		System.out.println("Step--> I select " + dropdownValue + " from " + dropdownName + " dropdownbox");
	}

	@After
	public void teardown(Scenario scenario) throws IOException {

		System.out.println("Step--> teardown ");

		scenario.embed(((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES), "image/png");

		driver.close();
		driver = null;
	}

}
