package XpathAssignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathAssignmentCase4 {
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("WebDriver.chrome.driver", "./drivers/chromeDriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[contains(@name,'email')]")).sendKeys("niki@123");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[contains(@name,'pass')]")).sendKeys("123456");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//button[contains(@name,'login')]")).click();
		
		
	}

}
