package assignmentPackage;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AssignmentForAmazon {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.amazon.in/");
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("samsung phones");
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='nav-search-submit-button']")).click();
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//span[@class='a-size-medium a-color-base a-text-normal'])[1]")).click();
		
		Thread.sleep(2000);
		WebElement colour = driver.findElement(By.xpath("(//img[@class='imgSwatch'])[1]"));
		Point ele = colour.getLocation();
		int xaxis = ele.getX();
		int yaxis = ele.getY();
		
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("window.scrollBy("+xaxis+","+(yaxis=80)+")");
		
		Thread.sleep(2000);
		colour.click();
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@id='a-autoid-23-announce']")).click();
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@id='contextualIngressPt']")).click();
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='GLUXZipUpdateInput']")).sendKeys("424201");
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[@id='GLUXZipUpdate-announce']")).click();
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='add-to-cart-button']")).click();
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[@id='attach-sidesheet-view-cart-button-announce']/preceding-sibling::input[@class='a-button-input']"));
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name='submit.delete.d67b0d2a-ae58-4c52-95ac-9f5b3145c288']")).click()
	}
}
