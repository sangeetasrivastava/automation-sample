package pageObjects;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Profile {

	public WebDriver driver;

	@FindBy(xpath = "//*[@class='main-header']")
	WebElement Header;

	@FindBy(xpath = "//input[@id='searchBox']")
	WebElement Search;

	@FindBy(xpath = "//button[text()='Log out']")
	WebElement Logout;

	@FindBy(xpath = "//button[text()='Delete Account']")
	WebElement DeleteAccount;

	@FindBy(xpath = "//button[text()='Cancel']")
	WebElement Cancel;

	@FindBy(xpath = "//button[@id='gotoStore']")
	WebElement GoStore;

	@FindBy(xpath = "//a[text()='Git Pocket Guide']/@href")
	WebElement FirstLink;

	@FindBy(xpath = "//a[text()='Speaking JavaScript']")
	WebElement SecondLink;

	@FindBy(xpath = "//div[@class='-center']/span[2]/select")
	WebElement DropDownList;

	@FindBy(xpath = "//div[@class='-center']/span[2]/select/option[2]")
	WebElement DropDownList2;

	public Profile(WebDriver driver) throws IOException {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public WebElement header() {
		return Header;
	}

	public By getHeaderBy() {
		return By.xpath("//*[@class='main-header']");
	}

	public WebElement search() {
		return Search;
	}

	public WebElement logOut() {
		return Logout;
	}

	public WebElement deleteAccount() {
		return DeleteAccount;
	}

	public WebElement cancel() {
		return Cancel;
	}

	public WebElement goStore() {
		return GoStore;
	}

	public WebElement firstLink() {
		return FirstLink;
	}

	public WebElement secondLink() {
		return SecondLink;
	}

	public WebElement dropDownList() {
		return DropDownList;
	}

	public WebElement dropDownList2() {
		return DropDownList2;
	}

}
