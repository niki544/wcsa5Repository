package methodsofWebElement;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SendKeysMethod {

	public static void main(String[] args) {
		
		System.setProperty("WebDriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		//driver.findElement(By.name("username")).sendKeys(" Admin");
		//driver.findElement(By.name("password")).sendKeys(" admin123");
		
		WebElement usnTB = driver.findElement(By.name("username"));
		usnTB.sendKeys("Admin");
		
		WebElement passTB = driver.findElement(By.name("password"));
		passTB.sendKeys("admin123");
	}
}
