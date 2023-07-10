package assignmentQuestions;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToCloseAllTheBrowserWithoutQuit {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("http://omayo.blogspot.com/");
		
		// launch the child window
				Thread.sleep(2000);
				WebElement childwindow = driver.findElement(By.xpath("//a[text()='Open a popup window']"));
				
				Point elementloc = childwindow.getLocation();
				int xaxis = elementloc.getX();
				int yaxis = elementloc.getY();
				
				// scroll till open a pop up window link
				JavascriptExecutor jse = (JavascriptExecutor)driver;
				jse.executeScript("window.scrollBy("+xaxis+","+(yaxis-80)+")");
				
				// click on link to open child browser
				childwindow.click();
				// close the all browsers 
				Thread.sleep(2000);
				driver.quit();
				
				// get the handle or address of parent and child window
				Set<String> allhandles = driver.getWindowHandles();
				
				// close the browser by reading address of each window or browser
				for(String wh : allhandles)
				{
					// switch the control to each browser by using switchTo();
					Thread.sleep(2000);
					driver.switchTo().window(wh).close();
				}
	}

}
