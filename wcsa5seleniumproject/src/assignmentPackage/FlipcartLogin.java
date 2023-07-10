package assignmentPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FlipcartLogin {
	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("Webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		Thread.sleep(2000);
		
		String pageTitle=driver.getTitle();
	    System.out.println("pageTitle");
		
		driver.findElement(By.xpath("//input[contains(@placeholder,'Search for products, brands and more')]")).sendKeys("HP Laptop");
		
		driver.findElement(By.xpath("//button[contains(@type,'submit')]")).click();
		
	
		    
		    
		    
		    
		    
	}

}
