package testNGExecution;

import java.time.Duration;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Test2 {
  @Test
  public void Test2Method() throws InterruptedException {
	  System.setProperty("WebDriver.gecko.driver", "./drivers/geckodrivers.exe");
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.google.co.in/");
		driver.switchTo().activeElement().sendKeys("sql", Keys.ENTER);
		Thread.sleep(2000);
		driver.quit();
		
  }
}
