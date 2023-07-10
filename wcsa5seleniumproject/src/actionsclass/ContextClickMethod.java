package actionsclass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ContextClickMethod {

	// use to perform right click
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		driver.get("file:///C:/Users/DELL/Desktop/WCSA5/WebElement/SingleSelectDropDown.html");

		WebElement target = driver.findElement(By.id("menu"));

		// to perform right click
		Actions act = new Actions(driver);
        Thread.sleep(2000);
		act.contextClick(target).perform();
	}

}
