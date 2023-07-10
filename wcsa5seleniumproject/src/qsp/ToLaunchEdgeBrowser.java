package qsp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class ToLaunchEdgeBrowser {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("WebDriver.chrome.driver", "./drivers/chromedriver.exe");
		
		  WebDriver driver=new EdgeDriver();
		
		driver.manage().window().maximize();
		
		Thread.sleep(2000);
		
		driver.close();

	}


}
