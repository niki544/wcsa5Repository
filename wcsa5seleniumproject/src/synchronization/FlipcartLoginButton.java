package synchronization;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FlipcartLoginButton {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("WebDriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver(); // Launch Browser
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/"); // FlipCart Web application

		driver.findElement(By.xpath("//button[text()='✕']")).click(); // Handle Popup

		driver.findElement(By.xpath("//span[text()='Cart']")).click(); // Click on a cart

		Thread.sleep(2000);

		driver.findElement(By.xpath("//span[text()='Login']")).click(); // Click on a login button

	}

}
