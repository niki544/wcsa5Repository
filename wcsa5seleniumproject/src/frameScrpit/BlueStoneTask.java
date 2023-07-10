package frameScrpit;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BlueStoneTask {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.get("https://www.bluestone.com/");
		
		//handle hidden division popup
		driver.findElement(By.id("denyBtn")).click();
		
		Thread.sleep(2000);
		
		//handle the frame by switch the control to frame
		
		//identify frame by using xpath
		WebElement frameelement = driver.findElement(By.xpath("//iframe[@id='fc_widget']"));
		driver.switchTo().frame(frameelement);
		
		//driver.switchTo().frame(5);  //handle frame by using index
		
		//driver.switchTo().frame("fc_widget");  //handle by using string name or id
		
		WebElement chatBox = driver.findElement(By.id("chat-icon"));
		chatBox.click();
		
		//WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(30));
		//wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@id='chat-icon']"))).click();
		
		
		//switch the control again back to the main webpage
		driver.switchTo().defaultContent();
		driver.findElement(By.id("chat-fc-name")).sendKeys("Nikii");
		
		driver.findElement(By.id("chat-fc-email")).sendKeys("niki@122");
		
		driver.findElement(By.id("chat-fc-phone")).sendKeys("1234567890");
		
		
		
	}

}
