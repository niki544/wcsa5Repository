package XpathLocator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathCase6DependantAndIndependantFeature {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("Webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		
		Thread.sleep(2000);
		//(when login Popup comes then we handle)
		driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();  //(we use this line)
		
		//String pageTitle=driver.getTitle();
	    //System.out.println("pageTitle");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[contains(@placeholder,'Search for products, brands and more')]")).sendKeys("HP Laptop");
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[contains(@type,'submit')]")).click();
	
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//div[@class='_213eRC _2ssEMF']/descendant::div[@class='_2gmUFU _3V8rao'])[2]")).click();
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[text()='HP']")).click();
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[text()='Operating System']")).click();
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[text()='Windows 10']")).click();
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[text()='Core i5']")).click();
		
//		WebElement element = driver.findElement(By.xpath("//div[text()='HP Omen Core i5 7th Gen - (8 GB/1 TB HDD/128 GB SSD/Windows 10 Home/4 GB Graphics/NVIDIA GeForce GTX 1...']/ancestor::div[@class='_3pLy-c row']/descendant::div[@class='_30jeq3 _1_WHN1']"));
//		String text = element.getText();
//     	System.out.println(text);

		WebElement element = driver.findElement(By.xpath("//div[text()='HP Omen Core i5 7th Gen - (8 GB/1 TB HDD/128 GB SSD/Windows 10 Home/4 GB Graphics/NVIDIA GeForce GTX 1...']/../..//div[text()='₹87,490']"));
	   String text = element.getText();
	   System.out.println(text);
		    
		    
		    
		    
		    
	}


	}


