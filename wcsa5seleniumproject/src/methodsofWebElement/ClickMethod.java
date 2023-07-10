package methodsofWebElement;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClickMethod {
	public static void main(String[] args) {

		System.setProperty("WebElemnt,chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		driver.get("file:///C:/Users/DELL/Desktop/WCSA5/WebElement/SingleSelectDropDown.html");
		
		driver.findElement(By.id("menu")).click();
		
		WebElement dropdown = driver.findElement(By.id("menu"));
		dropdown.clear();

		
		// driver.findElement(By.name("username")).sendKeys("niki");
		// driver.findElement(By.name("pwd")).sendKeys("12345");

		//WebElement usnTB = driver.findElement(By.name("username"));
		//WebElement passTB = driver.findElement(By.name("pwd"));

		//usnTB.sendKeys("niki");
		//passTB.sendKeys("12345");
		//usnTB.click();
		//passTB.clear();

		

	}

}
