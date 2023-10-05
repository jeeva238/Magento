package testcase001;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class BaseClass {

	public String url = "https://magento.softwaretestingboard.com/";

	public String username = "jeeva123@gmail.com";

	public String password = "jeeva@123";

	public static WebDriver driver;

	@BeforeClass

	public void setup() {
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "//Drivers//geckodriver.exe");

		driver = new FirefoxDriver();

		driver.get(url);

		driver.manage().window().maximize();

	}

	@AfterClass

	public void close() {

		driver.quit();
	}

}
