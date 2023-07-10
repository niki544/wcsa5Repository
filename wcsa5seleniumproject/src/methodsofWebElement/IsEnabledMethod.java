package methodsofWebElement;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsEnabledMethod {
	public static void main(String[] args) {
		
		System.setProperty("WebDriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		driver.get("https://www.instagram.com/");
		
		driver.findElement(By.name("username")).sendKeys("niki12");
		driver.findElement(By.name("password")).sendKeys("1234");
		boolean loginbutton = driver.findElement(By.xpath("//button[contains(@class,'_acan _acap _acas _aj1-')]")).isEnabled();
		System.out.println(loginbutton);
	}

}
