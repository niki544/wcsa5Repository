package popUpHandelling;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ConfirmationPopup {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.get("file:///C:/Users/DELL/Desktop/WCSA5/WebElement/Confirmation%20Popup.html");
		
		//to generate confirmation popup click on submit button
		driver.findElement(By.tagName("input")).click();
		
		//handle confirmation popup by using switchto()
		Thread.sleep(2000);
		Alert al = driver.switchTo().alert();
		//al.accept();  //for accept the confirmation popup
		//al.dismiss();  //for dismiss confirmation popup
		System.out.println(al.getText());
		al.accept();
		al.sendKeys("getText");
	}

}
