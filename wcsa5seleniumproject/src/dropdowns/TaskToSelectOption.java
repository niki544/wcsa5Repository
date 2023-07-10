package dropdowns;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class TaskToSelectOption {
	public static void main(String[] args) {
		
			System.setProperty("WebDriver.chrome.driver", "./drivers/chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
			
			driver.get("file:///C:/Users/DELL/Desktop/WCSA5/WebElement/SingleSelectDropDown.html");
			
			//identify dropdown on webpage
			WebElement dropDownElement = driver.findElement(By.id("menu"));
			
			//handle the dropdown by creating object
			Select sel = new Select(dropDownElement);
			
			//read all the options of dropdown
			List<WebElement> allOps = sel.getOptions();
			
			//to read list use looping statements
			for(WebElement op : allOps)
			{
				if(op.getText().equals("Pani Puri"))
				{
					op.click();
					break;
				}
			}
				
		
	}

}
