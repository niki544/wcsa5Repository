package pom;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Stale {
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver  driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("http://desktop-0ae2i98/login.do;jsessionid=bi7iaoacrok3");
		
		WebElement usnTB = driver.findElement(By.name("username"));
		usnTB.sendKeys("admin");
		WebElement pwd = driver.findElement(By.name("pwd"));
		pwd.sendKeys("manager");
		driver.findElement(By.id("loginButton")).click();
		
		driver.navigate().refresh();
		usnTB.sendKeys("admin");
		
		
	}

}
