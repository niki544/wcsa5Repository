package methodsofWebElement;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetAttributeMethod {
	public static void main(String[] args) {

		System.setProperty("WebElemnt.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		driver.get("https://www.facebook.com/");

		// System.out.println(driver.findElement(By.id("email")).getAttribute("class"));

		WebElement attributevalue = driver.findElement(By.id("email"));
		String classValue = attributevalue.getAttribute("class");
		System.out.println(classValue);
	}

}
