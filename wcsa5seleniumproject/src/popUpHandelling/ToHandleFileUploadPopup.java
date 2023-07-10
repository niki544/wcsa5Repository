package popUpHandelling;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ToHandleFileUploadPopup {
	public static void main(String[] args) throws IOException, InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("http://omayo.blogspot.com/");

		Actions act = new Actions(driver);

		WebElement uploadbutton = driver.findElement(By.id("uploadfile"));
		act.doubleClick(uploadbutton).perform();

		Runtime.getRuntime().exec("./autoitPrograms/OmayoFileUpload1.exe");
		Thread.sleep(2000);
		Runtime.getRuntime().exec("./autoitPrograms/OmayoFileUpload1.exe");
		Thread.sleep(2000);
		
	

	}

}
