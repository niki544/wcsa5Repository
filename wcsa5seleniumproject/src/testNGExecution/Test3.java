package testNGExecution;

import java.time.Duration;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class Test3 {
  @Test
  public void Test3Method() throws InterruptedException {
	  System.setProperty("WebDriver.edge.driver", "./drivers/msedgedrivers.exe");
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.google.co.in/");
		driver.switchTo().activeElement().sendKeys("selenium", Keys.ENTER);
		Thread.sleep(2000);
		driver.quit();
		
  }
}
