package XpathLocator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathCase4 {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("WebDriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Thread.sleep(2000);

		driver.findElement(By.xpath("//input[contains(@name,'username')]")).sendKeys("Admin");
		Thread.sleep(2000);

		driver.findElement(By.xpath("//input[contains(@type,'password')]")).sendKeys("admin123");
		Thread.sleep(2000);

		driver.findElement(By.xpath(
				"//button[contains(@class,'oxd-button oxd-button--medium oxd-button--main orangehrm-login-button')]"))
				.click();

	}

}
