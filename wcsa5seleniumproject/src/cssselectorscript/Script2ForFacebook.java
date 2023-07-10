package cssselectorscript;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Script2ForFacebook {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("WebDriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		Thread.sleep(4000);

		driver.findElement(By.cssSelector("input[id^='e']")).sendKeys("nikii12");
		Thread.sleep(4000);

		driver.findElement(By.cssSelector("input[id$='s']")).sendKeys("123454");
		Thread.sleep(4000);

		driver.findElement(By.cssSelector("button[name='login']")).click();

	}

}
