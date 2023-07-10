package XpathAssignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathAssignmentCase3 {
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("WebDriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://desktop-0ae2i98/login.do;jsessionid=e4y1kblm0qie");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@name='username' and (@type='text')]")).sendKeys("admin");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@name='pwd' and (@type='password')]")).sendKeys("manager");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//a[text()='Login' and (@id='loginButton')]")).click();
	}

}
