package cssselectorscript;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Script4ForLinkdien {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("WebDriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.linkedin.com/login");
		Thread.sleep(4000);

		driver.findElement(By.cssSelector("input[id^='user']")).sendKeys("dell");
		Thread.sleep(4000);

		driver.findElement(By.cssSelector("input[id*='pas']")).sendKeys("16082001");
		Thread.sleep(4000);

		driver.findElement(By.cssSelector("button[class='btn__primary--large from__button--floating']")).click();
		Thread.sleep(4000);

	}

}
