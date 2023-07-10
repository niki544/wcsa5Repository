package synchronization;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsingImplicitWait {
	public static void main(String[] args)  {

		System.setProperty("WebDriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		driver.get("https://www.instagram.com/");
		

		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("niki@123");

		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("12345678");

		driver.findElement(By.xpath("//div[text()='Log in']")).click();

	}

}
