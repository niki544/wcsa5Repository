package dropdowns;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class GetWrappedElements {
	public static void main(String[] args) {
		

		System.setProperty("WebDriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

		driver.get("file:///C:/Users/DELL/Desktop/WCSA5/WebElement/MultiSelectDropdown.html");
		
		//identify dropdown
		WebElement dropDownElement = driver.findElement(By.id("menu"));
		
		//handle the dropdown
		Select sel = new Select(dropDownElement);
		
		List<WebElement> allops = sel.getOptions();
		for( WebElement op : allops) 
		{
			System.out.println(op.getText());
		}
		
		//to read options from dropdown
		WebElement allopts = sel.getWrappedElement();
		System.out.println(allopts.getText());
	}
	

}
