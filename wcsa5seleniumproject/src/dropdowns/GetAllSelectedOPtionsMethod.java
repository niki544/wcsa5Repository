package dropdowns;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class GetAllSelectedOPtionsMethod {
	public static void main(String[] args) throws InterruptedException {
		

		System.setProperty("WebDriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

		driver.get("file:///C:/Users/DELL/Desktop/WCSA5/WebElement/MultiSelectDropdown2.html");
		
		//identify dropdown
		WebElement dropDownElement = driver.findElement(By.id("menu"));
		
		//handle the dropdown
		Select sel = new Select(dropDownElement);
		
		//select multiple options from dropdown
		for(int i=2; i<=5; i++) 
		{
			sel.selectByIndex(i);
			Thread.sleep(2000);
		}
		
		//to read all selected option from dropdown
		List<WebElement> allops = sel.getAllSelectedOptions();
		
		//to read list of webelement
		
		//for(  WebElement op: allops)
		//{
		//	Thread.sleep(2000);
		//	System.out.println(op.getText());
		//}
		
		for(int i=0; i<allops.size(); i++)
		{
			
			System.out.println(allops.get(i).getText());
			Thread.sleep(2000);
		}
	}

}
