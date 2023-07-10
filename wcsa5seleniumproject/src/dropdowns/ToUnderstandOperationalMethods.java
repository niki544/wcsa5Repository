package dropdowns;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ToUnderstandOperationalMethods {
	public static void main(String[] args) throws InterruptedException {

		System.setProperty("WebDriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.get("file:///C:/Users/DELL/Desktop/WCSA5/WebElement/MultiSelectDropdown.html");

		WebElement MultiSelectDD = driver.findElement(By.id("menu"));
		Select sel = new Select(MultiSelectDD);
		Thread.sleep(2000);

		// isMultipleMethod
		boolean result = sel.isMultiple();
		System.out.println(result);

		// getoptions method using for loop
		List<WebElement> dropdownoptions = sel.getOptions();
		for (int i = 0; i < dropdownoptions.size(); i++) {
			String options = dropdownoptions.get(i).getText();
			System.out.println(options);
			Thread.sleep(1000);
		}

		System.out.println();

		// using for each loop

		List<WebElement> ops = sel.getOptions();
		for (WebElement we : ops) {
			String textofops = we.getText();
			System.out.println(textofops);
		}
		// using getFirstSelectedOPtion
		for (int i = 2; i <= 4; i++) {
			sel.selectByIndex(i);
		}
			WebElement firstoption = sel.getFirstSelectedOption();
			System.out.println("firstSelectedOptionIs :" + firstoption.getText());

	}

}
