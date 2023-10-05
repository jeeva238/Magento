package testcase001;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class LoginPage extends BaseClass {

	@Test

	public void Registration() {

		driver.findElement(By.xpath("(//a[text()=\"Create an Account\"])[1]")).click();

		driver.findElement(By.xpath("(//a[text()=\"Create an Account\"])[1]")).click();

		driver.findElement(By.id("firstname")).sendKeys("jeeva");

		driver.findElement(By.id("lastname")).sendKeys("muraga");

		driver.findElement(By.id("email_address")).sendKeys("jeeva123@gmail.com");

		driver.findElement(By.id("password")).sendKeys("jeeva@123");

		driver.findElement(By.id("password-confirmation")).sendKeys("jeeva@123");

		driver.findElement(By.xpath("(//button[@type=\"submit\"])[2]")).submit();

	}

	@Test(priority = 1)

	public void moverhover() throws InterruptedException {

		WebElement Men = driver
				.findElement(By.xpath("(//a[@href=\"https://magento.softwaretestingboard.com/men.html\"])[1]"));

		Men.click();

		driver.findElement(By.xpath("//a[text()=\"Jackets\"]")).click();

		driver.findElement(
				By.xpath("(//a[@href=\"https://magento.softwaretestingboard.com/proteus-fitness-jackshirt.html\"])[2]"))
				.click();

		Thread.sleep(1500);

		driver.findElement(By.xpath("//div[@id=\"option-label-size-143-item-168\"]")).click();

		driver.findElement(By.xpath("//div[@id=\"option-label-color-93-item-56\"]")).click();

		driver.findElement(By.xpath("//button[@id=\"product-addtocart-button\"]")).click();

		Thread.sleep(1500);

		WebElement Men1 = driver
				.findElement(By.xpath("(//a[@href=\"https://magento.softwaretestingboard.com/men.html\"])[1]"));

		Men1.click();

		driver.findElement(By.xpath("//a[text()=\"Bottoms\"]")).click();

		driver.findElement(By.xpath("//div[text()=\"Category\"]")).click();

		driver.findElement(
				By.xpath("//a[@href=\"https://magento.softwaretestingboard.com/men/bottoms-men.html?cat=18\"]"))
				.click();

		driver.findElement(By.xpath("//img[@alt=\"Cronus Yoga Pant \"]")).click();

		Thread.sleep(1500);

		driver.findElement(By.xpath("//div[@id=\"option-label-size-143-item-177\"]")).click();

		Thread.sleep(2500);

		driver.findElement(By.xpath("//div[@id=\"option-label-color-93-item-58\"]")).click();

		Thread.sleep(1500);

		driver.findElement(By.xpath("(//button[@type=\"submit\"])[2]")).click();

		Thread.sleep(2500);

	}

	@Test(priority = 3)

	public void checkout() throws InterruptedException {

		driver.findElement(By.xpath("(//div[@class=\"header content\"]/..//div[2]//div//a)[1]")).click();

		Thread.sleep(2500);

		driver.findElement(By.xpath("//span[text()=\"View and Edit Cart\"]")).click();

		Thread.sleep(1500);

		driver.findElement(By.xpath("//span[text()=\"Proceed to Checkout\"]")).click();

		Thread.sleep(6000);
	}

	@Test
	public void shipping() throws InterruptedException {

		Thread.sleep(1500);

		driver.findElement(By.xpath("(//span[text()=\"Sign In\"])[1]")).click();
	}

}
