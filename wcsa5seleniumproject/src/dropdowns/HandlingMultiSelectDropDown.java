package dropdowns;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HandlingMultiSelectDropDown {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("WebDriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.get("file:///C:/Users/DELL/Desktop/WCSA5/WebElement/MultiSelectDropdown.html");

		WebElement MultiSelectDD = driver.findElement(By.id("menu"));
		Select sel = new Select(MultiSelectDD);
		Thread.sleep(2000);

		// to select using index method

		sel.selectByIndex(1);
		
        Thread.sleep(2000);
		// to select using visibleText Method
        
        sel.selectByVisibleText("Pav Bhaji");
        Thread.sleep(2000);

		// to select using value method

		sel.selectByValue("v5");

		// deSelect using index method

		sel.deselectByIndex(2);
		Thread.sleep(2000);

		// deSelect using visibleText method

		sel.deselectByVisibleText("Misal Pav");
		Thread.sleep(2000);

		// deSelect using value method

		sel.deselectByValue("v5");
		Thread.sleep(2000);
		
		// to select Multiple options using for loop
		for(int i=0; i<5; i++)
		{
			sel.selectByIndex(i);
			Thread.sleep(1000);
		}
		Thread.sleep(2000);
		
		//to deselect Multiple options using for loop
		for(int i=0; i<5; i++)
		{
			sel.deselectByIndex(i);
			Thread.sleep(1000);
		}
			
		

	}

}
