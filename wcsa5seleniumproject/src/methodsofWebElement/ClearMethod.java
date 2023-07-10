package methodsofWebElement;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClearMethod {
	public static void main(String[] args) throws InterruptedException {

		System.setProperty("WebElemnt,chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		driver.get("http://desktop-0ae2i98/login.do;jsessionid=6o6h4q45nseli");

		//driver.findElement(By.name("username")).sendKeys("Admin");
		//driver.findElement(By.name("pwd")).sendKeys("Manager");

		//Thread.sleep(2000);
		//driver.findElement(By.name("username")).clear();
		//driver.findElement(By.name("pwd")).clear();
		
		WebElement usnTB = driver.findElement(By.name("username"));
		WebElement passTB = driver.findElement(By.name("pwd"));

		usnTB.sendKeys("Admin");
		passTB.sendKeys("Manager");
		Thread.sleep(2000);
		
		usnTB.clear();
		passTB.clear();

	}

}
