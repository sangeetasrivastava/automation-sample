package pageObjects;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Login {

	public WebDriver driver;

	By UserName = By.xpath("//input[@id='userName']");
	By Password = By.xpath("//input[@id='password']");
	By Login = By.xpath("//*[@id='login']");
	By NewUser = By.xpath("//*[@id='newUser']");
	By ErrorMessage = By.xpath("//*[@id='name']");

	public Login(WebDriver driver) throws IOException {
		this.driver = driver;
	}

	public WebElement userName() {
		return driver.findElement(UserName);
	}

	public WebElement password() {
		return driver.findElement(Password);
	}

	public WebElement login() {
		return driver.findElement(Login);
	}

	public WebElement newUser() {
		return driver.findElement(NewUser);
	}

	public WebElement errorMessage() {
		return driver.findElement(ErrorMessage);
	}

}
