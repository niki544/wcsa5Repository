package actionsclass;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DoubleClickMethod {
	//use to perform double click
	
	public static void main(String[] args) throws InterruptedException, IOException {
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		//launch the actitime
		driver.get("http://127.0.0.1/login.do;jsessionid=gfcrt3b4b4se6");
		
		new WebDriverWait(driver,Duration.ofSeconds(30)).until(ExpectedConditions.titleContains(driver.getTitle()));

		//perform  login operation
		driver.findElement(By.name("username")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("manager");
		driver.findElement(By.id("loginButton")).click();
		
		//home page
		new WebDriverWait(driver,Duration.ofSeconds(30)).until(ExpectedConditions.titleContains(driver.getTitle()));
		
		 // click on setting Module..
     	driver.findElement(By.xpath("//div[text()='Settings']/ancestor::a")).click();
     // click on logo and color
     	driver.findElement(By.xpath("//a[.='Logo & Color Scheme']")).click();
     	Thread.sleep(2000);
     	
     	// click on use custom logo
     	driver.findElement(By.id("uploadNewLogoOption")).click();
     	
     	// click on button to select the file
     //	driver.findElement(By.name("formCustomInterfaceLogo.logo")).click();
     	// perform Double Click
     	WebElement target = driver.findElement(By.name("formCustomInterfaceLogo.logo"));
     	
     	Actions act = new Actions(driver);
     	act.doubleClick(target).perform();
     	
     	Thread.sleep(2000);
     	 
     	Runtime.getRuntime().exec("./autoitPrograms/FileUploadInActiTime");
     	Thread.sleep(2000);
     	Runtime.getRuntime().exec("./autoitPrograms/FileUploadInActiTime");
     	Thread.sleep(2000);
     	driver.quit();
	}

}
