package XpathLocator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathCase3 {
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("WebDriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@id='email' and (@name='email')]")).sendKeys("niki@123");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@name='pass' and (@placeholder='Password')]")).sendKeys("98765");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//button[text()=\"Log in\" and (@data-testid='royal_login_button')]")).click();
		
		
		
	}
	
	
		
	}


