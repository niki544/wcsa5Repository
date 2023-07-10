package javaScriptExecutor;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollUp {
	public static void main(String[] args) throws InterruptedException {
		
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.get("https://dashboards.handmadeinteractive.com/jasonlove/");
		
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		
		//jse.executeScript("window.scrollBy(0,5467)");
		//jse.executeScript("window.scrollBy(0,-5467)");
		
		// scroll Down
				Thread.sleep(2000);
				jse.executeScript("window.scrollBy(0,1000)");
				Thread.sleep(2000);
				// To perform scroll up ,First we need to do scroll down
				jse.executeScript("window.scrollBy(0,-1000)");
		
		
	}

}
