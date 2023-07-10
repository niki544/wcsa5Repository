package synchronization;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ActiTimeSynchronization {
	public static void main(String[] args) {
		System.setProperty("WebDriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("http://127.0.0.1/login.do;jsessionid=7v60jrutanbj");
		
		String actualTitleOfLoginPage = driver.getTitle();
		if(actualTitleOfLoginPage.equals("actiTime=Login"))
		{
			System.out.println("Title is matched,Test case Passed");
			driver.findElement(By.name("username")).sendKeys("admin");
			driver.findElement(By.name("pwd")).sendKeys("manager");
			driver.findElement(By.id("loginButton")).click();
			
		}
		
		else
		{
			System.out.println("We will get Exception");
		}
		
		//Home Page
		
		String actualTitleOfHomePage = driver.getTitle();
		
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(30));
		wait.until(ExpectedConditions.titleContains(actualTitleOfHomePage));
		
		//if(actualTitleOfHomePage.equals("actiTime - Enter Time-Track"))
			
		//{
			System.out.println("Title is matched,Test case Passed");
		//}
		
		//else
		//{
			//System.out.println("Title is not matched,Test Case is Failed");
		//  }
		
	}

}
