package methodsOfWebDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class QuiteMethod {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("Webdriver.gecko.driver", "./drivers/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("http://omayo.blogspot.com/");

		Thread.sleep(2000);
		// click on link for the child browser
		driver.findElement(By.xpath("//a[text()='open a popup window,]")).click();

		// close parent as well as child browser
		driver.quit();

	}

}
