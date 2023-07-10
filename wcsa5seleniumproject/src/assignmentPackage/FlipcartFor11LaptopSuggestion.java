package assignmentPackage;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FlipcartFor11LaptopSuggestion {
	
	public static void main(String[] args) {
		
		System.setProperty("WebDriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.get("https://www.flipkart.com/");
		
		//List<WebElement> searchbox = driver.findElements(By.xpath("//input[@name='q']"));
		
		//driver.findElement(By.xpath("//input[@name='q']")).sendKeys("Hp Laptops");
		
		//driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
		
		driver.findElement(By.xpath("//button[text()='✕']")).click();  //handle popup
		
		driver.findElement(By.name("q")).sendKeys("Hp Laptop");
		
		driver.findElement(By.xpath("//button[@class='L0Z3Pu']")).click();
		
		driver.findElement(By.xpath("//div[@class='_24_Dny']/following-sibling::div[text()='Core i7']")).click();
		
		driver.findElement(By.xpath("//div[text()='Brand']")).click();
		
		driver.findElement(By.xpath("//div[text()='Operating System']")).click();
		
		driver.findElement(By.xpath("//div[text()='Windows 11']")).click();
		
		driver.findElement(By.xpath("//div[text()='Customer Ratings']")).click();
		
		driver.findElement(By.xpath("//div[text()='4★ & above']")).click();
	
		
		
		
	}

}
