package assignmentPackage;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MoveToElementByUsingBlueStone {
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webDriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("https://www.bluestone.com/");
		
		driver.findElement(By.id("denyBtn")).click();
		
		WebElement target = driver.findElement(By.xpath("//a[text()='Coins ']"));
		
		Actions act = new Actions(driver);
		
		act.moveToElement(target).perform();
		
		driver.findElement(By.xpath("//span[@data-p='l-gold-coins-weight-1gms,m']")).click();
		
		//driver.findElement(By.xpath("//div[@class='mousetrap']")).isDisplayed();
		
		WebElement coin = driver.findElement(By.className("mousetraps"));
		if(coin.isDisplayed())
		{
			Thread.sleep(2000);
			driver.quit();
		}
		
		else
		{
			System.out.println("Exception!!!");
		}
		
		
		
		
		
	}

}
