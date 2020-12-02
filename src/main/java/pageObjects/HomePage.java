package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage {

	public WebDriver driver;

	By Elements = By.xpath("//div[@class='home-body']/div/div[1]");
	By Forms = By.xpath("//div[@class='home-body']/div/div[2]");
	By Alerts = By.xpath("//div[@class='home-body']/div/div[3]");
	By Widgets = By.xpath("//div[@class='home-body']/div/div[4]");
	By Interactions = By.xpath("//div[@class='home-body']/div/div[5]");
	By App = By.xpath("//div[@class='home-body']/div/div[6]");

	public HomePage(WebDriver driver) {
		this.driver = driver;
	}

	public WebElement getElements() {
		return driver.findElement(Elements);
	}

	public WebElement getForms() {
		return driver.findElement(Forms);
	}

	public WebElement getAlerts() {
		return driver.findElement(Alerts);
	}

	public WebElement getWidgets() {

		return driver.findElement(Widgets);

	}

	public WebElement getInteractions() {

		return driver.findElement(Interactions);

	}

	public WebElement getApp() {

		return driver.findElement(App);

	}

}
