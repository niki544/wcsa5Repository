package popUpHandelling;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertPopup {
	public static void main(String[] args) throws AWTException, InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.get("file:///C:/Users/DELL/Desktop/WCSA5/WebElement/Alert%20Popup.html");
		
		//to generate popup click on button
		driver.findElement(By.xpath("//button[@type='button']")).click();
		
		//handle alert popup by using robot class
//		Robot robot = new Robot();
//		robot.keyPress(KeyEvent.VK_ENTER);
//		robot.keyRelease(KeyEvent.VK_ENTER);
//		
//		Thread.sleep(2000);
//		robot.keyPress(KeyEvent.VK_ENTER);
//		robot.keyRelease(KeyEvent.VK_ENTER);
//		
		//handle alert popup by using switch to method
		Alert al = driver.switchTo().alert();
		Thread.sleep(2000);
		al.accept();  //for accept the alert popup
		al.dismiss();  //for dismiss alert popup
		System.out.println(al.getText()); //return the text of alert popup
		
		
	}

}
