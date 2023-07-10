package assignmentPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SpicejetLogin {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("WebDriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.spicejet.com/profile/sign-in");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//div[@class='css-76zvg2 r-jwli3a r-ubezar r-majxgm']")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@type='number']")).sendKeys("1234567890");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("niki@12");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//div[@data-testid='login-submit-btn']")).click();
		
		
		

	}

}
