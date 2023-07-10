package frameScrpit;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TaskOnGoogle {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://WWW.Google.com");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//a[@class='gb_d']")).click();
		Thread.sleep(2000);
		
		//handle by using int index
		driver.switchTo().frame(1);
		driver.findElement(By.xpath("//span[@style='background-position: 0 -348px;']")).click();
		Thread.sleep(2000);

	}

}
