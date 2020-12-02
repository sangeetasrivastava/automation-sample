package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Books {

	public WebDriver driver;

	@FindBy(xpath = "//button[text()='Log out']")
	WebElement LogOut;

	public Books(WebDriver driver) {
		this.driver = driver;
	}

	public WebElement logOut() {
		return LogOut;
	}

}