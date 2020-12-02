package stepdefinition;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import javax.imageio.ImageIO;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import ru.yandex.qatools.ashot.AShot;
import ru.yandex.qatools.ashot.Screenshot;
import ru.yandex.qatools.ashot.shooting.ShootingStrategies;

public class Base {
	public WebDriver driver;
	public Properties prop;
	public Properties locators;

	public void initialize() throws Exception {
		loadProperties();
		String browserName = prop.getProperty("browser");

		if (browserName.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver", prop.getProperty("chromeDriver"));
			driver = new ChromeDriver();
		} else if (browserName.equals("firefox")) {
			System.setProperty("webdriver.gecko.driver", prop.getProperty("firefoxDriver"));
			driver = new FirefoxDriver();

		} else if (browserName.equals("IE")) {
			//
		}
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}

	private void loadProperties() throws IOException {
		prop = new Properties();
		FileInputStream fis = new FileInputStream(
				"C:\\automation-sample\\src\\main\\java\\resources\\data.properties");
		prop.load(fis);
		locators = new Properties();
		FileInputStream loc = new FileInputStream(
				"C:\\automation-sample\\src\\main\\java\\resources\\locators.properties");
		locators.load(loc);
	}

	protected void takeScreenshot(String fileName) throws IOException {
		// Screenshot screenshot = new AShot().takeScreenshot(driver);
		Screenshot screenshot = new AShot().shootingStrategy(ShootingStrategies.viewportPasting(100))
				.takeScreenshot(driver);
		ImageIO.write(screenshot.getImage(), "jpg", new File(fileName));
	}

}
