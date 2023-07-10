package actionsclass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MoveToElement {
	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		//launch the blue stone application
		driver.get(
				"https://www.bluestone.com/?utm_campaign=&utm_medium=cpc&utm_source=google&gclid=CjwKCAjwp6CkBhB_EiwAlQVyxVcxXwHo1cDCGCJLEmOJw2pCLeo_48psyz9H878pLIM9b4rNCuR-uBoCtskQAvD_BwE");

		driver.findElement(By.id("denyBtn")).click();

		driver.findElement(By.xpath("//a[text()='Watch Jewellery ']")).click();

		Thread.sleep(2000);
		WebElement target = driver.findElement(By.xpath("//a[text()='Watch Jewellery ']"));

		//to perform mouse action on webelement
		Actions act = new Actions(driver);

		//to perform mousehover action
		act.moveToElement(target).perform();

		driver.findElement(By.xpath("//a[text()='Band']")).click();

	}

}
