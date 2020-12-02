package stepdefinition;

import pageObjects.Login;
import pageObjects.Profile;

public class StepDefinitionPageObjectModel extends Base {
	private Login l;
	private Profile p;

	/*
	 * @Given("^I open landingpage$") public void i_open_url() throws Throwable {
	 * initialize(); driver.get(prop.getProperty("url"));
	 * driver.manage().window().maximize(); l = new Login(driver); p = new
	 * Profile(driver); }
	 * 
	 * @When("^I enter UserName '(.*)'$") public void I_enter_UserName(String
	 * userName) { l.userName().sendKeys(userName); }
	 * 
	 * @When("^I enter PassWord '(.*)'$") public void i_enter_PassWord(String
	 * password) throws Throwable { l.password().sendKeys(password); }
	 * 
	 * @Then("^I click on 'Login' button$") public void i_click_on_Login_button()
	 * throws Throwable { l.login().click(); }
	 * 
	 * 
	 * @Then("^I need more time - (.*) sec$") public void
	 * i_need_more_time_sec(String seconds) throws Throwable { WebDriverWait d = new
	 * WebDriverWait(driver, Integer.valueOf(seconds));
	 * d.until(ExpectedConditions.textToBePresentInElement(p.header(), "Profile"));
	 * }
	 * 
	 * @Then("^I verify the values$") public void i_verify_the_values(DataTable
	 * arg1) throws Throwable { Assert.assertEquals("Profile",
	 * p.header().getText()); System.out.println("Actual:" + p.header().getText() +
	 * ", Expected:" + "Profile"); }
	 * 
	 * @Then("^I enter Search '(.*)'$") public void i_search_in_profile(String
	 * searchString) throws Throwable { p.search().sendKeys(searchString); }
	 * 
	 * @Then("^I clear values for 'Search'$") public void
	 * i_clear_values_for_Search() throws Throwable { p.search().clear(); }
	 * 
	 * @Then("^I click on 'DeleteAccount' button$") public void
	 * i_click_on_DeleteAccount_button() throws Throwable { JavascriptExecutor js =
	 * (JavascriptExecutor) driver; js.executeScript("window.scrollBy(0,1000)");
	 * p.deleteAccount().click();
	 * 
	 * }
	 * 
	 * @Then("^I click on 'Cancel'$") public void i_click_on_Cancel() throws
	 * Throwable { p.cancel().click();
	 * 
	 * }
	 * 
	 * @Then("^I select '(\\d+) rows' from 'DropDownList' dropdownbox$") public void
	 * i_select_rows_from_DropDownList_dropdownbox(int arg1) throws Throwable {
	 * Select s = new Select(p.dropDownList()); s.selectByVisibleText("10 rows");
	 * 
	 * }
	 * 
	 * @Then("^I click on 'LogOut' button$") public void i_click_on_LogOut_button()
	 * throws Throwable { p.logOut().click();
	 * 
	 * }
	 * 
	 */
}
