package assignmentPackage;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import com.google.common.io.Files;

	public class ScreenshotOfAnElement {	
		public static void main(String[] args) throws IOException {
			
			System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
			RemoteWebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
			
			driver.get("http://desktop-0ae2i98/login.do;jsessionid=6dio2ggltjtea");
			
		    WebElement element = driver.findElement(By.xpath("//img[@height='100']"));
		    File src = element.getScreenshotAs(OutputType.FILE);
		    File dest = new File("./screenshot/element2.png");
		    Files.copy(src, dest);
		         
		}

	}