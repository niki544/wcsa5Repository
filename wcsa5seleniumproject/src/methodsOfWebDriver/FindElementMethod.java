package methodsOfWebDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElementMethod {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("WbDriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://127.0.0.1/login.do;jsessionid=a5brr5hkn9pcm");
		Thread.sleep(2000);

		WebElement usn = driver.findElement(By.xpath("//input[@class='textField']"));

		usn.sendKeys("Admin");

	}

}
