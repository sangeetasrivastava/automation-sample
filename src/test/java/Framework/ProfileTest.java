package Framework;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import junit.framework.Assert;
import pageObjects.Login;
import pageObjects.Profile;
import stepdefinition.Base;

public class ProfileTest extends Base {
	@Test
	public void Profile() throws Exception {
		initialize();
		// driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get(prop.getProperty("url"));
		driver.manage().window().maximize();
		Login l = new Login(driver);
		l.userName().sendKeys("test@test.com");
		l.password().sendKeys("Testing12$");
		l.login().click();
		// Thread.sleep(10000);

		Profile p = new Profile(driver);
		// Explicit wait
		WebDriverWait d = new WebDriverWait(driver, 20);
		// d.until(ExpectedConditions.visibilityOfElementLocated(p.getHeaderBy()));
		d.until(ExpectedConditions.textToBePresentInElement(p.header(), "Profile"));
		Assert.assertEquals("Profile", p.header().getText());
		System.out.println("Actual:" + p.header().getText() + ", Expected:" + "Profile");
		Assert.assertTrue(p.search().isDisplayed());
		p.search().sendKeys("Git Pocket Guide");
		// Assert.assertTrue(p.firstLink().isDisplayed());
		p.search().clear();
		p.search().sendKeys("sp");
		// Assert.assertTrue(p.secondLink().isDisplayed());
		// Assert.assertFalse(p.firstLink().isDisplayed());
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,1000)");
		p.deleteAccount().click();
		p.cancel().click();

		Select s = new Select(p.dropDownList());
		s.selectByVisibleText("5 rows");
		s.selectByValue("10");
		s.selectByVisibleText("20 rows");
		p.logOut().click();
	}

	@AfterTest
	public void teardown() {
		driver.close();
		driver = null;
	}
}
