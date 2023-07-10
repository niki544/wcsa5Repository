package assignmentPackage;

import java.time.Duration;
import java.util.List;
import java.util.TreeSet;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class EliminatesDuplicatesByUsingTreeSet {
	
	//By Using TreeSet
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
		
		TreeSet<String> ts = new TreeSet<String>();
		
		//to set options from dropdown
				List<WebElement> allops = sel.getOptions();
				
				//to read options from dropdown
				for(int i=0; i<allops.size(); i++)
				{
					WebElement op = allops.get(i);
					
					//get text of webelemnt and add into set
					String value = op.getText();
					
					//add the value into set that means duplicates will not be allowed
					//insertion order wont be maintain
		    
					ts.add(value);
		}
				//read the value from set
				for(String element : ts)
				{
					Thread.sleep(2000);
					System.out.println(element);
				}
		
	}

}
