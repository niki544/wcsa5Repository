package methodsofWebElement;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SubmitMethod {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("WebDriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

		driver.get("https://www.instagram.com/");

		driver.findElement(By.name("username")).sendKeys("mahajan");
		driver.findElement(By.name("password")).sendKeys("123456");
		WebElement Loginbutton = driver.findElement(By.xpath("//button[contains(@class,'_acan _acap _acas _aj1-')]"));

		Loginbutton.submit();
		//Loginbutton.click();
		//Thread.sleep(2000);

	}

}
