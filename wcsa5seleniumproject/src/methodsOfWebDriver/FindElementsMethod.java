package methodsOfWebDriver;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElementsMethod {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("WbDriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.co.in/");
		driver.switchTo().activeElement().sendKeys("bikes");
		Thread.sleep(2000);
		List<WebElement> bikes = driver.findElements(By.xpath("//div[@class='wM6W7d']"));

		for (int i = 0; i < bikes.size(); i++) {
			String bikesoption = bikes.get(i).getText();
			System.out.println(bikesoption);
			Thread.sleep(1000);

			for (WebElement we : bikes) {
				String bikesoptions = we.getText();
				System.out.println(bikesoptions);
				Thread.sleep(1000);

			}

		}

	}

}
