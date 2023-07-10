package cssselectorscript;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Script1 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("WebDriver.chrome.driver", "./drivers/chromedriver.exe");
	    WebDriver driver=new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.get("https://www.instagram.com/");
	    Thread.sleep(4000);
	    
	    driver.findElement(By.cssSelector("input[name*='er']")).sendKeys("admin");
	    Thread.sleep(4000);
	    
	    driver.findElement(By.cssSelector("input[name*='word']")).sendKeys("123456");
	    Thread.sleep(4000);
	    
	    driver.findElement(By.cssSelector("button[class*='ap _a']")).click();

	}

}
