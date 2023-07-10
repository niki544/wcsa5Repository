package assignmentPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginPageAssignment {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("WebDriver.chrome.driver", "./drivers/chromedriver.exe");
	    WebDriver driver=new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.get("https://www.netflix.com/in/");
	    
	    //To identify webElement we use Locators
	    driver.findElement(By.id("id_userLoginId")).sendKeys("nikitamahajan544@gmail.com");//Username textbox
	    
	   driver.findElement(By.id("id_password")).sendKeys("123456");
	   Thread.sleep(4000);
	   driver.findElement(By.cssSelector("button[class='btn login-button btn-submit btn-small']")).click();
	   
	    

	}

}
