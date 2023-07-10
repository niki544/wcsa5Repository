package methodsOfWebDriver;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwitchToMethod {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("WebDriver.chrome.driver", "./driver/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://WWW.google.co.in/");
		driver.switchTo().activeElement().sendKeys("What is selenium",Keys.ENTER);
		Thread.sleep(5000);
		driver.close();
		
		//To perform back operation
		Thread.sleep(2000);
		driver.navigate().back();

	}

}
