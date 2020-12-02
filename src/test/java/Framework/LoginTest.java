package Framework;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.testng.annotations.AfterTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import junit.framework.Assert;
import pageObjects.Login;
import stepdefinition.Base;

public class LoginTest extends Base {

	@Test(dataProvider = "getData")

	public void testInvalidLogin(String userName, String passWord) throws Exception {
		try {

			initialize();
			driver.get(prop.getProperty("url"));
			driver.manage().window().maximize();
			Login l = new Login(driver);
			l.userName().sendKeys(userName);
			l.password().sendKeys(passWord);
			l.login().click();
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			// driver.switchTo().alert().accept();
			Assert.assertEquals(l.errorMessage().getText(), "Invalid username or password!");
		} catch (Exception ex) {
			throw ex;
		} finally {
			takeScreenshot("C:\\screenshots\\login-" + userName + ".jpg");
		}

	}

	@DataProvider
	public Object[][] getData() {

		Object[][] data = new Object[2][2];
		data[0][0] = "test1";
		data[0][1] = "test1";

		data[1][0] = "sample";
		data[1][1] = "sample";
		// Object[][] data = {{"test1","test1"}, {"sample","sample"}};
		return data;

	}

	@Test

	public void testLogin() throws Exception {

		initialize();
		driver.get(prop.getProperty("url"));
		driver.manage().window().maximize();
		Thread.sleep(2000);
		String userNameXPath = locators.getProperty("userName");
		driver.findElement(By.xpath(userNameXPath)).sendKeys("test");
		String passwordxPath = locators.getProperty("password");
		driver.findElement(By.xpath(passwordxPath)).sendKeys("test");
		String loginxPath = locators.getProperty("login");
		driver.findElement(By.xpath(loginxPath)).click();
		// driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		// driver.switchTo().alert().accept();
		String errormessagexPath = locators.getProperty("errorMessage");
		Assert.assertEquals(driver.findElement(By.xpath(errormessagexPath)).getText(), "Invalid username or password!");

	}

	@AfterTest
	public void teardown() {
		driver.close();
		driver = null;
	}
}
